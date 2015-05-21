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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import com.mtcflow.designer.diagram.edit.policies.MtcBaseItemSemanticEditPolicy;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.Transformation;

/**
 * @generated
 */
public class InputModelReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public InputModelReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InputModel) {
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
		if (!(oldEnd instanceof Model && newEnd instanceof Model)) {
			return false;
		}
		Transformation target = getLink().getTransformation();
		if (!(getLink().eContainer() instanceof com.mtcflow.model.mtc.MTC)) {
			return false;
		}
		com.mtcflow.model.mtc.MTC container = (com.mtcflow.model.mtc.MTC) getLink().eContainer();
		return MtcBaseItemSemanticEditPolicy.getLinkConstraints().canExistInputModel_4027(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Transformation && newEnd instanceof Transformation)) {
			return false;
		}
		Model source = getLink().getModel();
		if (!(getLink().eContainer() instanceof com.mtcflow.model.mtc.MTC)) {
			return false;
		}
		com.mtcflow.model.mtc.MTC container = (com.mtcflow.model.mtc.MTC) getLink().eContainer();
		return MtcBaseItemSemanticEditPolicy.getLinkConstraints().canExistInputModel_4027(container, getLink(), source, getNewTarget());
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
		getLink().setModel(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTransformation(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected InputModel getLink() {
		return (InputModel) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Model getOldSource() {
		return (Model) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Model getNewSource() {
		return (Model) newEnd;
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
