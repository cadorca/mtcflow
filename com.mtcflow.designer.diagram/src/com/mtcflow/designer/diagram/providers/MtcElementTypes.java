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

import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

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
import com.mtcflow.designer.diagram.figures.PluginActivator;
import com.mtcflow.designer.diagram.part.MtcDiagramEditorPlugin;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.MtcPackage;

/**
 * @generated
 */
public class MtcElementTypes {

	/**
	 * @generated
	 */
	private MtcElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(MtcDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType MTC_1000 = getElementType("com.mtcflow.diagram.MTC_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType M2MTransformation_2026 = getElementType("com.mtcflow.diagram.M2MTransformation_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType T2MTransformation_2028 = getElementType("com.mtcflow.diagram.T2MTransformation_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MTCTransformation_2029 = getElementType("com.mtcflow.diagram.MTCTransformation_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType M2TTransformation_2030 = getElementType("com.mtcflow.diagram.M2TTransformation_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HOTransformation_2039 = getElementType("com.mtcflow.diagram.HOTransformation_2039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType File_2038 = getElementType("com.mtcflow.diagram.File_2038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Metamodel_2032 = getElementType("com.mtcflow.diagram.Metamodel_2032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Model_2033 = getElementType("com.mtcflow.diagram.Model_2033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Validation_2034 = getElementType("com.mtcflow.diagram.Validation_2034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ReferencedResource_2035 = getElementType("com.mtcflow.diagram.ReferencedResource_2035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Configuration_2037 = getElementType("com.mtcflow.diagram.Configuration_2037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Library_3008 = getElementType("com.mtcflow.diagram.Library_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Script_3009 = getElementType("com.mtcflow.diagram.Script_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Variable_3010 = getElementType("com.mtcflow.diagram.Variable_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Tag_3011 = getElementType("com.mtcflow.diagram.Tag_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModelEnvironment_3013 = getElementType("com.mtcflow.diagram.ModelEnvironment_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputModel_4027 = getElementType("com.mtcflow.diagram.InputModel_4027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputModel_4028 = getElementType("com.mtcflow.diagram.OutputModel_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType M2TTransformationOutputFiles_4034 = getElementType("com.mtcflow.diagram.M2TTransformationOutputFiles_4034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ModelMetamodel_4043 = getElementType("com.mtcflow.diagram.ModelMetamodel_4043"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ModelValidations_4031 = getElementType("com.mtcflow.diagram.ModelValidations_4031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TransformationModelDependencies_4040 = getElementType("com.mtcflow.diagram.TransformationModelDependencies_4040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransformationFileDependencies_4041 = getElementType("com.mtcflow.diagram.TransformationFileDependencies_4041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MTCResourceReferencedResources_4033 = getElementType("com.mtcflow.diagram.MTCResourceReferencedResources_4033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType T2MTransformationInputFiles_4035 = getElementType("com.mtcflow.diagram.T2MTransformationInputFiles_4035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HOTransformationOutputTransformations_4039 = getElementType("com.mtcflow.diagram.HOTransformationOutputTransformations_4039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated NOT
	 */
	private final static HashMap<String, Image> IMAGE_CACHE = new HashMap<String, Image>();

	static {
		IMAGE_CACHE.put("Configuration", PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "icons/configuration.png").createImage());
		IMAGE_CACHE.put("Library", PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "icons/library.png").createImage());
		IMAGE_CACHE.put("Variable", PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "icons/variable.png").createImage());
		IMAGE_CACHE.put("ModelEnvironment", PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "icons/modelenvironment.png").createImage());
		IMAGE_CACHE.put("Script", PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "icons/script.png").createImage());
		IMAGE_CACHE.put("Tag", PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "icons/tag.png").createImage());
	}

	/**
	 * @generated NOT
	 */
	public static Image getImage(ENamedElement element) {
		Image img = IMAGE_CACHE.get(element.getName());
		if (img != null) {
			return img;
		}
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(MTC_1000, MtcPackage.eINSTANCE.getMTC());

			elements.put(HOTransformation_2039, MtcPackage.eINSTANCE.getHOTransformation());

			elements.put(MTCTransformation_2029, MtcPackage.eINSTANCE.getMTCTransformation());

			elements.put(M2MTransformation_2026, MtcPackage.eINSTANCE.getM2MTransformation());

			elements.put(T2MTransformation_2028, MtcPackage.eINSTANCE.getT2MTransformation());

			elements.put(M2TTransformation_2030, MtcPackage.eINSTANCE.getM2TTransformation());

			elements.put(File_2038, MtcPackage.eINSTANCE.getFile());

			elements.put(Metamodel_2032, MtcPackage.eINSTANCE.getMetamodel());

			elements.put(Model_2033, MtcPackage.eINSTANCE.getModel());

			elements.put(Validation_2034, MtcPackage.eINSTANCE.getValidation());

			elements.put(ReferencedResource_2035, MtcPackage.eINSTANCE.getReferencedResource());

			elements.put(Configuration_2037, MtcPackage.eINSTANCE.getConfiguration());

			elements.put(Library_3008, MtcPackage.eINSTANCE.getLibrary());

			elements.put(Script_3009, MtcPackage.eINSTANCE.getScript());

			elements.put(Variable_3010, MtcPackage.eINSTANCE.getVariable());

			elements.put(Tag_3011, MtcPackage.eINSTANCE.getTag());

			elements.put(ModelEnvironment_3013, MtcPackage.eINSTANCE.getModelEnvironment());

			elements.put(InputModel_4027, MtcPackage.eINSTANCE.getInputModel());

			elements.put(OutputModel_4028, MtcPackage.eINSTANCE.getOutputModel());

			elements.put(ModelMetamodel_4043, MtcPackage.eINSTANCE.getModel_Metamodel());

			elements.put(ModelValidations_4031, MtcPackage.eINSTANCE.getModel_Validations());

			elements.put(HOTransformationOutputTransformations_4039, MtcPackage.eINSTANCE.getHOTransformation_OutputTransformations());

			elements.put(M2TTransformationOutputFiles_4034, MtcPackage.eINSTANCE.getM2TTransformation_OutputFiles());

			elements.put(T2MTransformationInputFiles_4035, MtcPackage.eINSTANCE.getT2MTransformation_InputFiles());

			elements.put(TransformationModelDependencies_4040, MtcPackage.eINSTANCE.getTransformation_ModelDependencies());

			elements.put(TransformationFileDependencies_4041, MtcPackage.eINSTANCE.getTransformation_FileDependencies());

			elements.put(MTCResourceReferencedResources_4033, MtcPackage.eINSTANCE.getMTCResource_ReferencedResources());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(MTC_1000);
			KNOWN_ELEMENT_TYPES.add(HOTransformation_2039);
			KNOWN_ELEMENT_TYPES.add(MTCTransformation_2029);
			KNOWN_ELEMENT_TYPES.add(M2MTransformation_2026);
			KNOWN_ELEMENT_TYPES.add(T2MTransformation_2028);
			KNOWN_ELEMENT_TYPES.add(M2TTransformation_2030);
			KNOWN_ELEMENT_TYPES.add(File_2038);
			KNOWN_ELEMENT_TYPES.add(Metamodel_2032);
			KNOWN_ELEMENT_TYPES.add(Model_2033);
			KNOWN_ELEMENT_TYPES.add(Validation_2034);
			KNOWN_ELEMENT_TYPES.add(ReferencedResource_2035);
			KNOWN_ELEMENT_TYPES.add(Configuration_2037);
			KNOWN_ELEMENT_TYPES.add(Library_3008);
			KNOWN_ELEMENT_TYPES.add(Script_3009);
			KNOWN_ELEMENT_TYPES.add(Variable_3010);
			KNOWN_ELEMENT_TYPES.add(Tag_3011);
			KNOWN_ELEMENT_TYPES.add(ModelEnvironment_3013);
			KNOWN_ELEMENT_TYPES.add(InputModel_4027);
			KNOWN_ELEMENT_TYPES.add(OutputModel_4028);
			KNOWN_ELEMENT_TYPES.add(ModelMetamodel_4043);
			KNOWN_ELEMENT_TYPES.add(ModelValidations_4031);
			KNOWN_ELEMENT_TYPES.add(HOTransformationOutputTransformations_4039);
			KNOWN_ELEMENT_TYPES.add(M2TTransformationOutputFiles_4034);
			KNOWN_ELEMENT_TYPES.add(T2MTransformationInputFiles_4035);
			KNOWN_ELEMENT_TYPES.add(TransformationModelDependencies_4040);
			KNOWN_ELEMENT_TYPES.add(TransformationFileDependencies_4041);
			KNOWN_ELEMENT_TYPES.add(MTCResourceReferencedResources_4033);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MTCEditPart.VISUAL_ID:
			return MTC_1000;
		case HOTransformationEditPart.VISUAL_ID:
			return HOTransformation_2039;
		case MTCTransformationEditPart.VISUAL_ID:
			return MTCTransformation_2029;
		case M2MTransformationEditPart.VISUAL_ID:
			return M2MTransformation_2026;
		case T2MTransformationEditPart.VISUAL_ID:
			return T2MTransformation_2028;
		case M2TTransformationEditPart.VISUAL_ID:
			return M2TTransformation_2030;
		case FileEditPart.VISUAL_ID:
			return File_2038;
		case MetamodelEditPart.VISUAL_ID:
			return Metamodel_2032;
		case ModelEditPart.VISUAL_ID:
			return Model_2033;
		case ValidationEditPart.VISUAL_ID:
			return Validation_2034;
		case ReferencedResourceEditPart.VISUAL_ID:
			return ReferencedResource_2035;
		case ConfigurationEditPart.VISUAL_ID:
			return Configuration_2037;
		case LibraryEditPart.VISUAL_ID:
			return Library_3008;
		case ScriptEditPart.VISUAL_ID:
			return Script_3009;
		case VariableEditPart.VISUAL_ID:
			return Variable_3010;
		case TagEditPart.VISUAL_ID:
			return Tag_3011;
		case ModelEnvironmentEditPart.VISUAL_ID:
			return ModelEnvironment_3013;
		case InputModelEditPart.VISUAL_ID:
			return InputModel_4027;
		case OutputModelEditPart.VISUAL_ID:
			return OutputModel_4028;
		case ModelMetamodelEditPart.VISUAL_ID:
			return ModelMetamodel_4043;
		case ModelValidationsEditPart.VISUAL_ID:
			return ModelValidations_4031;
		case HOTransformationOutputTransformationsEditPart.VISUAL_ID:
			return HOTransformationOutputTransformations_4039;
		case M2TTransformationOutputFilesEditPart.VISUAL_ID:
			return M2TTransformationOutputFiles_4034;
		case T2MTransformationInputFilesEditPart.VISUAL_ID:
			return T2MTransformationInputFiles_4035;
		case TransformationModelDependenciesEditPart.VISUAL_ID:
			return TransformationModelDependencies_4040;
		case TransformationFileDependenciesEditPart.VISUAL_ID:
			return TransformationFileDependencies_4041;
		case MTCResourceReferencedResourcesEditPart.VISUAL_ID:
			return MTCResourceReferencedResources_4033;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return com.mtcflow.designer.diagram.providers.MtcElementTypes.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return com.mtcflow.designer.diagram.providers.MtcElementTypes.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return com.mtcflow.designer.diagram.providers.MtcElementTypes.getElement(elementTypeAdapter);
		}
	};

}
