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
package com.mtcflow.designer.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationEnvironmentsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationLibrariesCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationScriptsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationTagsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationVariablesCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationEditPart;
import com.mtcflow.designer.diagram.edit.parts.FileEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationOutputTransformationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.InputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.LibraryEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationOutputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCResourceReferencedResourcesEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.MetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEnvironmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelMetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelValidationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.OutputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ReferencedResourceEditPart;
import com.mtcflow.designer.diagram.edit.parts.ScriptEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationInputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TagEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationFileDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationModelDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.ValidationEditPart;
import com.mtcflow.designer.diagram.edit.parts.VariableEditPart;
import com.mtcflow.designer.diagram.providers.MtcElementTypes;
import com.mtcflow.model.mtc.Configuration;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.MTCTransformation;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.ModelProducerTransformation;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.Script;
import com.mtcflow.model.mtc.T2MTransformation;
import com.mtcflow.model.mtc.Tag;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;
import com.mtcflow.model.mtc.Variable;

/**
 * @generated
 */
public class MtcDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<MtcNodeDescriptor> getSemanticChildren(View view) {
		switch (MtcVisualIDRegistry.getVisualID(view)) {
		case MTCEditPart.VISUAL_ID:
			return getMTC_1000SemanticChildren(view);
		case ConfigurationConfigurationVariablesCompartmentEditPart.VISUAL_ID:
			return getConfigurationConfigurationVariablesCompartment_7008SemanticChildren(view);
		case ConfigurationConfigurationTagsCompartmentEditPart.VISUAL_ID:
			return getConfigurationConfigurationTagsCompartment_7009SemanticChildren(view);
		case ConfigurationConfigurationLibrariesCompartmentEditPart.VISUAL_ID:
			return getConfigurationConfigurationLibrariesCompartment_7010SemanticChildren(view);
		case ConfigurationConfigurationScriptsCompartmentEditPart.VISUAL_ID:
			return getConfigurationConfigurationScriptsCompartment_7011SemanticChildren(view);
		case ConfigurationConfigurationEnvironmentsCompartmentEditPart.VISUAL_ID:
			return getConfigurationConfigurationEnvironmentsCompartment_7012SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcNodeDescriptor> getMTC_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		com.mtcflow.model.mtc.MTC modelElement = (com.mtcflow.model.mtc.MTC) view.getElement();
		LinkedList<MtcNodeDescriptor> result = new LinkedList<MtcNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTransformations().iterator(); it.hasNext();) {
			Transformation childElement = (Transformation) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HOTransformationEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MTCTransformationEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == M2MTransformationEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == T2MTransformationEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == M2TTransformationEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FileEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMetamodels().iterator(); it.hasNext();) {
			Metamodel childElement = (Metamodel) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MetamodelEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getModels().iterator(); it.hasNext();) {
			Model childElement = (Model) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModelEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidations().iterator(); it.hasNext();) {
			Validation childElement = (Validation) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ValidationEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getReferencedResources().iterator(); it.hasNext();) {
			ReferencedResource childElement = (ReferencedResource) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ReferencedResourceEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Configuration childElement = modelElement.getConfigurations();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConfigurationEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcNodeDescriptor> getConfigurationConfigurationVariablesCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Configuration modelElement = (Configuration) containerView.getElement();
		LinkedList<MtcNodeDescriptor> result = new LinkedList<MtcNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == VariableEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcNodeDescriptor> getConfigurationConfigurationTagsCompartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Configuration modelElement = (Configuration) containerView.getElement();
		LinkedList<MtcNodeDescriptor> result = new LinkedList<MtcNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTags().iterator(); it.hasNext();) {
			Tag childElement = (Tag) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TagEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcNodeDescriptor> getConfigurationConfigurationLibrariesCompartment_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Configuration modelElement = (Configuration) containerView.getElement();
		LinkedList<MtcNodeDescriptor> result = new LinkedList<MtcNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLibraries().iterator(); it.hasNext();) {
			Library childElement = (Library) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LibraryEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcNodeDescriptor> getConfigurationConfigurationScriptsCompartment_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Configuration modelElement = (Configuration) containerView.getElement();
		LinkedList<MtcNodeDescriptor> result = new LinkedList<MtcNodeDescriptor>();
		for (Iterator<?> it = modelElement.getScripts().iterator(); it.hasNext();) {
			Script childElement = (Script) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ScriptEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcNodeDescriptor> getConfigurationConfigurationEnvironmentsCompartment_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Configuration modelElement = (Configuration) containerView.getElement();
		LinkedList<MtcNodeDescriptor> result = new LinkedList<MtcNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEnvironments().iterator(); it.hasNext();) {
			ModelEnvironment childElement = (ModelEnvironment) it.next();
			int visualID = MtcVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModelEnvironmentEditPart.VISUAL_ID) {
				result.add(new MtcNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getContainedLinks(View view) {
		switch (MtcVisualIDRegistry.getVisualID(view)) {
		case MTCEditPart.VISUAL_ID:
			return getMTC_1000ContainedLinks(view);
		case HOTransformationEditPart.VISUAL_ID:
			return getHOTransformation_2039ContainedLinks(view);
		case MTCTransformationEditPart.VISUAL_ID:
			return getMTCTransformation_2029ContainedLinks(view);
		case M2MTransformationEditPart.VISUAL_ID:
			return getM2MTransformation_2026ContainedLinks(view);
		case T2MTransformationEditPart.VISUAL_ID:
			return getT2MTransformation_2028ContainedLinks(view);
		case M2TTransformationEditPart.VISUAL_ID:
			return getM2TTransformation_2030ContainedLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2038ContainedLinks(view);
		case MetamodelEditPart.VISUAL_ID:
			return getMetamodel_2032ContainedLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2033ContainedLinks(view);
		case ValidationEditPart.VISUAL_ID:
			return getValidation_2034ContainedLinks(view);
		case ReferencedResourceEditPart.VISUAL_ID:
			return getReferencedResource_2035ContainedLinks(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_2037ContainedLinks(view);
		case LibraryEditPart.VISUAL_ID:
			return getLibrary_3008ContainedLinks(view);
		case ScriptEditPart.VISUAL_ID:
			return getScript_3009ContainedLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3010ContainedLinks(view);
		case TagEditPart.VISUAL_ID:
			return getTag_3011ContainedLinks(view);
		case ModelEnvironmentEditPart.VISUAL_ID:
			return getModelEnvironment_3013ContainedLinks(view);
		case InputModelEditPart.VISUAL_ID:
			return getInputModel_4027ContainedLinks(view);
		case OutputModelEditPart.VISUAL_ID:
			return getOutputModel_4028ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getIncomingLinks(View view) {
		switch (MtcVisualIDRegistry.getVisualID(view)) {
		case HOTransformationEditPart.VISUAL_ID:
			return getHOTransformation_2039IncomingLinks(view);
		case MTCTransformationEditPart.VISUAL_ID:
			return getMTCTransformation_2029IncomingLinks(view);
		case M2MTransformationEditPart.VISUAL_ID:
			return getM2MTransformation_2026IncomingLinks(view);
		case T2MTransformationEditPart.VISUAL_ID:
			return getT2MTransformation_2028IncomingLinks(view);
		case M2TTransformationEditPart.VISUAL_ID:
			return getM2TTransformation_2030IncomingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2038IncomingLinks(view);
		case MetamodelEditPart.VISUAL_ID:
			return getMetamodel_2032IncomingLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2033IncomingLinks(view);
		case ValidationEditPart.VISUAL_ID:
			return getValidation_2034IncomingLinks(view);
		case ReferencedResourceEditPart.VISUAL_ID:
			return getReferencedResource_2035IncomingLinks(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_2037IncomingLinks(view);
		case LibraryEditPart.VISUAL_ID:
			return getLibrary_3008IncomingLinks(view);
		case ScriptEditPart.VISUAL_ID:
			return getScript_3009IncomingLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3010IncomingLinks(view);
		case TagEditPart.VISUAL_ID:
			return getTag_3011IncomingLinks(view);
		case ModelEnvironmentEditPart.VISUAL_ID:
			return getModelEnvironment_3013IncomingLinks(view);
		case InputModelEditPart.VISUAL_ID:
			return getInputModel_4027IncomingLinks(view);
		case OutputModelEditPart.VISUAL_ID:
			return getOutputModel_4028IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getOutgoingLinks(View view) {
		switch (MtcVisualIDRegistry.getVisualID(view)) {
		case HOTransformationEditPart.VISUAL_ID:
			return getHOTransformation_2039OutgoingLinks(view);
		case MTCTransformationEditPart.VISUAL_ID:
			return getMTCTransformation_2029OutgoingLinks(view);
		case M2MTransformationEditPart.VISUAL_ID:
			return getM2MTransformation_2026OutgoingLinks(view);
		case T2MTransformationEditPart.VISUAL_ID:
			return getT2MTransformation_2028OutgoingLinks(view);
		case M2TTransformationEditPart.VISUAL_ID:
			return getM2TTransformation_2030OutgoingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2038OutgoingLinks(view);
		case MetamodelEditPart.VISUAL_ID:
			return getMetamodel_2032OutgoingLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2033OutgoingLinks(view);
		case ValidationEditPart.VISUAL_ID:
			return getValidation_2034OutgoingLinks(view);
		case ReferencedResourceEditPart.VISUAL_ID:
			return getReferencedResource_2035OutgoingLinks(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_2037OutgoingLinks(view);
		case LibraryEditPart.VISUAL_ID:
			return getLibrary_3008OutgoingLinks(view);
		case ScriptEditPart.VISUAL_ID:
			return getScript_3009OutgoingLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3010OutgoingLinks(view);
		case TagEditPart.VISUAL_ID:
			return getTag_3011OutgoingLinks(view);
		case ModelEnvironmentEditPart.VISUAL_ID:
			return getModelEnvironment_3013OutgoingLinks(view);
		case InputModelEditPart.VISUAL_ID:
			return getInputModel_4027OutgoingLinks(view);
		case OutputModelEditPart.VISUAL_ID:
			return getOutputModel_4028OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getMTC_1000ContainedLinks(View view) {
		com.mtcflow.model.mtc.MTC modelElement = (com.mtcflow.model.mtc.MTC) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InputModel_4027(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_OutputModel_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getMTCTransformation_2029ContainedLinks(View view) {
		MTCTransformation modelElement = (MTCTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getM2MTransformation_2026ContainedLinks(View view) {
		M2MTransformation modelElement = (M2MTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getT2MTransformation_2028ContainedLinks(View view) {
		T2MTransformation modelElement = (T2MTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getM2TTransformation_2030ContainedLinks(View view) {
		M2TTransformation modelElement = (M2TTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getHOTransformation_2039ContainedLinks(View view) {
		HOTransformation modelElement = (HOTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getFile_2038ContainedLinks(View view) {
		File modelElement = (File) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getMetamodel_2032ContainedLinks(View view) {
		Metamodel modelElement = (Metamodel) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getModel_2033ContainedLinks(View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Model_Metamodel_4043(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Model_Validations_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getValidation_2034ContainedLinks(View view) {
		Validation modelElement = (Validation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getReferencedResource_2035ContainedLinks(View view) {
		ReferencedResource modelElement = (ReferencedResource) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getConfiguration_2037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getLibrary_3008ContainedLinks(View view) {
		Library modelElement = (Library) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getScript_3009ContainedLinks(View view) {
		Script modelElement = (Script) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getVariable_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getTag_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getModelEnvironment_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getInputModel_4027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getOutputModel_4028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getMTCTransformation_2029IncomingLinks(View view) {
		MTCTransformation modelElement = (MTCTransformation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputModel_4027(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getM2MTransformation_2026IncomingLinks(View view) {
		M2MTransformation modelElement = (M2MTransformation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputModel_4027(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getT2MTransformation_2028IncomingLinks(View view) {
		T2MTransformation modelElement = (T2MTransformation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputModel_4027(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getM2TTransformation_2030IncomingLinks(View view) {
		M2TTransformation modelElement = (M2TTransformation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputModel_4027(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getHOTransformation_2039IncomingLinks(View view) {
		HOTransformation modelElement = (HOTransformation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputModel_4027(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getFile_2038IncomingLinks(View view) {
		File modelElement = (File) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getMetamodel_2032IncomingLinks(View view) {
		Metamodel modelElement = (Metamodel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Model_Metamodel_4043(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getModel_2033IncomingLinks(View view) {
		Model modelElement = (Model) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_OutputModel_4028(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getValidation_2034IncomingLinks(View view) {
		Validation modelElement = (Validation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Model_Validations_4031(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getReferencedResource_2035IncomingLinks(View view) {
		ReferencedResource modelElement = (ReferencedResource) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getConfiguration_2037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getLibrary_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getScript_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getVariable_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getTag_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getModelEnvironment_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getInputModel_4027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getOutputModel_4028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getMTCTransformation_2029OutgoingLinks(View view) {
		MTCTransformation modelElement = (MTCTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_OutputModel_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getM2MTransformation_2026OutgoingLinks(View view) {
		M2MTransformation modelElement = (M2MTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_OutputModel_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getT2MTransformation_2028OutgoingLinks(View view) {
		T2MTransformation modelElement = (T2MTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_OutputModel_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getM2TTransformation_2030OutgoingLinks(View view) {
		M2TTransformation modelElement = (M2TTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getHOTransformation_2039OutgoingLinks(View view) {
		HOTransformation modelElement = (HOTransformation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_OutputModel_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getFile_2038OutgoingLinks(View view) {
		File modelElement = (File) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getMetamodel_2032OutgoingLinks(View view) {
		Metamodel modelElement = (Metamodel) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getModel_2033OutgoingLinks(View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputModel_4027(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Model_Metamodel_4043(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Model_Validations_4031(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getValidation_2034OutgoingLinks(View view) {
		Validation modelElement = (Validation) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getReferencedResource_2035OutgoingLinks(View view) {
		ReferencedResource modelElement = (ReferencedResource) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getConfiguration_2037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getLibrary_3008OutgoingLinks(View view) {
		Library modelElement = (Library) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getScript_3009OutgoingLinks(View view) {
		Script modelElement = (Script) view.getElement();
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getVariable_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getTag_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getModelEnvironment_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getInputModel_4027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MtcLinkDescriptor> getOutputModel_4028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getContainedTypeModelFacetLinks_InputModel_4027(com.mtcflow.model.mtc.MTC container) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> links = container.getInputModels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InputModel) {
				continue;
			}
			InputModel link = (InputModel) linkObject;
			if (InputModelEditPart.VISUAL_ID != MtcVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Transformation dst = link.getTransformation();
			Model src = link.getModel();
			result.add(new MtcLinkDescriptor(src, dst, link, MtcElementTypes.InputModel_4027, InputModelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getContainedTypeModelFacetLinks_OutputModel_4028(com.mtcflow.model.mtc.MTC container) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> links = container.getOutputModels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OutputModel) {
				continue;
			}
			OutputModel link = (OutputModel) linkObject;
			if (OutputModelEditPart.VISUAL_ID != MtcVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Model dst = link.getModel();
			ModelProducerTransformation src = link.getTransformation();
			result.add(new MtcLinkDescriptor(src, dst, link, MtcElementTypes.OutputModel_4028, OutputModelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingTypeModelFacetLinks_InputModel_4027(Transformation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MtcPackage.eINSTANCE.getInputModel_Transformation() || false == setting.getEObject() instanceof InputModel) {
				continue;
			}
			InputModel link = (InputModel) setting.getEObject();
			if (InputModelEditPart.VISUAL_ID != MtcVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Model src = link.getModel();
			result.add(new MtcLinkDescriptor(src, target, link, MtcElementTypes.InputModel_4027, InputModelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingTypeModelFacetLinks_OutputModel_4028(Model target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MtcPackage.eINSTANCE.getOutputModel_Model() || false == setting.getEObject() instanceof OutputModel) {
				continue;
			}
			OutputModel link = (OutputModel) setting.getEObject();
			if (OutputModelEditPart.VISUAL_ID != MtcVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelProducerTransformation src = link.getTransformation();
			result.add(new MtcLinkDescriptor(src, target, link, MtcElementTypes.OutputModel_4028, OutputModelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(File target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MtcPackage.eINSTANCE.getM2TTransformation_OutputFiles()) {
				result.add(new MtcLinkDescriptor(setting.getEObject(), target, MtcElementTypes.M2TTransformationOutputFiles_4034, M2TTransformationOutputFilesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingFeatureModelFacetLinks_Model_Metamodel_4043(Metamodel target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MtcPackage.eINSTANCE.getModel_Metamodel()) {
				result.add(new MtcLinkDescriptor(setting.getEObject(), target, MtcElementTypes.ModelMetamodel_4043, ModelMetamodelEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingFeatureModelFacetLinks_Model_Validations_4031(Validation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MtcPackage.eINSTANCE.getModel_Validations()) {
				result.add(new MtcLinkDescriptor(setting.getEObject(), target, MtcElementTypes.ModelValidations_4031, ModelValidationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(Model target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MtcPackage.eINSTANCE.getTransformation_ModelDependencies()) {
				result.add(new MtcLinkDescriptor(setting.getEObject(), target, MtcElementTypes.TransformationModelDependencies_4040, TransformationModelDependenciesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingFeatureModelFacetLinks_Transformation_FileDependencies_4041(File target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MtcPackage.eINSTANCE.getTransformation_FileDependencies()) {
				result.add(new MtcLinkDescriptor(setting.getEObject(), target, MtcElementTypes.TransformationFileDependencies_4041, TransformationFileDependenciesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(ReferencedResource target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MtcPackage.eINSTANCE.getMTCResource_ReferencedResources()) {
				result.add(new MtcLinkDescriptor(setting.getEObject(), target, MtcElementTypes.MTCResourceReferencedResources_4033, MTCResourceReferencedResourcesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(File target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MtcPackage.eINSTANCE.getT2MTransformation_InputFiles()) {
				result.add(new MtcLinkDescriptor(setting.getEObject(), target, MtcElementTypes.T2MTransformationInputFiles_4035, T2MTransformationInputFilesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getIncomingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(Transformation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MtcPackage.eINSTANCE.getHOTransformation_OutputTransformations()) {
				result.add(new MtcLinkDescriptor(setting.getEObject(), target, MtcElementTypes.HOTransformationOutputTransformations_4039, HOTransformationOutputTransformationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingTypeModelFacetLinks_InputModel_4027(Model source) {
		com.mtcflow.model.mtc.MTC container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof com.mtcflow.model.mtc.MTC) {
				container = (com.mtcflow.model.mtc.MTC) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> links = container.getInputModels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InputModel) {
				continue;
			}
			InputModel link = (InputModel) linkObject;
			if (InputModelEditPart.VISUAL_ID != MtcVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Transformation dst = link.getTransformation();
			Model src = link.getModel();
			if (src != source) {
				continue;
			}
			result.add(new MtcLinkDescriptor(src, dst, link, MtcElementTypes.InputModel_4027, InputModelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingTypeModelFacetLinks_OutputModel_4028(ModelProducerTransformation source) {
		com.mtcflow.model.mtc.MTC container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof com.mtcflow.model.mtc.MTC) {
				container = (com.mtcflow.model.mtc.MTC) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> links = container.getOutputModels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OutputModel) {
				continue;
			}
			OutputModel link = (OutputModel) linkObject;
			if (OutputModelEditPart.VISUAL_ID != MtcVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Model dst = link.getModel();
			ModelProducerTransformation src = link.getTransformation();
			if (src != source) {
				continue;
			}
			result.add(new MtcLinkDescriptor(src, dst, link, MtcElementTypes.OutputModel_4028, OutputModelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingFeatureModelFacetLinks_M2TTransformation_OutputFiles_4034(M2TTransformation source) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> destinations = source.getOutputFiles().iterator(); destinations.hasNext();) {
			File destination = (File) destinations.next();
			result.add(new MtcLinkDescriptor(source, destination, MtcElementTypes.M2TTransformationOutputFiles_4034, M2TTransformationOutputFilesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingFeatureModelFacetLinks_Model_Metamodel_4043(Model source) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> destinations = source.getMetamodel().iterator(); destinations.hasNext();) {
			Metamodel destination = (Metamodel) destinations.next();
			result.add(new MtcLinkDescriptor(source, destination, MtcElementTypes.ModelMetamodel_4043, ModelMetamodelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingFeatureModelFacetLinks_Model_Validations_4031(Model source) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> destinations = source.getValidations().iterator(); destinations.hasNext();) {
			Validation destination = (Validation) destinations.next();
			result.add(new MtcLinkDescriptor(source, destination, MtcElementTypes.ModelValidations_4031, ModelValidationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingFeatureModelFacetLinks_Transformation_ModelDependencies_4040(Transformation source) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> destinations = source.getModelDependencies().iterator(); destinations.hasNext();) {
			Model destination = (Model) destinations.next();
			result.add(new MtcLinkDescriptor(source, destination, MtcElementTypes.TransformationModelDependencies_4040, TransformationModelDependenciesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingFeatureModelFacetLinks_Transformation_FileDependencies_4041(Transformation source) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> destinations = source.getFileDependencies().iterator(); destinations.hasNext();) {
			File destination = (File) destinations.next();
			result.add(new MtcLinkDescriptor(source, destination, MtcElementTypes.TransformationFileDependencies_4041, TransformationFileDependenciesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingFeatureModelFacetLinks_MTCResource_ReferencedResources_4033(MTCResource source) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> destinations = source.getReferencedResources().iterator(); destinations.hasNext();) {
			ReferencedResource destination = (ReferencedResource) destinations.next();
			result.add(new MtcLinkDescriptor(source, destination, MtcElementTypes.MTCResourceReferencedResources_4033, MTCResourceReferencedResourcesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingFeatureModelFacetLinks_T2MTransformation_InputFiles_4035(T2MTransformation source) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> destinations = source.getInputFiles().iterator(); destinations.hasNext();) {
			File destination = (File) destinations.next();
			result.add(new MtcLinkDescriptor(source, destination, MtcElementTypes.T2MTransformationInputFiles_4035, T2MTransformationInputFilesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MtcLinkDescriptor> getOutgoingFeatureModelFacetLinks_HOTransformation_OutputTransformations_4039(HOTransformation source) {
		LinkedList<MtcLinkDescriptor> result = new LinkedList<MtcLinkDescriptor>();
		for (Iterator<?> destinations = source.getOutputTransformations().iterator(); destinations.hasNext();) {
			Transformation destination = (Transformation) destinations.next();
			result.add(new MtcLinkDescriptor(source, destination, MtcElementTypes.HOTransformationOutputTransformations_4039, HOTransformationOutputTransformationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<MtcNodeDescriptor> getSemanticChildren(View view) {
			return MtcDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MtcLinkDescriptor> getContainedLinks(View view) {
			return MtcDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MtcLinkDescriptor> getIncomingLinks(View view) {
			return MtcDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MtcLinkDescriptor> getOutgoingLinks(View view) {
			return MtcDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
