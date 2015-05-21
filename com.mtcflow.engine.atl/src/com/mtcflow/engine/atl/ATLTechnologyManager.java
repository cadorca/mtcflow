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
package com.mtcflow.engine.atl;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.m2m.atl.engine.compiler.CompileTimeError;
import org.eclipse.m2m.atl.engine.compiler.atl2006.Atl2006Compiler;

import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.ITechnologyManager;
import com.mtcflow.engine.transformation.ITransformationExecutor;
import com.mtcflow.engine.validation.IValidationExecutor;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;

public class ATLTechnologyManager implements ITechnologyManager {

	private final static Atl2006Compiler compiler = new Atl2006Compiler();
	private final static ArrayList<String> sourceExtensions = new ArrayList<String>();
	private final static ArrayList<String> compiledExtensions = new ArrayList<String>();
	public final static String ATL_SOURCE_EXTENSION = "atl";
	public final static String ATL_COMPILED_EXTENSION = "asm";

	public ATLTechnologyManager() {
		if (sourceExtensions.isEmpty()) {
			sourceExtensions.add(ATL_SOURCE_EXTENSION);
			compiledExtensions.add(ATL_COMPILED_EXTENSION);
		}
	}

	@Override
	public void compile(File resource, String buildID, IMTCConsole console) throws Exception {
		CompileTimeError[] errors = compiler.compile(new FileInputStream(resource), resource.getAbsolutePath().replace(".atl", ".asm"));
		if(errors.length!=0){
			StringBuilder sb = new StringBuilder();
			for (CompileTimeError compileTimeError : errors) {
				String message = "Compiler "+compileTimeError.getSeverity()+": "+compileTimeError.getDescription()+"(Location:"+compileTimeError.getLocation()+")";
				console.printError(message);
				sb.append(message).append("\n");
			}
			throw new RuntimeException("The transformation cant be compiled. \n"+sb.toString());
		}
	}

	@Override
	public void compileFolder(File folder, String buildID, IMTCConsole console) throws Exception {
		File[] files = folder.listFiles();
		for (File file : files) {
			compile(file, buildID, console);
		}
	}

	@Override
	public ITransformationExecutor createTransformationExecutor(Transformation transformation) {
		return new ATLTransformationExecutor();
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
	public IValidationExecutor createValidationExecutor(Validation validation) {
		return null;
	}

	@Override
	public String getCompiledExtension(String extension) {
		extension = extension.toLowerCase();
		if (extension.equals(ATL_SOURCE_EXTENSION))
			return ATL_COMPILED_EXTENSION;
		return null;
	}

	@Override
	public String getSourceExtension(String extension) {
		extension = extension.toLowerCase();
		if (extension.equals(ATL_COMPILED_EXTENSION))
			return ATL_SOURCE_EXTENSION;
		return null;
	}

}
