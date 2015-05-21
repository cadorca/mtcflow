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

import java.util.List;

import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.ReferencedResource;

public interface IModelEnvironmentManager {

	public void configureEnvironment(IExecutionEnvironment mtcChoreographer, ModelEnvironment env);

	public void configureReferencedResource(IExecutionEnvironment mtcChoreographer, List<ModelEnvironment> enviroments, ReferencedResource referencedResource);

	public void setResourceLocator(IResourceLocator locator);
}
