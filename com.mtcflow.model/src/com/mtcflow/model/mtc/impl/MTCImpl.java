/**
 */
package com.mtcflow.model.mtc.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.mtcflow.model.mtc.Configuration;
import com.mtcflow.model.mtc.Decision;
import com.mtcflow.model.mtc.DecisionInputModel;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.InputFile;
import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.T2MTransformation;
import com.mtcflow.model.mtc.Transformation;
import com.mtcflow.model.mtc.Validation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>MTC</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getName <em>Name</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getFiles <em>Files</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getMetamodels <em>Metamodels
 * </em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getModels <em>Models</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getInputModels <em>Input Models
 * </em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getTransformations <em>
 * Transformations</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getOutputModels <em>Output
 * Models</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getM2MTechnology <em>M2M
 * Technology</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getM2TTechnology <em>M2T
 * Technology</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getHOTechnology <em>HO
 * Technology</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getM2MTransformationsFolder
 * <em>M2M Transformations Folder</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getM2TTransformationsFolder
 * <em>M2T Transformations Folder</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getHOTransformationsFolder <em>
 * HO Transformations Folder</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getMetamodelsFolder <em>
 * Metamodels Folder</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getModelsFolder <em>Models
 * Folder</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getValidations <em>Validations
 * </em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getConfigurations <em>
 * Configurations</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getValidationsFolder <em>
 * Validations Folder</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getVersion <em>Version</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getLibrariesFolder <em>
 * Libraries Folder</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getDescription <em>Description
 * </em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getReferencedResources <em>
 * Referenced Resources</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#isValidateConformance <em>
 * Validate Conformance</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getWorkspace <em>Workspace
 * </em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getExecutionInformation <em>
 * Execution Information</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getModelValidations <em>Model
 * Validations</em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getInputFiles <em>Input Files
 * </em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getOutputFiles <em>Output Files
 * </em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getDecisions <em>Decisions
 * </em>}</li>
 * <li>{@link com.mtcflow.model.mtc.impl.MTCImpl#getDecisionInputModels <em>
 * Decision Input Models</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MTCImpl extends EObjectImpl implements MTC {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MTC";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getMetamodels() <em>Metamodels</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> metamodels;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The cached value of the '{@link #getInputModels() <em>Input Models</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInputModels()
	 * @generated
	 * @ordered
	 */
	protected EList<InputModel> inputModels;

	/**
	 * The cached value of the '{@link #getTransformations()
	 * <em>Transformations</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

	/**
	 * The cached value of the '{@link #getOutputModels()
	 * <em>Output Models</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getOutputModels()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputModel> outputModels;

	/**
	 * The default value of the '{@link #getM2MTechnology()
	 * <em>M2M Technology</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getM2MTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String M2M_TECHNOLOGY_EDEFAULT = "ATL";

	/**
	 * The cached value of the '{@link #getM2MTechnology()
	 * <em>M2M Technology</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getM2MTechnology()
	 * @generated
	 * @ordered
	 */
	protected String m2MTechnology = M2M_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getM2TTechnology()
	 * <em>M2T Technology</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getM2TTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String M2T_TECHNOLOGY_EDEFAULT = "ACCELEO";

	/**
	 * The cached value of the '{@link #getM2TTechnology()
	 * <em>M2T Technology</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getM2TTechnology()
	 * @generated
	 * @ordered
	 */
	protected String m2TTechnology = M2T_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHOTechnology()
	 * <em>HO Technology</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getHOTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String HO_TECHNOLOGY_EDEFAULT = "ATL";

	/**
	 * The cached value of the '{@link #getHOTechnology()
	 * <em>HO Technology</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getHOTechnology()
	 * @generated
	 * @ordered
	 */
	protected String hoTechnology = HO_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getM2MTransformationsFolder()
	 * <em>M2M Transformations Folder</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getM2MTransformationsFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String M2M_TRANSFORMATIONS_FOLDER_EDEFAULT = "/transformations/M2M/";

	/**
	 * The cached value of the '{@link #getM2MTransformationsFolder()
	 * <em>M2M Transformations Folder</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getM2MTransformationsFolder()
	 * @generated
	 * @ordered
	 */
	protected String m2MTransformationsFolder = M2M_TRANSFORMATIONS_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getM2TTransformationsFolder()
	 * <em>M2T Transformations Folder</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getM2TTransformationsFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String M2T_TRANSFORMATIONS_FOLDER_EDEFAULT = "/transformations/M2T/";

	/**
	 * The cached value of the '{@link #getM2TTransformationsFolder()
	 * <em>M2T Transformations Folder</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getM2TTransformationsFolder()
	 * @generated
	 * @ordered
	 */
	protected String m2TTransformationsFolder = M2T_TRANSFORMATIONS_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHOTransformationsFolder()
	 * <em>HO Transformations Folder</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHOTransformationsFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String HO_TRANSFORMATIONS_FOLDER_EDEFAULT = "/transformations/HOT/";

	/**
	 * The cached value of the '{@link #getHOTransformationsFolder()
	 * <em>HO Transformations Folder</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHOTransformationsFolder()
	 * @generated
	 * @ordered
	 */
	protected String hoTransformationsFolder = HO_TRANSFORMATIONS_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelsFolder()
	 * <em>Metamodels Folder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMetamodelsFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODELS_FOLDER_EDEFAULT = "/metamodels/";

	/**
	 * The cached value of the '{@link #getMetamodelsFolder()
	 * <em>Metamodels Folder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMetamodelsFolder()
	 * @generated
	 * @ordered
	 */
	protected String metamodelsFolder = METAMODELS_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelsFolder()
	 * <em>Models Folder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getModelsFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELS_FOLDER_EDEFAULT = "/models/";

	/**
	 * The cached value of the '{@link #getModelsFolder()
	 * <em>Models Folder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getModelsFolder()
	 * @generated
	 * @ordered
	 */
	protected String modelsFolder = MODELS_FOLDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidations() <em>Validations</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValidations()
	 * @generated
	 * @ordered
	 */
	protected EList<Validation> validations;

	/**
	 * The cached value of the '{@link #getConfigurations()
	 * <em>Configurations</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected Configuration configurations;

	/**
	 * The default value of the '{@link #getValidationsFolder()
	 * <em>Validations Folder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getValidationsFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATIONS_FOLDER_EDEFAULT = "/validations/";

	/**
	 * The cached value of the '{@link #getValidationsFolder()
	 * <em>Validations Folder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getValidationsFolder()
	 * @generated
	 * @ordered
	 */
	protected String validationsFolder = VALIDATIONS_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibrariesFolder()
	 * <em>Libraries Folder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLibrariesFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARIES_FOLDER_EDEFAULT = "/libraries/";

	/**
	 * The cached value of the '{@link #getLibrariesFolder()
	 * <em>Libraries Folder</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLibrariesFolder()
	 * @generated
	 * @ordered
	 */
	protected String librariesFolder = LIBRARIES_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedResources()
	 * <em>Referenced Resources</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferencedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferencedResource> referencedResources;

	/**
	 * The default value of the '{@link #isValidateConformance()
	 * <em>Validate Conformance</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isValidateConformance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATE_CONFORMANCE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isValidateConformance()
	 * <em>Validate Conformance</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isValidateConformance()
	 * @generated
	 * @ordered
	 */
	protected boolean validateConformance = VALIDATE_CONFORMANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkspace() <em>Workspace</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWorkspace()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKSPACE_EDEFAULT = "/workspace/";

	/**
	 * The cached value of the '{@link #getWorkspace() <em>Workspace</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWorkspace()
	 * @generated
	 * @ordered
	 */
	protected String workspace = WORKSPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutionInformation()
	 * <em>Execution Information</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExecutionInformation()
	 * @generated
	 * @ordered
	 */
	protected Map<Object, Object> executionInformation;

	/**
	 * The cached value of the '{@link #getModelValidations()
	 * <em>Model Validations</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModelValidations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelValidation> modelValidations;

	/**
	 * The cached value of the '{@link #getInputFiles() <em>Input Files</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInputFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<InputFile> inputFiles;

	/**
	 * The cached value of the '{@link #getOutputFiles() <em>Output Files</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutputFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputFile> outputFiles;

	/**
	 * The cached value of the '{@link #getDecisions() <em>Decisions</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDecisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decision> decisions;

	/**
	 * The cached value of the '{@link #getDecisionInputModels()
	 * <em>Decision Input Models</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDecisionInputModels()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionInputModel> decisionInputModels;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MTCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.MTC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, MtcPackage.MTC__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Metamodel> getMetamodels() {
		if (metamodels == null) {
			metamodels = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, MtcPackage.MTC__METAMODELS);
		}
		return metamodels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<Model>(Model.class, this, MtcPackage.MTC__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<InputModel> getInputModels() {
		if (inputModels == null) {
			inputModels = new EObjectContainmentEList<InputModel>(InputModel.class, this, MtcPackage.MTC__INPUT_MODELS);
		}
		return inputModels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<Transformation>(Transformation.class, this, MtcPackage.MTC__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OutputModel> getOutputModels() {
		if (outputModels == null) {
			outputModels = new EObjectContainmentEList<OutputModel>(OutputModel.class, this, MtcPackage.MTC__OUTPUT_MODELS);
		}
		return outputModels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getM2MTechnology() {
		return m2MTechnology;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setM2MTechnology(String newM2MTechnology) {
		String oldM2MTechnology = m2MTechnology;
		m2MTechnology = newM2MTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__M2M_TECHNOLOGY, oldM2MTechnology, m2MTechnology));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getM2TTechnology() {
		return m2TTechnology;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setM2TTechnology(String newM2TTechnology) {
		String oldM2TTechnology = m2TTechnology;
		m2TTechnology = newM2TTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__M2T_TECHNOLOGY, oldM2TTechnology, m2TTechnology));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getHOTechnology() {
		return hoTechnology;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHOTechnology(String newHOTechnology) {
		String oldHOTechnology = hoTechnology;
		hoTechnology = newHOTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__HO_TECHNOLOGY, oldHOTechnology, hoTechnology));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getM2MTransformationsFolder() {
		return m2MTransformationsFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setM2MTransformationsFolder(String newM2MTransformationsFolder) {
		String oldM2MTransformationsFolder = m2MTransformationsFolder;
		m2MTransformationsFolder = newM2MTransformationsFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__M2M_TRANSFORMATIONS_FOLDER, oldM2MTransformationsFolder, m2MTransformationsFolder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getM2TTransformationsFolder() {
		return m2TTransformationsFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setM2TTransformationsFolder(String newM2TTransformationsFolder) {
		String oldM2TTransformationsFolder = m2TTransformationsFolder;
		m2TTransformationsFolder = newM2TTransformationsFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__M2T_TRANSFORMATIONS_FOLDER, oldM2TTransformationsFolder, m2TTransformationsFolder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getHOTransformationsFolder() {
		return hoTransformationsFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHOTransformationsFolder(String newHOTransformationsFolder) {
		String oldHOTransformationsFolder = hoTransformationsFolder;
		hoTransformationsFolder = newHOTransformationsFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__HO_TRANSFORMATIONS_FOLDER, oldHOTransformationsFolder, hoTransformationsFolder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMetamodelsFolder() {
		return metamodelsFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMetamodelsFolder(String newMetamodelsFolder) {
		String oldMetamodelsFolder = metamodelsFolder;
		metamodelsFolder = newMetamodelsFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__METAMODELS_FOLDER, oldMetamodelsFolder, metamodelsFolder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getModelsFolder() {
		return modelsFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setModelsFolder(String newModelsFolder) {
		String oldModelsFolder = modelsFolder;
		modelsFolder = newModelsFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__MODELS_FOLDER, oldModelsFolder, modelsFolder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Validation> getValidations() {
		if (validations == null) {
			validations = new EObjectContainmentEList<Validation>(Validation.class, this, MtcPackage.MTC__VALIDATIONS);
		}
		return validations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Configuration getConfigurations() {
		return configurations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetConfigurations(Configuration newConfigurations, NotificationChain msgs) {
		Configuration oldConfigurations = configurations;
		configurations = newConfigurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__CONFIGURATIONS, oldConfigurations, newConfigurations);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConfigurations(Configuration newConfigurations) {
		if (newConfigurations != configurations) {
			NotificationChain msgs = null;
			if (configurations != null)
				msgs = ((InternalEObject) configurations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MtcPackage.MTC__CONFIGURATIONS, null, msgs);
			if (newConfigurations != null)
				msgs = ((InternalEObject) newConfigurations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MtcPackage.MTC__CONFIGURATIONS, null, msgs);
			msgs = basicSetConfigurations(newConfigurations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__CONFIGURATIONS, newConfigurations, newConfigurations));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getValidationsFolder() {
		return validationsFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValidationsFolder(String newValidationsFolder) {
		String oldValidationsFolder = validationsFolder;
		validationsFolder = newValidationsFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__VALIDATIONS_FOLDER, oldValidationsFolder, validationsFolder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLibrariesFolder() {
		return librariesFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLibrariesFolder(String newLibrariesFolder) {
		String oldLibrariesFolder = librariesFolder;
		librariesFolder = newLibrariesFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__LIBRARIES_FOLDER, oldLibrariesFolder, librariesFolder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ReferencedResource> getReferencedResources() {
		if (referencedResources == null) {
			referencedResources = new EObjectContainmentEList<ReferencedResource>(ReferencedResource.class, this, MtcPackage.MTC__REFERENCED_RESOURCES);
		}
		return referencedResources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isValidateConformance() {
		return validateConformance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValidateConformance(boolean newValidateConformance) {
		boolean oldValidateConformance = validateConformance;
		validateConformance = newValidateConformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__VALIDATE_CONFORMANCE, oldValidateConformance, validateConformance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getWorkspace() {
		return workspace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWorkspace(String newWorkspace) {
		String oldWorkspace = workspace;
		workspace = newWorkspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__WORKSPACE, oldWorkspace, workspace));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map<Object, Object> getExecutionInformation() {
		return executionInformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExecutionInformation(Map<Object, Object> newExecutionInformation) {
		Map<Object, Object> oldExecutionInformation = executionInformation;
		executionInformation = newExecutionInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC__EXECUTION_INFORMATION, oldExecutionInformation, executionInformation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ModelValidation> getModelValidations() {
		if (modelValidations == null) {
			modelValidations = new EObjectContainmentEList<ModelValidation>(ModelValidation.class, this, MtcPackage.MTC__MODEL_VALIDATIONS);
		}
		return modelValidations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<InputFile> getInputFiles() {
		if (inputFiles == null) {
			inputFiles = new EObjectContainmentEList<InputFile>(InputFile.class, this, MtcPackage.MTC__INPUT_FILES);
		}
		return inputFiles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OutputFile> getOutputFiles() {
		if (outputFiles == null) {
			outputFiles = new EObjectContainmentEList<OutputFile>(OutputFile.class, this, MtcPackage.MTC__OUTPUT_FILES);
		}
		return outputFiles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Decision> getDecisions() {
		if (decisions == null) {
			decisions = new EObjectContainmentEList<Decision>(Decision.class, this, MtcPackage.MTC__DECISIONS);
		}
		return decisions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DecisionInputModel> getDecisionInputModels() {
		if (decisionInputModels == null) {
			decisionInputModels = new EObjectContainmentEList<DecisionInputModel>(DecisionInputModel.class, this, MtcPackage.MTC__DECISION_INPUT_MODELS);
		}
		return decisionInputModels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<InputFile> getInputFiles(Transformation transformation) {
		EList<InputFile> resp = new BasicEList<InputFile>();
		if (inputFiles != null) {
			for (InputFile inFile : inputFiles) {
				if (inFile.getTransformation().equals(transformation)) {
					resp.add(inFile);
				}
			}
		}
		return resp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<OutputFile> getOutputFiles(Transformation transformation) {
		EList<OutputFile> resp = new BasicEList<OutputFile>();
		if (outputFiles != null) {
			for (OutputFile outFile : outputFiles) {
				if (outFile.getTransformation().equals(transformation)) {
					resp.add(outFile);
				}
			}
		}
		return resp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<File> getFiles(T2MTransformation transformation) {
		final EList<File> resp = new BasicEList<File>();
		if (inputFiles != null) { 
			for (InputFile inFile : inputFiles) {
				if (inFile.getTransformation().equals(transformation)) {
					resp.add(inFile.getFile());
				}
			}
		}
		return resp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<ModelValidation> getValidations(Model model) {
		EList<ModelValidation> validations = new BasicEList<ModelValidation>();
		for (ModelValidation modelValidation : getModelValidations()) {
			if (modelValidation.getModels().contains(model)) {
				validations.add(modelValidation);
			}
		}
		return validations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transformation getTransformationByName(String transformationName) {
		try {
			for (Transformation transformation : getTransformations()) {
				if (transformation.getName().equals(transformationName)) {
					return transformation;
				}
			}
		} catch (Exception ex) {

		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MtcPackage.MTC__FILES:
			return ((InternalEList<?>) getFiles()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__METAMODELS:
			return ((InternalEList<?>) getMetamodels()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__MODELS:
			return ((InternalEList<?>) getModels()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__INPUT_MODELS:
			return ((InternalEList<?>) getInputModels()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__TRANSFORMATIONS:
			return ((InternalEList<?>) getTransformations()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__OUTPUT_MODELS:
			return ((InternalEList<?>) getOutputModels()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__VALIDATIONS:
			return ((InternalEList<?>) getValidations()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__CONFIGURATIONS:
			return basicSetConfigurations(null, msgs);
		case MtcPackage.MTC__REFERENCED_RESOURCES:
			return ((InternalEList<?>) getReferencedResources()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__MODEL_VALIDATIONS:
			return ((InternalEList<?>) getModelValidations()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__INPUT_FILES:
			return ((InternalEList<?>) getInputFiles()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__OUTPUT_FILES:
			return ((InternalEList<?>) getOutputFiles()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__DECISIONS:
			return ((InternalEList<?>) getDecisions()).basicRemove(otherEnd, msgs);
		case MtcPackage.MTC__DECISION_INPUT_MODELS:
			return ((InternalEList<?>) getDecisionInputModels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MtcPackage.MTC__NAME:
			return getName();
		case MtcPackage.MTC__FILES:
			return getFiles();
		case MtcPackage.MTC__METAMODELS:
			return getMetamodels();
		case MtcPackage.MTC__MODELS:
			return getModels();
		case MtcPackage.MTC__INPUT_MODELS:
			return getInputModels();
		case MtcPackage.MTC__TRANSFORMATIONS:
			return getTransformations();
		case MtcPackage.MTC__OUTPUT_MODELS:
			return getOutputModels();
		case MtcPackage.MTC__M2M_TECHNOLOGY:
			return getM2MTechnology();
		case MtcPackage.MTC__M2T_TECHNOLOGY:
			return getM2TTechnology();
		case MtcPackage.MTC__HO_TECHNOLOGY:
			return getHOTechnology();
		case MtcPackage.MTC__M2M_TRANSFORMATIONS_FOLDER:
			return getM2MTransformationsFolder();
		case MtcPackage.MTC__M2T_TRANSFORMATIONS_FOLDER:
			return getM2TTransformationsFolder();
		case MtcPackage.MTC__HO_TRANSFORMATIONS_FOLDER:
			return getHOTransformationsFolder();
		case MtcPackage.MTC__METAMODELS_FOLDER:
			return getMetamodelsFolder();
		case MtcPackage.MTC__MODELS_FOLDER:
			return getModelsFolder();
		case MtcPackage.MTC__VALIDATIONS:
			return getValidations();
		case MtcPackage.MTC__CONFIGURATIONS:
			return getConfigurations();
		case MtcPackage.MTC__VALIDATIONS_FOLDER:
			return getValidationsFolder();
		case MtcPackage.MTC__VERSION:
			return getVersion();
		case MtcPackage.MTC__LIBRARIES_FOLDER:
			return getLibrariesFolder();
		case MtcPackage.MTC__DESCRIPTION:
			return getDescription();
		case MtcPackage.MTC__REFERENCED_RESOURCES:
			return getReferencedResources();
		case MtcPackage.MTC__VALIDATE_CONFORMANCE:
			return isValidateConformance();
		case MtcPackage.MTC__WORKSPACE:
			return getWorkspace();
		case MtcPackage.MTC__EXECUTION_INFORMATION:
			return getExecutionInformation();
		case MtcPackage.MTC__MODEL_VALIDATIONS:
			return getModelValidations();
		case MtcPackage.MTC__INPUT_FILES:
			return getInputFiles();
		case MtcPackage.MTC__OUTPUT_FILES:
			return getOutputFiles();
		case MtcPackage.MTC__DECISIONS:
			return getDecisions();
		case MtcPackage.MTC__DECISION_INPUT_MODELS:
			return getDecisionInputModels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MtcPackage.MTC__NAME:
			setName((String) newValue);
			return;
		case MtcPackage.MTC__FILES:
			getFiles().clear();
			getFiles().addAll((Collection<? extends File>) newValue);
			return;
		case MtcPackage.MTC__METAMODELS:
			getMetamodels().clear();
			getMetamodels().addAll((Collection<? extends Metamodel>) newValue);
			return;
		case MtcPackage.MTC__MODELS:
			getModels().clear();
			getModels().addAll((Collection<? extends Model>) newValue);
			return;
		case MtcPackage.MTC__INPUT_MODELS:
			getInputModels().clear();
			getInputModels().addAll((Collection<? extends InputModel>) newValue);
			return;
		case MtcPackage.MTC__TRANSFORMATIONS:
			getTransformations().clear();
			getTransformations().addAll((Collection<? extends Transformation>) newValue);
			return;
		case MtcPackage.MTC__OUTPUT_MODELS:
			getOutputModels().clear();
			getOutputModels().addAll((Collection<? extends OutputModel>) newValue);
			return;
		case MtcPackage.MTC__M2M_TECHNOLOGY:
			setM2MTechnology((String) newValue);
			return;
		case MtcPackage.MTC__M2T_TECHNOLOGY:
			setM2TTechnology((String) newValue);
			return;
		case MtcPackage.MTC__HO_TECHNOLOGY:
			setHOTechnology((String) newValue);
			return;
		case MtcPackage.MTC__M2M_TRANSFORMATIONS_FOLDER:
			setM2MTransformationsFolder((String) newValue);
			return;
		case MtcPackage.MTC__M2T_TRANSFORMATIONS_FOLDER:
			setM2TTransformationsFolder((String) newValue);
			return;
		case MtcPackage.MTC__HO_TRANSFORMATIONS_FOLDER:
			setHOTransformationsFolder((String) newValue);
			return;
		case MtcPackage.MTC__METAMODELS_FOLDER:
			setMetamodelsFolder((String) newValue);
			return;
		case MtcPackage.MTC__MODELS_FOLDER:
			setModelsFolder((String) newValue);
			return;
		case MtcPackage.MTC__VALIDATIONS:
			getValidations().clear();
			getValidations().addAll((Collection<? extends Validation>) newValue);
			return;
		case MtcPackage.MTC__CONFIGURATIONS:
			setConfigurations((Configuration) newValue);
			return;
		case MtcPackage.MTC__VALIDATIONS_FOLDER:
			setValidationsFolder((String) newValue);
			return;
		case MtcPackage.MTC__VERSION:
			setVersion((String) newValue);
			return;
		case MtcPackage.MTC__LIBRARIES_FOLDER:
			setLibrariesFolder((String) newValue);
			return;
		case MtcPackage.MTC__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MtcPackage.MTC__REFERENCED_RESOURCES:
			getReferencedResources().clear();
			getReferencedResources().addAll((Collection<? extends ReferencedResource>) newValue);
			return;
		case MtcPackage.MTC__VALIDATE_CONFORMANCE:
			setValidateConformance((Boolean) newValue);
			return;
		case MtcPackage.MTC__WORKSPACE:
			setWorkspace((String) newValue);
			return;
		case MtcPackage.MTC__EXECUTION_INFORMATION:
			setExecutionInformation((Map<Object, Object>) newValue);
			return;
		case MtcPackage.MTC__MODEL_VALIDATIONS:
			getModelValidations().clear();
			getModelValidations().addAll((Collection<? extends ModelValidation>) newValue);
			return;
		case MtcPackage.MTC__INPUT_FILES:
			getInputFiles().clear();
			getInputFiles().addAll((Collection<? extends InputFile>) newValue);
			return;
		case MtcPackage.MTC__OUTPUT_FILES:
			getOutputFiles().clear();
			getOutputFiles().addAll((Collection<? extends OutputFile>) newValue);
			return;
		case MtcPackage.MTC__DECISIONS:
			getDecisions().clear();
			getDecisions().addAll((Collection<? extends Decision>) newValue);
			return;
		case MtcPackage.MTC__DECISION_INPUT_MODELS:
			getDecisionInputModels().clear();
			getDecisionInputModels().addAll((Collection<? extends DecisionInputModel>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MtcPackage.MTC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MtcPackage.MTC__FILES:
			getFiles().clear();
			return;
		case MtcPackage.MTC__METAMODELS:
			getMetamodels().clear();
			return;
		case MtcPackage.MTC__MODELS:
			getModels().clear();
			return;
		case MtcPackage.MTC__INPUT_MODELS:
			getInputModels().clear();
			return;
		case MtcPackage.MTC__TRANSFORMATIONS:
			getTransformations().clear();
			return;
		case MtcPackage.MTC__OUTPUT_MODELS:
			getOutputModels().clear();
			return;
		case MtcPackage.MTC__M2M_TECHNOLOGY:
			setM2MTechnology(M2M_TECHNOLOGY_EDEFAULT);
			return;
		case MtcPackage.MTC__M2T_TECHNOLOGY:
			setM2TTechnology(M2T_TECHNOLOGY_EDEFAULT);
			return;
		case MtcPackage.MTC__HO_TECHNOLOGY:
			setHOTechnology(HO_TECHNOLOGY_EDEFAULT);
			return;
		case MtcPackage.MTC__M2M_TRANSFORMATIONS_FOLDER:
			setM2MTransformationsFolder(M2M_TRANSFORMATIONS_FOLDER_EDEFAULT);
			return;
		case MtcPackage.MTC__M2T_TRANSFORMATIONS_FOLDER:
			setM2TTransformationsFolder(M2T_TRANSFORMATIONS_FOLDER_EDEFAULT);
			return;
		case MtcPackage.MTC__HO_TRANSFORMATIONS_FOLDER:
			setHOTransformationsFolder(HO_TRANSFORMATIONS_FOLDER_EDEFAULT);
			return;
		case MtcPackage.MTC__METAMODELS_FOLDER:
			setMetamodelsFolder(METAMODELS_FOLDER_EDEFAULT);
			return;
		case MtcPackage.MTC__MODELS_FOLDER:
			setModelsFolder(MODELS_FOLDER_EDEFAULT);
			return;
		case MtcPackage.MTC__VALIDATIONS:
			getValidations().clear();
			return;
		case MtcPackage.MTC__CONFIGURATIONS:
			setConfigurations((Configuration) null);
			return;
		case MtcPackage.MTC__VALIDATIONS_FOLDER:
			setValidationsFolder(VALIDATIONS_FOLDER_EDEFAULT);
			return;
		case MtcPackage.MTC__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case MtcPackage.MTC__LIBRARIES_FOLDER:
			setLibrariesFolder(LIBRARIES_FOLDER_EDEFAULT);
			return;
		case MtcPackage.MTC__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MtcPackage.MTC__REFERENCED_RESOURCES:
			getReferencedResources().clear();
			return;
		case MtcPackage.MTC__VALIDATE_CONFORMANCE:
			setValidateConformance(VALIDATE_CONFORMANCE_EDEFAULT);
			return;
		case MtcPackage.MTC__WORKSPACE:
			setWorkspace(WORKSPACE_EDEFAULT);
			return;
		case MtcPackage.MTC__EXECUTION_INFORMATION:
			setExecutionInformation((Map<Object, Object>) null);
			return;
		case MtcPackage.MTC__MODEL_VALIDATIONS:
			getModelValidations().clear();
			return;
		case MtcPackage.MTC__INPUT_FILES:
			getInputFiles().clear();
			return;
		case MtcPackage.MTC__OUTPUT_FILES:
			getOutputFiles().clear();
			return;
		case MtcPackage.MTC__DECISIONS:
			getDecisions().clear();
			return;
		case MtcPackage.MTC__DECISION_INPUT_MODELS:
			getDecisionInputModels().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MtcPackage.MTC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MtcPackage.MTC__FILES:
			return files != null && !files.isEmpty();
		case MtcPackage.MTC__METAMODELS:
			return metamodels != null && !metamodels.isEmpty();
		case MtcPackage.MTC__MODELS:
			return models != null && !models.isEmpty();
		case MtcPackage.MTC__INPUT_MODELS:
			return inputModels != null && !inputModels.isEmpty();
		case MtcPackage.MTC__TRANSFORMATIONS:
			return transformations != null && !transformations.isEmpty();
		case MtcPackage.MTC__OUTPUT_MODELS:
			return outputModels != null && !outputModels.isEmpty();
		case MtcPackage.MTC__M2M_TECHNOLOGY:
			return M2M_TECHNOLOGY_EDEFAULT == null ? m2MTechnology != null : !M2M_TECHNOLOGY_EDEFAULT.equals(m2MTechnology);
		case MtcPackage.MTC__M2T_TECHNOLOGY:
			return M2T_TECHNOLOGY_EDEFAULT == null ? m2TTechnology != null : !M2T_TECHNOLOGY_EDEFAULT.equals(m2TTechnology);
		case MtcPackage.MTC__HO_TECHNOLOGY:
			return HO_TECHNOLOGY_EDEFAULT == null ? hoTechnology != null : !HO_TECHNOLOGY_EDEFAULT.equals(hoTechnology);
		case MtcPackage.MTC__M2M_TRANSFORMATIONS_FOLDER:
			return M2M_TRANSFORMATIONS_FOLDER_EDEFAULT == null ? m2MTransformationsFolder != null : !M2M_TRANSFORMATIONS_FOLDER_EDEFAULT.equals(m2MTransformationsFolder);
		case MtcPackage.MTC__M2T_TRANSFORMATIONS_FOLDER:
			return M2T_TRANSFORMATIONS_FOLDER_EDEFAULT == null ? m2TTransformationsFolder != null : !M2T_TRANSFORMATIONS_FOLDER_EDEFAULT.equals(m2TTransformationsFolder);
		case MtcPackage.MTC__HO_TRANSFORMATIONS_FOLDER:
			return HO_TRANSFORMATIONS_FOLDER_EDEFAULT == null ? hoTransformationsFolder != null : !HO_TRANSFORMATIONS_FOLDER_EDEFAULT.equals(hoTransformationsFolder);
		case MtcPackage.MTC__METAMODELS_FOLDER:
			return METAMODELS_FOLDER_EDEFAULT == null ? metamodelsFolder != null : !METAMODELS_FOLDER_EDEFAULT.equals(metamodelsFolder);
		case MtcPackage.MTC__MODELS_FOLDER:
			return MODELS_FOLDER_EDEFAULT == null ? modelsFolder != null : !MODELS_FOLDER_EDEFAULT.equals(modelsFolder);
		case MtcPackage.MTC__VALIDATIONS:
			return validations != null && !validations.isEmpty();
		case MtcPackage.MTC__CONFIGURATIONS:
			return configurations != null;
		case MtcPackage.MTC__VALIDATIONS_FOLDER:
			return VALIDATIONS_FOLDER_EDEFAULT == null ? validationsFolder != null : !VALIDATIONS_FOLDER_EDEFAULT.equals(validationsFolder);
		case MtcPackage.MTC__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case MtcPackage.MTC__LIBRARIES_FOLDER:
			return LIBRARIES_FOLDER_EDEFAULT == null ? librariesFolder != null : !LIBRARIES_FOLDER_EDEFAULT.equals(librariesFolder);
		case MtcPackage.MTC__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MtcPackage.MTC__REFERENCED_RESOURCES:
			return referencedResources != null && !referencedResources.isEmpty();
		case MtcPackage.MTC__VALIDATE_CONFORMANCE:
			return validateConformance != VALIDATE_CONFORMANCE_EDEFAULT;
		case MtcPackage.MTC__WORKSPACE:
			return WORKSPACE_EDEFAULT == null ? workspace != null : !WORKSPACE_EDEFAULT.equals(workspace);
		case MtcPackage.MTC__EXECUTION_INFORMATION:
			return executionInformation != null;
		case MtcPackage.MTC__MODEL_VALIDATIONS:
			return modelValidations != null && !modelValidations.isEmpty();
		case MtcPackage.MTC__INPUT_FILES:
			return inputFiles != null && !inputFiles.isEmpty();
		case MtcPackage.MTC__OUTPUT_FILES:
			return outputFiles != null && !outputFiles.isEmpty();
		case MtcPackage.MTC__DECISIONS:
			return decisions != null && !decisions.isEmpty();
		case MtcPackage.MTC__DECISION_INPUT_MODELS:
			return decisionInputModels != null && !decisionInputModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", M2MTechnology: ");
		result.append(m2MTechnology);
		result.append(", M2TTechnology: ");
		result.append(m2TTechnology);
		result.append(", HOTechnology: ");
		result.append(hoTechnology);
		result.append(", M2MTransformationsFolder: ");
		result.append(m2MTransformationsFolder);
		result.append(", M2TTransformationsFolder: ");
		result.append(m2TTransformationsFolder);
		result.append(", HOTransformationsFolder: ");
		result.append(hoTransformationsFolder);
		result.append(", metamodelsFolder: ");
		result.append(metamodelsFolder);
		result.append(", modelsFolder: ");
		result.append(modelsFolder);
		result.append(", validationsFolder: ");
		result.append(validationsFolder);
		result.append(", version: ");
		result.append(version);
		result.append(", librariesFolder: ");
		result.append(librariesFolder);
		result.append(", description: ");
		result.append(description);
		result.append(", validateConformance: ");
		result.append(validateConformance);
		result.append(", workspace: ");
		result.append(workspace);
		result.append(", executionInformation: ");
		result.append(executionInformation);
		result.append(')');
		return result.toString();
	}

} // MTCImpl
