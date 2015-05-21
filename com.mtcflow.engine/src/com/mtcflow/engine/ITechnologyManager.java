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

import java.io.File;
import java.util.List;

import com.mtcflow.engine.transformation.ITransformationExecutor;
import com.mtcflow.engine.validation.IValidationExecutor;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;

public interface ITechnologyManager {

	public List<String> getSourceExtensions();

	public List<String> getCompiledExtensions();

	public String getCompiledExtension(String extension);

	public String getSourceExtension(String extension);

	public void compile(File resource, String buildID, IMTCConsole console) throws Exception;

	public void compileFolder(File folder, String buildID, IMTCConsole console) throws Exception;

	public ITransformationExecutor createTransformationExecutor(Transformation transformation);

	public IValidationExecutor createValidationExecutor(Validation validation);
}
