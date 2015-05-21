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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import com.mtcflow.designer.diagram.edit.policies.ValidationGraphicalNodeEditPolicy;
import com.mtcflow.designer.diagram.edit.policies.ValidationItemSemanticEditPolicy;
import com.mtcflow.designer.diagram.figures.GearFigure;
import com.mtcflow.designer.diagram.figures.ValidationIcon;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class ValidationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2034;

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
	public ValidationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ValidationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ValidationGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		return primaryShape = new ValidationFigure();
	}

	/**
	 * @generated
	 */
	public ValidationFigure getPrimaryShape() {
		return (ValidationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ValidationNameEditPart) {
			((ValidationNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureValidationLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ValidationNameEditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(83, 105);
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
		return getChildBySemanticHint(MtcVisualIDRegistry.getType(ValidationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MtcElementTypes.MTCResourceReferencedResources_4033);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ReferencedResourceEditPart) {
			types.add(MtcElementTypes.MTCResourceReferencedResources_4033);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == MtcElementTypes.MTCResourceReferencedResources_4033) {
			types.add(MtcElementTypes.ReferencedResource_2035);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MtcElementTypes.ModelValidations_4031);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == MtcElementTypes.ModelValidations_4031) {
			types.add(MtcElementTypes.Model_2033);
		}
		return types;
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
	public class ValidationFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureValidationLabelFigure;

		/**
		 * @generated
		 */
		public ValidationFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode().DPtoLP(2)));
			this.addPoint(new Point(getMapMode().DPtoLP(8), getMapMode().DPtoLP(2)));
			this.addPoint(new Point(getMapMode().DPtoLP(8), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode().DPtoLP(2)));
			this.addPoint(new Point(getMapMode().DPtoLP(8), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			this.setFill(true);
			this.setForegroundColor(THIS_FORE);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(83), getMapMode().DPtoLP(105)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			ValidationIcon validationFigureIcon0 = new ValidationIcon();

			GridData constraintValidationFigureIcon0 = new GridData();
			constraintValidationFigureIcon0.verticalAlignment = GridData.BEGINNING;
			constraintValidationFigureIcon0.horizontalAlignment = GridData.CENTER;
			constraintValidationFigureIcon0.horizontalIndent = 0;
			constraintValidationFigureIcon0.horizontalSpan = 1;
			constraintValidationFigureIcon0.verticalSpan = 1;
			constraintValidationFigureIcon0.grabExcessHorizontalSpace = false;
			constraintValidationFigureIcon0.grabExcessVerticalSpace = false;
			this.add(validationFigureIcon0, constraintValidationFigureIcon0);

			fFigureValidationLabelFigure = new WrappingLabel();

			fFigureValidationLabelFigure.setText("Validation");

			fFigureValidationLabelFigure.setFont(FFIGUREVALIDATIONLABELFIGURE_FONT);

			fFigureValidationLabelFigure.setPreferredSize(new Dimension(getMapMode().DPtoLP(83), getMapMode().DPtoLP(105)));
			fFigureValidationLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(83), getMapMode().DPtoLP(105)));

			fFigureValidationLabelFigure.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(1), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));
			fFigureValidationLabelFigure.setTextWrap(true);
			fFigureValidationLabelFigure.setAlignment(PositionConstants.WEST);

			GridData constraintFFigureValidationLabelFigure = new GridData();
			constraintFFigureValidationLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureValidationLabelFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureValidationLabelFigure.horizontalIndent = 0;
			constraintFFigureValidationLabelFigure.horizontalSpan = 1;
			constraintFFigureValidationLabelFigure.verticalSpan = 1;
			constraintFFigureValidationLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureValidationLabelFigure.grabExcessVerticalSpace = true;
			this.add(fFigureValidationLabelFigure, constraintFFigureValidationLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureValidationLabelFigure() {
			return fFigureValidationLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 88, 88, 88);

	/**
	 * @generated
	 */
	static final Font FFIGUREVALIDATIONLABELFIGURE_FONT = new Font(Display.getCurrent(), "Arial", 9, SWT.NORMAL);

	/**
	 * @generated NOT
	 */
	@Override
	public DragTracker getDragTracker(Request request) {
		return new com.mtcflow.designer.diagram.util.OpenFileDragTracker(this, resolveSemanticElement());
	}

}
