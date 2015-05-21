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
package com.mtcflow.engine.eclipse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;

import com.mtcflow.engine.ITechnologyManager;
import com.mtcflow.engine.MTCFlow;
import com.mtcflow.engine.core.MTCChoreographer;
import com.mtcflow.engine.core.TransformationExecutorFactory;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.Script;
import com.mtcflow.model.mtc.Transformation;

public class MTCEclipseUtils {

	private final static String MTC_CONSOLE = "MTC Flow";
	private static EclipseConsole console = null;
	private static boolean REGISTRY_INITIALIZED = false;
	private final static String EXTENSION_POINT_ID = "com.mtcflow.engine.managers";

	public MTCEclipseUtils() {

	}

	public static void initializeRegistry() {
		if (!REGISTRY_INITIALIZED) {
			try {
				IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID); // 1
				if (config != null && config.length > 0) {
					for (IConfigurationElement e : config) { // 2
						try {
							ITechnologyManager tManager = (ITechnologyManager) e.createExecutableExtension("class"); // 3
							List<String> extensions = tManager.getSourceExtensions();
							extensions.addAll(tManager.getCompiledExtensions());
							for (String ext : extensions) {
								MTCFlow.TechnologyManagerRegistry.INSTANCE.put(ext.toLowerCase(), tManager);
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				}
				REGISTRY_INITIALIZED = true;
			} catch (Exception ex) {
				console.logException("Error initializing the techonology registry.", ex);
			}
		}
	}

	public static MTC loadModel(IResource res) {
		IProject project = res.getProject();
		if (res.getProjectRelativePath().toString().endsWith(".mtcd")) {
			res = project.findMember(res.getProjectRelativePath().toPortableString().replaceAll(".mtcd", ".mtc"));
		}
		// Initialize the model
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createPlatformResourceURI(res.getFullPath().toString(), true), true);
		return (MTC) resource.getContents().get(0);
	}

	public static MTCChoreographer startMTC(IResource res, String transformation, List<String> startModels, List<String> tagList) {
		return startMTC(res, transformation, startModels, tagList, new HashMap<String, Object>());
	}

	public static MTCChoreographer startMTC(IResource res, String transformationName, List<String> startModelsNames, List<String> tagList, Map<String, Object> variables) {
		MTCChoreographer mtcChoreographer = null;
		ProjectClassLoader loader = null;
		ArrayList<Model> startModels = new ArrayList<Model>();
		try {
			// Initialize the model
			MTC mtc = (MTC) loadModel(res);
			if (console == null) {
				console = new EclipseConsole(findConsole(MTC_CONSOLE));
			}
			// show the console

			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					String id = IConsoleConstants.ID_CONSOLE_VIEW;
					IConsoleView view = null;
					try {
						view = (IConsoleView) page.showView(id);
					} catch (PartInitException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					view.display(findConsole(MTC_CONSOLE));

				}
			});

			initializeRegistry();
			String mtcPath = res.getFullPath().toPortableString();
			console.clear();
			mtcChoreographer = new MTCChoreographer(mtcPath, mtc, false, false, console, new EclipseResourceLocator(res.getProject(), mtc), new TransformationExecutorFactory(), new EclipseModelEnvironmentManager(), tagList, variables);
			JobExecutorService executorService = new JobExecutorService();
			mtcChoreographer.setExecutorService(executorService);
			// Configure Project classloader
			mtcChoreographer.addExecutionListener(new MTCEclipseProjectClassLoader());
			mtcChoreographer.addExecutionListener(new MTCEclipseProjectRefresh());
			mtcChoreographer.addExecutionListener(new MTCEclipseConsole());
			loader = new ProjectClassLoader(res.getProject(), mtcChoreographer.getConsole());

			Transformation startTransformation = null;
			if (transformationName != null) {
				for (Transformation transf : mtc.getTransformations()) {
					if (transf.getName().equals(transformationName)) {
						startTransformation = transf;
						startTransformation.getFileDependencies().clear();
						startTransformation.getModelDependencies().clear();
						break;
					}
				}
			}
			mtcChoreographer.start(startTransformation);

			// search models by name
			if (startModelsNames != null && startModelsNames.size() > 0) {
				for (String modelName : startModelsNames) {
					for (Model model : mtc.getModels()) {
						if (model.getName().equals(modelName)) {
							startModels.add(model);
							break;
						}
					}
				}
			}

			// detect start models
			if (startModelsNames == null && startTransformation == null) {
				startModelsNames = new ArrayList<String>();
				// Find the models that start the mtc
				for (Model modeli : mtc.getModels()) {
					// Test if the model init the mtc
					boolean startModel = true;
					for (OutputModel outModel : mtc.getOutputModels()) {
						if (outModel.getModel() !=null && outModel.getModel().equals(modeli)) {
							startModel = false;
							break;
						}
					}
					if (startModel) {
						startModels.add(modeli);
					}
				}
				// detect start files
				ArrayList<File> files = new ArrayList<File>();
				// Find the files that start the mtc
				for (File filei : mtc.getFiles()) {
					// Test if the model init the mtc
					boolean startFile = true;
					for (OutputFile outFile : mtc.getOutputFiles()) {
						if (outFile.getFile()!=null && outFile.getFile().equals(filei)) {
							startFile = false;
							break;
						}
					}
					if (startFile) {
						files.add(filei);
					}
				}
				for (File file : files) {
					mtcChoreographer.fileReady(file, null);
				}
			}
			
			if (transformationName != null && startModelsNames == null) {
				for (InputModel inModel : mtc.getInputModels()) {
					if (inModel.getTransformation().getName().equals(transformationName)) {
						mtcChoreographer.modelReady(inModel.getModel(), null);
					}
				}
			}
			
			if (transformationName != null) {
				for (InputFile inFile : mtc.getInputFiles()) {
					if (inFile.getTransformation().getName().equals(transformationName)) {
						mtcChoreographer.fileReady(inFile.getFile(), null);
					}
				}

			}
			
			for (Model startModel : startModels) {
				mtcChoreographer.modelReady(startModel.getName(), null);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (loader != null) {
				loader.restore();
			}
		}
		return mtcChoreographer;
	}

	public static String getResourceFolder(MTCResource mtcResource) {
		MTC mtc = null; 
		if (mtcResource instanceof Library || mtcResource instanceof Script) {
			mtc = (MTC) mtcResource.eContainer().eContainer();
		} else {
			mtc = (MTC) mtcResource.eContainer();
		}
		EclipseResourceLocator locator = new EclipseResourceLocator(null, mtc);
		return locator.getFolder(mtcResource);
	}

	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

}
