/**
 */
package com.mtcflow.model.mtc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Input Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.DecisionInputModel#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.DecisionInputModel#getModel <em>Model</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.DecisionInputModel#getModelAlias <em>Model Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.DecisionInputModel#getMetamodelAlias <em>Metamodel Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.DecisionInputModel#isLoadForDecisionEvaluation <em>Load For Decision Evaluation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.DecisionInputModel#getChoises <em>Choises</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getDecisionInputModel()
 * @model
 * @generated
 */
public interface DecisionInputModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' reference.
	 * @see #setDecision(Decision)
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecisionInputModel_Decision()
	 * @model required="true"
	 * @generated
	 */
	Decision getDecision();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.DecisionInputModel#getDecision <em>Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(Decision value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecisionInputModel_Model()
	 * @model
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.DecisionInputModel#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Model Alias</b></em>' attribute.
	 * The default value is <code>"IN"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Alias</em>' attribute.
	 * @see #setModelAlias(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecisionInputModel_ModelAlias()
	 * @model default="IN"
	 * @generated
	 */
	String getModelAlias();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.DecisionInputModel#getModelAlias <em>Model Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Alias</em>' attribute.
	 * @see #getModelAlias()
	 * @generated
	 */
	void setModelAlias(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Alias</em>' attribute.
	 * @see #setMetamodelAlias(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecisionInputModel_MetamodelAlias()
	 * @model
	 * @generated
	 */
	String getMetamodelAlias();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.DecisionInputModel#getMetamodelAlias <em>Metamodel Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Alias</em>' attribute.
	 * @see #getMetamodelAlias()
	 * @generated
	 */
	void setMetamodelAlias(String value);

	/**
	 * Returns the value of the '<em><b>Load For Decision Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load For Decision Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load For Decision Evaluation</em>' attribute.
	 * @see #setLoadForDecisionEvaluation(boolean)
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecisionInputModel_LoadForDecisionEvaluation()
	 * @model
	 * @generated
	 */
	boolean isLoadForDecisionEvaluation();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.DecisionInputModel#isLoadForDecisionEvaluation <em>Load For Decision Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load For Decision Evaluation</em>' attribute.
	 * @see #isLoadForDecisionEvaluation()
	 * @generated
	 */
	void setLoadForDecisionEvaluation(boolean value);

	/**
	 * Returns the value of the '<em><b>Choises</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Choise}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choises</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choises</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getDecisionInputModel_Choises()
	 * @model
	 * @generated
	 */
	EList<Choise> getChoises();

} // DecisionInputModel
