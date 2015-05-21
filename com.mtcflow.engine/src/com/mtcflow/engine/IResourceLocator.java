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
import java.io.InputStream;

import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTCResource;

public interface IResourceLocator {

	public org.eclipse.emf.common.util.URI getEMFURI(MTCResource resource);

	public String getWorkingFolder();

	public String getPath(MTCResource resource);

	public String getAbsolutFilePath(MTCResource resource);

	public File getFile(MTCResource resource);

	public File getTarget(M2TTransformation resource);

	public InputStream getInputStream(MTCResource resource);

	public String getResourceExtension(MTCResource resource);

	public String getDefaultResourceExtension(MTCResource resource);

	public <T> T getResourceAs(Class<T> clazz, MTCResource resource);

	public <T> T getResourceSourceAs(Class<T> clazz, MTCResource resource);

	public File findFile(String path);

}
