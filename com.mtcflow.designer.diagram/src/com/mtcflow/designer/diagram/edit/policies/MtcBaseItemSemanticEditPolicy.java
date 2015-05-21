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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import com.mtcflow.designer.diagram.part.MtcDiagramEditorPlugin;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelProducerTransformation;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.T2MTransformation;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;

/**
 * @generated
 */
public class MtcBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected MtcBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id. Add visual id of
	 * edited editpart to extended data of the request so command switch can
	 * decide what kind of diagram element is being edited. It is done in those
	 * cases when it's not possible to deduce diagram element kind from domain
	 * element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(MtcVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = MtcElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * 
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = MtcDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			MtcDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateInputModel_4027(com.mtcflow.model.mtc.MTC container, Model source, Transformation target) {
			return canExistInputModel_4027(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOutputModel_4028(com.mtcflow.model.mtc.MTC container, ModelProducerTransformation source, Model target) {
			return canExistOutputModel_4028(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateM2TTransformationOutputFiles_4034(M2TTransformation source, File target) {
			if (source != null) {
				if (source.getOutputFiles().contains(target)) {
					return false;
				}
			}

			return canExistM2TTransformationOutputFiles_4034(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateModelMetamodel_4043(Model source, Metamodel target) {
			if (source != null) {
				if (source.getMetamodel().contains(target)) {
					return false;
				}
			}

			return canExistModelMetamodel_4043(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateModelValidations_4031(Model source, Validation target) {
			if (source != null) {
				if (source.getValidations().contains(target)) {
					return false;
				}
			}

			return canExistModelValidations_4031(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTransformationModelDependencies_4040(Transformation source, Model target) {
			if (source != null) {
				if (source.getModelDependencies().contains(target)) {
					return false;
				}
			}

			return canExistTransformationModelDependencies_4040(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTransformationFileDependencies_4041(Transformation source, File target) {
			if (source != null) {
				if (source.getFileDependencies().contains(target)) {
					return false;
				}
			}

			return canExistTransformationFileDependencies_4041(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMTCResourceReferencedResources_4033(MTCResource source, ReferencedResource target) {
			if (source != null) {
				if (source.getReferencedResources().contains(target)) {
					return false;
				}
			}

			return canExistMTCResourceReferencedResources_4033(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateT2MTransformationInputFiles_4035(T2MTransformation source, File target) {
			if (source != null) {
				if (source.getInputFiles().contains(target)) {
					return false;
				}
			}

			return canExistT2MTransformationInputFiles_4035(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHOTransformationOutputTransformations_4039(HOTransformation source, Transformation target) {
			if (source != null) {
				if (source.getOutputTransformations().contains(target)) {
					return false;
				}
			}

			return canExistHOTransformationOutputTransformations_4039(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistInputModel_4027(com.mtcflow.model.mtc.MTC container, InputModel linkInstance, Model source, Transformation target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOutputModel_4028(com.mtcflow.model.mtc.MTC container, OutputModel linkInstance, ModelProducerTransformation source, Model target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistM2TTransformationOutputFiles_4034(M2TTransformation source, File target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistModelMetamodel_4043(Model source, Metamodel target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistModelValidations_4031(Model source, Validation target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTransformationModelDependencies_4040(Transformation source, Model target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTransformationFileDependencies_4041(Transformation source, File target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMTCResourceReferencedResources_4033(MTCResource source, ReferencedResource target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistT2MTransformationInputFiles_4035(T2MTransformation source, File target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHOTransformationOutputTransformations_4039(HOTransformation source, Transformation target) {
			return true;
		}
	}

}
