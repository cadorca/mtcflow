/*
 * 
 */
package com.mtcflow.designer.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationEnvironmentsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationLibrariesCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationScriptsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationTagsCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationConfigurationVariablesCompartmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationEditPart;
import com.mtcflow.designer.diagram.edit.parts.ConfigurationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.FileEditPart;
import com.mtcflow.designer.diagram.edit.parts.FileNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationOutputTransformationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationOutputTransformationsExternalLabelEditPart;
import com.mtcflow.designer.diagram.edit.parts.InputModelAliasEditPart;
import com.mtcflow.designer.diagram.edit.parts.InputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.LibraryEditPart;
import com.mtcflow.designer.diagram.edit.parts.LibraryNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2MTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationOutputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationOutputFilesExternalLabelEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCResourceReferencedResourcesEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCResourceReferencedResourcesExternalLabelEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.MetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.MetamodelNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEnvironmentEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEnvironmentNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelMetamodelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelMetamodelExternalLabelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelValidationsEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelValidationsExternalLabelEditPart;
import com.mtcflow.designer.diagram.edit.parts.OutputModelAliasEditPart;
import com.mtcflow.designer.diagram.edit.parts.OutputModelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ReferencedResourceEditPart;
import com.mtcflow.designer.diagram.edit.parts.ReferencedResourceNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ScriptEditPart;
import com.mtcflow.designer.diagram.edit.parts.ScriptNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationInputFilesEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationInputFilesExternalLabelEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.TagEditPart;
import com.mtcflow.designer.diagram.edit.parts.TagNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationFileDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationFileDependenciesExternalLabelEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationModelDependenciesEditPart;
import com.mtcflow.designer.diagram.edit.parts.TransformationModelDependenciesExternalLabelEditPart;
import com.mtcflow.designer.diagram.edit.parts.ValidationEditPart;
import com.mtcflow.designer.diagram.edit.parts.ValidationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.VariableEditPart;
import com.mtcflow.designer.diagram.edit.parts.VariableNameEditPart;
import com.mtcflow.model.mtc.MtcPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MtcVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "com.mtcflow.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MTCEditPart.MODEL_ID.equals(view.getType())) {
				return MTCEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				MtcDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MtcPackage.eINSTANCE.getMTC().isSuperTypeOf(domainElement.eClass()) && isDiagram((com.mtcflow.model.mtc.MTC) domainElement)) {
			return MTCEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.getModelID(containerView);
		if (!MTCEditPart.MODEL_ID.equals(containerModelID) && !"mtc".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MTCEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MTCEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MTCEditPart.VISUAL_ID:
			if (MtcPackage.eINSTANCE.getHOTransformation().isSuperTypeOf(domainElement.eClass())) {
				return HOTransformationEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getMTCTransformation().isSuperTypeOf(domainElement.eClass())) {
				return MTCTransformationEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getM2MTransformation().isSuperTypeOf(domainElement.eClass())) {
				return M2MTransformationEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getT2MTransformation().isSuperTypeOf(domainElement.eClass())) {
				return T2MTransformationEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getM2TTransformation().isSuperTypeOf(domainElement.eClass())) {
				return M2TTransformationEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getFile().isSuperTypeOf(domainElement.eClass())) {
				return FileEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getMetamodel().isSuperTypeOf(domainElement.eClass())) {
				return MetamodelEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getModel().isSuperTypeOf(domainElement.eClass())) {
				return ModelEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getValidation().isSuperTypeOf(domainElement.eClass())) {
				return ValidationEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getReferencedResource().isSuperTypeOf(domainElement.eClass())) {
				return ReferencedResourceEditPart.VISUAL_ID;
			}
			if (MtcPackage.eINSTANCE.getConfiguration().isSuperTypeOf(domainElement.eClass())) {
				return ConfigurationEditPart.VISUAL_ID;
			}
			break;
		case ConfigurationConfigurationVariablesCompartmentEditPart.VISUAL_ID:
			if (MtcPackage.eINSTANCE.getVariable().isSuperTypeOf(domainElement.eClass())) {
				return VariableEditPart.VISUAL_ID;
			}
			break;
		case ConfigurationConfigurationTagsCompartmentEditPart.VISUAL_ID:
			if (MtcPackage.eINSTANCE.getTag().isSuperTypeOf(domainElement.eClass())) {
				return TagEditPart.VISUAL_ID;
			}
			break;
		case ConfigurationConfigurationLibrariesCompartmentEditPart.VISUAL_ID:
			if (MtcPackage.eINSTANCE.getLibrary().isSuperTypeOf(domainElement.eClass())) {
				return LibraryEditPart.VISUAL_ID;
			}
			break;
		case ConfigurationConfigurationScriptsCompartmentEditPart.VISUAL_ID:
			if (MtcPackage.eINSTANCE.getScript().isSuperTypeOf(domainElement.eClass())) {
				return ScriptEditPart.VISUAL_ID;
			}
			break;
		case ConfigurationConfigurationEnvironmentsCompartmentEditPart.VISUAL_ID:
			if (MtcPackage.eINSTANCE.getModelEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ModelEnvironmentEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.getModelID(containerView);
		if (!MTCEditPart.MODEL_ID.equals(containerModelID) && !"mtc".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MTCEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MTCEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MTCEditPart.VISUAL_ID:
			if (HOTransformationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MTCTransformationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (M2MTransformationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (T2MTransformationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (M2TTransformationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetamodelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReferencedResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HOTransformationEditPart.VISUAL_ID:
			if (HOTransformationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MTCTransformationEditPart.VISUAL_ID:
			if (MTCTransformationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case M2MTransformationEditPart.VISUAL_ID:
			if (M2MTransformationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case T2MTransformationEditPart.VISUAL_ID:
			if (T2MTransformationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case M2TTransformationEditPart.VISUAL_ID:
			if (M2TTransformationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FileEditPart.VISUAL_ID:
			if (FileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetamodelEditPart.VISUAL_ID:
			if (MetamodelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (ModelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValidationEditPart.VISUAL_ID:
			if (ValidationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReferencedResourceEditPart.VISUAL_ID:
			if (ReferencedResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationEditPart.VISUAL_ID:
			if (ConfigurationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigurationConfigurationVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigurationConfigurationTagsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigurationConfigurationLibrariesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigurationConfigurationScriptsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigurationConfigurationEnvironmentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LibraryEditPart.VISUAL_ID:
			if (LibraryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScriptEditPart.VISUAL_ID:
			if (ScriptNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariableEditPart.VISUAL_ID:
			if (VariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TagEditPart.VISUAL_ID:
			if (TagNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelEnvironmentEditPart.VISUAL_ID:
			if (ModelEnvironmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigurationVariablesCompartmentEditPart.VISUAL_ID:
			if (VariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigurationTagsCompartmentEditPart.VISUAL_ID:
			if (TagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigurationLibrariesCompartmentEditPart.VISUAL_ID:
			if (LibraryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigurationScriptsCompartmentEditPart.VISUAL_ID:
			if (ScriptEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigurationEnvironmentsCompartmentEditPart.VISUAL_ID:
			if (ModelEnvironmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputModelEditPart.VISUAL_ID:
			if (InputModelAliasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputModelEditPart.VISUAL_ID:
			if (OutputModelAliasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelMetamodelEditPart.VISUAL_ID:
			if (ModelMetamodelExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelValidationsEditPart.VISUAL_ID:
			if (ModelValidationsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HOTransformationOutputTransformationsEditPart.VISUAL_ID:
			if (HOTransformationOutputTransformationsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case M2TTransformationOutputFilesEditPart.VISUAL_ID:
			if (M2TTransformationOutputFilesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case T2MTransformationInputFilesEditPart.VISUAL_ID:
			if (T2MTransformationInputFilesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransformationModelDependenciesEditPart.VISUAL_ID:
			if (TransformationModelDependenciesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransformationFileDependenciesEditPart.VISUAL_ID:
			if (TransformationFileDependenciesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MTCResourceReferencedResourcesEditPart.VISUAL_ID:
			if (MTCResourceReferencedResourcesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MtcPackage.eINSTANCE.getInputModel().isSuperTypeOf(domainElement.eClass())) {
			return InputModelEditPart.VISUAL_ID;
		}
		if (MtcPackage.eINSTANCE.getOutputModel().isSuperTypeOf(domainElement.eClass())) {
			return OutputModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(com.mtcflow.model.mtc.MTC element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ConfigurationConfigurationVariablesCompartmentEditPart.VISUAL_ID:
		case ConfigurationConfigurationTagsCompartmentEditPart.VISUAL_ID:
		case ConfigurationConfigurationLibrariesCompartmentEditPart.VISUAL_ID:
		case ConfigurationConfigurationScriptsCompartmentEditPart.VISUAL_ID:
		case ConfigurationConfigurationEnvironmentsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MTCEditPart.VISUAL_ID:
			return false;
		case M2MTransformationEditPart.VISUAL_ID:
		case T2MTransformationEditPart.VISUAL_ID:
		case MTCTransformationEditPart.VISUAL_ID:
		case M2TTransformationEditPart.VISUAL_ID:
		case MetamodelEditPart.VISUAL_ID:
		case ModelEditPart.VISUAL_ID:
		case ValidationEditPart.VISUAL_ID:
		case ReferencedResourceEditPart.VISUAL_ID:
		case FileEditPart.VISUAL_ID:
		case HOTransformationEditPart.VISUAL_ID:
		case LibraryEditPart.VISUAL_ID:
		case ScriptEditPart.VISUAL_ID:
		case VariableEditPart.VISUAL_ID:
		case TagEditPart.VISUAL_ID:
		case ModelEnvironmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return com.mtcflow.designer.diagram.part.MtcVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
