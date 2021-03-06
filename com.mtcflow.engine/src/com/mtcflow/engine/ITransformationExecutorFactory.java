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

import com.mtcflow.engine.exception.TransformationNotSupportedException;
import com.mtcflow.engine.transformation.ITransformationExecutor;
import com.mtcflow.model.mtc.Transformation;

public interface ITransformationExecutorFactory {

	public ITransformationExecutor createTransformationExecutor(String extension, Transformation transformation) throws TransformationNotSupportedException;

}
