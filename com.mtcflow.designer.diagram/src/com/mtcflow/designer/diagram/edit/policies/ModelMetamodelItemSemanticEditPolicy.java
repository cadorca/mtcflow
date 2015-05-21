/*
 * 
 */
package com.mtcflow.designer.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class ModelMetamodelItemSemanticEditPolicy extends MtcBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModelMetamodelItemSemanticEditPolicy() {
		super(MtcElementTypes.ModelMetamodel_4043);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
