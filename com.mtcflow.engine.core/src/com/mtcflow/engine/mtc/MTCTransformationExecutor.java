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
package com.mtcflow.engine.mtc;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.mtcflow.engine.IExecutionListener;
import com.mtcflow.engine.core.MTCChoreographer;
import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Model;

public class MTCTransformationExecutor extends TransformationExecutor {

	@Override
	public void executeTransformation(IExecutionInformation information) throws Exception {
		java.io.File f = locator.getFile(transformation);
		if (!f.exists()) {

		}
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createFileURI(locator.getAbsolutFilePath(transformation)), true);
		MTC mtc = (MTC) resource.getContents().get(0);
		MTCChoreographer choreographer = new MTCChoreographer(locator.getAbsolutFilePath(transformation), mtc, executionEnvironment.isStandalone(), executionEnvironment.isRegisterMetamodels(), console, executionEnvironment.getRegistry(),
				executionEnvironment.getLocator(), executionEnvironment.getTransformationExecutorFactory(), executionEnvironment.getModelEnvironmentManager(), executionEnvironment.getTags(), executionEnvironment.getVaribles());
		List<IExecutionListener> listeners = executionEnvironment.getListeners();
		for (IExecutionListener iExecutionListener : listeners) {
			choreographer.addExecutionListener(iExecutionListener);
		}
		MTCExecutionListener listener = new MTCExecutionListener(this);
		executionEnvironment.addExecutionListener(listener);
		executionEnvironment.setVariables(executionEnvironment.getVaribles());
		choreographer.start();
		for (InputModel inModel : inputModels) {
			Model model = choreographer.getModel(inModel.getModel().getName());
			if(model==null){
				console.printError("The input models of the MTC "+mtc.getName()+" are different from the specified in the Main MTC, check the names.");
				return;
			}
			model.setURI(inModel.getModel().getURI());
			model.setExecutionInformation(inModel.getModel().getExecutionInformation());
			choreographer.modelReady(model, transformation);
		}
		for (InputFile filei : inputFiles) {
			File file = choreographer.getFile(filei.getFile().getName());
			file.setURI(filei.getFile().getURI());
			filei.getFile().setExecutionInformation(file.getExecutionInformation());
			choreographer.fileReady(file, transformation); 
		}
	}

}
