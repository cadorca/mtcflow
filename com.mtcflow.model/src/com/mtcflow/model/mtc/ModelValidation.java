/**
 */
package com.mtcflow.model.mtc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.ModelValidation#getValidation <em>Validation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.ModelValidation#getModels <em>Models</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.ModelValidation#isStopOnError <em>Stop On Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getModelValidation()
 * @model
 * @generated
 */
public interface ModelValidation extends Configurable {
	/**
	 * Returns the value of the '<em><b>Validation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' reference.
	 * @see #setValidation(Validation)
	 * @see com.mtcflow.model.mtc.MtcPackage#getModelValidation_Validation()
	 * @model required="true"
	 * @generated
	 */
	Validation getValidation();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.ModelValidation#getValidation <em>Validation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' reference.
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(Validation value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getModelValidation_Models()
	 * @model
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Stop On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop On Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop On Error</em>' attribute.
	 * @see #setStopOnError(boolean)
	 * @see com.mtcflow.model.mtc.MtcPackage#getModelValidation_StopOnError()
	 * @model
	 * @generated
	 */
	boolean isStopOnError();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.ModelValidation#isStopOnError <em>Stop On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop On Error</em>' attribute.
	 * @see #isStopOnError()
	 * @generated
	 */
	void setStopOnError(boolean value);

} // ModelValidation
