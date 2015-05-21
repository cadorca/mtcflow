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
package com.mtcflow.engine.eol;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.epsilon.common.EpsilonExecutor;
import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.OutputModel;

public class EOLTransformationExecutor extends TransformationExecutor {

	private EpsilonExecutor executor;

	@Override
	protected void afterInit() {
		super.afterInit();
		executor = new EpsilonExecutor() {

			@Override
			public List<IModel> getModels() throws Exception {
				List<IModel> models = new ArrayList<IModel>();
				// input Models
				for (InputModel inputModel : inputModels) {
					models.add(createEmfModel(inputModel, locator));
				}
				// out Models
				for (OutputModel outputModel : outputModels) {
					models.add(createEmfModel(outputModel, locator));
				}

				return models;
			}

			@Override
			public IEolExecutableModule createModule() {
				EolModule eol = new EolModule();
				try {
					eol.parse(locator.getFile(transformation));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return eol;
			}

			@Override
			public void postProcess() {
				for (OutputModel outputModel : outputModels) {
					executionEnvironment.modelReady(outputModel.getModel(), transformation);
				}
			}
			
			@Override
			protected IExecutionEnvironment getExecutionEnvironment() {
				return executionEnvironment;
			}

		};
		executor.setConsole(console);
	}

	@Override
	public void executeTransformation(IExecutionInformation information) throws Exception {
		executor.execute();
	}

}
