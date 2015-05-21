/**
 */
package com.mtcflow.model.mtc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.File#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getFile()
 * @model annotation="gmf.node label.icon='false' label='name' figure='polygon' polygon.x='0 0 10 10 8 8 10 8 0' polygon.y='0 10 10 2 2 0 2 0 0' border.color='88,88,88' tool.small.path='icons/file.png' tool.name='File' tool.description='Create a new Output File' size='83,105'"
 * @generated
 */
public interface File extends MTCResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getFile_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.File#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // File
