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
package com.mtcflow.designer.diagram.layout;

import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.providers.LeftRightProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNodeOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

public class MTCFlowLeftLayout extends org.eclipse.gmf.runtime.diagram.ui.providers.LeftRightProvider {
	
	  public static String DEFAULT_LAYOUT = "Default";
	  
	    public boolean provides(IOperation operation) {
	        // enable this provider only on mindmap diagrams
	        if (operation instanceof ILayoutNodeOperation) {
	            Iterator nodes = ((ILayoutNodeOperation) operation)
	                .getLayoutNodes().listIterator();
	            if (nodes.hasNext()) {
	                View node = ((ILayoutNode) nodes.next()).getNode();
	                Diagram container = node.getDiagram();
	                if (container == null
	                    || !(container.getType().equals("Mtc"))) //$NON-NLS-1$
	                    return false;
	            }
	        } else {
	            return false;
	        }
	        IAdaptable layoutHint = ((ILayoutNodeOperation) operation)
	            .getLayoutHint();
	        String layoutType = (String) layoutHint.getAdapter(String.class);
	        return LayoutType.DEFAULT.equals(layoutType);
	    }

}
