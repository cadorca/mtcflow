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

public class ExecutionInformation implements IExecutionInformation {

	protected boolean enableProfile;

	public ExecutionInformation() {
		enableProfile = false;
	}

	public ExecutionInformation(boolean enableProfile) {
		super();
		this.enableProfile = enableProfile;
	}

	@Override
	public boolean enableProfile() {
		return enableProfile;
	}

	public void setEnableProfile(boolean enableProfile) {
		this.enableProfile = enableProfile;
	}

}
