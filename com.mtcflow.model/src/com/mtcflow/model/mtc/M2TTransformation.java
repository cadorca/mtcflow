/**
 */
package com.mtcflow.model.mtc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M2T Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.M2TTransformation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getM2TTransformation()
 * @model annotation="gmf.node label.icon='false' label='name' tool.small.path='icons/m2t.png' tool.name='M2T - Model To Text' tool.description='Create a new Model To Text Transformation (M2T)' size='200,49' border.color='0,0,0'"
 * @generated
 */
public interface M2TTransformation extends Transformation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getM2TTransformation_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.M2TTransformation#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // M2TTransformation
