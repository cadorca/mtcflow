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
package com.mtcflow.designer.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;

/**
 * @generated
 */
public class MtcNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7014;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7013;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MtcNavigatorItem) {
			MtcNavigatorItem item = (MtcNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MtcVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
