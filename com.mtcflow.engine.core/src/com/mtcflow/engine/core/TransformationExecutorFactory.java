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
package com.mtcflow.engine.core;

import com.mtcflow.engine.ITechnologyManager;
import com.mtcflow.engine.ITransformationExecutorFactory;
import com.mtcflow.engine.MTCFlow;
import com.mtcflow.engine.exception.TransformationNotSupportedException;
import com.mtcflow.engine.transformation.ITransformationExecutor;
import com.mtcflow.model.mtc.Transformation;

public class TransformationExecutorFactory implements ITransformationExecutorFactory {

	@Override
	public ITransformationExecutor createTransformationExecutor(String extension, Transformation transformation) throws TransformationNotSupportedException {
		if (transformation.getImplementationClass() != null && !transformation.getImplementationClass().isEmpty()) {
			try { 
				Class cls = Thread.currentThread().getContextClassLoader().loadClass(transformation.getImplementationClass());
				return (ITransformationExecutor) cls.newInstance();
			} catch (Exception ex) {
				throw new TransformationNotSupportedException(ex);
			}
		}
		ITechnologyManager tManager = MTCFlow.TechnologyManagerRegistry.INSTANCE.get(extension.toLowerCase());
		if (tManager != null) {
			return tManager.createTransformationExecutor(transformation);
		} else {
			return new NotSupportedTransformationExecutor(transformation.getURI());
		}
	}

}
