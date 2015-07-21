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
package com.mtcflow.engine.egl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.epsilon.common.EpsilonExecutor;
import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.OutputFile;

public class EGLTransformationExecutor extends TransformationExecutor {

	private EpsilonExecutor executor;

	@Override
	protected void afterInit() {
		executor = new EpsilonExecutor() {

			@Override
			public List<IModel> getModels() throws Exception {
				List<IModel> models = new ArrayList<IModel>();
				// input Models
				for (InputModel inputModel : inputModels) {
					models.add(createEmfModel(inputModel, locator));
				}
				return models;
			}

			@Override
			public IEolExecutableModule createModule() {
				EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
				File output = locator.getTarget((M2TTransformation) transformation);
				try {
					output.mkdirs();
				} finally {

				}
				if (!output.isDirectory()) {
					output = output.getParentFile();
				}
				factory.setRoot(output.toURI());
				try {
					factory.setTemplateRoot(locator.getFile(transformation).getParentFile().toURI().toString());
				} catch (EglRuntimeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				EglTemplateFactoryModuleAdapter module = new EglTemplateFactoryModuleAdapter(factory);
				try {
					module.parse(locator.getFile(transformation));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return module;
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
		for (OutputFile file : outputFiles) {
			executionEnvironment.fileReady(file.getFile(), transformation);
		}
	}

}
