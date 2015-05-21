/**
 */
package com.mtcflow.model.mtc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.InputFile#getFile <em>File</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.InputFile#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getInputFile()
 * @model
 * @generated
 */
public interface InputFile extends Configurable {
	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(File)
	 * @see com.mtcflow.model.mtc.MtcPackage#getInputFile_File()
	 * @model required="true"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.InputFile#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(T2MTransformation)
	 * @see com.mtcflow.model.mtc.MtcPackage#getInputFile_Transformation()
	 * @model required="true"
	 * @generated
	 */
	T2MTransformation getTransformation();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.InputFile#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(T2MTransformation value);

} // InputFile
