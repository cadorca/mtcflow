/**
 */
package com.mtcflow.model.mtc;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getName <em>Name</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getFiles <em>Files</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getModels <em>Models</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getInputModels <em>Input Models</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getOutputModels <em>Output Models</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getM2MTechnology <em>M2M Technology</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getM2TTechnology <em>M2T Technology</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getHOTechnology <em>HO Technology</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getM2MTransformationsFolder <em>M2M Transformations Folder</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getM2TTransformationsFolder <em>M2T Transformations Folder</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getHOTransformationsFolder <em>HO Transformations Folder</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getMetamodelsFolder <em>Metamodels Folder</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getModelsFolder <em>Models Folder</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getValidations <em>Validations</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getValidationsFolder <em>Validations Folder</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getVersion <em>Version</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getLibrariesFolder <em>Libraries Folder</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getReferencedResources <em>Referenced Resources</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#isValidateConformance <em>Validate Conformance</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getExecutionInformation <em>Execution Information</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getModelValidations <em>Model Validations</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getInputFiles <em>Input Files</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getOutputFiles <em>Output Files</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTC#getDecisionInputModels <em>Decision Input Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getMTC()
 * @model annotation="gmf.diagram model.extension='mtc' diagram.extension='mtcdiag'"
 * @generated
 */
public interface MTC extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MTC"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Name()
	 * @model default="MTC" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodels</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Metamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getMetamodels();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Input Models</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.InputModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Models</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_InputModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputModel> getInputModels();

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

	/**
	 * Returns the value of the '<em><b>Output Models</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.OutputModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Models</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_OutputModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputModel> getOutputModels();

	/**
	 * Returns the value of the '<em><b>M2M Technology</b></em>' attribute.
	 * The default value is <code>"ATL"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M2M Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M2M Technology</em>' attribute.
	 * @see #setM2MTechnology(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_M2MTechnology()
	 * @model default="ATL" required="true"
	 * @generated
	 */
	String getM2MTechnology();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getM2MTechnology <em>M2M Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M2M Technology</em>' attribute.
	 * @see #getM2MTechnology()
	 * @generated
	 */
	void setM2MTechnology(String value);

	/**
	 * Returns the value of the '<em><b>M2T Technology</b></em>' attribute.
	 * The default value is <code>"ACCELEO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M2T Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M2T Technology</em>' attribute.
	 * @see #setM2TTechnology(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_M2TTechnology()
	 * @model default="ACCELEO" required="true"
	 * @generated
	 */
	String getM2TTechnology();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getM2TTechnology <em>M2T Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M2T Technology</em>' attribute.
	 * @see #getM2TTechnology()
	 * @generated
	 */
	void setM2TTechnology(String value);

	/**
	 * Returns the value of the '<em><b>HO Technology</b></em>' attribute.
	 * The default value is <code>"ATL"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HO Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HO Technology</em>' attribute.
	 * @see #setHOTechnology(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_HOTechnology()
	 * @model default="ATL" required="true"
	 * @generated
	 */
	String getHOTechnology();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getHOTechnology <em>HO Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HO Technology</em>' attribute.
	 * @see #getHOTechnology()
	 * @generated
	 */
	void setHOTechnology(String value);

	/**
	 * Returns the value of the '<em><b>M2M Transformations Folder</b></em>' attribute.
	 * The default value is <code>"/transformations/M2M/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M2M Transformations Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M2M Transformations Folder</em>' attribute.
	 * @see #setM2MTransformationsFolder(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_M2MTransformationsFolder()
	 * @model default="/transformations/M2M/" required="true"
	 * @generated
	 */
	String getM2MTransformationsFolder();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getM2MTransformationsFolder <em>M2M Transformations Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M2M Transformations Folder</em>' attribute.
	 * @see #getM2MTransformationsFolder()
	 * @generated
	 */
	void setM2MTransformationsFolder(String value);

	/**
	 * Returns the value of the '<em><b>M2T Transformations Folder</b></em>' attribute.
	 * The default value is <code>"/transformations/M2T/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M2T Transformations Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M2T Transformations Folder</em>' attribute.
	 * @see #setM2TTransformationsFolder(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_M2TTransformationsFolder()
	 * @model default="/transformations/M2T/" required="true"
	 * @generated
	 */
	String getM2TTransformationsFolder();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getM2TTransformationsFolder <em>M2T Transformations Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M2T Transformations Folder</em>' attribute.
	 * @see #getM2TTransformationsFolder()
	 * @generated
	 */
	void setM2TTransformationsFolder(String value);

	/**
	 * Returns the value of the '<em><b>HO Transformations Folder</b></em>' attribute.
	 * The default value is <code>"/transformations/HOT/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HO Transformations Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HO Transformations Folder</em>' attribute.
	 * @see #setHOTransformationsFolder(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_HOTransformationsFolder()
	 * @model default="/transformations/HOT/" required="true"
	 * @generated
	 */
	String getHOTransformationsFolder();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getHOTransformationsFolder <em>HO Transformations Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HO Transformations Folder</em>' attribute.
	 * @see #getHOTransformationsFolder()
	 * @generated
	 */
	void setHOTransformationsFolder(String value);

	/**
	 * Returns the value of the '<em><b>Metamodels Folder</b></em>' attribute.
	 * The default value is <code>"/metamodels/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodels Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodels Folder</em>' attribute.
	 * @see #setMetamodelsFolder(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_MetamodelsFolder()
	 * @model default="/metamodels/" required="true"
	 * @generated
	 */
	String getMetamodelsFolder();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getMetamodelsFolder <em>Metamodels Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodels Folder</em>' attribute.
	 * @see #getMetamodelsFolder()
	 * @generated
	 */
	void setMetamodelsFolder(String value);

	/**
	 * Returns the value of the '<em><b>Models Folder</b></em>' attribute.
	 * The default value is <code>"/models/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models Folder</em>' attribute.
	 * @see #setModelsFolder(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_ModelsFolder()
	 * @model default="/models/" required="true"
	 * @generated
	 */
	String getModelsFolder();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getModelsFolder <em>Models Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Models Folder</em>' attribute.
	 * @see #getModelsFolder()
	 * @generated
	 */
	void setModelsFolder(String value);

	/**
	 * Returns the value of the '<em><b>Validations</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Validation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validations</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Validations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validation> getValidations();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference.
	 * @see #setConfigurations(Configuration)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getConfigurations();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getConfigurations <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' containment reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(Configuration value);

	/**
	 * Returns the value of the '<em><b>Validations Folder</b></em>' attribute.
	 * The default value is <code>"/validations/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validations Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validations Folder</em>' attribute.
	 * @see #setValidationsFolder(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_ValidationsFolder()
	 * @model default="/validations/" required="true"
	 * @generated
	 */
	String getValidationsFolder();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getValidationsFolder <em>Validations Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validations Folder</em>' attribute.
	 * @see #getValidationsFolder()
	 * @generated
	 */
	void setValidationsFolder(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Version()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Libraries Folder</b></em>' attribute.
	 * The default value is <code>"/libraries/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries Folder</em>' attribute.
	 * @see #setLibrariesFolder(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_LibrariesFolder()
	 * @model default="/libraries/" required="true"
	 * @generated
	 */
	String getLibrariesFolder();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getLibrariesFolder <em>Libraries Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libraries Folder</em>' attribute.
	 * @see #getLibrariesFolder()
	 * @generated
	 */
	void setLibrariesFolder(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.ReferencedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Resources</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_ReferencedResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferencedResource> getReferencedResources();

	/**
	 * Returns the value of the '<em><b>Validate Conformance</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Conformance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Conformance</em>' attribute.
	 * @see #setValidateConformance(boolean)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_ValidateConformance()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isValidateConformance();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#isValidateConformance <em>Validate Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Conformance</em>' attribute.
	 * @see #isValidateConformance()
	 * @generated
	 */
	void setValidateConformance(boolean value);

	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' attribute.
	 * The default value is <code>"/workspace/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workspace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workspace</em>' attribute.
	 * @see #setWorkspace(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Workspace()
	 * @model default="/workspace/" required="true"
	 * @generated
	 */
	String getWorkspace();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getWorkspace <em>Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspace</em>' attribute.
	 * @see #getWorkspace()
	 * @generated
	 */
	void setWorkspace(String value);

	/**
	 * Returns the value of the '<em><b>Execution Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Information</em>' attribute.
	 * @see #setExecutionInformation(Map)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_ExecutionInformation()
	 * @model transient="true"
	 * @generated
	 */
	Map<Object, Object> getExecutionInformation();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTC#getExecutionInformation <em>Execution Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Information</em>' attribute.
	 * @see #getExecutionInformation()
	 * @generated
	 */
	void setExecutionInformation(Map<Object, Object> value);

	/**
	 * Returns the value of the '<em><b>Model Validations</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.ModelValidation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Validations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Validations</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_ModelValidations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelValidation> getModelValidations();

	/**
	 * Returns the value of the '<em><b>Input Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.InputFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Files</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_InputFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputFile> getInputFiles();

	/**
	 * Returns the value of the '<em><b>Output Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.OutputFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Files</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_OutputFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputFile> getOutputFiles();

	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Decision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_Decisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decision> getDecisions();

	/**
	 * Returns the value of the '<em><b>Decision Input Models</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.DecisionInputModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Input Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Input Models</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTC_DecisionInputModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecisionInputModel> getDecisionInputModels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<InputFile> getInputFiles(Transformation transformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<OutputFile> getOutputFiles(Transformation transformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<File> getFiles(T2MTransformation transformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelRequired="true"
	 * @generated
	 */
	EList<ModelValidation> getValidations(Model model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model transformationNameRequired="true"
	 * @generated
	 */
	Transformation getTransformationByName(String transformationName);

} // MTC
