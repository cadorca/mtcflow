/**
 */
package com.mtcflow.model.mtc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.OutputFile#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.OutputFile#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getOutputFile()
 * @model
 * @generated
 */
public interface OutputFile extends Configurable {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(M2TTransformation)
	 * @see com.mtcflow.model.mtc.MtcPackage#getOutputFile_Transformation()
	 * @model required="true"
	 * @generated
	 */
	M2TTransformation getTransformation();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.OutputFile#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(M2TTransformation value);

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
	 * @see com.mtcflow.model.mtc.MtcPackage#getOutputFile_File()
	 * @model required="true"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.OutputFile#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

} // OutputFile
