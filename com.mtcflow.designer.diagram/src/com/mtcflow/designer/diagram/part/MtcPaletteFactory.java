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

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.mtcflow.designer.diagram.providers.MtcElementTypes;

/**
 * @generated
 */
public class MtcPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTransformations1Group());
		paletteRoot.add(createConnections2Group());
		paletteRoot.add(createArtifacts3Group());
		paletteRoot.add(createConfiguration4Group());
		paletteRoot.add(createValidation5Group());
	}

	/**
	 * Creates "Transformations" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createTransformations1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Transformations1Group_title);
		paletteContainer.setId("createTransformations1Group"); //$NON-NLS-1$
		paletteContainer.add(createHOTHighOrderTranformation1CreationTool());
		paletteContainer.add(createM2MModelToModel2CreationTool());
		paletteContainer.add(createM2TModelToText3CreationTool());
		paletteContainer.add(createMTCModelTChain4CreationTool());
		paletteContainer.add(createT2MTextToModel5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDependsonfile1CreationTool());
		paletteContainer.add(createDependsonmodel2CreationTool());
		paletteContainer.add(createGeneratedTransformations3CreationTool());
		paletteContainer.add(createInputFiles4CreationTool());
		paletteContainer.add(createInputModel5CreationTool());
		paletteContainer.add(createMetamodel6CreationTool());
		paletteContainer.add(createOutputFiles7CreationTool());
		paletteContainer.add(createOutputModel8CreationTool());
		paletteContainer.add(createReferencedResources9CreationTool());
		paletteContainer.add(createValidations10CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Artifacts" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createArtifacts3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Artifacts3Group_title);
		paletteContainer.setId("createArtifacts3Group"); //$NON-NLS-1$
		paletteContainer.add(createFile1CreationTool());
		paletteContainer.add(createMetamodel2CreationTool());
		paletteContainer.add(createModel3CreationTool());
		paletteContainer.add(createReferencedResource4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Configuration" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createConfiguration4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Configuration4Group_title);
		paletteContainer.setId("createConfiguration4Group"); //$NON-NLS-1$
		paletteContainer.add(createLibrary1CreationTool());
		paletteContainer.add(createMTCConfiguration2CreationTool());
		paletteContainer.add(createModelEnvironment3CreationTool());
		paletteContainer.add(createScript4CreationTool());
		paletteContainer.add(createTag5CreationTool());
		paletteContainer.add(createVariable6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Validation" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createValidation5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Validation5Group_title);
		paletteContainer.setId("createValidation5Group"); //$NON-NLS-1$
		paletteContainer.add(createValidation1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHOTHighOrderTranformation1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.HOTHighOrderTranformation1CreationTool_title, Messages.HOTHighOrderTranformation1CreationTool_desc, Collections.singletonList(MtcElementTypes.HOTransformation_2039));
		entry.setId("createHOTHighOrderTranformation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/hot.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createM2MModelToModel2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.M2MModelToModel2CreationTool_title, Messages.M2MModelToModel2CreationTool_desc, Collections.singletonList(MtcElementTypes.M2MTransformation_2026));
		entry.setId("createM2MModelToModel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/m2m.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createM2TModelToText3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.M2TModelToText3CreationTool_title, Messages.M2TModelToText3CreationTool_desc, Collections.singletonList(MtcElementTypes.M2TTransformation_2030));
		entry.setId("createM2TModelToText3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/m2t.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMTCModelTChain4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.MTCModelTChain4CreationTool_title, Messages.MTCModelTChain4CreationTool_desc, Collections.singletonList(MtcElementTypes.MTCTransformation_2029));
		entry.setId("createMTCModelTChain4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/mtc.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createT2MTextToModel5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.T2MTextToModel5CreationTool_title, Messages.T2MTextToModel5CreationTool_desc, Collections.singletonList(MtcElementTypes.T2MTransformation_2028));
		entry.setId("createT2MTextToModel5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/t2m.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependsonfile1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Dependsonfile1CreationTool_title, Messages.Dependsonfile1CreationTool_desc, Collections.singletonList(MtcElementTypes.TransformationFileDependencies_4041));
		entry.setId("createDependsonfile1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependsonmodel2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Dependsonmodel2CreationTool_title, Messages.Dependsonmodel2CreationTool_desc, Collections.singletonList(MtcElementTypes.TransformationModelDependencies_4040));
		entry.setId("createDependsonmodel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneratedTransformations3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.GeneratedTransformations3CreationTool_title, Messages.GeneratedTransformations3CreationTool_desc, Collections.singletonList(MtcElementTypes.HOTransformationOutputTransformations_4039));
		entry.setId("createGeneratedTransformations3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputFiles4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.InputFiles4CreationTool_title, Messages.InputFiles4CreationTool_desc, Collections.singletonList(MtcElementTypes.T2MTransformationInputFiles_4035));
		entry.setId("createInputFiles4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputModel5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.InputModel5CreationTool_title, Messages.InputModel5CreationTool_desc, Collections.singletonList(MtcElementTypes.InputModel_4027));
		entry.setId("createInputModel5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetamodel6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Metamodel6CreationTool_title, Messages.Metamodel6CreationTool_desc, Collections.singletonList(MtcElementTypes.ModelMetamodel_4043));
		entry.setId("createMetamodel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputFiles7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.OutputFiles7CreationTool_title, Messages.OutputFiles7CreationTool_desc, Collections.singletonList(MtcElementTypes.M2TTransformationOutputFiles_4034));
		entry.setId("createOutputFiles7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputModel8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.OutputModel8CreationTool_title, Messages.OutputModel8CreationTool_desc, Collections.singletonList(MtcElementTypes.OutputModel_4028));
		entry.setId("createOutputModel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReferencedResources9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.ReferencedResources9CreationTool_title, Messages.ReferencedResources9CreationTool_desc, Collections.singletonList(MtcElementTypes.MTCResourceReferencedResources_4033));
		entry.setId("createReferencedResources9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValidations10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Validations10CreationTool_title, Messages.Validations10CreationTool_desc, Collections.singletonList(MtcElementTypes.ModelValidations_4031));
		entry.setId("createValidations10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFile1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.File1CreationTool_title, Messages.File1CreationTool_desc, Collections.singletonList(MtcElementTypes.File_2038));
		entry.setId("createFile1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/file.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetamodel2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Metamodel2CreationTool_title, Messages.Metamodel2CreationTool_desc, Collections.singletonList(MtcElementTypes.Metamodel_2032));
		entry.setId("createMetamodel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/metamodel.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModel3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Model3CreationTool_title, Messages.Model3CreationTool_desc, Collections.singletonList(MtcElementTypes.Model_2033));
		entry.setId("createModel3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/model.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReferencedResource4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ReferencedResource4CreationTool_title, Messages.ReferencedResource4CreationTool_desc, Collections.singletonList(MtcElementTypes.ReferencedResource_2035));
		entry.setId("createReferencedResource4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/refresource.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLibrary1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Library1CreationTool_title, Messages.Library1CreationTool_desc, Collections.singletonList(MtcElementTypes.Library_3008));
		entry.setId("createLibrary1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/library.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMTCConfiguration2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.MTCConfiguration2CreationTool_title, Messages.MTCConfiguration2CreationTool_desc, Collections.singletonList(MtcElementTypes.Configuration_2037));
		entry.setId("createMTCConfiguration2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/configuration.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelEnvironment3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ModelEnvironment3CreationTool_title, Messages.ModelEnvironment3CreationTool_desc, Collections.singletonList(MtcElementTypes.ModelEnvironment_3013));
		entry.setId("createModelEnvironment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/modelenvironment.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScript4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Script4CreationTool_title, Messages.Script4CreationTool_desc, Collections.singletonList(MtcElementTypes.Script_3009));
		entry.setId("createScript4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/script.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTag5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Tag5CreationTool_title, Messages.Tag5CreationTool_desc, Collections.singletonList(MtcElementTypes.Tag_3011));
		entry.setId("createTag5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/tag.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariable6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Variable6CreationTool_title, Messages.Variable6CreationTool_desc, Collections.singletonList(MtcElementTypes.Variable_3010));
		entry.setId("createVariable6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/variable.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValidation1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Validation1CreationTool_title, Messages.Validation1CreationTool_desc, Collections.singletonList(MtcElementTypes.Validation_2034));
		entry.setId("createValidation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MtcDiagramEditorPlugin.findImageDescriptor("icons/validation.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
