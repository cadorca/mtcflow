package com.mtcflow.diagram;

import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.Square;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.SimpleStyleConfiguration;

public class ArtifactStyleConfiguration extends SimpleStyleConfiguration {
	
	
	  /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.sirius.diagram.tools.api.graphical.edit.styles.SimpleStyleConfiguration#getBorderDimension(org.eclipse.sirius.viewpoint.DNode)
     */
    @Override
    public Insets getBorderDimension(final DNode node) {
        final Insets result = new Insets(0, 0, 0, 0);
        if (node.getStyle() instanceof Square) {
            final Square square = (Square) node.getStyle();
            result.left = square.getBorderSize().intValue();
            result.right = square.getBorderSize().intValue();
            result.top = 40; 
            result.bottom = square.getBorderSize().intValue();
        }
        return result;
    } 
    
}
