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

import com.mtcflow.designer.diagram.edit.commands.ModelEnvironmentCreateCommand;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class ConfigurationConfigurationEnvironmentsCompartmentItemSemanticEditPolicy extends MtcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConfigurationConfigurationEnvironmentsCompartmentItemSemanticEditPolicy() {
		super(MtcElementTypes.Configuration_2037);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MtcElementTypes.ModelEnvironment_3013 == req.getElementType()) {
			return getGEFWrapper(new ModelEnvironmentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
