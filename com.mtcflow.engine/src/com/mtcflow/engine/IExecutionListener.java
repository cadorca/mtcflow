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
package com.mtcflow.engine;

import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.Transformation;

public interface IExecutionListener {

	public void beforeStartExecution(MTC mtc, String modelPath, IExecutionEnvironment executionEnvironment);

	public void afterFinishExecution(MTC mtc, String modelPath, IExecutionEnvironment executionEnvironment);

	public void configureClassPath(MTC mtc, String modelPath, Transformation transformation, IExecutionEnvironment executionEnvironment);

	public void restoreClassPath(MTC mtc, String modelPath, Transformation transformation, IExecutionEnvironment executionEnvironment);

	public void beforeExecuteTransformation(MTC mtc, String modelPath, Transformation transformation, IExecutionEnvironment executionEnvironment);

	public void afterExecuteTransformation(MTC mtc, String modelPath, Transformation transformation, IExecutionEnvironment executionEnvironment);

	public abstract void modelReady(Model model, Transformation transformation, IExecutionEnvironment executionEnvironment);

	public abstract void fileReady(File file, Transformation transformation, IExecutionEnvironment executionEnvironment);

}
