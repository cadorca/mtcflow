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
package com.mtcflow.designer.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import com.mtcflow.designer.diagram.edit.policies.ConfigurationItemSemanticEditPolicy;
import com.mtcflow.designer.diagram.edit.policies.OpenDiagramEditPolicy;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class ConfigurationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2037;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ConfigurationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(MtcVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ConfigurationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ConfigurationFigure();
	}

	/**
	 * @generated
	 */
	public ConfigurationFigure getPrimaryShape() {
		return (ConfigurationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConfigurationNameEditPart) {
			((ConfigurationNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureConfigurationLabelFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationVariablesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationVariablesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ConfigurationConfigurationVariablesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationTagsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationTagsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ConfigurationConfigurationTagsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationLibrariesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationLibrariesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ConfigurationConfigurationLibrariesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationScriptsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationScriptsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ConfigurationConfigurationScriptsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationEnvironmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationEnvironmentsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ConfigurationConfigurationEnvironmentsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConfigurationNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationVariablesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationVariablesCompartmentFigure();
			pane.remove(((ConfigurationConfigurationVariablesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationTagsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationTagsCompartmentFigure();
			pane.remove(((ConfigurationConfigurationTagsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationLibrariesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationLibrariesCompartmentFigure();
			pane.remove(((ConfigurationConfigurationLibrariesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationScriptsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationScriptsCompartmentFigure();
			pane.remove(((ConfigurationConfigurationScriptsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConfigurationConfigurationEnvironmentsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getConfigurationEnvironmentsCompartmentFigure();
			pane.remove(((ConfigurationConfigurationEnvironmentsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ConfigurationConfigurationVariablesCompartmentEditPart) {
			return getPrimaryShape().getConfigurationVariablesCompartmentFigure();
		}
		if (editPart instanceof ConfigurationConfigurationTagsCompartmentEditPart) {
			return getPrimaryShape().getConfigurationTagsCompartmentFigure();
		}
		if (editPart instanceof ConfigurationConfigurationLibrariesCompartmentEditPart) {
			return getPrimaryShape().getConfigurationLibrariesCompartmentFigure();
		}
		if (editPart instanceof ConfigurationConfigurationScriptsCompartmentEditPart) {
			return getPrimaryShape().getConfigurationScriptsCompartmentFigure();
		}
		if (editPart instanceof ConfigurationConfigurationEnvironmentsCompartmentEditPart) {
			return getPrimaryShape().getConfigurationEnvironmentsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(MtcVisualIDRegistry.getType(ConfigurationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor().getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == MtcElementTypes.Variable_3010) {
				return getChildBySemanticHint(MtcVisualIDRegistry.getType(ConfigurationConfigurationVariablesCompartmentEditPart.VISUAL_ID));
			}
			if (type == MtcElementTypes.Tag_3011) {
				return getChildBySemanticHint(MtcVisualIDRegistry.getType(ConfigurationConfigurationTagsCompartmentEditPart.VISUAL_ID));
			}
			if (type == MtcElementTypes.Library_3008) {
				return getChildBySemanticHint(MtcVisualIDRegistry.getType(ConfigurationConfigurationLibrariesCompartmentEditPart.VISUAL_ID));
			}
			if (type == MtcElementTypes.Script_3009) {
				return getChildBySemanticHint(MtcVisualIDRegistry.getType(ConfigurationConfigurationScriptsCompartmentEditPart.VISUAL_ID));
			}
			if (type == MtcElementTypes.ModelEnvironment_3013) {
				return getChildBySemanticHint(MtcVisualIDRegistry.getType(ConfigurationConfigurationEnvironmentsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel() && EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ConfigurationFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConfigurationLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fConfigurationVariablesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fConfigurationTagsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fConfigurationLibrariesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fConfigurationScriptsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fConfigurationEnvironmentsCompartmentFigure;

		/**
		 * @generated
		 */
		public ConfigurationFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConfigurationLabelFigure = new WrappingLabel();

			fFigureConfigurationLabelFigure.setText("Configuration");

			fFigureConfigurationLabelFigure.setFont(FFIGURECONFIGURATIONLABELFIGURE_FONT);

			fFigureConfigurationLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			fFigureConfigurationLabelFigure.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(1), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			this.add(fFigureConfigurationLabelFigure);

			fConfigurationVariablesCompartmentFigure = new RectangleFigure();

			fConfigurationVariablesCompartmentFigure.setOutline(false);

			this.add(fConfigurationVariablesCompartmentFigure);

			fConfigurationTagsCompartmentFigure = new RectangleFigure();

			fConfigurationTagsCompartmentFigure.setOutline(false);

			this.add(fConfigurationTagsCompartmentFigure);

			fConfigurationLibrariesCompartmentFigure = new RectangleFigure();

			fConfigurationLibrariesCompartmentFigure.setOutline(false);

			this.add(fConfigurationLibrariesCompartmentFigure);

			fConfigurationScriptsCompartmentFigure = new RectangleFigure();

			fConfigurationScriptsCompartmentFigure.setOutline(false);

			this.add(fConfigurationScriptsCompartmentFigure);

			fConfigurationEnvironmentsCompartmentFigure = new RectangleFigure();

			fConfigurationEnvironmentsCompartmentFigure.setOutline(false);

			this.add(fConfigurationEnvironmentsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConfigurationLabelFigure() {
			return fFigureConfigurationLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getConfigurationVariablesCompartmentFigure() {
			return fConfigurationVariablesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getConfigurationTagsCompartmentFigure() {
			return fConfigurationTagsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getConfigurationLibrariesCompartmentFigure() {
			return fConfigurationLibrariesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getConfigurationScriptsCompartmentFigure() {
			return fConfigurationScriptsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getConfigurationEnvironmentsCompartmentFigure() {
			return fConfigurationEnvironmentsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECONFIGURATIONLABELFIGURE_FONT = new Font(Display.getCurrent(), "Arial", 12, SWT.NORMAL);

}
