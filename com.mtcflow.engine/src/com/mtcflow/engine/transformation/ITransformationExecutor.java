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
package com.mtcflow.engine.transformation;

import java.util.List;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.IResourceLocator;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.Transformation;

public interface ITransformationExecutor {

	public void init(IResourceLocator locator, 
			IExecutionEnvironment executionEnvironment, 
			List<InputModel> inputModels, 
			List<OutputModel> outputModels,
			List<InputFile> inputFiles, 
			List<OutputFile> outputFiles,
			Transformation transformation, 
			IMTCConsole console);

	public void executeTransformation(IExecutionInformation information) throws Exception;

	public Transformation getTransformation();

	/**
	 * Notifies the transformation that a input model is ready, the
	 * choreographer will immediately invoke the isReady() method.
	 * 
	 * @param model
	 */
	public void modelReady(Model model, Transformation transformation);

	/**
	 * Notifies the transformation that a input file is ready, the choreographer
	 * will immediately invoke the isReady() method.
	 * 
	 * @param model
	 */
	public void fileReady(File file, Transformation transformation);

	/**
	 * The choreographer will invoke this method to validate that the
	 * transformation is ready to start, if it returns TRUE the transformation
	 * begin otherwise nothing happen
	 * 
	 * @return
	 */
	public boolean isReady();
}
