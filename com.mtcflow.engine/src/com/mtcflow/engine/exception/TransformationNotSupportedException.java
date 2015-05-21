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
package com.mtcflow.engine.exception;

public class TransformationNotSupportedException extends Exception {

	private static final long serialVersionUID = 1L;

	public TransformationNotSupportedException(String transformationName) {
		super("Transformation Not Supported for URI: " + transformationName);
	}

	public TransformationNotSupportedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TransformationNotSupportedException(Throwable arg0) {
		super(arg0);
	}

}
