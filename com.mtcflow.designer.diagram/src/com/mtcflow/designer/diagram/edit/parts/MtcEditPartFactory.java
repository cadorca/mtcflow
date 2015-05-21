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

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;

/**
 * @generated
 */
public class MtcEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MtcVisualIDRegistry.getVisualID(view)) {

			case MTCEditPart.VISUAL_ID:
				return new MTCEditPart(view);

			case HOTransformationEditPart.VISUAL_ID:
				return new HOTransformationEditPart(view);

			case HOTransformationNameEditPart.VISUAL_ID:
				return new HOTransformationNameEditPart(view);

			case MTCTransformationEditPart.VISUAL_ID:
				return new MTCTransformationEditPart(view);

			case MTCTransformationNameEditPart.VISUAL_ID:
				return new MTCTransformationNameEditPart(view);

			case M2MTransformationEditPart.VISUAL_ID:
				return new M2MTransformationEditPart(view);

			case M2MTransformationNameEditPart.VISUAL_ID:
				return new M2MTransformationNameEditPart(view);

			case T2MTransformationEditPart.VISUAL_ID:
				return new T2MTransformationEditPart(view);

			case T2MTransformationNameEditPart.VISUAL_ID:
				return new T2MTransformationNameEditPart(view);

			case M2TTransformationEditPart.VISUAL_ID:
				return new M2TTransformationEditPart(view);

			case M2TTransformationNameEditPart.VISUAL_ID:
				return new M2TTransformationNameEditPart(view);

			case FileEditPart.VISUAL_ID:
				return new FileEditPart(view);

			case FileNameEditPart.VISUAL_ID:
				return new FileNameEditPart(view);

			case MetamodelEditPart.VISUAL_ID:
				return new MetamodelEditPart(view);

			case MetamodelNameEditPart.VISUAL_ID:
				return new MetamodelNameEditPart(view);

			case ModelEditPart.VISUAL_ID:
				return new ModelEditPart(view);

			case ModelNameEditPart.VISUAL_ID:
				return new ModelNameEditPart(view);

			case ValidationEditPart.VISUAL_ID:
				return new ValidationEditPart(view);

			case ValidationNameEditPart.VISUAL_ID:
				return new ValidationNameEditPart(view);

			case ReferencedResourceEditPart.VISUAL_ID:
				return new ReferencedResourceEditPart(view);

			case ReferencedResourceNameEditPart.VISUAL_ID:
				return new ReferencedResourceNameEditPart(view);

			case ConfigurationEditPart.VISUAL_ID:
				return new ConfigurationEditPart(view);

			case ConfigurationNameEditPart.VISUAL_ID:
				return new ConfigurationNameEditPart(view);

			case LibraryEditPart.VISUAL_ID:
				return new LibraryEditPart(view);

			case LibraryNameEditPart.VISUAL_ID:
				return new LibraryNameEditPart(view);

			case ScriptEditPart.VISUAL_ID:
				return new ScriptEditPart(view);

			case ScriptNameEditPart.VISUAL_ID:
				return new ScriptNameEditPart(view);

			case VariableEditPart.VISUAL_ID:
				return new VariableEditPart(view);

			case VariableNameEditPart.VISUAL_ID:
				return new VariableNameEditPart(view);

			case TagEditPart.VISUAL_ID:
				return new TagEditPart(view);

			case TagNameEditPart.VISUAL_ID:
				return new TagNameEditPart(view);

			case ModelEnvironmentEditPart.VISUAL_ID:
				return new ModelEnvironmentEditPart(view);

			case ModelEnvironmentNameEditPart.VISUAL_ID:
				return new ModelEnvironmentNameEditPart(view);

			case ConfigurationConfigurationVariablesCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationVariablesCompartmentEditPart(view);

			case ConfigurationConfigurationTagsCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationTagsCompartmentEditPart(view);

			case ConfigurationConfigurationLibrariesCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationLibrariesCompartmentEditPart(view);

			case ConfigurationConfigurationScriptsCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationScriptsCompartmentEditPart(view);

			case ConfigurationConfigurationEnvironmentsCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationEnvironmentsCompartmentEditPart(view);

			case InputModelEditPart.VISUAL_ID:
				return new InputModelEditPart(view);

			case InputModelAliasEditPart.VISUAL_ID:
				return new InputModelAliasEditPart(view);

			case OutputModelEditPart.VISUAL_ID:
				return new OutputModelEditPart(view);

			case OutputModelAliasEditPart.VISUAL_ID:
				return new OutputModelAliasEditPart(view);

			case ModelMetamodelEditPart.VISUAL_ID:
				return new ModelMetamodelEditPart(view);

			case ModelMetamodelExternalLabelEditPart.VISUAL_ID:
				return new ModelMetamodelExternalLabelEditPart(view);

			case ModelValidationsEditPart.VISUAL_ID:
				return new ModelValidationsEditPart(view);

			case ModelValidationsExternalLabelEditPart.VISUAL_ID:
				return new ModelValidationsExternalLabelEditPart(view);

			case HOTransformationOutputTransformationsEditPart.VISUAL_ID:
				return new HOTransformationOutputTransformationsEditPart(view);

			case HOTransformationOutputTransformationsExternalLabelEditPart.VISUAL_ID:
				return new HOTransformationOutputTransformationsExternalLabelEditPart(view);

			case M2TTransformationOutputFilesEditPart.VISUAL_ID:
				return new M2TTransformationOutputFilesEditPart(view);

			case M2TTransformationOutputFilesExternalLabelEditPart.VISUAL_ID:
				return new M2TTransformationOutputFilesExternalLabelEditPart(view);

			case T2MTransformationInputFilesEditPart.VISUAL_ID:
				return new T2MTransformationInputFilesEditPart(view);

			case T2MTransformationInputFilesExternalLabelEditPart.VISUAL_ID:
				return new T2MTransformationInputFilesExternalLabelEditPart(view);

			case TransformationModelDependenciesEditPart.VISUAL_ID:
				return new TransformationModelDependenciesEditPart(view);

			case TransformationModelDependenciesExternalLabelEditPart.VISUAL_ID:
				return new TransformationModelDependenciesExternalLabelEditPart(view);

			case TransformationFileDependenciesEditPart.VISUAL_ID:
				return new TransformationFileDependenciesEditPart(view);

			case TransformationFileDependenciesExternalLabelEditPart.VISUAL_ID:
				return new TransformationFileDependenciesExternalLabelEditPart(view);

			case MTCResourceReferencedResourcesEditPart.VISUAL_ID:
				return new MTCResourceReferencedResourcesEditPart(view);

			case MTCResourceReferencedResourcesExternalLabelEditPart.VISUAL_ID:
				return new MTCResourceReferencedResourcesExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
