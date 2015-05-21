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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.mtcflow.engine.ExecutionListener;
import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Transformation;

public class MTCEclipseProjectRefresh extends ExecutionListener {

	@Override
	public void afterExecuteTransformation(MTC mtc, String modelPath, Transformation transformation, IExecutionEnvironment executionEnvironment) {
		try {
			if (transformation instanceof M2TTransformation) {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot workspaceRoot = workspace.getRoot();
				IResource resource = workspaceRoot.findMember(modelPath);
				M2TTransformation trans = (M2TTransformation) transformation;
				IResource generatedFolder;
				if (transformation instanceof HOTransformation) {
					generatedFolder = resource.getProject().getFolder(EclipseResourceLocator.WORKSPACE_FOLDER + "/" + trans.getTarget());
				} else {
					generatedFolder = resource.getProject().getFolder(trans.getTarget());
				}

				try {
					generatedFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void afterFinishExecution(MTC mtc, String modelPath, IExecutionEnvironment executionEnvironment) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		IResource modelResource = workspaceRoot.findMember(modelPath);
		if (modelResource != null) {
			try {
				IResource modelsFolderResource = modelResource.getProject().findMember(mtc.getModelsFolder());
				modelsFolderResource.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void beforeStartExecution(MTC mtc, String modelPath, IExecutionEnvironment executionEnvironment) {
		// TODO Auto-generated method stub
		super.beforeStartExecution(mtc, modelPath, executionEnvironment);
	}
}
