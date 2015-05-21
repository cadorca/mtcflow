/**
 */
package com.mtcflow.model.mtc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelValidation;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Validation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.ModelValidationImpl#getValidation <em>Validation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ModelValidationImpl#getModels <em>Models</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ModelValidationImpl#isStopOnError <em>Stop On Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelValidationImpl extends ConfigurableImpl implements ModelValidation {
	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected Validation validation;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The default value of the '{@link #isStopOnError() <em>Stop On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStopOnError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOP_ON_ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStopOnError() <em>Stop On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStopOnError()
	 * @generated
	 * @ordered
	 */
	protected boolean stopOnError = STOP_ON_ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.MODEL_VALIDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validation getValidation() {
		if (validation != null && validation.eIsProxy()) {
			InternalEObject oldValidation = (InternalEObject)validation;
			validation = (Validation)eResolveProxy(oldValidation);
			if (validation != oldValidation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.MODEL_VALIDATION__VALIDATION, oldValidation, validation));
			}
		}
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validation basicGetValidation() {
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidation(Validation newValidation) {
		Validation oldValidation = validation;
		validation = newValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MODEL_VALIDATION__VALIDATION, oldValidation, validation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectResolvingEList<Model>(Model.class, this, MtcPackage.MODEL_VALIDATION__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStopOnError() {
		return stopOnError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopOnError(boolean newStopOnError) {
		boolean oldStopOnError = stopOnError;
		stopOnError = newStopOnError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MODEL_VALIDATION__STOP_ON_ERROR, oldStopOnError, stopOnError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.MODEL_VALIDATION__VALIDATION:
				if (resolve) return getValidation();
				return basicGetValidation();
			case MtcPackage.MODEL_VALIDATION__MODELS:
				return getModels();
			case MtcPackage.MODEL_VALIDATION__STOP_ON_ERROR:
				return isStopOnError();
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
			case MtcPackage.MODEL_VALIDATION__VALIDATION:
				setValidation((Validation)newValue);
				return;
			case MtcPackage.MODEL_VALIDATION__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
				return;
			case MtcPackage.MODEL_VALIDATION__STOP_ON_ERROR:
				setStopOnError((Boolean)newValue);
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
			case MtcPackage.MODEL_VALIDATION__VALIDATION:
				setValidation((Validation)null);
				return;
			case MtcPackage.MODEL_VALIDATION__MODELS:
				getModels().clear();
				return;
			case MtcPackage.MODEL_VALIDATION__STOP_ON_ERROR:
				setStopOnError(STOP_ON_ERROR_EDEFAULT);
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
			case MtcPackage.MODEL_VALIDATION__VALIDATION:
				return validation != null;
			case MtcPackage.MODEL_VALIDATION__MODELS:
				return models != null && !models.isEmpty();
			case MtcPackage.MODEL_VALIDATION__STOP_ON_ERROR:
				return stopOnError != STOP_ON_ERROR_EDEFAULT;
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
		result.append(" (stopOnError: ");
		result.append(stopOnError);
		result.append(')');
		return result.toString();
	}

} //ModelValidationImpl
