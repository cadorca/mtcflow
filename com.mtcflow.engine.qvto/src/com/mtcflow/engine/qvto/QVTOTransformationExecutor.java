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
package com.mtcflow.engine.qvto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;

import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.OutputModel;

public class QVTOTransformationExecutor extends TransformationExecutor {

	@Override
	public void executeTransformation(IExecutionInformation information) throws Exception {
		ArrayList<OutputModelInfo> outQVTModels = new ArrayList<QVTOTransformationExecutor.OutputModelInfo>();
		org.eclipse.m2m.qvt.oml.TransformationExecutor executor = new org.eclipse.m2m.qvt.oml.TransformationExecutor(locator.getEMFURI(transformation), executionEnvironment.getRegistry());
		ExecutionContextImpl context = new ExecutionContextImpl();
		ResourceSet resourceSet = new ResourceSetImpl();
		ArrayList<ModelExtent> lModels = new ArrayList<ModelExtent>();

		for (InputModel inModel : inputModels) {
			Resource inResource = resourceSet.getResource(locator.getEMFURI(inModel.getModel()), true);
			lModels.add(new BasicModelExtent(inResource.getContents()));
		}

		// set the output models
		for (OutputModel outModel : outputModels) {
			BasicModelExtent bmx = new BasicModelExtent();
			lModels.add(bmx);
			outQVTModels.add(new OutputModelInfo(outModel.getModel(), bmx));
		}
		context.setConfigProperty("keepModeling", true);

		ExecutionDiagnostic result = executor.execute(context, lModels.toArray(new BasicModelExtent[0]));
		// check the result for success
		if (result.getSeverity() == Diagnostic.OK) {
			for (OutputModelInfo outputModelInfo : outQVTModels) {
				// the output objects got captured in the output extent
				List<EObject> outObjects = outputModelInfo.basicExtend.getContents();
				// let's persist them using a resource
				ResourceSet resourceSet2 = new ResourceSetImpl();
				Resource outResource = resourceSet2.createResource(locator.getEMFURI(outputModelInfo.mtcModel));
				outResource.getContents().addAll(outObjects);
				outResource.save(Collections.emptyMap());
				executionEnvironment.modelReady(outputModelInfo.mtcModel, transformation);
			}
		} else {
			System.out.println(result.getMessage());
			// turn the result diagnostic into status and send it to error
		}
	}

	private class OutputModelInfo {

		public Model mtcModel;
		public BasicModelExtent basicExtend;

		public OutputModelInfo(Model mtcModel, BasicModelExtent basicExtend) {
			super();
			this.mtcModel = mtcModel;
			this.basicExtend = basicExtend;
		}

	}

}
