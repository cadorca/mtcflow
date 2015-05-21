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

public class InvalidConfigurationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidConfigurationException() {
		super();
	}

	public InvalidConfigurationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidConfigurationException(String arg0) {
		super(arg0);
	}

	public InvalidConfigurationException(Throwable arg0) {
		super(arg0);
	}

}
