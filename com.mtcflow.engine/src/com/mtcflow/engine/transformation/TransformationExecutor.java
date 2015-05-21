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
package com.mtcflow.engine.transformation;

import java.util.ArrayList;
import java.util.List;

import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.IResourceLocator;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.T2MTransformation;
import com.mtcflow.model.mtc.Transformation;

public abstract class TransformationExecutor implements ITransformationExecutor {

	protected IResourceLocator locator;
	protected IExecutionEnvironment executionEnvironment;
	protected List<InputModel> inputModels;
	protected List<OutputModel> outputModels;
	protected List<InputFile> inputFiles;
	protected List<OutputFile> outputFiles;
	protected ArrayList<MTCResource> pendingResources;
	protected Transformation transformation;
	protected IMTCConsole console;

	@Override
	public void init(IResourceLocator locator, IExecutionEnvironment executionEnvironment, List<InputModel> inputModels, List<OutputModel> outputModels, List<InputFile> inputFiles, List<OutputFile> outFiles, Transformation transformation, IMTCConsole console) {
		beforeInit();
		this.locator = locator;
		this.executionEnvironment = executionEnvironment;
		this.inputModels = (inputModels != null ? inputModels : new ArrayList<InputModel>());
		this.outputModels = (outputModels != null ? outputModels : new ArrayList<OutputModel>());
		this.inputFiles = (inputFiles != null ? inputFiles : new ArrayList<InputFile>());
		this.outputFiles = (outFiles != null ? outFiles : new ArrayList<OutputFile>());
		this.transformation = transformation;
		this.console = console;
		pendingResources = new ArrayList<MTCResource>();
		for (InputModel inputModel : inputModels) {
			pendingResources.add(inputModel.getModel());
		}
		for (InputFile inputFile : inputFiles) {
			pendingResources.add(inputFile.getFile());
		}

		afterInit();
	}

	protected void beforeInit() {

	}

	protected void afterInit() {

	}

	@Override
	public Transformation getTransformation() {
		return transformation;
	}

	@Override
	public void modelReady(Model model, Transformation transformation) {
		pendingResources.remove(model);
	}

	@Override
	public void fileReady(File file, Transformation transformation) {
		pendingResources.remove(file);
	}

	@Override
	public boolean isReady() {
		return pendingResources.isEmpty();
	}

	public void notifyAllModelsReady() {
		for (OutputModel oModel : outputModels) {
			executionEnvironment.modelReady(oModel.getModel(), transformation);
		}
	}

	public IResourceLocator getLocator() {
		return locator;
	}

	public void setLocator(IResourceLocator locator) {
		this.locator = locator;
	}

	public IExecutionEnvironment getExecutionEnvironment() {
		return executionEnvironment;
	}

	public void setExecutionEnvironment(IExecutionEnvironment executionEnvironment) {
		this.executionEnvironment = executionEnvironment;
	}

	public List<InputModel> getInputModels() {
		return inputModels;
	}

	public void setInputModels(List<InputModel> inputModels) {
		this.inputModels = inputModels;
	}

	public List<OutputModel> getOutputModels() {
		return outputModels;
	}

	public void setOutputModels(List<OutputModel> outputModels) {
		this.outputModels = outputModels;
	}

	public List<InputFile> getInputFiles() {
		return inputFiles;
	}

	public void setInputFiles(List<InputFile> inputFiles) {
		this.inputFiles = inputFiles;
	}

	public List<OutputFile> getOutputFiles() {
		return outputFiles;
	}

	public void setOutputFiles(List<OutputFile> outputFiles) {
		this.outputFiles = outputFiles;
	}

	public ArrayList<MTCResource> getPendingResources() {
		return pendingResources;
	}

	public void setPendingResources(ArrayList<MTCResource> pendingResources) {
		this.pendingResources = pendingResources;
	}

	public IMTCConsole getConsole() {
		return console;
	}

	public void setConsole(IMTCConsole console) {
		this.console = console;
	}

	public void setTransformation(Transformation transformation) {
		this.transformation = transformation;
	}

}
