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
package com.mtcflow.engine.validation;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.IResourceLocator;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.Validation;

public interface IValidationExecutor {

	public void init(Model model, IExecutionEnvironment executionEnvironment, IResourceLocator locator, Validation validation, IMTCConsole console);

	public abstract IValidationResult execute() throws Exception;

}
