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
/*
 * 
 */
package com.mtcflow.designer.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.mtcflow.designer.diagram.edit.commands.VariableCreateCommand;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class ConfigurationConfigurationVariablesCompartmentItemSemanticEditPolicy extends MtcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConfigurationConfigurationVariablesCompartmentItemSemanticEditPolicy() {
		super(MtcElementTypes.Configuration_2037);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MtcElementTypes.Variable_3010 == req.getElementType()) {
			return getGEFWrapper(new VariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
