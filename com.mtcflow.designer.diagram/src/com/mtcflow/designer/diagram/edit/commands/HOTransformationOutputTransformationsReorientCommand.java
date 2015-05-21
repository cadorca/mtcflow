/*
 * 
 */
package com.mtcflow.designer.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import com.mtcflow.designer.diagram.edit.policies.MtcBaseItemSemanticEditPolicy;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.Transformation;

/**
 * @generated
 */
public class HOTransformationOutputTransformationsReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public HOTransformationOutputTransformationsReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof HOTransformation) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Transformation && newEnd instanceof HOTransformation)) {
			return false;
		}
		return MtcBaseItemSemanticEditPolicy.getLinkConstraints().canExistHOTransformationOutputTransformations_4039(getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Transformation && newEnd instanceof Transformation)) {
			return false;
		}
		return MtcBaseItemSemanticEditPolicy.getLinkConstraints().canExistHOTransformationOutputTransformations_4039(getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getOutputTransformations().remove(getOldTarget());
		getNewSource().getOutputTransformations().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getOutputTransformations().remove(getOldTarget());
		getOldSource().getOutputTransformations().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected HOTransformation getOldSource() {
		return (HOTransformation) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected HOTransformation getNewSource() {
		return (HOTransformation) newEnd;
	}

	/**
	 * @generated
	 */
	protected Transformation getOldTarget() {
		return (Transformation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Transformation getNewTarget() {
		return (Transformation) newEnd;
	}
}
