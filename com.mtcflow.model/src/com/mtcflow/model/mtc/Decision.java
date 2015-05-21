/**
 */
package com.mtcflow.model.mtc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.Decision#getName <em>Name</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Decision#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Decision#getChoises <em>Choises</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Decision#getImplementationClass <em>Implementation Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends EObject {
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
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecision_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Decision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expresion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expresion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresion</em>' attribute.
	 * @see #setExpresion(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecision_Expresion()
	 * @model required="true"
	 * @generated
	 */
	String getExpresion();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Decision#getExpresion <em>Expresion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresion</em>' attribute.
	 * @see #getExpresion()
	 * @generated
	 */
	void setExpresion(String value);

	/**
	 * Returns the value of the '<em><b>Choises</b></em>' containment reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Choise}.
	 * It is bidirectional and its opposite is '{@link com.mtcflow.model.mtc.Choise#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choises</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choises</em>' containment reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecision_Choises()
	 * @see com.mtcflow.model.mtc.Choise#getDecision
	 * @model opposite="decision" containment="true"
	 * @generated
	 */
	EList<Choise> getChoises();

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
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecision_ImplementationClass()
	 * @model
	 * @generated
	 */
	String getImplementationClass();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Decision#getImplementationClass <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class</em>' attribute.
	 * @see #getImplementationClass()
	 * @generated
	 */
	void setImplementationClass(String value);

} // Decision
