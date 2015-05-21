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
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelProducerTransformation;
import com.mtcflow.model.mtc.OutputModel;

/**
 * @generated
 */
public class OutputModelReorientCommand extends EditElementCommand {

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
	public OutputModelReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof OutputModel) {
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
		if (!(oldEnd instanceof ModelProducerTransformation && newEnd instanceof ModelProducerTransformation)) {
			return false;
		}
		Model target = getLink().getModel();
		if (!(getLink().eContainer() instanceof com.mtcflow.model.mtc.MTC)) {
			return false;
		}
		com.mtcflow.model.mtc.MTC container = (com.mtcflow.model.mtc.MTC) getLink().eContainer();
		return MtcBaseItemSemanticEditPolicy.getLinkConstraints().canExistOutputModel_4028(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Model && newEnd instanceof Model)) {
			return false;
		}
		ModelProducerTransformation source = getLink().getTransformation();
		if (!(getLink().eContainer() instanceof com.mtcflow.model.mtc.MTC)) {
			return false;
		}
		com.mtcflow.model.mtc.MTC container = (com.mtcflow.model.mtc.MTC) getLink().eContainer();
		return MtcBaseItemSemanticEditPolicy.getLinkConstraints().canExistOutputModel_4028(container, getLink(), source, getNewTarget());
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
		getLink().setTransformation(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setModel(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OutputModel getLink() {
		return (OutputModel) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ModelProducerTransformation getOldSource() {
		return (ModelProducerTransformation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ModelProducerTransformation getNewSource() {
		return (ModelProducerTransformation) newEnd;
	}

	/**
	 * @generated
	 */
	protected Model getOldTarget() {
		return (Model) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Model getNewTarget() {
		return (Model) newEnd;
	}
}
