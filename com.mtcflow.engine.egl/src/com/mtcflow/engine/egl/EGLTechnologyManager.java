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

import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.ITechnologyManager;
import com.mtcflow.engine.transformation.ITransformationExecutor;
import com.mtcflow.engine.validation.IValidationExecutor;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;

public class EGLTechnologyManager implements ITechnologyManager {

	private final static ArrayList<String> sourceExtensions = new ArrayList<String>();
	private final static ArrayList<String> compiledExtensions = new ArrayList<String>();
	private final static String EGL_SOURCE_EXTENSION = "egl";
	private final static String EGL_COMPILED_EXTENSION = "egl";

	static {
		if (sourceExtensions.isEmpty()) {
			sourceExtensions.add(EGL_SOURCE_EXTENSION);
			compiledExtensions.add(EGL_COMPILED_EXTENSION);
		}
	}

	@Override
	public List<String> getSourceExtensions() {
		return sourceExtensions;
	}

	@Override
	public List<String> getCompiledExtensions() {
		return compiledExtensions;
	}

	@Override
	public String getCompiledExtension(String extension) {
		return EGL_COMPILED_EXTENSION;
	}

	@Override
	public String getSourceExtension(String extension) {
		return EGL_COMPILED_EXTENSION;
	}

	@Override
	public void compile(File resource, String buildID, IMTCConsole console) throws Exception {
	}

	@Override
	public void compileFolder(File folder, String buildID, IMTCConsole console) throws Exception {
	}

	@Override
	public ITransformationExecutor createTransformationExecutor(Transformation transformation) {
		return new EGLTransformationExecutor();
	}

	@Override
	public IValidationExecutor createValidationExecutor(Validation validation) {
		// TODO Auto-generated method stub
		return null;
	}
}
