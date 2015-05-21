/**
 */
package com.mtcflow.model.mtc.impl;

import com.mtcflow.model.mtc.Choise;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.mtcflow.model.mtc.Decision;
import com.mtcflow.model.mtc.DecisionInputModel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Input Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.DecisionInputModelImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.DecisionInputModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.DecisionInputModelImpl#getModelAlias <em>Model Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.DecisionInputModelImpl#getMetamodelAlias <em>Metamodel Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.DecisionInputModelImpl#isLoadForDecisionEvaluation <em>Load For Decision Evaluation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.DecisionInputModelImpl#getChoises <em>Choises</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionInputModelImpl extends EObjectImpl implements DecisionInputModel {
	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected Decision decision;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The default value of the '{@link #getModelAlias() <em>Model Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ALIAS_EDEFAULT = "IN";

	/**
	 * The cached value of the '{@link #getModelAlias() <em>Model Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAlias()
	 * @generated
	 * @ordered
	 */
	protected String modelAlias = MODEL_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelAlias() <em>Metamodel Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelAlias() <em>Metamodel Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelAlias()
	 * @generated
	 * @ordered
	 */
	protected String metamodelAlias = METAMODEL_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoadForDecisionEvaluation() <em>Load For Decision Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadForDecisionEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOAD_FOR_DECISION_EVALUATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoadForDecisionEvaluation() <em>Load For Decision Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadForDecisionEvaluation()
	 * @generated
	 * @ordered
	 */
	protected boolean loadForDecisionEvaluation = LOAD_FOR_DECISION_EVALUATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoises() <em>Choises</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoises()
	 * @generated
	 * @ordered
	 */
	protected EList<Choise> choises;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionInputModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.DECISION_INPUT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision getDecision() {
		if (decision != null && decision.eIsProxy()) {
			InternalEObject oldDecision = (InternalEObject)decision;
			decision = (Decision)eResolveProxy(oldDecision);
			if (decision != oldDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.DECISION_INPUT_MODEL__DECISION, oldDecision, decision));
			}
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision basicGetDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecision(Decision newDecision) {
		Decision oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.DECISION_INPUT_MODEL__DECISION, oldDecision, decision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.DECISION_INPUT_MODEL__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.DECISION_INPUT_MODEL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelAlias() {
		return modelAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelAlias(String newModelAlias) {
		String oldModelAlias = modelAlias;
		modelAlias = newModelAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.DECISION_INPUT_MODEL__MODEL_ALIAS, oldModelAlias, modelAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelAlias() {
		return metamodelAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelAlias(String newMetamodelAlias) {
		String oldMetamodelAlias = metamodelAlias;
		metamodelAlias = newMetamodelAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.DECISION_INPUT_MODEL__METAMODEL_ALIAS, oldMetamodelAlias, metamodelAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoadForDecisionEvaluation() {
		return loadForDecisionEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadForDecisionEvaluation(boolean newLoadForDecisionEvaluation) {
		boolean oldLoadForDecisionEvaluation = loadForDecisionEvaluation;
		loadForDecisionEvaluation = newLoadForDecisionEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.DECISION_INPUT_MODEL__LOAD_FOR_DECISION_EVALUATION, oldLoadForDecisionEvaluation, loadForDecisionEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choise> getChoises() {
		if (choises == null) {
			choises = new EObjectResolvingEList<Choise>(Choise.class, this, MtcPackage.DECISION_INPUT_MODEL__CHOISES);
		}
		return choises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.DECISION_INPUT_MODEL__DECISION:
				if (resolve) return getDecision();
				return basicGetDecision();
			case MtcPackage.DECISION_INPUT_MODEL__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case MtcPackage.DECISION_INPUT_MODEL__MODEL_ALIAS:
				return getModelAlias();
			case MtcPackage.DECISION_INPUT_MODEL__METAMODEL_ALIAS:
				return getMetamodelAlias();
			case MtcPackage.DECISION_INPUT_MODEL__LOAD_FOR_DECISION_EVALUATION:
				return isLoadForDecisionEvaluation();
			case MtcPackage.DECISION_INPUT_MODEL__CHOISES:
				return getChoises();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MtcPackage.DECISION_INPUT_MODEL__DECISION:
				setDecision((Decision)newValue);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__MODEL:
				setModel((Model)newValue);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__MODEL_ALIAS:
				setModelAlias((String)newValue);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__METAMODEL_ALIAS:
				setMetamodelAlias((String)newValue);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__LOAD_FOR_DECISION_EVALUATION:
				setLoadForDecisionEvaluation((Boolean)newValue);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__CHOISES:
				getChoises().clear();
				getChoises().addAll((Collection<? extends Choise>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MtcPackage.DECISION_INPUT_MODEL__DECISION:
				setDecision((Decision)null);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__MODEL:
				setModel((Model)null);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__MODEL_ALIAS:
				setModelAlias(MODEL_ALIAS_EDEFAULT);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__METAMODEL_ALIAS:
				setMetamodelAlias(METAMODEL_ALIAS_EDEFAULT);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__LOAD_FOR_DECISION_EVALUATION:
				setLoadForDecisionEvaluation(LOAD_FOR_DECISION_EVALUATION_EDEFAULT);
				return;
			case MtcPackage.DECISION_INPUT_MODEL__CHOISES:
				getChoises().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MtcPackage.DECISION_INPUT_MODEL__DECISION:
				return decision != null;
			case MtcPackage.DECISION_INPUT_MODEL__MODEL:
				return model != null;
			case MtcPackage.DECISION_INPUT_MODEL__MODEL_ALIAS:
				return MODEL_ALIAS_EDEFAULT == null ? modelAlias != null : !MODEL_ALIAS_EDEFAULT.equals(modelAlias);
			case MtcPackage.DECISION_INPUT_MODEL__METAMODEL_ALIAS:
				return METAMODEL_ALIAS_EDEFAULT == null ? metamodelAlias != null : !METAMODEL_ALIAS_EDEFAULT.equals(metamodelAlias);
			case MtcPackage.DECISION_INPUT_MODEL__LOAD_FOR_DECISION_EVALUATION:
				return loadForDecisionEvaluation != LOAD_FOR_DECISION_EVALUATION_EDEFAULT;
			case MtcPackage.DECISION_INPUT_MODEL__CHOISES:
				return choises != null && !choises.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelAlias: ");
		result.append(modelAlias);
		result.append(", metamodelAlias: ");
		result.append(metamodelAlias);
		result.append(", loadForDecisionEvaluation: ");
		result.append(loadForDecisionEvaluation);
		result.append(')');
		return result.toString();
	}

} //DecisionInputModelImpl
