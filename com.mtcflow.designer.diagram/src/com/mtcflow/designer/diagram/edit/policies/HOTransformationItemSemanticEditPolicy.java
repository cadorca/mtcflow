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

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import com.mtcflow.designer.diagram.edit.commands.HOTransformationOutputTransformationsCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.HOTransformationOutputTransformationsReorientCommand;
import com.mtcflow.designer.diagram.edit.commands.InputModelCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.InputModelReorientCommand;
import com.mtcflow.designer.diagram.edit.commands.M2TTransformationOutputFilesCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.M2TTransformationOutputFilesReorientCommand;
import com.mtcflow.designer.diagram.edit.commands.MTCResourceReferencedResourcesCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.MTCResourceReferencedResourcesReorientCommand;
import com.mtcflow.designer.diagram.edit.commands.OutputModelCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.OutputModelReorientCommand;
import com.mtcflow.designer.diagram.edit.commands.T2MTransformationInputFilesCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.T2MTransformationInputFilesReorientCommand;
import com.mtcflow.designer.diagram.edit.commands.TransformationFileDependenciesCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.TransformationFileDependenciesReorientCommand;
import com.mtcflow.designer.diagram.edit.commands.TransformationModelDependenciesCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.TransformationModelDependenciesReorientCommand;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationOutputTransformationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.InputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationOutputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCResourceReferencedResourcesEditPart;
import com.mtcflow.designer.diagram.edit.parts.OutputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationInputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationFileDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationModelDependenciesEditPart;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class HOTransformationItemSemanticEditPolicy extends MtcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HOTransformationItemSemanticEditPolicy() {
		super(MtcElementTypes.HOTransformation_2039);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (MtcVisualIDRegistry.getVisualID(incomingLink) == InputModelEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MtcVisualIDRegistry.getVisualID(incomingLink) == HOTransformationOutputTransformationsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MtcVisualIDRegistry.getVisualID(outgoingLink) == OutputModelEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MtcVisualIDRegistry.getVisualID(outgoingLink) == HOTransformationOutputTransformationsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MtcVisualIDRegistry.getVisualID(outgoingLink) == M2TTransformationOutputFilesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MtcVisualIDRegistry.getVisualID(outgoingLink) == T2MTransformationInputFilesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MtcVisualIDRegistry.getVisualID(outgoingLink) == TransformationModelDependenciesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MtcVisualIDRegistry.getVisualID(outgoingLink) == TransformationFileDependenciesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MtcVisualIDRegistry.getVisualID(outgoingLink) == MTCResourceReferencedResourcesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MtcElementTypes.InputModel_4027 == req.getElementType()) {
			return getGEFWrapper(new InputModelCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (MtcElementTypes.OutputModel_4028 == req.getElementType()) {
			return getGEFWrapper(new OutputModelCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MtcElementTypes.HOTransformationOutputTransformations_4039 == req.getElementType()) {
			return getGEFWrapper(new HOTransformationOutputTransformationsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MtcElementTypes.M2TTransformationOutputFiles_4034 == req.getElementType()) {
			return getGEFWrapper(new M2TTransformationOutputFilesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MtcElementTypes.T2MTransformationInputFiles_4035 == req.getElementType()) {
			return getGEFWrapper(new T2MTransformationInputFilesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MtcElementTypes.TransformationModelDependencies_4040 == req.getElementType()) {
			return getGEFWrapper(new TransformationModelDependenciesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MtcElementTypes.TransformationFileDependencies_4041 == req.getElementType()) {
			return getGEFWrapper(new TransformationFileDependenciesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MtcElementTypes.MTCResourceReferencedResources_4033 == req.getElementType()) {
			return getGEFWrapper(new MTCResourceReferencedResourcesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MtcElementTypes.InputModel_4027 == req.getElementType()) {
			return getGEFWrapper(new InputModelCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MtcElementTypes.OutputModel_4028 == req.getElementType()) {
			return getGEFWrapper(new OutputModelCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (MtcElementTypes.HOTransformationOutputTransformations_4039 == req.getElementType()) {
			return getGEFWrapper(new HOTransformationOutputTransformationsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MtcElementTypes.M2TTransformationOutputFiles_4034 == req.getElementType()) {
			return null;
		}
		if (MtcElementTypes.T2MTransformationInputFiles_4035 == req.getElementType()) {
			return getGEFWrapper(new T2MTransformationInputFilesCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (MtcElementTypes.TransformationModelDependencies_4040 == req.getElementType()) {
			return getGEFWrapper(new TransformationModelDependenciesCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (MtcElementTypes.TransformationFileDependencies_4041 == req.getElementType()) {
			return getGEFWrapper(new TransformationFileDependenciesCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (MtcElementTypes.MTCResourceReferencedResources_4033 == req.getElementType()) {
			return getGEFWrapper(new MTCResourceReferencedResourcesCreateCommand(req, req.getTarget(), req.getSource()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case InputModelEditPart.VISUAL_ID:
			return getGEFWrapper(new InputModelReorientCommand(req));
		case OutputModelEditPart.VISUAL_ID:
			return getGEFWrapper(new OutputModelReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or
	 * source should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case HOTransformationOutputTransformationsEditPart.VISUAL_ID:
			return getGEFWrapper(new HOTransformationOutputTransformationsReorientCommand(req));
		case M2TTransformationOutputFilesEditPart.VISUAL_ID:
			return getGEFWrapper(new M2TTransformationOutputFilesReorientCommand(req));
		case T2MTransformationInputFilesEditPart.VISUAL_ID:
			return getGEFWrapper(new T2MTransformationInputFilesReorientCommand(req));
		case TransformationModelDependenciesEditPart.VISUAL_ID:
			return getGEFWrapper(new TransformationModelDependenciesReorientCommand(req));
		case TransformationFileDependenciesEditPart.VISUAL_ID:
			return getGEFWrapper(new TransformationFileDependenciesReorientCommand(req));
		case MTCResourceReferencedResourcesEditPart.VISUAL_ID:
			return getGEFWrapper(new MTCResourceReferencedResourcesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
