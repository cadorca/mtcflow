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
package com.mtcflow.designer.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import com.mtcflow.designer.diagram.edit.parts.MTCEditPart;
import com.mtcflow.designer.diagram.edit.parts.MtcEditPartFactory;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;

/**
 * @generated
 */
public class MtcEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public MtcEditPartProvider() {
		super(new MtcEditPartFactory(), MtcVisualIDRegistry.TYPED_INSTANCE, MTCEditPart.MODEL_ID);
	}
}
