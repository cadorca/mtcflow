/**
 */
package com.mtcflow.model.mtc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.Transformation#getImplementationClass <em>Implementation Class</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Transformation#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Transformation#getPreExecutionScript <em>Pre Execution Script</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Transformation#getPostExecutionScript <em>Post Execution Script</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Transformation#getModelDependencies <em>Model Dependencies</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Transformation#getFileDependencies <em>File Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getTransformation()
 * @model abstract="true"
 * @generated
 */
public interface Transformation extends MTCResource {
	/**
	 * Returns the value of the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Class</em>' attribute.
	 * @see #setImplementationClass(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformation_ImplementationClass()
	 * @model
	 * @generated
	 */
	String getImplementationClass();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Transformation#getImplementationClass <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class</em>' attribute.
	 * @see #getImplementationClass()
	 * @generated
	 */
	void setImplementationClass(String value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformation_Libraries()
	 * @model
	 * @generated
	 */
	EList<Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>Pre Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Execution Script</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Execution Script</em>' reference.
	 * @see #setPreExecutionScript(Script)
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformation_PreExecutionScript()
	 * @model
	 * @generated
	 */
	Script getPreExecutionScript();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Transformation#getPreExecutionScript <em>Pre Execution Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Execution Script</em>' reference.
	 * @see #getPreExecutionScript()
	 * @generated
	 */
	void setPreExecutionScript(Script value);

	/**
	 * Returns the value of the '<em><b>Post Execution Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Execution Script</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Execution Script</em>' reference.
	 * @see #setPostExecutionScript(Script)
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformation_PostExecutionScript()
	 * @model
	 * @generated
	 */
	Script getPostExecutionScript();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Transformation#getPostExecutionScript <em>Post Execution Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Execution Script</em>' reference.
	 * @see #getPostExecutionScript()
	 * @generated
	 */
	void setPostExecutionScript(Script value);

	/**
	 * Returns the value of the '<em><b>Model Dependencies</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Dependencies</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformation_ModelDependencies()
	 * @model annotation="gmf.link target.decoration='filledsquare' tool.name='Depends on model' style='solid' width='1' color='74,118,110' label='depends on' incoming='true' tool.small.path='icons/link.png'"
	 * @generated
	 */
	EList<Model> getModelDependencies();

	/**
	 * Returns the value of the '<em><b>File Dependencies</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Dependencies</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getTransformation_FileDependencies()
	 * @model annotation="gmf.link source.decoration='filledsquare' tool.name='Depends on file' style='solid' width='1' color='74,118,110' label='depends on' incoming='true' tool.small.path='icons/link.png'"
	 * @generated
	 */
	EList<File> getFileDependencies();

} // Transformation
