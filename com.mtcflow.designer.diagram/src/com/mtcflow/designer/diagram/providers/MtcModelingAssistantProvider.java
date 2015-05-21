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
package com.mtcflow.designer.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationEnvironmentsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationLibrariesCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationScriptsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationTagsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationVariablesCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationEditPart;
import com.mtcflow.designer.diagram.edit.parts.FileEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.LibraryEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.MetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ReferencedResourceEditPart;
import com.mtcflow.designer.diagram.edit.parts.ScriptEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.ValidationEditPart;
import com.mtcflow.designer.diagram.part.Messages;
import com.mtcflow.designer.diagram.part.MtcDiagramEditorPlugin;

/**
 * @generated
 */
public class MtcModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof MTCEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(11);
			types.add(MtcElementTypes.HOTransformation_2039);
			types.add(MtcElementTypes.MTCTransformation_2029);
			types.add(MtcElementTypes.M2MTransformation_2026);
			types.add(MtcElementTypes.T2MTransformation_2028);
			types.add(MtcElementTypes.M2TTransformation_2030);
			types.add(MtcElementTypes.File_2038);
			types.add(MtcElementTypes.Metamodel_2032);
			types.add(MtcElementTypes.Model_2033);
			types.add(MtcElementTypes.Validation_2034);
			types.add(MtcElementTypes.ReferencedResource_2035);
			types.add(MtcElementTypes.Configuration_2037);
			return types;
		}
		if (editPart instanceof ConfigurationEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(MtcElementTypes.Variable_3010);
			types.add(MtcElementTypes.Tag_3011);
			types.add(MtcElementTypes.Library_3008);
			types.add(MtcElementTypes.Script_3009);
			types.add(MtcElementTypes.ModelEnvironment_3013);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof HOTransformationEditPart) {
			return ((HOTransformationEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MTCTransformationEditPart) {
			return ((MTCTransformationEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof M2MTransformationEditPart) {
			return ((M2MTransformationEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof T2MTransformationEditPart) {
			return ((T2MTransformationEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof M2TTransformationEditPart) {
			return ((M2TTransformationEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FileEditPart) {
			return ((FileEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MetamodelEditPart) {
			return ((MetamodelEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ModelEditPart) {
			return ((ModelEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValidationEditPart) {
			return ((ValidationEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ReferencedResourceEditPart) {
			return ((ReferencedResourceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LibraryEditPart) {
			return ((LibraryEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScriptEditPart) {
			return ((ScriptEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof HOTransformationEditPart) {
			return ((HOTransformationEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MTCTransformationEditPart) {
			return ((MTCTransformationEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof M2MTransformationEditPart) {
			return ((M2MTransformationEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof T2MTransformationEditPart) {
			return ((T2MTransformationEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof M2TTransformationEditPart) {
			return ((M2TTransformationEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FileEditPart) {
			return ((FileEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MetamodelEditPart) {
			return ((MetamodelEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ModelEditPart) {
			return ((ModelEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValidationEditPart) {
			return ((ValidationEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ReferencedResourceEditPart) {
			return ((ReferencedResourceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof HOTransformationEditPart) {
			return ((HOTransformationEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MTCTransformationEditPart) {
			return ((MTCTransformationEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof M2MTransformationEditPart) {
			return ((M2MTransformationEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof T2MTransformationEditPart) {
			return ((T2MTransformationEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof M2TTransformationEditPart) {
			return ((M2TTransformationEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FileEditPart) {
			return ((FileEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MetamodelEditPart) {
			return ((MetamodelEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ModelEditPart) {
			return ((ModelEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValidationEditPart) {
			return ((ValidationEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ReferencedResourceEditPart) {
			return ((ReferencedResourceEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LibraryEditPart) {
			return ((LibraryEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScriptEditPart) {
			return ((ScriptEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof HOTransformationEditPart) {
			return ((HOTransformationEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MTCTransformationEditPart) {
			return ((MTCTransformationEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof M2MTransformationEditPart) {
			return ((M2MTransformationEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof T2MTransformationEditPart) {
			return ((T2MTransformationEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof M2TTransformationEditPart) {
			return ((M2TTransformationEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FileEditPart) {
			return ((FileEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MetamodelEditPart) {
			return ((MetamodelEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ModelEditPart) {
			return ((ModelEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValidationEditPart) {
			return ((ValidationEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ReferencedResourceEditPart) {
			return ((ReferencedResourceEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof HOTransformationEditPart) {
			return ((HOTransformationEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MTCTransformationEditPart) {
			return ((MTCTransformationEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof M2MTransformationEditPart) {
			return ((M2MTransformationEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof T2MTransformationEditPart) {
			return ((T2MTransformationEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof M2TTransformationEditPart) {
			return ((M2TTransformationEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FileEditPart) {
			return ((FileEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MetamodelEditPart) {
			return ((MetamodelEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ModelEditPart) {
			return ((ModelEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValidationEditPart) {
			return ((ValidationEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ReferencedResourceEditPart) {
			return ((ReferencedResourceEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LibraryEditPart) {
			return ((LibraryEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScriptEditPart) {
			return ((ScriptEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(MtcDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.MtcModelingAssistantProviderMessage);
		dialog.setTitle(Messages.MtcModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
