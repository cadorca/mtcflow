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
package com.mtcflow.engine.eml;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.eml.EmlModule;
import org.eclipse.epsilon.eml.execute.context.EmlContext;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.epsilon.common.EpsilonExecutor;
import com.mtcflow.engine.exception.InvalidConfigurationException;
import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.ReferencedResource;

public class EMLTransformationExecutor extends TransformationExecutor {

	private EpsilonExecutor eclExecutor;
	private EpsilonExecutor emlExecutor;

	@Override
	protected void afterInit() {
		super.afterInit();

		eclExecutor = new EpsilonExecutor() {

			@Override
			public List<IModel> getModels() throws Exception {
				List<IModel> models = new ArrayList<IModel>();
				// input Models
				for (InputModel inputModel : inputModels) {
					models.add(createEmfModel(inputModel, locator));
				}
				// out Models
				for (OutputModel outputModel : outputModels) {
					models.add(createEmfModel(outputModel, locator));				}

				return models;
			}

			@Override
			public IEolExecutableModule createModule() {
				disposeModels = false;
				EclModule ecl = new EclModule();

				List<ReferencedResource> res = transformation.getReferencedResources();
				if (res.size() != 1) {
					throw new InvalidConfigurationException("Should be one referenced resource for the mtl to the ecl file");
				}
				ReferencedResource eclFile = res.get(0);
				try {
					ecl.parse(locator.getFile(eclFile));
				} catch (Exception e) {
					throw new InvalidConfigurationException("Error initilizing the transformation:" + transformation.getName(), e);
				}
				return ecl;
			}
			
			@Override
			protected IExecutionEnvironment getExecutionEnvironment() {
				return executionEnvironment;
			}


			@Override
			public void postProcess() {
			}
		};
		eclExecutor.setConsole(console);

	}

	@Override
	public void executeTransformation(IExecutionInformation information) throws Exception {
		eclExecutor.execute();
		final Object matchTrace = eclExecutor.getResult();
		emlExecutor = new EpsilonExecutor() {

			@Override
			public List<IModel> getModels() throws Exception {
				return eclExecutor.getLoadedModels();
			}

			@Override
			public IEolExecutableModule createModule() {
				EmlModule emlmodule = new EmlModule();
				EmlContext context = emlmodule.getContext();
				context.setMatchTrace(((MatchTrace) matchTrace).getReduced());
				try {
					emlmodule.parse(locator.getFile(transformation));
				} catch (Exception e) {
					throw new InvalidConfigurationException("Error initilizing the transformation:" + transformation.getName(), e);
				}
				return emlmodule;
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
		emlExecutor.setConsole(console);
		emlExecutor.execute();
	}

}
