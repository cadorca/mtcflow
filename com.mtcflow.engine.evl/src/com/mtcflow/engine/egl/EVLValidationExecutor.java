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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.EvlUnsatisfiedConstraint;
import org.eclipse.epsilon.evl.execute.context.IEvlContext;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.epsilon.common.EpsilonExecutor;
import com.mtcflow.engine.validation.IValidationMessage.MessageType;
import com.mtcflow.engine.validation.IValidationResult;
import com.mtcflow.engine.validation.ValidationExecutor;
import com.mtcflow.engine.validation.ValidationResult;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.MtcFactory;

public class EVLValidationExecutor extends ValidationExecutor {

	private EvlModule evlModule;
	private EpsilonExecutor executor;

	@Override
	protected void postInit() {
		executor = new EpsilonExecutor() {

			@Override
			public List<IModel> getModels() throws Exception {
				List<IModel> models = new ArrayList<IModel>();
				// input Models
				InputModel inModel = MtcFactory.eINSTANCE.createInputModel();
				inModel.setModel(model);
				inModel.setModelAlias(model.getName());
				models.add(createEmfModel(inModel, locator));
				return models;
			}

			@Override
			public IEolExecutableModule createModule() {
				evlModule = new EvlModule();
				try {
					evlModule.parse(locator.getFile(validation));
				} catch (Exception e) {
					e.printStackTrace();
				}
				return evlModule;
			}

			@Override
			protected IExecutionEnvironment getExecutionEnvironment() {
				return executionEnvironment;
			}

		};

		executor.setConsole(console);
	}

	@Override
	public IValidationResult execute() throws Exception {
		executor.execute();
		IEvlContext context = evlModule.getContext();
		List<EvlUnsatisfiedConstraint> uContraints = context.getUnsatisfiedConstraints();
		ValidationResult vResult = new ValidationResult(uContraints.isEmpty());
		for (EvlUnsatisfiedConstraint evlUnsatisfiedConstraint : uContraints) {
			vResult.addMessage(evlUnsatisfiedConstraint.getMessage(), MessageType.ERROR);
		}
		return vResult;
	}

}
