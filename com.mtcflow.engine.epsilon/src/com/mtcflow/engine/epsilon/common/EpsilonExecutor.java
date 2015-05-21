/*******************************************************************************
 * Copyright (c) 2008 The University of York..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   Dimitrios Kolovos - initial API and implementation
 *     Camilo Alvarez (cadorca@gmail.com)  - updates to handle integrate with MTC Flow
 ******************************************************************************/
package com.mtcflow.engine.epsilon.common;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.types.IToolNativeTypeDelegate;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.IResourceLocator;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.OutputModel;

public abstract class EpsilonExecutor {
	private IMTCConsole console;

	protected IExecutionEnvironment environment;

	protected boolean disposeModels = true;

	protected IEolExecutableModule module;

	protected Object result;

	protected List<IModel> models;

	private final String modelsUI = UUID.randomUUID().toString()+"-"+UUID.randomUUID().toString();

	public abstract IEolExecutableModule createModule();

	public abstract List<IModel> getModels() throws Exception;

	public List<IModel> getLoadedModels() {
		return models;
	}

	public void postProcess() {
	};

	protected abstract IExecutionEnvironment getExecutionEnvironment();

	public void preProcess() {
		module.getContext().setOutputStream(console.getPrintStream());
		module.getContext().getNativeTypeDelegates().add(new IToolNativeTypeDelegate() {

			@Override
			public boolean knowsAbout(String arg0) {
				return true;
			}

			@Override
			public Object createInstance(String arg0, List<Object> arg1, IEolContext arg2) throws EolRuntimeException {
				try {
					Class cls = cls = Thread.currentThread().getContextClassLoader().loadClass(arg0);
					if (cls != null)
						return cls.newInstance();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				return null;
			}
		});
	};

	public void execute() throws Exception {
		module = createModule();
		if (module.getParseProblems().size() > 0) {
			console.printError("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				console.printError(problem.toString());
			}
			return;
		}

		environment = getExecutionEnvironment();

		Map variablesMap = environment.getVaribles();
		Set<Entry> entries = variablesMap.entrySet();
		for (Entry entry : entries) {
			Variable var = Variable.createReadOnlyVariable((String) entry.getKey(), entry.getValue());
			module.getContext().getFrameStack().put(var);
		}

		HashMap<String, IModel> registeredModels = new HashMap<String, IModel>();
		models = getModels();
		for (IModel model : models) {
			IModel previousModel = registeredModels.get(model.getName());
			if (previousModel != null) {
				model.setReadOnLoad(previousModel.isReadOnLoad() || model.isReadOnLoad());
				model.setStoredOnDisposal(previousModel.isStoredOnDisposal() || model.isStoredOnDisposal());
				module.getContext().getModelRepository().removeModel(previousModel);
			}
			registeredModels.put(model.getName(), model);
			module.getContext().getModelRepository().addModel(model);
		}

		List<IModel> models = module.getContext().getModelRepository().getModels();
		for (IModel iModel : models) {
			iModel.load();
		}

		preProcess();
		result = execute(module);

		if (disposeModels) {
			module.getContext().getModelRepository().dispose();
		}

		postProcess();
	}

	protected Object execute(IEolExecutableModule module) throws EolRuntimeException {
		return module.execute();
	}

	protected EmfModel createEmfModel(InputModel inputModel, IResourceLocator locator) throws EolModelLoadingException, URISyntaxException {
		ArrayList<URI> metamodelFileURIs = new ArrayList<URI>();
		ArrayList<String> metamodelURIs = new ArrayList<String>();
		for (Metamodel metamodel : inputModel.getModel().getMetamodels()) {
			if (metamodel.getMetamodelURI() != null && !metamodel.getMetamodelURI().isEmpty()) {
				metamodelURIs.add(metamodel.getMetamodelURI());
			} else {
				metamodelFileURIs.add(locator.getEMFURI(metamodel));
			}
		}
		synchronized (inputModel) {
			return createEmfModel(inputModel.getModelAlias(), locator.getEMFURI(inputModel.getModel()), metamodelFileURIs, metamodelURIs, true, false);
		}
	}

	protected EmfModel createEmfModel(OutputModel outputModel, IResourceLocator locator) throws EolModelLoadingException, URISyntaxException {
		ArrayList<URI> metamodelFileURIs = new ArrayList<URI>();
		ArrayList<String> metamodelURIs = new ArrayList<String>();
		for (Metamodel metamodel : outputModel.getModel().getMetamodels()) {
			if (metamodel.getMetamodelURI() != null && !metamodel.getMetamodelURI().isEmpty()) {
				metamodelURIs.add(metamodel.getMetamodelURI());
			} else {
				metamodelFileURIs.add(locator.getEMFURI(metamodel));
			}
		}
		synchronized (outputModel) {
			return createEmfModel(outputModel.getModelAlias(), locator.getEMFURI(outputModel.getModel()), metamodelFileURIs, metamodelURIs, false, true);
		}
	}

	private EmfModel createEmfModel(String name, URI model, List<URI> metamodelFileURI, List<String> metamodelURI, boolean readOnLoad, boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		model = model.appendQuery("id=" + modelsUI);
		emfModel.setModelFileUri(model);
		if (metamodelFileURI != null && !metamodelFileURI.isEmpty()) {
			emfModel.setMetamodelFileUris(metamodelFileURI);
		}
		if (metamodelURI != null && !metamodelURI.isEmpty()) {
			emfModel.setMetamodelUris(metamodelURI);
		}
		emfModel.setCachingEnabled(false);
		emfModel.setReadOnLoad(readOnLoad);
		emfModel.setStoredOnDisposal(storeOnDisposal);
		emfModel.setExpand(true);
		emfModel.setName(name);
		return emfModel;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public void setConsole(IMTCConsole console) {
		this.console = console;
	}

	public IEolExecutableModule getModule() {
		return module;
	}
}
