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
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
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

import com.mtcflow.designer.diagram.edit.policies.HOTransformationGraphicalNodeEditPolicy;
import com.mtcflow.designer.diagram.edit.policies.HOTransformationItemSemanticEditPolicy;
import com.mtcflow.designer.diagram.figures.GearFigure;
import com.mtcflow.designer.diagram.figures.HOTFigure;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class HOTransformationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2039;

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
	public HOTransformationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new HOTransformationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new HOTransformationGraphicalNodeEditPolicy());
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
		return primaryShape = new HOTransformationFigure();
	}

	/**
	 * @generated
	 */
	public HOTransformationFigure getPrimaryShape() {
		return (HOTransformationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HOTransformationNameEditPart) {
			((HOTransformationNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureHOTransformationLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HOTransformationNameEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(200, 49);
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
		return getChildBySemanticHint(MtcVisualIDRegistry.getType(HOTransformationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(MtcElementTypes.OutputModel_4028);
		types.add(MtcElementTypes.HOTransformationOutputTransformations_4039);
		types.add(MtcElementTypes.M2TTransformationOutputFiles_4034);
		types.add(MtcElementTypes.T2MTransformationInputFiles_4035);
		types.add(MtcElementTypes.TransformationModelDependencies_4040);
		types.add(MtcElementTypes.TransformationFileDependencies_4041);
		types.add(MtcElementTypes.MTCResourceReferencedResources_4033);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ModelEditPart) {
			types.add(MtcElementTypes.OutputModel_4028);
		}
		if (targetEditPart instanceof com.mtcflow.designer.diagram.edit.parts.HOTransformationEditPart) {
			types.add(MtcElementTypes.HOTransformationOutputTransformations_4039);
		}
		if (targetEditPart instanceof MTCTransformationEditPart) {
			types.add(MtcElementTypes.HOTransformationOutputTransformations_4039);
		}
		if (targetEditPart instanceof M2MTransformationEditPart) {
			types.add(MtcElementTypes.HOTransformationOutputTransformations_4039);
		}
		if (targetEditPart instanceof T2MTransformationEditPart) {
			types.add(MtcElementTypes.HOTransformationOutputTransformations_4039);
		}
		if (targetEditPart instanceof M2TTransformationEditPart) {
			types.add(MtcElementTypes.HOTransformationOutputTransformations_4039);
		}
		if (targetEditPart instanceof FileEditPart) {
			types.add(MtcElementTypes.M2TTransformationOutputFiles_4034);
		}
		if (targetEditPart instanceof FileEditPart) {
			types.add(MtcElementTypes.T2MTransformationInputFiles_4035);
		}
		if (targetEditPart instanceof ModelEditPart) {
			types.add(MtcElementTypes.TransformationModelDependencies_4040);
		}
		if (targetEditPart instanceof FileEditPart) {
			types.add(MtcElementTypes.TransformationFileDependencies_4041);
		}
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
		if (relationshipType == MtcElementTypes.OutputModel_4028) {
			types.add(MtcElementTypes.Model_2033);
		} else if (relationshipType == MtcElementTypes.HOTransformationOutputTransformations_4039) {
			types.add(MtcElementTypes.HOTransformation_2039);
			types.add(MtcElementTypes.MTCTransformation_2029);
			types.add(MtcElementTypes.M2MTransformation_2026);
			types.add(MtcElementTypes.T2MTransformation_2028);
			types.add(MtcElementTypes.M2TTransformation_2030);
		} else if (relationshipType == MtcElementTypes.M2TTransformationOutputFiles_4034) {
			types.add(MtcElementTypes.File_2038);
		} else if (relationshipType == MtcElementTypes.T2MTransformationInputFiles_4035) {
			types.add(MtcElementTypes.File_2038);
		} else if (relationshipType == MtcElementTypes.TransformationModelDependencies_4040) {
			types.add(MtcElementTypes.Model_2033);
		} else if (relationshipType == MtcElementTypes.TransformationFileDependencies_4041) {
			types.add(MtcElementTypes.File_2038);
		} else if (relationshipType == MtcElementTypes.MTCResourceReferencedResources_4033) {
			types.add(MtcElementTypes.ReferencedResource_2035);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MtcElementTypes.InputModel_4027);
		types.add(MtcElementTypes.HOTransformationOutputTransformations_4039);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == MtcElementTypes.InputModel_4027) {
			types.add(MtcElementTypes.Model_2033);
		} else if (relationshipType == MtcElementTypes.HOTransformationOutputTransformations_4039) {
			types.add(MtcElementTypes.HOTransformation_2039);
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
	public class HOTransformationFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHOTransformationLabelFigure;

		/**
		 * @generated
		 */
		public HOTransformationFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 3;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			this.setForegroundColor(THIS_FORE);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(200), getMapMode().DPtoLP(49)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			HOTFigure hOTransformationFigureIcon0 = new HOTFigure();

			GridData constraintHOTransformationFigureIcon0 = new GridData();
			constraintHOTransformationFigureIcon0.verticalAlignment = GridData.CENTER;
			constraintHOTransformationFigureIcon0.horizontalAlignment = GridData.BEGINNING;
			constraintHOTransformationFigureIcon0.horizontalIndent = 0;
			constraintHOTransformationFigureIcon0.horizontalSpan = 1;
			constraintHOTransformationFigureIcon0.verticalSpan = 1;
			constraintHOTransformationFigureIcon0.grabExcessHorizontalSpace = false;
			constraintHOTransformationFigureIcon0.grabExcessVerticalSpace = false;
			this.add(hOTransformationFigureIcon0, constraintHOTransformationFigureIcon0);

			fFigureHOTransformationLabelFigure = new WrappingLabel();

			fFigureHOTransformationLabelFigure.setText("HOTransformation");

			fFigureHOTransformationLabelFigure.setFont(FFIGUREHOTRANSFORMATIONLABELFIGURE_FONT);

			fFigureHOTransformationLabelFigure.setPreferredSize(new Dimension(getMapMode().DPtoLP(200), getMapMode().DPtoLP(49)));
			fFigureHOTransformationLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(200), getMapMode().DPtoLP(49)));

			fFigureHOTransformationLabelFigure.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(1), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));
			fFigureHOTransformationLabelFigure.setTextWrap(true);
			fFigureHOTransformationLabelFigure.setAlignment(PositionConstants.WEST);

			GridData constraintFFigureHOTransformationLabelFigure = new GridData();
			constraintFFigureHOTransformationLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureHOTransformationLabelFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureHOTransformationLabelFigure.horizontalIndent = 0;
			constraintFFigureHOTransformationLabelFigure.horizontalSpan = 1;
			constraintFFigureHOTransformationLabelFigure.verticalSpan = 1;
			constraintFFigureHOTransformationLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureHOTransformationLabelFigure.grabExcessVerticalSpace = true;
			this.add(fFigureHOTransformationLabelFigure, constraintFFigureHOTransformationLabelFigure);

			GearFigure hOTransformationFigureGearIcon0 = new GearFigure();

			GridData constraintHOTransformationFigureGearIcon0 = new GridData();
			constraintHOTransformationFigureGearIcon0.verticalAlignment = GridData.BEGINNING;
			constraintHOTransformationFigureGearIcon0.horizontalAlignment = GridData.END;
			constraintHOTransformationFigureGearIcon0.horizontalIndent = 0;
			constraintHOTransformationFigureGearIcon0.horizontalSpan = 1;
			constraintHOTransformationFigureGearIcon0.verticalSpan = 1;
			constraintHOTransformationFigureGearIcon0.grabExcessHorizontalSpace = false;
			constraintHOTransformationFigureGearIcon0.grabExcessVerticalSpace = false;
			this.add(hOTransformationFigureGearIcon0, constraintHOTransformationFigureGearIcon0);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHOTransformationLabelFigure() {
			return fFigureHOTransformationLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREHOTRANSFORMATIONLABELFIGURE_FONT = new Font(Display.getCurrent(), "Arial", 12, SWT.NORMAL);

	/**
	 * @generated NOT
	 */
	@Override
	public DragTracker getDragTracker(Request request) {
		return new com.mtcflow.designer.diagram.util.OpenFileDragTracker(this, resolveSemanticElement());
	}
}
