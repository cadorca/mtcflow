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

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.CancelIndicator;

import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.T2MTransformation;

public class XTEXTTransformationExecutor extends TransformationExecutor {

	@Override
	public void executeTransformation(IExecutionInformation information) throws Exception {
		// if (inputModels.size() != 1) {
		// throw new
		// InvalidConfigurationException("Should be 1 model as an input for the tranformation");
		// }
		// if (transformation instanceof T2MTransformation) {
		// if (outputModels.size() != 1)
		// throw new
		// InvalidConfigurationException("Should be 1 model as an output for the tranformation");
		// }
		final HashMap<String, Resource> inputResourcesAlias = new HashMap<String, Resource>();
		final HashMap<String, Resource> outputResourcesAlias = new HashMap<String, Resource>();

		for (InputModel inModel : inputModels) {
			final Resource inputResource = executionEnvironment.getResourceSet().createResource(locator.getEMFURI(inModel.getModel()));
			inputResourcesAlias.put(inModel.getModelAlias(), inputResource);
		}

		for (InputFile inFile : inputFiles) {
			if (transformation instanceof M2TTransformation) {
				final URI uri = URI.createFileURI(locator.getTarget((M2TTransformation) transformation).getAbsolutePath() + "/" + inFile.getFile().getURI());
				final Resource inResource = executionEnvironment.getResourceSet().createResource(uri);
				inputResourcesAlias.put(inFile.getFile().getName(), inResource);
			} else {
				final Resource inResource = executionEnvironment.getResourceSet().createResource(locator.getEMFURI(inFile.getFile()));
				inputResourcesAlias.put(inFile.getFile().getName(), inResource);
			}

		}

		for (OutputModel outModel : outputModels) {
			final Resource outResource = executionEnvironment.getResourceSet().createResource(locator.getEMFURI(outModel.getModel()));
			outputResourcesAlias.put(outModel.getModelAlias(), outResource);
		}

		for (OutputFile inFile : outputFiles) {
			if (transformation instanceof M2TTransformation) {
				final URI uri = URI.createFileURI(locator.getTarget((M2TTransformation) transformation).getAbsolutePath() + "/" + inFile.getFile().getURI());
				final Resource outResource = executionEnvironment.getResourceSet().createResource(uri);
				outputResourcesAlias.put(inFile.getFile().getName(), outResource);
			} else {
				final Resource outResource = executionEnvironment.getResourceSet().createResource(locator.getEMFURI(inFile.getFile()));
				outputResourcesAlias.put(inFile.getFile().getName(), outResource);
			}

		}

		EcoreUtil.resolveAll(executionEnvironment.getResourceSet());

		for (String resourceAlias : outputResourcesAlias.keySet()) {
			final Resource outResource = outputResourcesAlias.get(resourceAlias);
			final Resource inResource = inputResourcesAlias.get(resourceAlias);
			if (inResource != null) {
				inResource.load(null);
				EcoreUtil2.resolveLazyCrossReferences(inResource, CancelIndicator.NullImpl);
				outResource.getContents().add(inResource.getContents().get(0));
				outResource.save(null);
			}
		}
		
		for (OutputFile outFile : outputFiles) {
			executionEnvironment.fileReady(outFile.getFile(), transformation);
		}

		for (OutputModel model : outputModels) {
			executionEnvironment.modelReady(model.getModel(), transformation);
		}
	}

}
