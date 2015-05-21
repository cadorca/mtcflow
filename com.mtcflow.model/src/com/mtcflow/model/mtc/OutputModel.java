/**
 */
package com.mtcflow.model.mtc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.OutputModel#getModelAlias <em>Model Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.OutputModel#getModel <em>Model</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.OutputModel#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.OutputModel#getMetamodelAlias <em>Metamodel Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getOutputModel()
 * @model annotation="gmf.link source='transformation' target='model' label='alias' width='2' color='77,77,77' target.decoration='filledclosedarrow' incoming='true' tool.small.path='icons/link.png'"
 * @generated
 */
public interface OutputModel extends Configurable {
	/**
	 * Returns the value of the '<em><b>Model Alias</b></em>' attribute.
	 * The default value is <code>"OUT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Alias</em>' attribute.
	 * @see #setModelAlias(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getOutputModel_ModelAlias()
	 * @model default="OUT" required="true"
	 * @generated
	 */
	String getModelAlias();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.OutputModel#getModelAlias <em>Model Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Alias</em>' attribute.
	 * @see #getModelAlias()
	 * @generated
	 */
	void setModelAlias(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see com.mtcflow.model.mtc.MtcPackage#getOutputModel_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.OutputModel#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(ModelProducerTransformation)
	 * @see com.mtcflow.model.mtc.MtcPackage#getOutputModel_Transformation()
	 * @model required="true"
	 * @generated
	 */
	ModelProducerTransformation getTransformation();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.OutputModel#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(ModelProducerTransformation value);

	/**
	 * Returns the value of the '<em><b>Metamodel Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Alias</em>' attribute.
	 * @see #setMetamodelAlias(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getOutputModel_MetamodelAlias()
	 * @model
	 * @generated
	 */
	String getMetamodelAlias();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.OutputModel#getMetamodelAlias <em>Metamodel Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Alias</em>' attribute.
	 * @see #getMetamodelAlias()
	 * @generated
	 */
	void setMetamodelAlias(String value);

} // OutputModel
