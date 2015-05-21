/**
 */
package com.mtcflow.model.mtc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.Model#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Model#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getModel()
 * @model annotation="gmf.node label.icon='false' label='name' figure='polygon' polygon.x='0 0 10 10 8 8 10 8 0' polygon.y='0 10 10 2 2 0 2 0 0' border.color='88,88,88' tool.small.path='icons/model.png' tool.name='Model' tool.description='Create a new Model' size='83,105'"
 * @generated
 */
public interface Model extends MTCResource {
	/**
	 * Returns the value of the '<em><b>Metamodels</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodels</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getModel_Metamodels()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='filledsquare' label='conforms to' style='dot' width='1' color='207,207,207' tool.small.path='icons/link.png'"
	 * @generated
	 */
	EList<Metamodel> getMetamodels();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getModel_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Model#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Metamodel getMainMetamodel();

} // Model
