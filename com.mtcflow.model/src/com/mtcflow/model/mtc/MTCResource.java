/**
 */
package com.mtcflow.model.mtc;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTC Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.MTCResource#getName <em>Name</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTCResource#getURI <em>URI</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTCResource#getTags <em>Tags</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTCResource#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTCResource#getReferencedResources <em>Referenced Resources</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTCResource#getExecutionInformation <em>Execution Information</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.MTCResource#getTechnology <em>Technology</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getMTCResource()
 * @model abstract="true"
 * @generated
 */
public interface MTCResource extends Configurable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTCResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTCResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTCResource_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTCResource#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTCResource_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

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
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTCResource_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTCResource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Resources</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.ReferencedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Resources</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTCResource_ReferencedResources()
	 * @model annotation="gmf.link target.decoration='filledclosedarrow' label='ref' style='dash' width='1' color='96,139,50' incoming='true' tool.small.path='icons/link.png'"
	 * @generated
	 */
	EList<ReferencedResource> getReferencedResources();

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
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTCResource_ExecutionInformation()
	 * @model transient="true"
	 * @generated
	 */
	Map<Object, Object> getExecutionInformation();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTCResource#getExecutionInformation <em>Execution Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Information</em>' attribute.
	 * @see #getExecutionInformation()
	 * @generated
	 */
	void setExecutionInformation(Map<Object, Object> value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMTCResource_Technology()
	 * @model
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.MTCResource#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean inWorkspace();

} // MTCResource
