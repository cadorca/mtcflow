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
package com.mtcflow.engine.eclipse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import com.mtcflow.engine.ExecutionListener;
import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Transformation;

public class MTCEclipseProjectClassLoader extends ExecutionListener {

	private final Map<Transformation, ProjectClassLoader> loaderIndex = Collections.synchronizedMap(new HashMap<Transformation, ProjectClassLoader>());

	@Override
	public void configureClassPath(MTC mtc, String modelPath, Transformation transformation, IExecutionEnvironment executionEnvironment) {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = workspaceRoot.findMember(modelPath);
		ProjectClassLoader loader = null;
		try {
			if (resource != null) {
				loader = new ProjectClassLoader(resource.getProject(), executionEnvironment.getConsole());
				loaderIndex.put(transformation, loader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (loader != null)
				loader.restore();
		}
	}

	public void restoreClassPath(MTC mtc, String modelPath, Transformation transformation) {
		ProjectClassLoader pLoader = loaderIndex.get(transformation);
		pLoader.restore();
	};

}
