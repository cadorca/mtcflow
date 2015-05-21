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
package com.mtcflow.designer.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.mtcflow.designer.diagram.edit.parts.ConfigurationEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.FileEditPart;
import com.mtcflow.designer.diagram.edit.parts.FileNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationOutputTransformationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.InputModelAliasEditPart;
import com.mtcflow.designer.diagram.edit.parts.InputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.LibraryEditPart;
import com.mtcflow.designer.diagram.edit.parts.LibraryNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2MTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationOutputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCResourceReferencedResourcesEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.MetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.MetamodelNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEnvironmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEnvironmentNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelMetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelValidationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.OutputModelAliasEditPart;
import com.mtcflow.designer.diagram.edit.parts.OutputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ReferencedResourceEditPart;
import com.mtcflow.designer.diagram.edit.parts.ReferencedResourceNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ScriptEditPart;
import com.mtcflow.designer.diagram.edit.parts.ScriptNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationInputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.TagEditPart;
import com.mtcflow.designer.diagram.edit.parts.TagNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationFileDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationModelDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.ValidationEditPart;
import com.mtcflow.designer.diagram.edit.parts.ValidationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.VariableEditPart;
import com.mtcflow.designer.diagram.edit.parts.VariableNameEditPart;
import com.mtcflow.designer.diagram.part.MtcDiagramEditorPlugin;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;
import com.mtcflow.designer.diagram.providers.MtcParserProvider;

/**
 * @generated
 */
public class MtcNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MtcDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MtcDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MtcNavigatorItem && !isOwnView(((MtcNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MtcNavigatorGroup) {
			MtcNavigatorGroup group = (MtcNavigatorGroup) element;
			return MtcDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MtcNavigatorItem) {
			MtcNavigatorItem navigatorItem = (MtcNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MtcVisualIDRegistry.getVisualID(view)) {
		case MTCEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://com.mtcflow.mtc/1.0?MTC", MtcElementTypes.MTC_1000); //$NON-NLS-1$
		case M2MTransformationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?M2MTransformation", MtcElementTypes.M2MTransformation_2026); //$NON-NLS-1$
		case T2MTransformationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?T2MTransformation", MtcElementTypes.T2MTransformation_2028); //$NON-NLS-1$
		case MTCTransformationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?MTCTransformation", MtcElementTypes.MTCTransformation_2029); //$NON-NLS-1$
		case M2TTransformationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?M2TTransformation", MtcElementTypes.M2TTransformation_2030); //$NON-NLS-1$
		case MetamodelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?Metamodel", MtcElementTypes.Metamodel_2032); //$NON-NLS-1$
		case ModelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?Model", MtcElementTypes.Model_2033); //$NON-NLS-1$
		case ValidationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?Validation", MtcElementTypes.Validation_2034); //$NON-NLS-1$
		case ReferencedResourceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?ReferencedResource", MtcElementTypes.ReferencedResource_2035); //$NON-NLS-1$
		case ConfigurationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?Configuration", MtcElementTypes.Configuration_2037); //$NON-NLS-1$
		case FileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?File", MtcElementTypes.File_2038); //$NON-NLS-1$
		case HOTransformationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.mtcflow.mtc/1.0?HOTransformation", MtcElementTypes.HOTransformation_2039); //$NON-NLS-1$
		case LibraryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://com.mtcflow.mtc/1.0?Library", MtcElementTypes.Library_3008); //$NON-NLS-1$
		case ScriptEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://com.mtcflow.mtc/1.0?Script", MtcElementTypes.Script_3009); //$NON-NLS-1$
		case VariableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://com.mtcflow.mtc/1.0?Variable", MtcElementTypes.Variable_3010); //$NON-NLS-1$
		case TagEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://com.mtcflow.mtc/1.0?Tag", MtcElementTypes.Tag_3011); //$NON-NLS-1$
		case ModelEnvironmentEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://com.mtcflow.mtc/1.0?ModelEnvironment", MtcElementTypes.ModelEnvironment_3013); //$NON-NLS-1$
		case InputModelEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?InputModel", MtcElementTypes.InputModel_4027); //$NON-NLS-1$
		case OutputModelEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?OutputModel", MtcElementTypes.OutputModel_4028); //$NON-NLS-1$
		case ModelValidationsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?Model?validations", MtcElementTypes.ModelValidations_4031); //$NON-NLS-1$
		case MTCResourceReferencedResourcesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?MTCResource?referencedResources", MtcElementTypes.MTCResourceReferencedResources_4033); //$NON-NLS-1$
		case M2TTransformationOutputFilesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?M2TTransformation?outputFiles", MtcElementTypes.M2TTransformationOutputFiles_4034); //$NON-NLS-1$
		case T2MTransformationInputFilesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?T2MTransformation?inputFiles", MtcElementTypes.T2MTransformationInputFiles_4035); //$NON-NLS-1$
		case HOTransformationOutputTransformationsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?HOTransformation?outputTransformations", MtcElementTypes.HOTransformationOutputTransformations_4039); //$NON-NLS-1$
		case TransformationModelDependenciesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?Transformation?modelDependencies", MtcElementTypes.TransformationModelDependencies_4040); //$NON-NLS-1$
		case TransformationFileDependenciesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?Transformation?fileDependencies", MtcElementTypes.TransformationFileDependencies_4041); //$NON-NLS-1$
		case ModelMetamodelEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://com.mtcflow.mtc/1.0?Model?metamodel", MtcElementTypes.ModelMetamodel_4043); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MtcDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && MtcElementTypes.isKnownElementType(elementType)) {
			image = MtcElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MtcNavigatorGroup) {
			MtcNavigatorGroup group = (MtcNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MtcNavigatorItem) {
			MtcNavigatorItem navigatorItem = (MtcNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MtcVisualIDRegistry.getVisualID(view)) {
		case MTCEditPart.VISUAL_ID:
			return getMTC_1000Text(view);
		case M2MTransformationEditPart.VISUAL_ID:
			return getM2MTransformation_2026Text(view);
		case T2MTransformationEditPart.VISUAL_ID:
			return getT2MTransformation_2028Text(view);
		case MTCTransformationEditPart.VISUAL_ID:
			return getMTCTransformation_2029Text(view);
		case M2TTransformationEditPart.VISUAL_ID:
			return getM2TTransformation_2030Text(view);
		case MetamodelEditPart.VISUAL_ID:
			return getMetamodel_2032Text(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2033Text(view);
		case ValidationEditPart.VISUAL_ID:
			return getValidation_2034Text(view);
		case ReferencedResourceEditPart.VISUAL_ID:
			return getReferencedResource_2035Text(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_2037Text(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2038Text(view);
		case HOTransformationEditPart.VISUAL_ID:
			return getHOTransformation_2039Text(view);
		case LibraryEditPart.VISUAL_ID:
			return getLibrary_3008Text(view);
		case ScriptEditPart.VISUAL_ID:
			return getScript_3009Text(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3010Text(view);
		case TagEditPart.VISUAL_ID:
			return getTag_3011Text(view);
		case ModelEnvironmentEditPart.VISUAL_ID:
			return getModelEnvironment_3013Text(view);
		case InputModelEditPart.VISUAL_ID:
			return getInputModel_4027Text(view);
		case OutputModelEditPart.VISUAL_ID:
			return getOutputModel_4028Text(view);
		case ModelValidationsEditPart.VISUAL_ID:
			return getModelValidations_4031Text(view);
		case MTCResourceReferencedResourcesEditPart.VISUAL_ID:
			return getMTCResourceReferencedResources_4033Text(view);
		case M2TTransformationOutputFilesEditPart.VISUAL_ID:
			return getM2TTransformationOutputFiles_4034Text(view);
		case T2MTransformationInputFilesEditPart.VISUAL_ID:
			return getT2MTransformationInputFiles_4035Text(view);
		case HOTransformationOutputTransformationsEditPart.VISUAL_ID:
			return getHOTransformationOutputTransformations_4039Text(view);
		case TransformationModelDependenciesEditPart.VISUAL_ID:
			return getTransformationModelDependencies_4040Text(view);
		case TransformationFileDependenciesEditPart.VISUAL_ID:
			return getTransformationFileDependencies_4041Text(view);
		case ModelMetamodelEditPart.VISUAL_ID:
			return getModelMetamodel_4043Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getReferencedResource_2035Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.ReferencedResource_2035, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(ReferencedResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMTCResourceReferencedResources_4033Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.MTCResourceReferencedResources_4033, view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getM2MTransformation_2026Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.M2MTransformation_2026, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(M2MTransformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModelEnvironment_3013Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.ModelEnvironment_3013, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(ModelEnvironmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHOTransformationOutputTransformations_4039Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.HOTransformationOutputTransformations_4039, view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputModel_4028Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.OutputModel_4028, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(OutputModelAliasEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformationFileDependencies_4041Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.TransformationFileDependencies_4041, view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModelMetamodel_4043Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.ModelMetamodel_4043, view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformationModelDependencies_4040Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.TransformationModelDependencies_4040, view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModelValidations_4031Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.ModelValidations_4031, view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMTC_1000Text(View view) {
		com.mtcflow.model.mtc.MTC domainModelElement = (com.mtcflow.model.mtc.MTC) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFile_2038Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.File_2038, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(FileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHOTransformation_2039Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.HOTransformation_2039, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(HOTransformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getT2MTransformation_2028Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.T2MTransformation_2028, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(T2MTransformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getT2MTransformationInputFiles_4035Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.T2MTransformationInputFiles_4035, view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidation_2034Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.Validation_2034, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(ValidationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModel_2033Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.Model_2033, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(ModelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLibrary_3008Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.Library_3008, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(LibraryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScript_3009Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.Script_3009, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(ScriptNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTag_3011Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.Tag_3011, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(TagNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConfiguration_2037Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.Configuration_2037, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(ConfigurationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getM2TTransformationOutputFiles_4034Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.M2TTransformationOutputFiles_4034, view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMTCTransformation_2029Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.MTCTransformation_2029, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(MTCTransformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputModel_4027Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.InputModel_4027, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(InputModelAliasEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getM2TTransformation_2030Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.M2TTransformation_2030, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(M2TTransformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMetamodel_2032Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.Metamodel_2032, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(MetamodelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariable_3010Text(View view) {
		IParser parser = MtcParserProvider.getParser(MtcElementTypes.Variable_3010, view.getElement() != null ? view.getElement() : view, MtcVisualIDRegistry.getType(VariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			MtcDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MTCEditPart.MODEL_ID.equals(MtcVisualIDRegistry.getModelID(view));
	}

}
