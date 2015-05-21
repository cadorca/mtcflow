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
package com.mtcflow.engine.atl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.LauncherService;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.ReferencedResource;

public class ATLTransformationExecutor extends TransformationExecutor {

	private M2MTransformation m2mTransformation;
	public final static String SUPERIMPOSITION = "SUPERIMPOSITION";

	@Override
	protected void afterInit() {
		m2mTransformation = (M2MTransformation) transformation;
	}

	@Override
	public void executeTransformation(IExecutionInformation information) throws Exception {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		ArrayList<InputModel> inoutModels = new ArrayList<InputModel>();
		IExtractor extractor = new EMFExtractor();
		HashMap<String, String> modelPaths = new HashMap<String, String>();
		List<OutputModel> outputsToRemove = new ArrayList<OutputModel>();
		if (isRefinement(m2mTransformation)) {
			ModelFactory factory = new EMFModelFactory();
			IReferenceModel refiningTraceMetamodel = factory.getBuiltInResource(LauncherService.REFINING_TRACE_METAMODEL + ".ecore"); //$NON-NLS-1$
			Map<String, Object> modelOptions = new HashMap<String, Object>();
			modelOptions.put(/* OPTION_MODEL_PATH */"path", "temp"); //$NON-NLS-1$ 
			modelOptions.put(/* OPTION_MODEL_NAME */"modelName", LauncherService.REFINING_TRACE_MODEL);
			modelOptions.put(/* OPTION_NEW_MODEL */"newModel", true);
			IModel refiningTraceModel = factory.newModel(refiningTraceMetamodel, modelOptions);
			launcher.addOutModel(refiningTraceModel, LauncherService.REFINING_TRACE_MODEL, LauncherService.REFINING_TRACE_METAMODEL);
			/*
			 * Original message from
			 * http://eclipsesourcecode.appspot.com/jsrcs/org
			 * .eclipse.atl/plugins
			 * /org.eclipse.m2m.atl.core.ant/src_ant/org/eclipse
			 * /m2m/atl/core/ant/tasks/AbstractAtlTask.java.html TODO: improve
			 * ----- ATL header syntax to recognize inout models. Apply those
			 * changes to launch config. Current workaround: refined models list
			 * must match output models list to be saved, with respect to the
			 * declaration order. -----
			 */

			for (InputModel inModel : inputModels) {
				String sourceModelName = inModel.getModelAlias();
				String sourceMetamodelName = inModel.getMetamodelAlias();
				for (OutputModel outModel : outputModels) {
					String targetModelName = outModel.getModelAlias();
					String targetMetamodelName = outModel.getMetamodelAlias();
					if (targetMetamodelName.equals(sourceMetamodelName) && !outputsToRemove.contains(targetModelName)) {
						String targetModelPath = locator.getPath(outModel.getModel());
						// Compute the inout model path (for extraction)
						inoutModels.add(inModel);
						modelPaths.put(sourceModelName, targetModelPath);
						outputsToRemove.add(outModel);
						break;
					}
				}
			}

		}

		for (InputModel inModel : inputModels) {
			if (inoutModels.contains(inModel)) {
				launcher.addInOutModel(getATLModel(inModel.getModel(), launcher.getModel(inModel.getMetamodelAlias()), true), inModel.getModelAlias(), inModel.getMetamodelAlias());
			} else {
				launcher.addInModel(getATLModel(inModel.getModel(), launcher.getModel(inModel.getMetamodelAlias()), true), inModel.getModelAlias(), inModel.getMetamodelAlias());
			}
		}
		for (OutputModel outModel : outputModels) {
			if (!outputsToRemove.contains(outModel)) {
				IModel atlOouModel = getATLModel(outModel.getModel(), launcher.getModel(outModel.getMetamodelAlias()), false);
				launcher.addOutModel(atlOouModel, outModel.getModelAlias(), outModel.getMetamodelAlias());
			}
		}

		for (Library library : transformation.getLibraries()) {
			launcher.addLibrary(library.getName(), locator.getInputStream(library));
		}

		ArrayList<InputStream> inStream = new ArrayList<InputStream>();
		// add the transformation module
		inStream.add(URIConverter.INSTANCE.createInputStream(locator.getEMFURI(transformation)));
		for (ReferencedResource refRes : transformation.getReferencedResources()) {
			if (refRes.getURI().endsWith(ATLTechnologyManager.ATL_COMPILED_EXTENSION) || refRes.getURI().endsWith(ATLTechnologyManager.ATL_SOURCE_EXTENSION)) {
				inStream.add(URIConverter.INSTANCE.createInputStream(locator.getEMFURI(refRes)));
			} else if (refRes.getURI().toUpperCase().endsWith(SUPERIMPOSITION)) {
				Scanner scanner = new Scanner(locator.getFile(refRes));
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine().trim();
					// each line correspond to the name of a superimposed module
					M2MTransformation transfi = MtcFactory.eINSTANCE.createM2MTransformation();
					transfi.setName(line);
					transfi.setURI(line);
					inStream.add(URIConverter.INSTANCE.createInputStream(locator.getEMFURI(transfi)));
				}
			}
		}

		Object transformationResult = launcher.launch("ATL Transformation :" + transformation.getName(), new NullProgressMonitor(), launcherOptions, inStream.toArray(new InputStream[0]));

		for (InputModel inputModel : inoutModels) {
			extractor.extract(launcher.getModel(inputModel.getModelAlias()), modelPaths.get(inputModel.getModelAlias()));
		}

		for (OutputModel outModel : outputModels) {
			if (!outputsToRemove.contains(outModel)) {
				extractor.extract(launcher.getModel(outModel.getModelAlias()), locator.getPath(outModel.getModel()));
			}
			executionEnvironment.modelReady(outModel.getModel(), transformation);
		}

		if (transformation instanceof HOTransformation) {
			for (OutputFile file : outputFiles) {
				executionEnvironment.fileReady(file.getFile(), transformation);
			}
		}
	}

	private IModel getATLModel(Model model, Object mmMetamodel, boolean load) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
		if (mmMetamodel == null) {
			mmMetamodel = factory.newReferenceModel();
			Map<String, Object> config = new HashMap<String, Object>();
			config.put("loadOnDemand", model.getMainMetamodel().isAutoregister());
			injector.inject((IReferenceModel) mmMetamodel, ((model.getMainMetamodel().getMetamodelURI() != null && !model.getMainMetamodel().getMetamodelURI().isEmpty()) ? model.getMainMetamodel().getMetamodelURI() : locator.getPath(model.getMainMetamodel())), config);
		}
		IModel atlModel = factory.newModel((IReferenceModel) mmMetamodel);
		if (load) {
			injector.inject(atlModel, locator.getPath(model));
		}
		return atlModel;
	}

	/**
	 * Returns the options map, parameterized from the property file.
	 * 
	 * @return the options map
	 * 
	 * @generated
	 */
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("allowInterModelReferences", true);
		if (isRefinement(m2mTransformation)) {
			// options.put("isRefiningTraceMode", "true");
			// options.put("step", "true");
		}
		/*
		 * for (Entry<Object, Object> entry : properties.entrySet()) { if
		 * (entry.getKey().toString().startsWith("Sql2ecore.options.")) {
		 * options.put( entry.getKey().toString()
		 * .replaceFirst("Sql2ecore.options.", ""), entry
		 * .getValue().toString()); } }
		 */
		return options;
	}

	public boolean isRefinement(M2MTransformation m2mTransformation) {
		return Boolean.valueOf(m2mTransformation.getProperty("refinement"));
	}

}
