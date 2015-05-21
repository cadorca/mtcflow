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
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.Transformation;

public interface IExecutionEnvironment {
	
	public final static String ANY_TAG = "any";

	public void modelReady(Model model, Transformation creator);

	public boolean modelReady(String modelName, Transformation creator);

	public void fileReady(File executor, Transformation creator);

	public IResourceLocator getLocator();

	public IMTCConsole getConsole();

	public void setVariable(String vName, String value);

	public void setVariables(Map map);

	public Object getVariable(String vName);
	
	public String getStringVariable(String vName);
	
	public Map getVaribles();

	public void addExecutionListener(IExecutionListener listener);

	public void remoceExecutionListener(IExecutionListener listener);

	public EPackage.Registry getRegistry();

	public ResourceSet getResourceSet();

	public boolean isStandalone();

	public MTC getMTC();

	public String getMTCPath();

	public ITransformationExecutorFactory getTransformationExecutorFactory();

	public List<String> getTags();

	public boolean isRegisterMetamodels();

	public IModelEnvironmentManager getModelEnvironmentManager();

	public List<IExecutionListener> getListeners();
}
