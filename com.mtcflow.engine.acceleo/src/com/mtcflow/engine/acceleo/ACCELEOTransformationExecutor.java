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
package com.mtcflow.engine.acceleo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.acceleo.common.internal.utils.AcceleoPackageRegistry;
import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.acceleo.common.utils.ModelUtils;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.mtcflow.engine.exception.InvalidConfigurationException;
import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.Transformation;

public class ACCELEOTransformationExecutor extends TransformationExecutor {
	private List<String> templates;
	
	public static List<String> getTemplatesName(Transformation transformation){
		ArrayList<String> templatesNames = new ArrayList<String>();
		String tNames = transformation.getProperty("templateNames");
		if(tNames!=null && !tNames.trim().isEmpty()){
			String[] templateNamesArr = tNames.split(",");
			for (String tName : templateNamesArr) {
				templatesNames.add(tName);
			}
		}
		return templatesNames;
	}

	@Override
	public void executeTransformation(IExecutionInformation information) throws Exception {
		M2TTransformation trans = (M2TTransformation) transformation;
		templates = getTemplatesName(trans);
		if (templates.isEmpty()) {
			throw new InvalidConfigurationException("At least one template should be specified for the transformation, check the TemplateNames property.");
		}
		final M2TTransformation m2mTransformation = (M2TTransformation) transformation;
		final AbstractAcceleoGenerator generator = new AbstractAcceleoGenerator() {

			@Override
			public String[] getTemplateNames() {
				return templates.toArray(new String[0]);
			}

			@Override
			public String getModuleName() {
				return "";
			}

			@Override
			protected URL findModuleURL(String moduleName) {
				try {
					String path = locator.getAbsolutFilePath(m2mTransformation);
					path = path.replaceAll("mtl", "emtl");
					return new File(path).toURI().toURL();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}

		};

		List<EObject> arguments = new ArrayList<EObject>();
		Collections.sort(inputModels, new Comparator<InputModel>() {
			@Override
			public int compare(InputModel in1, InputModel in2) {
				int om1 = in1.getIndex() != null ? in1.getIndex() : 0;
				int om2 = in2.getIndex() != null ? in2.getIndex() : 0;
				return om1 - om2;
			}
		});
		if (inputModels.size() > 1) {
			for (int i = 1; i < inputModels.size(); i++) {
				EObject modeli = ModelUtils.load(locator.getEMFURI(inputModels.get(i).getModel()), executionEnvironment.getResourceSet());
				arguments.add(modeli);
			}
		}
		Map<String, String> originalMap = AcceleoPackageRegistry.INSTANCE.getDynamicEcorePackagePaths();
		for (String key : originalMap.keySet()) {
			AcceleoPackageRegistry.INSTANCE.get(key);
			AcceleoPackageRegistry.INSTANCE.put(key, EPackage.Registry.INSTANCE.get(key));
		}
		AcceleoPackageRegistry.INSTANCE.getDynamicEcorePackagePaths().clear();
		// AcceleoPackageRegistry.INSTANCE.getDynamicEcorePackagePaths().clear();
		boolean originalState = AcceleoPreferences.areNotificationsForcedDisabled();
		AcceleoPreferences.switchForceDeactivationNotifications(true);
		EObject obj = ModelUtils.load(locator.getEMFURI(inputModels.get(0).getModel()), executionEnvironment.getResourceSet());
		generator.initialize(obj, locator.getTarget(m2mTransformation), arguments);
		AcceleoListener listener = new AcceleoListener(transformation, console);
		generator.addGenerationListener(listener);
		generator.doGenerate(null);
		AcceleoPreferences.switchForceDeactivationNotifications(originalState);
		// AcceleoPackageRegistry.INSTANCE.getDynamicEcorePackagePaths().putAll(originalMap);
		for (com.mtcflow.model.mtc.OutputFile file : outputFiles) {
			executionEnvironment.fileReady(file.getFile(), transformation);
		}
		if (listener.getTotalGeneratedFiles() < 1) {
			console.printError("The transformation " + transformation.getName() + " doesn't generate any file. Check your templates and input models.");
		}
		AcceleoPackageRegistry.INSTANCE.getDynamicEcorePackagePaths().putAll(originalMap);

	}

}
