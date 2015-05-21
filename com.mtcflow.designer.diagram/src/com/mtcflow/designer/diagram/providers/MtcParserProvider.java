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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import com.mtcflow.designer.diagram.edit.parts.ConfigurationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.FileNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.HOTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.InputModelAliasEditPart;
import com.mtcflow.designer.diagram.edit.parts.LibraryNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2MTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.M2TTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.MTCTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.MetamodelNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelEnvironmentNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ModelNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.OutputModelAliasEditPart;
import com.mtcflow.designer.diagram.edit.parts.ReferencedResourceNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ScriptNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.T2MTransformationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.TagNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.ValidationNameEditPart;
import com.mtcflow.designer.diagram.edit.parts.VariableNameEditPart;
import com.mtcflow.designer.diagram.parsers.MessageFormatParser;
import com.mtcflow.designer.diagram.part.MtcVisualIDRegistry;
import com.mtcflow.model.mtc.MtcPackage;

/**
 * @generated
 */
public class MtcParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser m2MTransformationName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getM2MTransformationName_5033Parser() {
		if (m2MTransformationName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			m2MTransformationName_5033Parser = parser;
		}
		return m2MTransformationName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser t2MTransformationName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getT2MTransformationName_5035Parser() {
		if (t2MTransformationName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			t2MTransformationName_5035Parser = parser;
		}
		return t2MTransformationName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser mTCTransformationName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getMTCTransformationName_5036Parser() {
		if (mTCTransformationName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mTCTransformationName_5036Parser = parser;
		}
		return mTCTransformationName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser m2TTransformationName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getM2TTransformationName_5037Parser() {
		if (m2TTransformationName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			m2TTransformationName_5037Parser = parser;
		}
		return m2TTransformationName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser hOTransformationName_5052Parser;

	/**
	 * @generated
	 */
	private IParser getHOTransformationName_5052Parser() {
		if (hOTransformationName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hOTransformationName_5052Parser = parser;
		}
		return hOTransformationName_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser fileName_5051Parser;

	/**
	 * @generated
	 */
	private IParser getFileName_5051Parser() {
		if (fileName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileName_5051Parser = parser;
		}
		return fileName_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser metamodelName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getMetamodelName_5039Parser() {
		if (metamodelName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			metamodelName_5039Parser = parser;
		}
		return metamodelName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getModelName_5040Parser() {
		if (modelName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelName_5040Parser = parser;
		}
		return modelName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser validationName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getValidationName_5041Parser() {
		if (validationName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validationName_5041Parser = parser;
		}
		return validationName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser referencedResourceName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getReferencedResourceName_5042Parser() {
		if (referencedResourceName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			referencedResourceName_5042Parser = parser;
		}
		return referencedResourceName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser configurationName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getConfigurationName_5049Parser() {
		if (configurationName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getConfiguration_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			configurationName_5049Parser = parser;
		}
		return configurationName_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser libraryName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getLibraryName_5044Parser() {
		if (libraryName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			libraryName_5044Parser = parser;
		}
		return libraryName_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser scriptName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getScriptName_5045Parser() {
		if (scriptName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getMTCResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scriptName_5045Parser = parser;
		}
		return scriptName_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getVariableName_5046Parser() {
		if (variableName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			variableName_5046Parser = parser;
		}
		return variableName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser tagName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getTagName_5047Parser() {
		if (tagName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getTag_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tagName_5047Parser = parser;
		}
		return tagName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelEnvironmentName_5050Parser;

	/**
	 * @generated
	 */
	private IParser getModelEnvironmentName_5050Parser() {
		if (modelEnvironmentName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getModelEnvironment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelEnvironmentName_5050Parser = parser;
		}
		return modelEnvironmentName_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputModelAlias_6018Parser;

	/**
	 * @generated
	 */
	private IParser getInputModelAlias_6018Parser() {
		if (inputModelAlias_6018Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getInputModel_Alias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputModelAlias_6018Parser = parser;
		}
		return inputModelAlias_6018Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputModelAlias_6019Parser;

	/**
	 * @generated
	 */
	private IParser getOutputModelAlias_6019Parser() {
		if (outputModelAlias_6019Parser == null) {
			EAttribute[] features = new EAttribute[] { MtcPackage.eINSTANCE.getOutputModel_Alias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputModelAlias_6019Parser = parser;
		}
		return outputModelAlias_6019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case HOTransformationNameEditPart.VISUAL_ID:
			return getHOTransformationName_5052Parser();
		case MTCTransformationNameEditPart.VISUAL_ID:
			return getMTCTransformationName_5036Parser();
		case M2MTransformationNameEditPart.VISUAL_ID:
			return getM2MTransformationName_5033Parser();
		case T2MTransformationNameEditPart.VISUAL_ID:
			return getT2MTransformationName_5035Parser();
		case M2TTransformationNameEditPart.VISUAL_ID:
			return getM2TTransformationName_5037Parser();
		case FileNameEditPart.VISUAL_ID:
			return getFileName_5051Parser();
		case MetamodelNameEditPart.VISUAL_ID:
			return getMetamodelName_5039Parser();
		case ModelNameEditPart.VISUAL_ID:
			return getModelName_5040Parser();
		case ValidationNameEditPart.VISUAL_ID:
			return getValidationName_5041Parser();
		case ReferencedResourceNameEditPart.VISUAL_ID:
			return getReferencedResourceName_5042Parser();
		case ConfigurationNameEditPart.VISUAL_ID:
			return getConfigurationName_5049Parser();
		case LibraryNameEditPart.VISUAL_ID:
			return getLibraryName_5044Parser();
		case ScriptNameEditPart.VISUAL_ID:
			return getScriptName_5045Parser();
		case VariableNameEditPart.VISUAL_ID:
			return getVariableName_5046Parser();
		case TagNameEditPart.VISUAL_ID:
			return getTagName_5047Parser();
		case ModelEnvironmentNameEditPart.VISUAL_ID:
			return getModelEnvironmentName_5050Parser();
		case InputModelAliasEditPart.VISUAL_ID:
			return getInputModelAlias_6018Parser();
		case OutputModelAliasEditPart.VISUAL_ID:
			return getOutputModelAlias_6019Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * 
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MtcVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MtcVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MtcElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
