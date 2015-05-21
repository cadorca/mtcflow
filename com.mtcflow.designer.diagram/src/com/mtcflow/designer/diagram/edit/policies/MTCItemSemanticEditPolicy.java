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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import com.mtcflow.designer.diagram.edit.commands.ConfigurationCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.FileCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.HOTransformationCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.M2MTransformationCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.M2TTransformationCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.MTCTransformationCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.MetamodelCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.ModelCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.ReferencedResourceCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.T2MTransformationCreateCommand;
import com.mtcflow.designer.diagram.edit.commands.ValidationCreateCommand;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class MTCItemSemanticEditPolicy extends MtcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MTCItemSemanticEditPolicy() {
		super(MtcElementTypes.MTC_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MtcElementTypes.HOTransformation_2039 == req.getElementType()) {
			return getGEFWrapper(new HOTransformationCreateCommand(req));
		}
		if (MtcElementTypes.MTCTransformation_2029 == req.getElementType()) {
			return getGEFWrapper(new MTCTransformationCreateCommand(req));
		}
		if (MtcElementTypes.M2MTransformation_2026 == req.getElementType()) {
			return getGEFWrapper(new M2MTransformationCreateCommand(req));
		}
		if (MtcElementTypes.T2MTransformation_2028 == req.getElementType()) {
			return getGEFWrapper(new T2MTransformationCreateCommand(req));
		}
		if (MtcElementTypes.M2TTransformation_2030 == req.getElementType()) {
			return getGEFWrapper(new M2TTransformationCreateCommand(req));
		}
		if (MtcElementTypes.File_2038 == req.getElementType()) {
			return getGEFWrapper(new FileCreateCommand(req));
		}
		if (MtcElementTypes.Metamodel_2032 == req.getElementType()) {
			return getGEFWrapper(new MetamodelCreateCommand(req));
		}
		if (MtcElementTypes.Model_2033 == req.getElementType()) {
			return getGEFWrapper(new ModelCreateCommand(req));
		}
		if (MtcElementTypes.Validation_2034 == req.getElementType()) {
			return getGEFWrapper(new ValidationCreateCommand(req));
		}
		if (MtcElementTypes.ReferencedResource_2035 == req.getElementType()) {
			return getGEFWrapper(new ReferencedResourceCreateCommand(req));
		}
		if (MtcElementTypes.Configuration_2037 == req.getElementType()) {
			return getGEFWrapper(new ConfigurationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
