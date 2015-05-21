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

import java.io.Serializable;

public class ExecutionData implements Serializable {

	public final static String EXECUTION_INFORMATIN_VALUE = "EXECUTION_INFORMATIN_VALUE";
	public final static String GENERATED_IN_WORKSPACE = "GENERATED_IN_WORKSPACE";

	public boolean storeInWorkspace = false;

}
