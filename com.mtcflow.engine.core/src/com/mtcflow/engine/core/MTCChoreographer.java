/*******************************************************************************
 * Copyright (c) 2013 Camilo Alvarez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Camilo Alvarez (cadorca@gmail.com)  - initial API and implementation
 ******************************************************************************/
package com.mtcflow.engine.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.IExecutionListener;
import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.IModelEnvironmentManager;
import com.mtcflow.engine.IResourceLocator;
import com.mtcflow.engine.ITechnologyManager;
import com.mtcflow.engine.ITransformationExecutorFactory;
import com.mtcflow.engine.ITransformationScheduler;
import com.mtcflow.engine.MTCFlow;
import com.mtcflow.engine.core.utils.FilenameUtils;
import com.mtcflow.engine.core.validation.ConformanceValidationExecutor;
import com.mtcflow.engine.exception.TransformationNotSupportedException;
import com.mtcflow.engine.transformation.ExecutionInformation;
import com.mtcflow.engine.transformation.ITransformationExecutor;
import com.mtcflow.engine.validation.IValidationExecutor;
import com.mtcflow.engine.validation.IValidationResult;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.ModelProducerTransformation;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.T2MTransformation;
import com.mtcflow.model.mtc.Tag;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;
import com.mtcflow.model.mtc.Variable;

public class MTCChoreographer implements IExecutionEnvironment {

	private static final String CONFORMANCE = ".conformance";
	private long startTime;
	private long finishTime;
	private Transformation startTransformation;
	private final HashMap<MTCResource, ArrayList<ITransformationExecutor>> resourceReferences;
	private final HashMap<Transformation, ITransformationExecutor> transformationExecutors;
	private final HashMap<Transformation, List<MTCResource>> dependentTransformationsStack;
	private final HashMap<MTCResource, ArrayList<Transformation>> transformationDependencies;
	private final ArrayList<IExecutionListener> executionListeners;
	private ITransformationScheduler executorService;
	private final MTC mtc;
	private final IResourceLocator resourceLocator;
	private final ITransformationExecutorFactory transformationFactory;
	private final IModelEnvironmentManager envManager;
	private final List<String> tags;
	private final IResourceLocator locator;
	private final IMTCConsole console;
	private final String mtcPath;
	private final EPackage.Registry registry;
	private final ResourceSet resourceSet;
	private final boolean registerMetamodel;
	private final boolean standalone;
	private final Map<String, Object> variables;
	private int runningTaks = 0;
	private int finishedTaks = 0;

	public MTCChoreographer(String mtcPath, MTC mtc, boolean standalone, boolean registerMetamodels, IMTCConsole console, IResourceLocator resourceLocator, ITransformationExecutorFactory transformationFactory, IModelEnvironmentManager envManager, List<String> tags, final Map<String, Object> variables) {
		this(mtcPath, mtc, standalone, registerMetamodels, console, null, resourceLocator, transformationFactory, envManager, tags, variables);
	}

	public MTCChoreographer(String mtcPath, MTC mtc, boolean standalone, boolean registerMetamodels, IMTCConsole console, EPackage.Registry registry, IResourceLocator resourceLocator, ITransformationExecutorFactory transformationFactory, IModelEnvironmentManager envManager, List<String> tags, final Map<String, Object> variables) {
		if (variables == null) {
			this.variables = new HashMap<String, Object>();
		} else {
			this.variables = variables;
		}
		console.println("Starting MTC: " + mtc.getName());
		this.standalone = standalone;
		this.registerMetamodel = registerMetamodels;
		resourceSet = new ResourceSetImpl();
		if (registry == null) {
			resourceSet.setPackageRegistry(EPackage.Registry.INSTANCE);
		} else {
			resourceSet.setPackageRegistry(registry);
		}
		this.registry = resourceSet.getPackageRegistry();
		this.mtcPath = mtcPath;
		this.console = console;
		this.locator = resourceLocator;
		this.mtc = mtc;
		this.resourceLocator = resourceLocator;
		this.transformationFactory = transformationFactory;
		// register the Ecore Resource Factory to the ".ecore" extension
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceReferences = new HashMap<MTCResource, ArrayList<ITransformationExecutor>>(mtc.getModels().size() + mtc.getFiles().size());
		transformationExecutors = new HashMap<Transformation, ITransformationExecutor>(mtc.getTransformations().size());
		dependentTransformationsStack = new HashMap<Transformation, List<MTCResource>>();
		transformationDependencies = new HashMap<MTCResource, ArrayList<Transformation>>();
		this.tags = tags;
		this.envManager = envManager;
		executionListeners = new ArrayList<IExecutionListener>();
		initilizeVariables();
		// TODO:
	}

	public void start(Transformation transfomation) {
		this.startTransformation = transfomation;
		start();
	}

	public void start() {
		startTime = System.nanoTime();
		if (executorService == null) {
			executorService = new com.mtcflow.engine.ExecutorService();
		}
		for (IExecutionListener listener : executionListeners) {
			listener.beforeStartExecution(mtc, mtcPath, this);
		}
		try {
			// Register metamodels before start the MTC
			if (registerMetamodel)
				for (Metamodel metamodel : mtc.getMetamodels()) {
					if (metamodel.getMetamodelURI() != null && !metamodel.getMetamodelURI().isEmpty()) {
						registerMetamodel(resourceLocator.getEMFURI(metamodel));
					}
				}

			// Configure Enviroment
			if (mtc.getConfigurations() != null) {
				console.println("Initializing Model Environments.");
				for (ModelEnvironment env : mtc.getConfigurations().getEnvironments()) {
					if (envManager != null) {
						console.println("Initializing " + env.getName() + " environment.");
						envManager.configureEnvironment(this, env);
					}
				}
				console.println("Finished Model Environments Initialization.");
			}

			// create the resource dependencies
			for (Model model : mtc.getModels()) {
				resourceReferences.put(model, new ArrayList<ITransformationExecutor>());
			}

			for (File file : mtc.getFiles()) {
				resourceReferences.put(file, new ArrayList<ITransformationExecutor>());
			}

			// Load the modelsReferences dependencies
			for (InputModel iModel : mtc.getInputModels()) {
				ITransformationExecutor executor = transformationExecutors.get(iModel.getTransformation());
				if (executor == null) {
					executor = createTransformationExecutor(iModel.getTransformation());
					transformationExecutors.put(iModel.getTransformation(), executor);
				}
				resourceReferences.get(iModel.getModel()).add(executor);
			}

			for (File file : mtc.getFiles()) {
				resourceReferences.put(file, new ArrayList<ITransformationExecutor>());
			}

			for (Transformation transformation : mtc.getTransformations()) {
				if (transformation instanceof T2MTransformation) {
					T2MTransformation t2m = (T2MTransformation) transformation;
					ITransformationExecutor executor = transformationExecutors.get(transformation);
					if (executor == null) {
						executor = createTransformationExecutor(transformation);
						transformationExecutors.put(transformation, executor);
					}
					for (File file : mtc.getFiles(t2m)) {
						resourceReferences.get(file).add(executor);
					}
				}
			}

			generateDependenciesBetweenTransformations();

			markGeneratedResourcesToWorkspace();

			// Find all the transformations generated by a HOT transformation
			for (Transformation transformation : mtc.getTransformations()) {
				if (!transformation.getModelDependencies().isEmpty() || !transformation.getFileDependencies().isEmpty()) {
					dependentTransformationsStack.put(transformation, new ArrayList<MTCResource>());
					for (Model model : transformation.getModelDependencies()) {
						if (transformationDependencies.get(model) == null) {
							transformationDependencies.put(model, new ArrayList<Transformation>());
						}
						transformationDependencies.get(model).add(transformation);
					}
					for (File file : transformation.getFileDependencies()) {
						if (transformationDependencies.get(file) == null) {
							transformationDependencies.put(file, new ArrayList<Transformation>());
						}
						transformationDependencies.get(file).add(transformation);
					}
				}

			}

			/*
			 * for (Metamodel metamodel : mtc.getMetamodels()) {
			 * unregisterMetamodel(resourceLocator.getEMFURI(metamodel)); }
			 */
		} catch (Exception ex) {
			console.logException("Error starting the MTC", ex);
		}
	}

	private void initilizeVariables() {
		if (mtc.getConfigurations() != null) {
			for (Variable variable : mtc.getConfigurations().getVariables()) {
				if (variable.getType() != null && variable.getDefaultValue() == null) {
					Class variableType = null;
					try {
						variableType = Class.forName(variable.getType());
						variables.put(variable.getName(), variableType.newInstance());
						continue;
					} catch (Exception e) {
					}
				}
				if (variables.get(variable.getName()) == null) {
					variables.put(variable.getName(), variable.getDefaultValue());
				} else {
					console.println("Setting variable [" + variable.getName() + "] value to: " + variables.get(variable.getName()));
				}
			}
		}
		// workspace system variable
		variables.put("workspace", locator.getWorkingFolder());
		HashMap<Object, Object> executionData = new HashMap<Object, Object>();
		executionData.put("variables", variables);
		mtc.setExecutionInformation(executionData);
	}

	private void generateDependenciesBetweenTransformations() {
		for (Transformation trans : mtc.getTransformations()) {
			if (trans instanceof HOTransformation) {
				HOTransformation hot = (HOTransformation) trans;
				List<Transformation> depTransformation = hot.getOutputTransformations();
				for (Transformation transformation : depTransformation) {
					List<Model> models = getOutModels(trans);
					transformation.getModelDependencies().addAll(models);
					List<File> files = getOutFiles(trans);
					transformation.getFileDependencies().addAll(files);
				}
			}
		}
	}

	private List<Model> getOutModels(Transformation transformation) {
		ArrayList<Model> resp = new ArrayList<Model>();
		for (OutputModel out : mtc.getOutputModels()) {
			if (out.getTransformation().equals(transformation)) {
				resp.add(out.getModel());
			}

		}
		return resp;
	}

	private List<File> getOutFiles(Transformation transformation) {
		ArrayList<File> resp = new ArrayList<File>();
		List<OutputFile> outF = mtc.getOutputFiles(transformation);
		for (OutputFile outputFile : outF) {
			resp.add(outputFile.getFile());
		}
		return resp;
	}

	@SuppressWarnings("unchecked")
	private void markGeneratedResourcesToWorkspace() {
		// check to mark the resources that are generated by any transformation
		// and should be generated in the workspace
		for (OutputModel outModel : mtc.getOutputModels()) {
			boolean isInput = false;
			// Verify if the resource is an input for other transformation
			for (InputModel inModel : mtc.getInputModels()) {
				if (inModel.getModel().equals(outModel.getModel())) {
					@SuppressWarnings("rawtypes")
					HashMap map = new HashMap();
					map.put(ExecutionData.GENERATED_IN_WORKSPACE, true);
					outModel.getModel().setExecutionInformation(map);
					break;
				}
			}
			// or if it is referenced from any transformation
			for (Transformation transformation : mtc.getTransformations()) {
				if (transformation.getModelDependencies().contains(outModel.getModel())) {
					@SuppressWarnings("rawtypes")
					HashMap map = new HashMap();
					map.put(ExecutionData.GENERATED_IN_WORKSPACE, true);
					outModel.getModel().setExecutionInformation(map);
				}

			}
		}

		for (File file : mtc.getFiles()) {
			// check to mark the resources that are generated by any
			// transformation
			boolean isInput = false;
			boolean isOutput = false;
			boolean isReferenced = false;
			for (Transformation transformation : mtc.getTransformations()) {
				if (transformation instanceof T2MTransformation) {
					T2MTransformation t2m = (T2MTransformation) transformation;
					isInput = mtc.getFiles(t2m).contains(file) || isInput;
				}
				if (transformation instanceof M2TTransformation) {
					M2TTransformation m2t = (M2TTransformation) transformation;
					isOutput = getOutFiles(m2t).contains(file) || isOutput;
				}
				isReferenced = transformation.getFileDependencies().contains(file) || isReferenced;
			}
			if (isOutput && (isInput || isReferenced)) {
				@SuppressWarnings("rawtypes")
				HashMap map = new HashMap();
				map.put(ExecutionData.GENERATED_IN_WORKSPACE, true);
				file.setExecutionInformation(map);
			}
		}

		// Mark transformations that should be searched in the workspace
		for (Transformation transformation : mtc.getTransformations()) {
			if ((!transformation.getModelDependencies().isEmpty() || !transformation.getFileDependencies().isEmpty()) && isGenerated(transformation)) {
				@SuppressWarnings("rawtypes")
				HashMap map = new HashMap();
				map.put(ExecutionData.GENERATED_IN_WORKSPACE, true);
				transformation.setExecutionInformation(map);
			}
		}
	}

	public boolean isGenerated(Transformation transformation) {
		for (Transformation ti : mtc.getTransformations()) {
			if (ti instanceof HOTransformation && !ti.equals(transformation)) {
				if (((HOTransformation) ti).getOutputTransformations().contains(transformation)) {
					return true;
				}
			}
		}
		return false;
	}

	private ITransformationExecutor createTransformationExecutor(Transformation transformation) {
		ArrayList<InputModel> inputModels = new ArrayList<InputModel>();
		for (InputModel inputModel : mtc.getInputModels()) {
			if (inputModel.getTransformation().equals(transformation))
				inputModels.add(inputModel);
		}
		ArrayList<OutputModel> outputModels = new ArrayList<OutputModel>();
		if (transformation instanceof ModelProducerTransformation) {
			for (OutputModel outModel : mtc.getOutputModels()) {
				if (outModel.getTransformation().equals(transformation))
					outputModels.add(outModel);
			}
		}
		ITransformationExecutor transformationExec;
		try {
			transformationExec = transformationFactory.createTransformationExecutor(locator.getResourceExtension(transformation), transformation);
			transformationExec.init(locator, this, inputModels, outputModels, mtc.getInputFiles(transformation), mtc.getOutputFiles(transformation), transformation, console);
		} catch (TransformationNotSupportedException e) {
			console.logException("Error creating a transformation :" + transformation.getName(), e);
			// todo: fix this should stop the mtc or no ?
			return null;
		}
		// Configure Executor
		return transformationExec;
	}

	public IValidationExecutor createValidationExecutor(Model model, Validation validation) {
		if (validation.getURI().equals(CONFORMANCE)) {
			ConformanceValidationExecutor cValidator = new ConformanceValidationExecutor();
			cValidator.init(model, this, locator, validation, console);
			return cValidator;
		} else {
			ITechnologyManager tManager = MTCFlow.TechnologyManagerRegistry.INSTANCE.get(locator.getResourceExtension(validation));
			IValidationExecutor vExecutor = tManager.createValidationExecutor(validation);
			vExecutor.init(model, this, locator, validation, console);
			return vExecutor;
		}
	}

	@Override
	public boolean modelReady(String modelName, Transformation creator) {
		Model model = getModel(modelName);
		if (model != null) {
			modelReady(model, creator);
		}
		return model != null;
	}

	public Model getModel(String modelName) {
		for (Model modeli : mtc.getModels()) {
			if (modeli.getName().equals(modelName)) {
				return modeli;
			}
		}
		return null;
	}

	public File getFile(String name) {
		for (File filei : mtc.getFiles()) {
			if (filei.getName().equals(name)) {
				return filei;
			}
		}
		return null;
	}

	@Override
	public void modelReady(Model model, Transformation transformation) {
		for (IExecutionListener execListener : executionListeners) {
			execListener.modelReady(model, transformation, this);
		}

		String path = locator.getPath(model);
		if (path == null) {
			path = "";
		}
		console.println("Model ready : " + model.getName() + "(" + path + ")");

		executeValidations(model);

		loadReferencedResources(model);

		executeTransformations(model, transformation);
	}

	@Override
	public void fileReady(File file, Transformation transformation) {
		for (IExecutionListener execListener : executionListeners) {
			execListener.fileReady(file, transformation, this);
		}
		String path = locator.getPath(file);
		if (path == null) {
			path = "";
		}
		console.println("Textual File ready : " + file.getName() + "(" + path + ")");

		loadReferencedResources(file);

		executeTransformations(file, transformation);
	}

	private boolean isTransformationReady(MTCResource resource, Transformation transformation) {
		if (transformation.getModelDependencies().isEmpty() && transformation.getFileDependencies().isEmpty()) {
			return true;
		} else {
			// Put the resources in the stack until the required the
			// transformation is ready
			List<MTCResource> pResources = dependentTransformationsStack.get(transformation);
			if (pResources != null) {
				pResources.add(resource);
			}
		}
		return false;
	}

	private void executeTransformations(MTCResource resource, Transformation resourceGenerator) {
		ArrayList<Transformation> dependentTransformations = transformationDependencies.get(resource);
		if (dependentTransformations != null && dependentTransformations.size() > 0) {
			for (Transformation depTransformation : dependentTransformations) {
				depTransformation.getModelDependencies().remove(resource);
				depTransformation.getFileDependencies().remove(resource);
				/*
				 * If all the required models and files are ready notify the
				 * transformation about the resources in the
				 * dependentTransformations Stack
				 */
				try {
					if (locator.getFile(resourceGenerator) != null) {
						console.println("Compiling generated file " + resource.getName() + "(" + locator.getAbsolutFilePath(resource) + ")");
						compileFile(locator.getFile(resource));
					}
				} catch (Exception e) {
					console.logException("Error compiling the generated file: " + resource.getName() + "(" + locator.getAbsolutFilePath(resource) + ")", e);
				}
				if (depTransformation.getModelDependencies().isEmpty() && depTransformation.getFileDependencies().isEmpty()) {
					ITransformationExecutor transformationExecutor = transformationExecutors.get(depTransformation);
					List<MTCResource> stackedResources = dependentTransformationsStack.get(depTransformation);
					for (MTCResource mtcResource : stackedResources) {
						if (mtcResource instanceof Model) {
							transformationExecutor.modelReady((Model) mtcResource, resourceGenerator);
						} else if (resource instanceof File) {
							transformationExecutor.fileReady((File) mtcResource, resourceGenerator);
						}
					}
					validateAndExecuteTransformation(transformationExecutor);
				}
			}
		}
		ArrayList<ITransformationExecutor> trans = resourceReferences.get(resource);
		if (trans != null) {
			for (ITransformationExecutor transformationExecutor : trans) {
				if (!isTransformationReady(resource, transformationExecutor.getTransformation())) {
					continue;
				}
				if (resource instanceof Model) {
					transformationExecutor.modelReady((Model) resource, resourceGenerator);
				} else if (resource instanceof File) {
					transformationExecutor.fileReady((File) resource, resourceGenerator);
				}
				validateAndExecuteTransformation(transformationExecutor);
			}
		}
	}

	private void validateAndExecuteTransformation(ITransformationExecutor transformationExecutor) {
		if (validateTags(transformationExecutor.getTransformation())) {
			if (validateTransformation(transformationExecutor.getTransformation())) {
				if (transformationExecutor.isReady()) {
					executeTransformation(transformationExecutor);
				}
			}
		}
	}

	public void executeValidations(Model model) {
		if (mtc.isValidateConformance()) {
			// Add Validate conformance to the life-cycle
			Validation va = MtcFactory.eINSTANCE.createValidation();
			va.setName("Conformance");
			va.setURI(CONFORMANCE);
			ModelValidation modelValidation = MtcFactory.eINSTANCE.createModelValidation();
			modelValidation.getModels().add(model);
			modelValidation.setValidation(va);
			mtc.getValidations().add(va);
			mtc.getModelValidations().add(modelValidation);
		}
		List<ModelValidation> validation = mtc.getValidations(model);
		if (!validation.isEmpty()) {
			// Execute validations before notify transformations
			for (ModelValidation modelValidation : validation) {
				IValidationExecutor executor = createValidationExecutor(model, modelValidation.getValidation());
				try {
					IValidationResult result = executor.execute();
					if (!result.isSuccess() /*&& modelValidation.isStopOnError()*/) {
						console.printError("Validation Error on model:  " + model.getName() + " (" + locator.getFile(model) + ")\n" + result.getMessage());
					} else {
						console.println("Model " + model.getName() + " validation [" + modelValidation.getValidation().getName() +"] : PASSED");
					}
				} catch (Exception ex) {
					console.printError("Error during validation execution:" + ex.getMessage());
				}
			}
		}
	}

	private boolean validateTransformation(Transformation transformationToExecute) {
		return startTransformation == null || this.startTransformation.getName().equals(transformationToExecute.getName());
	}

	private boolean validateTags(Transformation transformation) {
		if (tags == null || tags.isEmpty() || transformation.getTags() == null || transformation.getTags().isEmpty() || tags.contains(ANY_TAG)) {
			return true;
		} else {
			List<Tag> tTags = transformation.getTags();
			for (Tag tag : tTags) {
				// todo: Find a better alternative
				if (tags.contains(tag.getName())) {
					return true;
				}
			}
			return false;
		}
	}

	private void loadReferencedResources(MTCResource resource) {
		// Load references resource
		for (ReferencedResource rr : resource.getReferencedResources()) {
			if (envManager != null) {
				try {
					envManager.configureReferencedResource(this, (mtc.getConfigurations() == null ? null : mtc.getConfigurations().getEnvironments()), rr);
				} catch (Exception ex) {
					console.logException("Error during configuration of the referenced resource: " + rr.getName() + " of the model " + resource.getName(), ex);
				}
			}
		}
	}

	private void executeTransformation(final ITransformationExecutor transformation) {
		final IExecutionEnvironment env = this;
		final MTCChoreographer choreographer = this;
		runningTaks++;
		executorService.execute("Executing Transformation: " + transformation.getTransformation().getName(), transformation, new Runnable() {

			@Override
			public void run() {
				try {
					ResourceSet rSet = new ResourceSetImpl();
					Object obj = rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("genmodel");
					for (IExecutionListener listener : executionListeners) {
						listener.configureClassPath(mtc, mtcPath, transformation.getTransformation(), env);
						listener.beforeExecuteTransformation(mtc, mtcPath, transformation.getTransformation(), env);
					}
					console.println("Executing " + transformation.getTransformation().getName() + " transformation" + (transformation instanceof M2TTransformation ? "(" + ((M2TTransformation) transformation).getTarget() + ")" : ""));
					transformation.executeTransformation(new ExecutionInformation(false));
					console.println(transformation.getTransformation().getName() + " transformation finished.");
					choreographer.finishedTaks++;
					choreographer.checkFinalization();
				} catch (Throwable ex) {
					if (ex instanceof java.lang.NoClassDefFoundError) {
						console.logException("Some classes can't be loaded check your classpath for the: " + transformation.getTransformation().getName() + "(" + transformation.getTransformation().getImplementationClass() + ") " + " transformation", ex);
					} else {
						console.logException("Exception executing " + transformation.getTransformation().getName() + " transformation", ex);
					}
				} finally {
					for (IExecutionListener listener : executionListeners) {
						listener.restoreClassPath(mtc, mtcPath, transformation.getTransformation(), env);
						listener.afterExecuteTransformation(mtc, mtcPath, transformation.getTransformation(), env);
					}
				}
			}
		});
	}

	private void checkFinalization() {
		if (runningTaks - finishedTaks == 0) {
			finishTime = System.nanoTime();
			long duration = TimeUnit.SECONDS.convert(finishTime-startTime, TimeUnit.NANOSECONDS);
			console.println("MTC: " + mtc.getName() + " Finished. Execution time: "+duration+" seconds.");
			for (IExecutionListener listener : executionListeners) {
				listener.afterFinishExecution(mtc, mtcPath, this);
			}
		}
	}

	public ArrayList<InputModel> getInputForModel(Model model) {
		ArrayList<InputModel> inModels = new ArrayList<InputModel>();
		for (InputModel inmodel : mtc.getInputModels()) {
			if (inmodel.getModel().equals(model)) {
				inModels.add(inmodel);
			}
		}
		return inModels;
	}

	// Utils
	private void compileFile(java.io.File file) throws Exception {
		String extension = FilenameUtils.getExtension(file.getAbsolutePath());
		if (extension != null) {
			extension = extension.toLowerCase();
			ITechnologyManager tManager = MTCFlow.TechnologyManagerRegistry.INSTANCE.get(extension);
			if (tManager != null && !tManager.getCompiledExtensions().contains(extension)) {
				tManager.compile(file, "", console);
				// resource.getParent().refreshLocal(IResource.DEPTH_INFINITE,
				// null);
			}
		}
	}

	private void registerMetamodel(URI uri) {
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		Resource r = resourceSet.getResource(uri, true);
		EList<EObject> lObjects = r.getContents();
		for (EObject eObject : lObjects) {
			if (eObject instanceof EPackage) {
				EPackage p = (EPackage) eObject;
				if (registry.get(p.getNsURI()) == null)
					registry.put(p.getNsURI(), p);
			}
		}
		// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",
		// new EcoreResourceFactoryImpl());
	}

	private void unregisterMetamodel(URI uri) {
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		Resource r = resourceSet.getResource(uri, true);
		EObject eObject = r.getContents().get(0);
		if (eObject instanceof EPackage) {
			EPackage p = (EPackage) eObject;
			registry.remove(p.getNsURI());
		}
	}

	public String getM2MTechnology() {
		return mtc.getM2MTechnology();
	}

	public String getM2TTechnology() {
		return mtc.getM2TTechnology();
	}

	public MTC getMtc() {
		return mtc;
	}

	@Override
	public IResourceLocator getLocator() {
		return locator;
	}

	@Override
	public IMTCConsole getConsole() {
		return console;
	}

	@Override
	public void addExecutionListener(IExecutionListener listener) {
		executionListeners.add(listener);
	}

	@Override
	public void remoceExecutionListener(IExecutionListener listener) {
		executionListeners.add(listener);
	}

	@Override
	public EPackage.Registry getRegistry() {
		return registry;
	}

	@Override
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	@Override
	public boolean isStandalone() {
		return standalone;
	}

	@Override
	public void setVariable(String vName, String value) {
		variables.put(vName, value);
	}

	@Override
	public void setVariables(Map map) {
		variables.putAll(map);
	}

	@Override
	public Object getVariable(String vName) {
		return variables.get(vName);
	}

	@Override
	public String getStringVariable(String vName) {
		final Object varValue = variables.get(vName);
		if (varValue == null) {
			return null;
		} else {
			return varValue.toString();
		}
	}

	@Override
	public MTC getMTC() {
		return mtc;
	}

	@Override
	public String getMTCPath() {
		return mtcPath;
	}

	@Override
	public ITransformationExecutorFactory getTransformationExecutorFactory() {
		return transformationFactory;
	}

	@Override
	public List<String> getTags() {
		return tags;
	}

	@Override
	public boolean isRegisterMetamodels() {
		return registerMetamodel;
	}

	@Override
	public IModelEnvironmentManager getModelEnvironmentManager() {
		return envManager;
	}

	@Override
	public List<IExecutionListener> getListeners() {
		return executionListeners;
	}

	@Override
	public Map getVaribles() {
		return variables;
	}

	public ITransformationScheduler getExecutorService() {
		return executorService;
	}

	public void setExecutorService(ITransformationScheduler executorService) {
		this.executorService = executorService;
	}

}
