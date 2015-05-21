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
package com.mtcflow.engine.xtext;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.ITechnologyManager;
import com.mtcflow.engine.transformation.ITransformationExecutor;
import com.mtcflow.engine.validation.IValidationExecutor;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;

public class XTEXTTechnologyManager implements ITechnologyManager {

	private final static ArrayList<String> sourceExtensions = new ArrayList<String>();
	private final static ArrayList<String> compiledExtensions = new ArrayList<String>();
	private final static String XTEXT_SOURCE_EXTENSION = "xtext";
	private final static String XTEXT_COMPILED_EXTENSION = "xtext";

	public XTEXTTechnologyManager() {
		if (sourceExtensions.isEmpty()) {
			sourceExtensions.add(XTEXT_SOURCE_EXTENSION);
			compiledExtensions.add(XTEXT_COMPILED_EXTENSION);
		}
	}

	@Override
	public void compile(File resource, String buildID, IMTCConsole console) throws Exception {

	}

	@Override
	public void compileFolder(File folder, String buildID, IMTCConsole console) throws Exception {

	}

	@Override
	public ITransformationExecutor createTransformationExecutor(Transformation transformation) {
		return new XTEXTTransformationExecutor();
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
	public String getSourceExtension(String extension) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IValidationExecutor createValidationExecutor(Validation validation) {
		return null;
	}

	@Override
	public String getCompiledExtension(String extension) {
		return null;
	}
}
