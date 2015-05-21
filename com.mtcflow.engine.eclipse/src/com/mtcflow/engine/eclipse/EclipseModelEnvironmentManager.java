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

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.IModelEnvironmentManager;
import com.mtcflow.engine.IResourceLocator;
import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.ReferencedResource;

public class EclipseModelEnvironmentManager implements IModelEnvironmentManager {

	private IResourceLocator rLocator = null;

	@Override
	public void configureEnvironment(IExecutionEnvironment mtcChoreographer, ModelEnvironment env) {
		// TODO Auto-generated method stub
	}

	@Override
	public void configureReferencedResource(IExecutionEnvironment executionEnvironment, List<ModelEnvironment> enviroments, ReferencedResource referencedResource) {
		if (referencedResource.getType().equals("UML_PROFILE")) {
			String path = rLocator.getAbsolutFilePath(referencedResource);
			path = path + ".ecore";
			File compiledFile = new File(path);
			URI uri = null;
			if (compiledFile.exists()) {
				uri = URI.createFileURI(path);
			} else {
				uri = rLocator.getEMFURI(referencedResource);
			}
			Resource r = executionEnvironment.getResourceSet().getResource(uri, true);
			EObject obj = r.getContents().get(0);
			EPackage pck = null;
//			if (obj instanceof Profile) {
//				Profile profile = (Profile) obj;
//				pck = profile.define();
//			} else if (obj instanceof EPackage) {
//				pck = (EPackage) obj;
//			}
			if (pck != null) {
				EPackage.Registry.INSTANCE.put(pck.getNsURI(), pck);
			}
		}
	}

	@Override
	public void setResourceLocator(IResourceLocator locator) {
		this.rLocator = locator;
	}

}
