/**
 */
package com.mtcflow.model.mtc.impl;

import com.mtcflow.model.mtc.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.mtcflow.model.mtc.Configuration;
import com.mtcflow.model.mtc.Decision;
import com.mtcflow.model.mtc.DecisionInputModel;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCTransformation;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcFactory;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.Property;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.Script;
import com.mtcflow.model.mtc.T2MTransformation;
import com.mtcflow.model.mtc.Tag;
import com.mtcflow.model.mtc.Validation;
import com.mtcflow.model.mtc.Variable;
import com.mtcflow.model.mtc.cimpl.ConfigurationCImpl;
import com.mtcflow.model.mtc.cimpl.FileCImpl;
import com.mtcflow.model.mtc.cimpl.HOTransformationCImpl;
import com.mtcflow.model.mtc.cimpl.InputFileCImpl;
import com.mtcflow.model.mtc.cimpl.InputModelCImpl;
import com.mtcflow.model.mtc.cimpl.LibraryCImpl;
import com.mtcflow.model.mtc.cimpl.M2MTransformationCImpl;
import com.mtcflow.model.mtc.cimpl.M2TTransformationCImpl;
import com.mtcflow.model.mtc.cimpl.MTCCImpl;
import com.mtcflow.model.mtc.cimpl.MTCTransformationCImpl;
import com.mtcflow.model.mtc.cimpl.MetamodelCImpl;
import com.mtcflow.model.mtc.cimpl.ModelCImpl;
import com.mtcflow.model.mtc.cimpl.ModelEnvironmentCImpl;
import com.mtcflow.model.mtc.cimpl.ModelValidationCImpl;
import com.mtcflow.model.mtc.cimpl.OutputFileCImpl;
import com.mtcflow.model.mtc.cimpl.OutputModelCImpl;
import com.mtcflow.model.mtc.cimpl.PropertyCImpl;
import com.mtcflow.model.mtc.cimpl.ReferencedResourceCImpl;
import com.mtcflow.model.mtc.cimpl.ScriptCImpl;
import com.mtcflow.model.mtc.cimpl.T2MTransformationCImpl;
import com.mtcflow.model.mtc.cimpl.TagCImpl;
import com.mtcflow.model.mtc.cimpl.ValidationCImpl;
import com.mtcflow.model.mtc.cimpl.VariableCImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtcFactoryImpl extends EFactoryImpl implements MtcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MtcFactory init() {
		try {
			MtcFactory theMtcFactory = (MtcFactory)EPackage.Registry.INSTANCE.getEFactory(MtcPackage.eNS_URI);
			if (theMtcFactory != null) {
				return theMtcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MtcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MtcPackage.MTC: return createMTC();
			case MtcPackage.METAMODEL: return createMetamodel();
			case MtcPackage.REFERENCED_RESOURCE: return createReferencedResource();
			case MtcPackage.FILE: return createFile();
			case MtcPackage.MODEL: return createModel();
			case MtcPackage.VALIDATION: return createValidation();
			case MtcPackage.HO_TRANSFORMATION: return createHOTransformation();
			case MtcPackage.M2M_TRANSFORMATION: return createM2MTransformation();
			case MtcPackage.M2T_TRANSFORMATION: return createM2TTransformation();
			case MtcPackage.MTC_TRANSFORMATION: return createMTCTransformation();
			case MtcPackage.T2M_TRANSFORMATION: return createT2MTransformation();
			case MtcPackage.INPUT_MODEL: return createInputModel();
			case MtcPackage.OUTPUT_MODEL: return createOutputModel();
			case MtcPackage.VARIABLE: return createVariable();
			case MtcPackage.CONFIGURATION: return createConfiguration();
			case MtcPackage.LIBRARY: return createLibrary();
			case MtcPackage.TAG: return createTag();
			case MtcPackage.SCRIPT: return createScript();
			case MtcPackage.MODEL_ENVIRONMENT: return createModelEnvironment();
			case MtcPackage.PROPERTY: return createProperty();
			case MtcPackage.MODEL_VALIDATION: return createModelValidation();
			case MtcPackage.OUTPUT_FILE: return createOutputFile();
			case MtcPackage.INPUT_FILE: return createInputFile();
			case MtcPackage.DECISION: return createDecision();
			case MtcPackage.CHOISE: return createChoise();
			case MtcPackage.DECISION_INPUT_MODEL: return createDecisionInputModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MTC createMTC() {
		MTCImpl mtc = new MTCCImpl();
		return mtc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelCImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ReferencedResource createReferencedResource() {
		ReferencedResourceImpl referencedResource = new ReferencedResourceCImpl();
		return referencedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File createFile() {
		FileImpl file = new FileCImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Model createModel() {
		ModelImpl model = new ModelCImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Validation createValidation() {
		ValidationImpl validation = new ValidationCImpl();
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HOTransformation createHOTransformation() {
		HOTransformationImpl hoTransformation = new HOTransformationCImpl();
		return hoTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public M2MTransformation createM2MTransformation() {
		M2MTransformationImpl m2MTransformation = new M2MTransformationCImpl();
		return m2MTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public M2TTransformation createM2TTransformation() {
		M2TTransformationImpl m2TTransformation = new M2TTransformationCImpl();
		return m2TTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MTCTransformation createMTCTransformation() {
		MTCTransformationImpl mtcTransformation = new MTCTransformationCImpl();
		return mtcTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public T2MTransformation createT2MTransformation() {
		T2MTransformationImpl t2MTransformation = new T2MTransformationCImpl();
		return t2MTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputModel createInputModel() {
		InputModelImpl inputModel = new InputModelCImpl();
		return inputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputModel createOutputModel() {
		OutputModelImpl outputModel = new OutputModelCImpl();
		return outputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableCImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationCImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryCImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Tag createTag() {
		TagImpl tag = new TagCImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptCImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModelEnvironment createModelEnvironment() {
		ModelEnvironmentImpl modelEnvironment = new ModelEnvironmentCImpl();
		return modelEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyCImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModelValidation createModelValidation() {
		ModelValidationImpl modelValidation = new ModelValidationCImpl();
		return modelValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputFile createOutputFile() {
		OutputFileImpl outputFile = new OutputFileCImpl();
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputFile createInputFile() {
		InputFileImpl inputFile = new InputFileCImpl();
		return inputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choise createChoise() {
		ChoiseImpl choise = new ChoiseImpl();
		return choise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionInputModel createDecisionInputModel() {
		DecisionInputModelImpl decisionInputModel = new DecisionInputModelImpl();
		return decisionInputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtcPackage getMtcPackage() {
		return (MtcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MtcPackage getPackage() {
		return MtcPackage.eINSTANCE;
	}

} //MtcFactoryImpl
