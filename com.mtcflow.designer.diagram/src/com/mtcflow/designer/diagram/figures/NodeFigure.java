package com.mtcflow.designer.diagram.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RoundedRectangleBorder;

public class NodeFigure extends ImageFigure {

	@SuppressWarnings("deprecation")
	public NodeFigure(String image){
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, image).createImage(), PositionConstants.WEST);
		RoundedRectangleBorder border = new RoundedRectangleBorder(0, 0); 
		border.setColor(ColorConstants.black);
		//setBorder(border); 
		setBackgroundColor(ColorConstants.green);
		//setOpaque(true);
		setMaximumSize(new Dimension(32, 32));
	}
}	
