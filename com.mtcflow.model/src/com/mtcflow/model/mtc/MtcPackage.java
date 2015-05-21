/**
 */
package com.mtcflow.model.mtc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mtcflow.model.mtc.MtcFactory
 * @model kind="package"
 * @generated
 */
public interface MtcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mtc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.mtcflow.mtc/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.mtcflow.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MtcPackage eINSTANCE = com.mtcflow.model.mtc.impl.MtcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.MTCImpl <em>MTC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.MTCImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getMTC()
	 * @generated
	 */
	int MTC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__FILES = 1;

	/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__METAMODELS = 2;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__MODELS = 3;

	/**
	 * The feature id for the '<em><b>Input Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__INPUT_MODELS = 4;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__TRANSFORMATIONS = 5;

	/**
	 * The feature id for the '<em><b>Output Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__OUTPUT_MODELS = 6;

	/**
	 * The feature id for the '<em><b>M2M Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__M2M_TECHNOLOGY = 7;

	/**
	 * The feature id for the '<em><b>M2T Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__M2T_TECHNOLOGY = 8;

	/**
	 * The feature id for the '<em><b>HO Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__HO_TECHNOLOGY = 9;

	/**
	 * The feature id for the '<em><b>M2M Transformations Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__M2M_TRANSFORMATIONS_FOLDER = 10;

	/**
	 * The feature id for the '<em><b>M2T Transformations Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__M2T_TRANSFORMATIONS_FOLDER = 11;

	/**
	 * The feature id for the '<em><b>HO Transformations Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__HO_TRANSFORMATIONS_FOLDER = 12;

	/**
	 * The feature id for the '<em><b>Metamodels Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__METAMODELS_FOLDER = 13;

	/**
	 * The feature id for the '<em><b>Models Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__MODELS_FOLDER = 14;

	/**
	 * The feature id for the '<em><b>Validations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__VALIDATIONS = 15;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__CONFIGURATIONS = 16;

	/**
	 * The feature id for the '<em><b>Validations Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__VALIDATIONS_FOLDER = 17;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__VERSION = 18;

	/**
	 * The feature id for the '<em><b>Libraries Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__LIBRARIES_FOLDER = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__REFERENCED_RESOURCES = 21;

	/**
	 * The feature id for the '<em><b>Validate Conformance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__VALIDATE_CONFORMANCE = 22;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__WORKSPACE = 23;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__EXECUTION_INFORMATION = 24;

	/**
	 * The feature id for the '<em><b>Model Validations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__MODEL_VALIDATIONS = 25;

	/**
	 * The feature id for the '<em><b>Input Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__INPUT_FILES = 26;

	/**
	 * The feature id for the '<em><b>Output Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__OUTPUT_FILES = 27;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__DECISIONS = 28;

	/**
	 * The feature id for the '<em><b>Decision Input Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC__DECISION_INPUT_MODELS = 29;

	/**
	 * The number of structural features of the '<em>MTC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ConfigurableImpl <em>Configurable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ConfigurableImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getConfigurable()
	 * @generated
	 */
	int CONFIGURABLE = 23;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Configurable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.MTCResourceImpl <em>MTC Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.MTCResourceImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getMTCResource()
	 * @generated
	 */
	int MTC_RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE__PROPERTIES = CONFIGURABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE__NAME = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE__URI = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE__TAGS = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE__DESCRIPTION = CONFIGURABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE__REFERENCED_RESOURCES = CONFIGURABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE__EXECUTION_INFORMATION = CONFIGURABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE__TECHNOLOGY = CONFIGURABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MTC Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_RESOURCE_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.MetamodelImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__PROPERTIES = MTC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = MTC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__URI = MTC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__TAGS = MTC_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__DESCRIPTION = MTC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__REFERENCED_RESOURCES = MTC_RESOURCE__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__EXECUTION_INFORMATION = MTC_RESOURCE__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__TECHNOLOGY = MTC_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__ALIAS = MTC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Autoregister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__AUTOREGISTER = MTC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metamodel URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__METAMODEL_URI = MTC_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = MTC_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ReferencedResourceImpl <em>Referenced Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ReferencedResourceImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getReferencedResource()
	 * @generated
	 */
	int REFERENCED_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__PROPERTIES = MTC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__NAME = MTC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__URI = MTC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__TAGS = MTC_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__DESCRIPTION = MTC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__REFERENCED_RESOURCES = MTC_RESOURCE__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__EXECUTION_INFORMATION = MTC_RESOURCE__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__TECHNOLOGY = MTC_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE__TYPE = MTC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referenced Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_RESOURCE_FEATURE_COUNT = MTC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.FileImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PROPERTIES = MTC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = MTC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__URI = MTC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TAGS = MTC_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = MTC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__REFERENCED_RESOURCES = MTC_RESOURCE__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXECUTION_INFORMATION = MTC_RESOURCE__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TECHNOLOGY = MTC_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TYPE = MTC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = MTC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ModelImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROPERTIES = MTC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = MTC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__URI = MTC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TAGS = MTC_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = MTC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REFERENCED_RESOURCES = MTC_RESOURCE__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EXECUTION_INFORMATION = MTC_RESOURCE__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TECHNOLOGY = MTC_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Metamodels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__METAMODELS = MTC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FORMAT = MTC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = MTC_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ValidationImpl <em>Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ValidationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getValidation()
	 * @generated
	 */
	int VALIDATION = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__PROPERTIES = MTC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__NAME = MTC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__URI = MTC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__TAGS = MTC_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__DESCRIPTION = MTC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__REFERENCED_RESOURCES = MTC_RESOURCE__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__EXECUTION_INFORMATION = MTC_RESOURCE__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__TECHNOLOGY = MTC_RESOURCE__TECHNOLOGY;

	/**
	 * The number of structural features of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_FEATURE_COUNT = MTC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.TransformationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PROPERTIES = MTC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = MTC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__URI = MTC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TAGS = MTC_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DESCRIPTION = MTC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__REFERENCED_RESOURCES = MTC_RESOURCE__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__EXECUTION_INFORMATION = MTC_RESOURCE__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TECHNOLOGY = MTC_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__IMPLEMENTATION_CLASS = MTC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__LIBRARIES = MTC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pre Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PRE_EXECUTION_SCRIPT = MTC_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Post Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__POST_EXECUTION_SCRIPT = MTC_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MODEL_DEPENDENCIES = MTC_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FILE_DEPENDENCIES = MTC_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = MTC_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.M2TTransformationImpl <em>M2T Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.M2TTransformationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getM2TTransformation()
	 * @generated
	 */
	int M2T_TRANSFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__PROPERTIES = TRANSFORMATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__URI = TRANSFORMATION__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__TAGS = TRANSFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__DESCRIPTION = TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__REFERENCED_RESOURCES = TRANSFORMATION__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__EXECUTION_INFORMATION = TRANSFORMATION__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__TECHNOLOGY = TRANSFORMATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__IMPLEMENTATION_CLASS = TRANSFORMATION__IMPLEMENTATION_CLASS;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__LIBRARIES = TRANSFORMATION__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Pre Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__PRE_EXECUTION_SCRIPT = TRANSFORMATION__PRE_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Post Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__POST_EXECUTION_SCRIPT = TRANSFORMATION__POST_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Model Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__MODEL_DEPENDENCIES = TRANSFORMATION__MODEL_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>File Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__FILE_DEPENDENCIES = TRANSFORMATION__FILE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION__TARGET = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>M2T Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2T_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.HOTransformationImpl <em>HO Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.HOTransformationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getHOTransformation()
	 * @generated
	 */
	int HO_TRANSFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__PROPERTIES = M2T_TRANSFORMATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__NAME = M2T_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__URI = M2T_TRANSFORMATION__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__TAGS = M2T_TRANSFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__DESCRIPTION = M2T_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__REFERENCED_RESOURCES = M2T_TRANSFORMATION__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__EXECUTION_INFORMATION = M2T_TRANSFORMATION__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__TECHNOLOGY = M2T_TRANSFORMATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__IMPLEMENTATION_CLASS = M2T_TRANSFORMATION__IMPLEMENTATION_CLASS;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__LIBRARIES = M2T_TRANSFORMATION__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Pre Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__PRE_EXECUTION_SCRIPT = M2T_TRANSFORMATION__PRE_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Post Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__POST_EXECUTION_SCRIPT = M2T_TRANSFORMATION__POST_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Model Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__MODEL_DEPENDENCIES = M2T_TRANSFORMATION__MODEL_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>File Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__FILE_DEPENDENCIES = M2T_TRANSFORMATION__FILE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__TARGET = M2T_TRANSFORMATION__TARGET;

	/**
	 * The feature id for the '<em><b>Output Transformations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION__OUTPUT_TRANSFORMATIONS = M2T_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HO Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_TRANSFORMATION_FEATURE_COUNT = M2T_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ModelProducerTransformationImpl <em>Model Producer Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ModelProducerTransformationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getModelProducerTransformation()
	 * @generated
	 */
	int MODEL_PRODUCER_TRANSFORMATION = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__PROPERTIES = TRANSFORMATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__URI = TRANSFORMATION__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__TAGS = TRANSFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__DESCRIPTION = TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__REFERENCED_RESOURCES = TRANSFORMATION__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__EXECUTION_INFORMATION = TRANSFORMATION__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__TECHNOLOGY = TRANSFORMATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__IMPLEMENTATION_CLASS = TRANSFORMATION__IMPLEMENTATION_CLASS;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__LIBRARIES = TRANSFORMATION__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Pre Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__PRE_EXECUTION_SCRIPT = TRANSFORMATION__PRE_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Post Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__POST_EXECUTION_SCRIPT = TRANSFORMATION__POST_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Model Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__MODEL_DEPENDENCIES = TRANSFORMATION__MODEL_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>File Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION__FILE_DEPENDENCIES = TRANSFORMATION__FILE_DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>Model Producer Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PRODUCER_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.M2MTransformationImpl <em>M2M Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.M2MTransformationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getM2MTransformation()
	 * @generated
	 */
	int M2M_TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__PROPERTIES = MODEL_PRODUCER_TRANSFORMATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__NAME = MODEL_PRODUCER_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__URI = MODEL_PRODUCER_TRANSFORMATION__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__TAGS = MODEL_PRODUCER_TRANSFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__DESCRIPTION = MODEL_PRODUCER_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__REFERENCED_RESOURCES = MODEL_PRODUCER_TRANSFORMATION__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__EXECUTION_INFORMATION = MODEL_PRODUCER_TRANSFORMATION__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__TECHNOLOGY = MODEL_PRODUCER_TRANSFORMATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__IMPLEMENTATION_CLASS = MODEL_PRODUCER_TRANSFORMATION__IMPLEMENTATION_CLASS;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__LIBRARIES = MODEL_PRODUCER_TRANSFORMATION__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Pre Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__PRE_EXECUTION_SCRIPT = MODEL_PRODUCER_TRANSFORMATION__PRE_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Post Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__POST_EXECUTION_SCRIPT = MODEL_PRODUCER_TRANSFORMATION__POST_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Model Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__MODEL_DEPENDENCIES = MODEL_PRODUCER_TRANSFORMATION__MODEL_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>File Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION__FILE_DEPENDENCIES = MODEL_PRODUCER_TRANSFORMATION__FILE_DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>M2M Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2M_TRANSFORMATION_FEATURE_COUNT = MODEL_PRODUCER_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.MTCTransformationImpl <em>MTC Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.MTCTransformationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getMTCTransformation()
	 * @generated
	 */
	int MTC_TRANSFORMATION = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__PROPERTIES = M2T_TRANSFORMATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__NAME = M2T_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__URI = M2T_TRANSFORMATION__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__TAGS = M2T_TRANSFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__DESCRIPTION = M2T_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__REFERENCED_RESOURCES = M2T_TRANSFORMATION__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__EXECUTION_INFORMATION = M2T_TRANSFORMATION__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__TECHNOLOGY = M2T_TRANSFORMATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__IMPLEMENTATION_CLASS = M2T_TRANSFORMATION__IMPLEMENTATION_CLASS;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__LIBRARIES = M2T_TRANSFORMATION__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Pre Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__PRE_EXECUTION_SCRIPT = M2T_TRANSFORMATION__PRE_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Post Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__POST_EXECUTION_SCRIPT = M2T_TRANSFORMATION__POST_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Model Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__MODEL_DEPENDENCIES = M2T_TRANSFORMATION__MODEL_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>File Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__FILE_DEPENDENCIES = M2T_TRANSFORMATION__FILE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION__TARGET = M2T_TRANSFORMATION__TARGET;

	/**
	 * The number of structural features of the '<em>MTC Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTC_TRANSFORMATION_FEATURE_COUNT = M2T_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.T2MTransformationImpl <em>T2M Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.T2MTransformationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getT2MTransformation()
	 * @generated
	 */
	int T2M_TRANSFORMATION = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__PROPERTIES = MODEL_PRODUCER_TRANSFORMATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__NAME = MODEL_PRODUCER_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__URI = MODEL_PRODUCER_TRANSFORMATION__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__TAGS = MODEL_PRODUCER_TRANSFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__DESCRIPTION = MODEL_PRODUCER_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__REFERENCED_RESOURCES = MODEL_PRODUCER_TRANSFORMATION__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__EXECUTION_INFORMATION = MODEL_PRODUCER_TRANSFORMATION__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__TECHNOLOGY = MODEL_PRODUCER_TRANSFORMATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__IMPLEMENTATION_CLASS = MODEL_PRODUCER_TRANSFORMATION__IMPLEMENTATION_CLASS;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__LIBRARIES = MODEL_PRODUCER_TRANSFORMATION__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Pre Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__PRE_EXECUTION_SCRIPT = MODEL_PRODUCER_TRANSFORMATION__PRE_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Post Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__POST_EXECUTION_SCRIPT = MODEL_PRODUCER_TRANSFORMATION__POST_EXECUTION_SCRIPT;

	/**
	 * The feature id for the '<em><b>Model Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__MODEL_DEPENDENCIES = MODEL_PRODUCER_TRANSFORMATION__MODEL_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>File Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION__FILE_DEPENDENCIES = MODEL_PRODUCER_TRANSFORMATION__FILE_DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>T2M Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2M_TRANSFORMATION_FEATURE_COUNT = MODEL_PRODUCER_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.InputModelImpl <em>Input Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.InputModelImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getInputModel()
	 * @generated
	 */
	int INPUT_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODEL__PROPERTIES = CONFIGURABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODEL__MODEL = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODEL__MODEL_ALIAS = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODEL__TRANSFORMATION = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metamodel Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODEL__METAMODEL_ALIAS = CONFIGURABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODEL__INDEX = CONFIGURABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Input Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODEL_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.OutputModelImpl <em>Output Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.OutputModelImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getOutputModel()
	 * @generated
	 */
	int OUTPUT_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODEL__PROPERTIES = CONFIGURABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Model Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODEL__MODEL_ALIAS = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODEL__MODEL = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODEL__TRANSFORMATION = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metamodel Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODEL__METAMODEL_ALIAS = CONFIGURABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Output Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODEL_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.VariableImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ConfigurationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__TAGS = 2;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LIBRARIES = 3;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SCRIPTS = 4;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ENVIRONMENTS = 5;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.LibraryImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 18;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PROPERTIES = MTC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = MTC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__URI = MTC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TAGS = MTC_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DESCRIPTION = MTC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__REFERENCED_RESOURCES = MTC_RESOURCE__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__EXECUTION_INFORMATION = MTC_RESOURCE__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TECHNOLOGY = MTC_RESOURCE__TECHNOLOGY;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = MTC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.TagImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ScriptImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 20;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__PROPERTIES = MTC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NAME = MTC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__URI = MTC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__TAGS = MTC_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__DESCRIPTION = MTC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Referenced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__REFERENCED_RESOURCES = MTC_RESOURCE__REFERENCED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__EXECUTION_INFORMATION = MTC_RESOURCE__EXECUTION_INFORMATION;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__TECHNOLOGY = MTC_RESOURCE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__IMPLEMENTATION_CLASS = MTC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = MTC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ModelEnvironmentImpl <em>Model Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ModelEnvironmentImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getModelEnvironment()
	 * @generated
	 */
	int MODEL_ENVIRONMENT = 21;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENVIRONMENT__PROPERTIES = CONFIGURABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENVIRONMENT__NAME = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENVIRONMENT__IMPLEMENTATION_CLASS = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENVIRONMENT_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.PropertyImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ModelValidationImpl <em>Model Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ModelValidationImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getModelValidation()
	 * @generated
	 */
	int MODEL_VALIDATION = 24;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALIDATION__PROPERTIES = CONFIGURABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALIDATION__VALIDATION = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALIDATION__MODELS = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stop On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALIDATION__STOP_ON_ERROR = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALIDATION_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.OutputFileImpl <em>Output File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.OutputFileImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getOutputFile()
	 * @generated
	 */
	int OUTPUT_FILE = 25;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__PROPERTIES = CONFIGURABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__TRANSFORMATION = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__FILE = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.InputFileImpl <em>Input File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.InputFileImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getInputFile()
	 * @generated
	 */
	int INPUT_FILE = 26;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__PROPERTIES = CONFIGURABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__FILE = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__TRANSFORMATION = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.DecisionImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expresion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__EXPRESION = 1;

	/**
	 * The feature id for the '<em><b>Choises</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__CHOISES = 2;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__IMPLEMENTATION_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.ChoiseImpl <em>Choise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.ChoiseImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getChoise()
	 * @generated
	 */
	int CHOISE = 28;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOISE__TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOISE__DECISION = 1;

	/**
	 * The feature id for the '<em><b>Choise Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOISE__CHOISE_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Choise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOISE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.mtcflow.model.mtc.impl.DecisionInputModelImpl <em>Decision Input Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mtcflow.model.mtc.impl.DecisionInputModelImpl
	 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getDecisionInputModel()
	 * @generated
	 */
	int DECISION_INPUT_MODEL = 29;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INPUT_MODEL__DECISION = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INPUT_MODEL__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Model Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INPUT_MODEL__MODEL_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Metamodel Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INPUT_MODEL__METAMODEL_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Load For Decision Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INPUT_MODEL__LOAD_FOR_DECISION_EVALUATION = 4;

	/**
	 * The feature id for the '<em><b>Choises</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INPUT_MODEL__CHOISES = 5;

	/**
	 * The number of structural features of the '<em>Decision Input Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INPUT_MODEL_FEATURE_COUNT = 6;

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.MTC <em>MTC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTC</em>'.
	 * @see com.mtcflow.model.mtc.MTC
	 * @generated
	 */
	EClass getMTC();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getName()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getFiles()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getMetamodels <em>Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodels</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getMetamodels()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_Metamodels();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getModels()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getInputModels <em>Input Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Models</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getInputModels()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_InputModels();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getTransformations()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_Transformations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getOutputModels <em>Output Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Models</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getOutputModels()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_OutputModels();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getM2MTechnology <em>M2M Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M2M Technology</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getM2MTechnology()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_M2MTechnology();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getM2TTechnology <em>M2T Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M2T Technology</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getM2TTechnology()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_M2TTechnology();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getHOTechnology <em>HO Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HO Technology</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getHOTechnology()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_HOTechnology();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getM2MTransformationsFolder <em>M2M Transformations Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M2M Transformations Folder</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getM2MTransformationsFolder()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_M2MTransformationsFolder();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getM2TTransformationsFolder <em>M2T Transformations Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M2T Transformations Folder</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getM2TTransformationsFolder()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_M2TTransformationsFolder();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getHOTransformationsFolder <em>HO Transformations Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HO Transformations Folder</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getHOTransformationsFolder()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_HOTransformationsFolder();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getMetamodelsFolder <em>Metamodels Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodels Folder</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getMetamodelsFolder()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_MetamodelsFolder();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getModelsFolder <em>Models Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Models Folder</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getModelsFolder()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_ModelsFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getValidations <em>Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validations</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getValidations()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_Validations();

	/**
	 * Returns the meta object for the containment reference '{@link com.mtcflow.model.mtc.MTC#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configurations</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getConfigurations()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_Configurations();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getValidationsFolder <em>Validations Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validations Folder</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getValidationsFolder()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_ValidationsFolder();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getVersion()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getLibrariesFolder <em>Libraries Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libraries Folder</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getLibrariesFolder()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_LibrariesFolder();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getDescription()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getReferencedResources <em>Referenced Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Resources</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getReferencedResources()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_ReferencedResources();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#isValidateConformance <em>Validate Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate Conformance</em>'.
	 * @see com.mtcflow.model.mtc.MTC#isValidateConformance()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_ValidateConformance();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workspace</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getWorkspace()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_Workspace();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTC#getExecutionInformation <em>Execution Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Information</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getExecutionInformation()
	 * @see #getMTC()
	 * @generated
	 */
	EAttribute getMTC_ExecutionInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getModelValidations <em>Model Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Validations</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getModelValidations()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_ModelValidations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getInputFiles <em>Input Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Files</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getInputFiles()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_InputFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getOutputFiles <em>Output Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Files</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getOutputFiles()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_OutputFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getDecisions()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_Decisions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.MTC#getDecisionInputModels <em>Decision Input Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Input Models</em>'.
	 * @see com.mtcflow.model.mtc.MTC#getDecisionInputModels()
	 * @see #getMTC()
	 * @generated
	 */
	EReference getMTC_DecisionInputModels();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see com.mtcflow.model.mtc.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Metamodel#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see com.mtcflow.model.mtc.Metamodel#getAlias()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Alias();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Metamodel#isAutoregister <em>Autoregister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autoregister</em>'.
	 * @see com.mtcflow.model.mtc.Metamodel#isAutoregister()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Autoregister();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Metamodel#getMetamodelURI <em>Metamodel URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel URI</em>'.
	 * @see com.mtcflow.model.mtc.Metamodel#getMetamodelURI()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_MetamodelURI();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.ReferencedResource <em>Referenced Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Resource</em>'.
	 * @see com.mtcflow.model.mtc.ReferencedResource
	 * @generated
	 */
	EClass getReferencedResource();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.ReferencedResource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.mtcflow.model.mtc.ReferencedResource#getType()
	 * @see #getReferencedResource()
	 * @generated
	 */
	EAttribute getReferencedResource_Type();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see com.mtcflow.model.mtc.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.File#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.mtcflow.model.mtc.File#getType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Type();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.mtcflow.model.mtc.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.Model#getMetamodels <em>Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodels</em>'.
	 * @see com.mtcflow.model.mtc.Model#getMetamodels()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Metamodels();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Model#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see com.mtcflow.model.mtc.Model#getFormat()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Format();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation</em>'.
	 * @see com.mtcflow.model.mtc.Validation
	 * @generated
	 */
	EClass getValidation();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.HOTransformation <em>HO Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HO Transformation</em>'.
	 * @see com.mtcflow.model.mtc.HOTransformation
	 * @generated
	 */
	EClass getHOTransformation();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.HOTransformation#getOutputTransformations <em>Output Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Transformations</em>'.
	 * @see com.mtcflow.model.mtc.HOTransformation#getOutputTransformations()
	 * @see #getHOTransformation()
	 * @generated
	 */
	EReference getHOTransformation_OutputTransformations();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.M2MTransformation <em>M2M Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M2M Transformation</em>'.
	 * @see com.mtcflow.model.mtc.M2MTransformation
	 * @generated
	 */
	EClass getM2MTransformation();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.M2TTransformation <em>M2T Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M2T Transformation</em>'.
	 * @see com.mtcflow.model.mtc.M2TTransformation
	 * @generated
	 */
	EClass getM2TTransformation();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.M2TTransformation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see com.mtcflow.model.mtc.M2TTransformation#getTarget()
	 * @see #getM2TTransformation()
	 * @generated
	 */
	EAttribute getM2TTransformation_Target();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.MTCTransformation <em>MTC Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTC Transformation</em>'.
	 * @see com.mtcflow.model.mtc.MTCTransformation
	 * @generated
	 */
	EClass getMTCTransformation();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.T2MTransformation <em>T2M Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2M Transformation</em>'.
	 * @see com.mtcflow.model.mtc.T2MTransformation
	 * @generated
	 */
	EClass getT2MTransformation();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.InputModel <em>Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Model</em>'.
	 * @see com.mtcflow.model.mtc.InputModel
	 * @generated
	 */
	EClass getInputModel();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.InputModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.mtcflow.model.mtc.InputModel#getModel()
	 * @see #getInputModel()
	 * @generated
	 */
	EReference getInputModel_Model();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.InputModel#getModelAlias <em>Model Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Alias</em>'.
	 * @see com.mtcflow.model.mtc.InputModel#getModelAlias()
	 * @see #getInputModel()
	 * @generated
	 */
	EAttribute getInputModel_ModelAlias();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.InputModel#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see com.mtcflow.model.mtc.InputModel#getTransformation()
	 * @see #getInputModel()
	 * @generated
	 */
	EReference getInputModel_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.InputModel#getMetamodelAlias <em>Metamodel Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Alias</em>'.
	 * @see com.mtcflow.model.mtc.InputModel#getMetamodelAlias()
	 * @see #getInputModel()
	 * @generated
	 */
	EAttribute getInputModel_MetamodelAlias();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.InputModel#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.mtcflow.model.mtc.InputModel#getIndex()
	 * @see #getInputModel()
	 * @generated
	 */
	EAttribute getInputModel_Index();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.OutputModel <em>Output Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Model</em>'.
	 * @see com.mtcflow.model.mtc.OutputModel
	 * @generated
	 */
	EClass getOutputModel();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.OutputModel#getModelAlias <em>Model Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Alias</em>'.
	 * @see com.mtcflow.model.mtc.OutputModel#getModelAlias()
	 * @see #getOutputModel()
	 * @generated
	 */
	EAttribute getOutputModel_ModelAlias();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.OutputModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.mtcflow.model.mtc.OutputModel#getModel()
	 * @see #getOutputModel()
	 * @generated
	 */
	EReference getOutputModel_Model();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.OutputModel#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see com.mtcflow.model.mtc.OutputModel#getTransformation()
	 * @see #getOutputModel()
	 * @generated
	 */
	EReference getOutputModel_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.OutputModel#getMetamodelAlias <em>Metamodel Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Alias</em>'.
	 * @see com.mtcflow.model.mtc.OutputModel#getMetamodelAlias()
	 * @see #getOutputModel()
	 * @generated
	 */
	EAttribute getOutputModel_MetamodelAlias();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see com.mtcflow.model.mtc.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Transformation#getImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Class</em>'.
	 * @see com.mtcflow.model.mtc.Transformation#getImplementationClass()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_ImplementationClass();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.Transformation#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Libraries</em>'.
	 * @see com.mtcflow.model.mtc.Transformation#getLibraries()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Libraries();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.Transformation#getPreExecutionScript <em>Pre Execution Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Execution Script</em>'.
	 * @see com.mtcflow.model.mtc.Transformation#getPreExecutionScript()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_PreExecutionScript();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.Transformation#getPostExecutionScript <em>Post Execution Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Execution Script</em>'.
	 * @see com.mtcflow.model.mtc.Transformation#getPostExecutionScript()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_PostExecutionScript();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.Transformation#getModelDependencies <em>Model Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Dependencies</em>'.
	 * @see com.mtcflow.model.mtc.Transformation#getModelDependencies()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_ModelDependencies();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.Transformation#getFileDependencies <em>File Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>File Dependencies</em>'.
	 * @see com.mtcflow.model.mtc.Transformation#getFileDependencies()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_FileDependencies();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.MTCResource <em>MTC Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTC Resource</em>'.
	 * @see com.mtcflow.model.mtc.MTCResource
	 * @generated
	 */
	EClass getMTCResource();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTCResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mtcflow.model.mtc.MTCResource#getName()
	 * @see #getMTCResource()
	 * @generated
	 */
	EAttribute getMTCResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTCResource#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.mtcflow.model.mtc.MTCResource#getURI()
	 * @see #getMTCResource()
	 * @generated
	 */
	EAttribute getMTCResource_URI();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.MTCResource#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see com.mtcflow.model.mtc.MTCResource#getTags()
	 * @see #getMTCResource()
	 * @generated
	 */
	EReference getMTCResource_Tags();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTCResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.mtcflow.model.mtc.MTCResource#getDescription()
	 * @see #getMTCResource()
	 * @generated
	 */
	EAttribute getMTCResource_Description();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.MTCResource#getReferencedResources <em>Referenced Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Resources</em>'.
	 * @see com.mtcflow.model.mtc.MTCResource#getReferencedResources()
	 * @see #getMTCResource()
	 * @generated
	 */
	EReference getMTCResource_ReferencedResources();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTCResource#getExecutionInformation <em>Execution Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Information</em>'.
	 * @see com.mtcflow.model.mtc.MTCResource#getExecutionInformation()
	 * @see #getMTCResource()
	 * @generated
	 */
	EAttribute getMTCResource_ExecutionInformation();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.MTCResource#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see com.mtcflow.model.mtc.MTCResource#getTechnology()
	 * @see #getMTCResource()
	 * @generated
	 */
	EAttribute getMTCResource_Technology();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see com.mtcflow.model.mtc.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mtcflow.model.mtc.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Variable#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see com.mtcflow.model.mtc.Variable#getDefaultValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Variable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.mtcflow.model.mtc.Variable#getDescription()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.mtcflow.model.mtc.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see com.mtcflow.model.mtc.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mtcflow.model.mtc.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.Configuration#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see com.mtcflow.model.mtc.Configuration#getVariables()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.Configuration#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see com.mtcflow.model.mtc.Configuration#getTags()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.Configuration#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see com.mtcflow.model.mtc.Configuration#getLibraries()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.Configuration#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see com.mtcflow.model.mtc.Configuration#getScripts()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Scripts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.Configuration#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see com.mtcflow.model.mtc.Configuration#getEnvironments()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Environments();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.ModelProducerTransformation <em>Model Producer Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Producer Transformation</em>'.
	 * @see com.mtcflow.model.mtc.ModelProducerTransformation
	 * @generated
	 */
	EClass getModelProducerTransformation();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see com.mtcflow.model.mtc.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see com.mtcflow.model.mtc.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mtcflow.model.mtc.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Tag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.mtcflow.model.mtc.Tag#getDescription()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Description();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see com.mtcflow.model.mtc.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Script#getImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Class</em>'.
	 * @see com.mtcflow.model.mtc.Script#getImplementationClass()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_ImplementationClass();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.ModelEnvironment <em>Model Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Environment</em>'.
	 * @see com.mtcflow.model.mtc.ModelEnvironment
	 * @generated
	 */
	EClass getModelEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.ModelEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mtcflow.model.mtc.ModelEnvironment#getName()
	 * @see #getModelEnvironment()
	 * @generated
	 */
	EAttribute getModelEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.ModelEnvironment#getImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Class</em>'.
	 * @see com.mtcflow.model.mtc.ModelEnvironment#getImplementationClass()
	 * @see #getModelEnvironment()
	 * @generated
	 */
	EAttribute getModelEnvironment_ImplementationClass();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.mtcflow.model.mtc.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mtcflow.model.mtc.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mtcflow.model.mtc.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Configurable <em>Configurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurable</em>'.
	 * @see com.mtcflow.model.mtc.Configurable
	 * @generated
	 */
	EClass getConfigurable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.Configurable#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.mtcflow.model.mtc.Configurable#getProperties()
	 * @see #getConfigurable()
	 * @generated
	 */
	EReference getConfigurable_Properties();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.ModelValidation <em>Model Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Validation</em>'.
	 * @see com.mtcflow.model.mtc.ModelValidation
	 * @generated
	 */
	EClass getModelValidation();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.ModelValidation#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validation</em>'.
	 * @see com.mtcflow.model.mtc.ModelValidation#getValidation()
	 * @see #getModelValidation()
	 * @generated
	 */
	EReference getModelValidation_Validation();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.ModelValidation#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see com.mtcflow.model.mtc.ModelValidation#getModels()
	 * @see #getModelValidation()
	 * @generated
	 */
	EReference getModelValidation_Models();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.ModelValidation#isStopOnError <em>Stop On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop On Error</em>'.
	 * @see com.mtcflow.model.mtc.ModelValidation#isStopOnError()
	 * @see #getModelValidation()
	 * @generated
	 */
	EAttribute getModelValidation_StopOnError();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output File</em>'.
	 * @see com.mtcflow.model.mtc.OutputFile
	 * @generated
	 */
	EClass getOutputFile();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.OutputFile#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see com.mtcflow.model.mtc.OutputFile#getTransformation()
	 * @see #getOutputFile()
	 * @generated
	 */
	EReference getOutputFile_Transformation();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.OutputFile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see com.mtcflow.model.mtc.OutputFile#getFile()
	 * @see #getOutputFile()
	 * @generated
	 */
	EReference getOutputFile_File();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input File</em>'.
	 * @see com.mtcflow.model.mtc.InputFile
	 * @generated
	 */
	EClass getInputFile();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.InputFile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see com.mtcflow.model.mtc.InputFile#getFile()
	 * @see #getInputFile()
	 * @generated
	 */
	EReference getInputFile_File();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.InputFile#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see com.mtcflow.model.mtc.InputFile#getTransformation()
	 * @see #getInputFile()
	 * @generated
	 */
	EReference getInputFile_Transformation();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see com.mtcflow.model.mtc.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Decision#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mtcflow.model.mtc.Decision#getName()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Decision#getExpresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expresion</em>'.
	 * @see com.mtcflow.model.mtc.Decision#getExpresion()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Expresion();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mtcflow.model.mtc.Decision#getChoises <em>Choises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choises</em>'.
	 * @see com.mtcflow.model.mtc.Decision#getChoises()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Choises();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Decision#getImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Class</em>'.
	 * @see com.mtcflow.model.mtc.Decision#getImplementationClass()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_ImplementationClass();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.Choise <em>Choise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choise</em>'.
	 * @see com.mtcflow.model.mtc.Choise
	 * @generated
	 */
	EClass getChoise();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.Choise#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see com.mtcflow.model.mtc.Choise#getTransformation()
	 * @see #getChoise()
	 * @generated
	 */
	EReference getChoise_Transformation();

	/**
	 * Returns the meta object for the container reference '{@link com.mtcflow.model.mtc.Choise#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Decision</em>'.
	 * @see com.mtcflow.model.mtc.Choise#getDecision()
	 * @see #getChoise()
	 * @generated
	 */
	EReference getChoise_Decision();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.Choise#getChoiseValue <em>Choise Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choise Value</em>'.
	 * @see com.mtcflow.model.mtc.Choise#getChoiseValue()
	 * @see #getChoise()
	 * @generated
	 */
	EAttribute getChoise_ChoiseValue();

	/**
	 * Returns the meta object for class '{@link com.mtcflow.model.mtc.DecisionInputModel <em>Decision Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Input Model</em>'.
	 * @see com.mtcflow.model.mtc.DecisionInputModel
	 * @generated
	 */
	EClass getDecisionInputModel();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.DecisionInputModel#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision</em>'.
	 * @see com.mtcflow.model.mtc.DecisionInputModel#getDecision()
	 * @see #getDecisionInputModel()
	 * @generated
	 */
	EReference getDecisionInputModel_Decision();

	/**
	 * Returns the meta object for the reference '{@link com.mtcflow.model.mtc.DecisionInputModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.mtcflow.model.mtc.DecisionInputModel#getModel()
	 * @see #getDecisionInputModel()
	 * @generated
	 */
	EReference getDecisionInputModel_Model();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.DecisionInputModel#getModelAlias <em>Model Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Alias</em>'.
	 * @see com.mtcflow.model.mtc.DecisionInputModel#getModelAlias()
	 * @see #getDecisionInputModel()
	 * @generated
	 */
	EAttribute getDecisionInputModel_ModelAlias();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.DecisionInputModel#getMetamodelAlias <em>Metamodel Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Alias</em>'.
	 * @see com.mtcflow.model.mtc.DecisionInputModel#getMetamodelAlias()
	 * @see #getDecisionInputModel()
	 * @generated
	 */
	EAttribute getDecisionInputModel_MetamodelAlias();

	/**
	 * Returns the meta object for the attribute '{@link com.mtcflow.model.mtc.DecisionInputModel#isLoadForDecisionEvaluation <em>Load For Decision Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load For Decision Evaluation</em>'.
	 * @see com.mtcflow.model.mtc.DecisionInputModel#isLoadForDecisionEvaluation()
	 * @see #getDecisionInputModel()
	 * @generated
	 */
	EAttribute getDecisionInputModel_LoadForDecisionEvaluation();

	/**
	 * Returns the meta object for the reference list '{@link com.mtcflow.model.mtc.DecisionInputModel#getChoises <em>Choises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Choises</em>'.
	 * @see com.mtcflow.model.mtc.DecisionInputModel#getChoises()
	 * @see #getDecisionInputModel()
	 * @generated
	 */
	EReference getDecisionInputModel_Choises();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MtcFactory getMtcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.MTCImpl <em>MTC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.MTCImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getMTC()
		 * @generated
		 */
		EClass MTC = eINSTANCE.getMTC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__NAME = eINSTANCE.getMTC_Name();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__FILES = eINSTANCE.getMTC_Files();

		/**
		 * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__METAMODELS = eINSTANCE.getMTC_Metamodels();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__MODELS = eINSTANCE.getMTC_Models();

		/**
		 * The meta object literal for the '<em><b>Input Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__INPUT_MODELS = eINSTANCE.getMTC_InputModels();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__TRANSFORMATIONS = eINSTANCE.getMTC_Transformations();

		/**
		 * The meta object literal for the '<em><b>Output Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__OUTPUT_MODELS = eINSTANCE.getMTC_OutputModels();

		/**
		 * The meta object literal for the '<em><b>M2M Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__M2M_TECHNOLOGY = eINSTANCE.getMTC_M2MTechnology();

		/**
		 * The meta object literal for the '<em><b>M2T Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__M2T_TECHNOLOGY = eINSTANCE.getMTC_M2TTechnology();

		/**
		 * The meta object literal for the '<em><b>HO Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__HO_TECHNOLOGY = eINSTANCE.getMTC_HOTechnology();

		/**
		 * The meta object literal for the '<em><b>M2M Transformations Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__M2M_TRANSFORMATIONS_FOLDER = eINSTANCE.getMTC_M2MTransformationsFolder();

		/**
		 * The meta object literal for the '<em><b>M2T Transformations Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__M2T_TRANSFORMATIONS_FOLDER = eINSTANCE.getMTC_M2TTransformationsFolder();

		/**
		 * The meta object literal for the '<em><b>HO Transformations Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__HO_TRANSFORMATIONS_FOLDER = eINSTANCE.getMTC_HOTransformationsFolder();

		/**
		 * The meta object literal for the '<em><b>Metamodels Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__METAMODELS_FOLDER = eINSTANCE.getMTC_MetamodelsFolder();

		/**
		 * The meta object literal for the '<em><b>Models Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__MODELS_FOLDER = eINSTANCE.getMTC_ModelsFolder();

		/**
		 * The meta object literal for the '<em><b>Validations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__VALIDATIONS = eINSTANCE.getMTC_Validations();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__CONFIGURATIONS = eINSTANCE.getMTC_Configurations();

		/**
		 * The meta object literal for the '<em><b>Validations Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__VALIDATIONS_FOLDER = eINSTANCE.getMTC_ValidationsFolder();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__VERSION = eINSTANCE.getMTC_Version();

		/**
		 * The meta object literal for the '<em><b>Libraries Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__LIBRARIES_FOLDER = eINSTANCE.getMTC_LibrariesFolder();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__DESCRIPTION = eINSTANCE.getMTC_Description();

		/**
		 * The meta object literal for the '<em><b>Referenced Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__REFERENCED_RESOURCES = eINSTANCE.getMTC_ReferencedResources();

		/**
		 * The meta object literal for the '<em><b>Validate Conformance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__VALIDATE_CONFORMANCE = eINSTANCE.getMTC_ValidateConformance();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__WORKSPACE = eINSTANCE.getMTC_Workspace();

		/**
		 * The meta object literal for the '<em><b>Execution Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC__EXECUTION_INFORMATION = eINSTANCE.getMTC_ExecutionInformation();

		/**
		 * The meta object literal for the '<em><b>Model Validations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__MODEL_VALIDATIONS = eINSTANCE.getMTC_ModelValidations();

		/**
		 * The meta object literal for the '<em><b>Input Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__INPUT_FILES = eINSTANCE.getMTC_InputFiles();

		/**
		 * The meta object literal for the '<em><b>Output Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__OUTPUT_FILES = eINSTANCE.getMTC_OutputFiles();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__DECISIONS = eINSTANCE.getMTC_Decisions();

		/**
		 * The meta object literal for the '<em><b>Decision Input Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC__DECISION_INPUT_MODELS = eINSTANCE.getMTC_DecisionInputModels();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.MetamodelImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__ALIAS = eINSTANCE.getMetamodel_Alias();

		/**
		 * The meta object literal for the '<em><b>Autoregister</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__AUTOREGISTER = eINSTANCE.getMetamodel_Autoregister();

		/**
		 * The meta object literal for the '<em><b>Metamodel URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__METAMODEL_URI = eINSTANCE.getMetamodel_MetamodelURI();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ReferencedResourceImpl <em>Referenced Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ReferencedResourceImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getReferencedResource()
		 * @generated
		 */
		EClass REFERENCED_RESOURCE = eINSTANCE.getReferencedResource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCED_RESOURCE__TYPE = eINSTANCE.getReferencedResource_Type();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.FileImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__TYPE = eINSTANCE.getFile_Type();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ModelImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Metamodels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__METAMODELS = eINSTANCE.getModel_Metamodels();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__FORMAT = eINSTANCE.getModel_Format();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ValidationImpl <em>Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ValidationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getValidation()
		 * @generated
		 */
		EClass VALIDATION = eINSTANCE.getValidation();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.HOTransformationImpl <em>HO Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.HOTransformationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getHOTransformation()
		 * @generated
		 */
		EClass HO_TRANSFORMATION = eINSTANCE.getHOTransformation();

		/**
		 * The meta object literal for the '<em><b>Output Transformations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HO_TRANSFORMATION__OUTPUT_TRANSFORMATIONS = eINSTANCE.getHOTransformation_OutputTransformations();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.M2MTransformationImpl <em>M2M Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.M2MTransformationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getM2MTransformation()
		 * @generated
		 */
		EClass M2M_TRANSFORMATION = eINSTANCE.getM2MTransformation();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.M2TTransformationImpl <em>M2T Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.M2TTransformationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getM2TTransformation()
		 * @generated
		 */
		EClass M2T_TRANSFORMATION = eINSTANCE.getM2TTransformation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute M2T_TRANSFORMATION__TARGET = eINSTANCE.getM2TTransformation_Target();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.MTCTransformationImpl <em>MTC Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.MTCTransformationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getMTCTransformation()
		 * @generated
		 */
		EClass MTC_TRANSFORMATION = eINSTANCE.getMTCTransformation();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.T2MTransformationImpl <em>T2M Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.T2MTransformationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getT2MTransformation()
		 * @generated
		 */
		EClass T2M_TRANSFORMATION = eINSTANCE.getT2MTransformation();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.InputModelImpl <em>Input Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.InputModelImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getInputModel()
		 * @generated
		 */
		EClass INPUT_MODEL = eINSTANCE.getInputModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_MODEL__MODEL = eINSTANCE.getInputModel_Model();

		/**
		 * The meta object literal for the '<em><b>Model Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MODEL__MODEL_ALIAS = eINSTANCE.getInputModel_ModelAlias();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_MODEL__TRANSFORMATION = eINSTANCE.getInputModel_Transformation();

		/**
		 * The meta object literal for the '<em><b>Metamodel Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MODEL__METAMODEL_ALIAS = eINSTANCE.getInputModel_MetamodelAlias();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MODEL__INDEX = eINSTANCE.getInputModel_Index();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.OutputModelImpl <em>Output Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.OutputModelImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getOutputModel()
		 * @generated
		 */
		EClass OUTPUT_MODEL = eINSTANCE.getOutputModel();

		/**
		 * The meta object literal for the '<em><b>Model Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_MODEL__MODEL_ALIAS = eINSTANCE.getOutputModel_ModelAlias();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_MODEL__MODEL = eINSTANCE.getOutputModel_Model();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_MODEL__TRANSFORMATION = eINSTANCE.getOutputModel_Transformation();

		/**
		 * The meta object literal for the '<em><b>Metamodel Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_MODEL__METAMODEL_ALIAS = eINSTANCE.getOutputModel_MetamodelAlias();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.TransformationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Implementation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__IMPLEMENTATION_CLASS = eINSTANCE.getTransformation_ImplementationClass();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__LIBRARIES = eINSTANCE.getTransformation_Libraries();

		/**
		 * The meta object literal for the '<em><b>Pre Execution Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__PRE_EXECUTION_SCRIPT = eINSTANCE.getTransformation_PreExecutionScript();

		/**
		 * The meta object literal for the '<em><b>Post Execution Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__POST_EXECUTION_SCRIPT = eINSTANCE.getTransformation_PostExecutionScript();

		/**
		 * The meta object literal for the '<em><b>Model Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__MODEL_DEPENDENCIES = eINSTANCE.getTransformation_ModelDependencies();

		/**
		 * The meta object literal for the '<em><b>File Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__FILE_DEPENDENCIES = eINSTANCE.getTransformation_FileDependencies();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.MTCResourceImpl <em>MTC Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.MTCResourceImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getMTCResource()
		 * @generated
		 */
		EClass MTC_RESOURCE = eINSTANCE.getMTCResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC_RESOURCE__NAME = eINSTANCE.getMTCResource_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC_RESOURCE__URI = eINSTANCE.getMTCResource_URI();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC_RESOURCE__TAGS = eINSTANCE.getMTCResource_Tags();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC_RESOURCE__DESCRIPTION = eINSTANCE.getMTCResource_Description();

		/**
		 * The meta object literal for the '<em><b>Referenced Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTC_RESOURCE__REFERENCED_RESOURCES = eINSTANCE.getMTCResource_ReferencedResources();

		/**
		 * The meta object literal for the '<em><b>Execution Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC_RESOURCE__EXECUTION_INFORMATION = eINSTANCE.getMTCResource_ExecutionInformation();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTC_RESOURCE__TECHNOLOGY = eINSTANCE.getMTCResource_Technology();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.VariableImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DEFAULT_VALUE = eINSTANCE.getVariable_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DESCRIPTION = eINSTANCE.getVariable_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ConfigurationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__VARIABLES = eINSTANCE.getConfiguration_Variables();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__TAGS = eINSTANCE.getConfiguration_Tags();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__LIBRARIES = eINSTANCE.getConfiguration_Libraries();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__SCRIPTS = eINSTANCE.getConfiguration_Scripts();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ENVIRONMENTS = eINSTANCE.getConfiguration_Environments();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ModelProducerTransformationImpl <em>Model Producer Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ModelProducerTransformationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getModelProducerTransformation()
		 * @generated
		 */
		EClass MODEL_PRODUCER_TRANSFORMATION = eINSTANCE.getModelProducerTransformation();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.LibraryImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.TagImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__DESCRIPTION = eINSTANCE.getTag_Description();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ScriptImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Implementation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__IMPLEMENTATION_CLASS = eINSTANCE.getScript_ImplementationClass();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ModelEnvironmentImpl <em>Model Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ModelEnvironmentImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getModelEnvironment()
		 * @generated
		 */
		EClass MODEL_ENVIRONMENT = eINSTANCE.getModelEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ENVIRONMENT__NAME = eINSTANCE.getModelEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Implementation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ENVIRONMENT__IMPLEMENTATION_CLASS = eINSTANCE.getModelEnvironment_ImplementationClass();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.PropertyImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ConfigurableImpl <em>Configurable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ConfigurableImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getConfigurable()
		 * @generated
		 */
		EClass CONFIGURABLE = eINSTANCE.getConfigurable();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE__PROPERTIES = eINSTANCE.getConfigurable_Properties();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ModelValidationImpl <em>Model Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ModelValidationImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getModelValidation()
		 * @generated
		 */
		EClass MODEL_VALIDATION = eINSTANCE.getModelValidation();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_VALIDATION__VALIDATION = eINSTANCE.getModelValidation_Validation();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_VALIDATION__MODELS = eINSTANCE.getModelValidation_Models();

		/**
		 * The meta object literal for the '<em><b>Stop On Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_VALIDATION__STOP_ON_ERROR = eINSTANCE.getModelValidation_StopOnError();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.OutputFileImpl <em>Output File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.OutputFileImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getOutputFile()
		 * @generated
		 */
		EClass OUTPUT_FILE = eINSTANCE.getOutputFile();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_FILE__TRANSFORMATION = eINSTANCE.getOutputFile_Transformation();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_FILE__FILE = eINSTANCE.getOutputFile_File();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.InputFileImpl <em>Input File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.InputFileImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getInputFile()
		 * @generated
		 */
		EClass INPUT_FILE = eINSTANCE.getInputFile();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_FILE__FILE = eINSTANCE.getInputFile_File();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_FILE__TRANSFORMATION = eINSTANCE.getInputFile_Transformation();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.DecisionImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__NAME = eINSTANCE.getDecision_Name();

		/**
		 * The meta object literal for the '<em><b>Expresion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__EXPRESION = eINSTANCE.getDecision_Expresion();

		/**
		 * The meta object literal for the '<em><b>Choises</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__CHOISES = eINSTANCE.getDecision_Choises();

		/**
		 * The meta object literal for the '<em><b>Implementation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__IMPLEMENTATION_CLASS = eINSTANCE.getDecision_ImplementationClass();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.ChoiseImpl <em>Choise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.ChoiseImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getChoise()
		 * @generated
		 */
		EClass CHOISE = eINSTANCE.getChoise();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOISE__TRANSFORMATION = eINSTANCE.getChoise_Transformation();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOISE__DECISION = eINSTANCE.getChoise_Decision();

		/**
		 * The meta object literal for the '<em><b>Choise Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOISE__CHOISE_VALUE = eINSTANCE.getChoise_ChoiseValue();

		/**
		 * The meta object literal for the '{@link com.mtcflow.model.mtc.impl.DecisionInputModelImpl <em>Decision Input Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mtcflow.model.mtc.impl.DecisionInputModelImpl
		 * @see com.mtcflow.model.mtc.impl.MtcPackageImpl#getDecisionInputModel()
		 * @generated
		 */
		EClass DECISION_INPUT_MODEL = eINSTANCE.getDecisionInputModel();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_INPUT_MODEL__DECISION = eINSTANCE.getDecisionInputModel_Decision();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_INPUT_MODEL__MODEL = eINSTANCE.getDecisionInputModel_Model();

		/**
		 * The meta object literal for the '<em><b>Model Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_INPUT_MODEL__MODEL_ALIAS = eINSTANCE.getDecisionInputModel_ModelAlias();

		/**
		 * The meta object literal for the '<em><b>Metamodel Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_INPUT_MODEL__METAMODEL_ALIAS = eINSTANCE.getDecisionInputModel_MetamodelAlias();

		/**
		 * The meta object literal for the '<em><b>Load For Decision Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_INPUT_MODEL__LOAD_FOR_DECISION_EVALUATION = eINSTANCE.getDecisionInputModel_LoadForDecisionEvaluation();

		/**
		 * The meta object literal for the '<em><b>Choises</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_INPUT_MODEL__CHOISES = eINSTANCE.getDecisionInputModel_Choises();

	}

} //MtcPackage
