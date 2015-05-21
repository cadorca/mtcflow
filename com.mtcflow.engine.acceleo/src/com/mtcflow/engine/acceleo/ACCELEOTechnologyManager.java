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
package com.mtcflow.engine.acceleo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.acceleo.common.internal.utils.AcceleoPackageRegistry;
import org.eclipse.emf.ecore.EPackage;

import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.ITechnologyManager;
import com.mtcflow.engine.transformation.ITransformationExecutor;
import com.mtcflow.engine.validation.IValidationExecutor;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;

public class ACCELEOTechnologyManager implements ITechnologyManager {

	private final static ArrayList<String> sourceExtensions = new ArrayList<String>();
	private final static ArrayList<String> compiledExtensions = new ArrayList<String>();
	private final static String ACCELEO_SOURCE_EXTENSION = "mtl";
	private final static String ACCELEO_COMPILED_EXTENSION = "emtl";
	private final static String COMPILATION_IN_PROGESS_FILE_NAME = ".accp";
	private final static String BUILD_ID_NAME = "buildID";

	public ACCELEOTechnologyManager() {
		if (sourceExtensions.isEmpty()) {
			sourceExtensions.add(ACCELEO_SOURCE_EXTENSION);
			compiledExtensions.add(ACCELEO_COMPILED_EXTENSION);
		}
	}

	@Override
	public void compile(File resource, String buildID, IMTCConsole console) throws Exception {
		compileFolder(resource.getParentFile(), buildID, console);
	}

	@Override
	public void compileFolder(File folder, String buildID, IMTCConsole console) throws Exception {
		File originalFolder = folder;
		if (folder.getParentFile() != null) {
			while (!folder.getName().equals("transformations") && !folder.getParentFile().getName().equals("transformations")) {
				folder = folder.getParentFile();
				if (folder == null) {
					folder = originalFolder;
					break;
				}
			}
		}

		File tmp = new File(folder, COMPILATION_IN_PROGESS_FILE_NAME);
		Properties pro = new Properties();
		if (tmp.exists()) {
			pro.load(new FileInputStream(tmp));
			String id = pro.getProperty(BUILD_ID_NAME);
			if (id != null && id.equals(buildID)) {
				return;
			}
		}
		pro.setProperty(BUILD_ID_NAME, buildID);
		pro.store(new FileOutputStream(tmp), null);
		Map<String, String> originalMap = AcceleoPackageRegistry.INSTANCE.getDynamicEcorePackagePaths();
		for (String key : originalMap.keySet()) {
			AcceleoPackageRegistry.INSTANCE.get(key);
			AcceleoPackageRegistry.INSTANCE.put(key, EPackage.Registry.INSTANCE.get(key));
		}
		AcceleoPackageRegistry.INSTANCE.getDynamicEcorePackagePaths().clear();
		deleteCompiledAcceleoFiles(folder);
		MTCFlowAcceleoCompiler acceleoCompilerHelper = new MTCFlowAcceleoCompiler();
		acceleoCompilerHelper.setDependencies(folder.getAbsolutePath());
		acceleoCompilerHelper.setSourceFolder(folder.getAbsolutePath());
		acceleoCompilerHelper.setOutputFolder(folder.getAbsolutePath());
		acceleoCompilerHelper.setBinaryResource(false);
		acceleoCompilerHelper.execute();
		AcceleoPackageRegistry.INSTANCE.getDynamicEcorePackagePaths().putAll(originalMap);
	}

	public void deleteCompiledAcceleoFiles(File folder) {
		File[] files = folder.listFiles();
		/*
		 * Arrays.sort(files, new Comparator<File>() { public int compare(File
		 * o1, File o2) { return -o1.getName().compareTo(o2.getName()); } });
		 */
		for (File fi : files) {
			if (fi.isDirectory()) {
				deleteCompiledAcceleoFiles(fi);
			} else if (fi.getName().endsWith(ACCELEO_COMPILED_EXTENSION)) {
				fi.delete();
			}
		}
	}

	@Override
	public ITransformationExecutor createTransformationExecutor(Transformation transformation) {
		return new ACCELEOTransformationExecutor();
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
		if (extension.equals(ACCELEO_SOURCE_EXTENSION))
			return ACCELEO_COMPILED_EXTENSION;
		return null;
	}

	@Override
	public String getSourceExtension(String extension) {
		extension = extension.toLowerCase();
		if (extension.equals(ACCELEO_COMPILED_EXTENSION))
			return ACCELEO_SOURCE_EXTENSION;
		return null;
	}

}
