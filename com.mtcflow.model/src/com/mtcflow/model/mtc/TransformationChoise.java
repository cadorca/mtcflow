/**
 */
package com.mtcflow.model.mtc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Choise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.TransformationChoise#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.TransformationChoise#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.TransformationChoise#getConditionValue <em>Condition Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getTransformationChoise()
 * @model
 * @generated
 */
public interface TransformationChoise extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Transformation)
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformationChoise_Transformation()
	 * @model required="true"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.TransformationChoise#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.mtcflow.model.mtc.Decision#getChoises <em>Choises</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' container reference.
	 * @see #setDecision(Decision)
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformationChoise_Decision()
	 * @see com.mtcflow.model.mtc.Decision#getChoises
	 * @model opposite="choises" required="true" transient="false"
	 * @generated
	 */
	Decision getDecision();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.TransformationChoise#getDecision <em>Decision</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' container reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(Decision value);

	/**
	 * Returns the value of the '<em><b>Condition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Value</em>' attribute.
	 * @see #setConditionValue(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformationChoise_ConditionValue()
	 * @model required="true"
	 * @generated
	 */
	String getConditionValue();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.TransformationChoise#getConditionValue <em>Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Value</em>' attribute.
	 * @see #getConditionValue()
	 * @generated
	 */
	void setConditionValue(String value);

} // TransformationChoise
