/**
 */
package com.mtcflow.model.mtc.impl;

import com.mtcflow.model.mtc.Choise;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.mtcflow.model.mtc.Decision;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.ChoiseImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ChoiseImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ChoiseImpl#getChoiseValue <em>Choise Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiseImpl extends EObjectImpl implements Choise {
	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation transformation;

	/**
	 * The default value of the '{@link #getChoiseValue() <em>Choise Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiseValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOISE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoiseValue() <em>Choise Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiseValue()
	 * @generated
	 * @ordered
	 */
	protected String choiseValue = CHOISE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.CHOISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (Transformation)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.CHOISE__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		Transformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.CHOISE__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision getDecision() {
		if (eContainerFeatureID() != MtcPackage.CHOISE__DECISION) return null;
		return (Decision)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(Decision newDecision, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDecision, MtcPackage.CHOISE__DECISION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecision(Decision newDecision) {
		if (newDecision != eInternalContainer() || (eContainerFeatureID() != MtcPackage.CHOISE__DECISION && newDecision != null)) {
			if (EcoreUtil.isAncestor(this, newDecision))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDecision != null)
				msgs = ((InternalEObject)newDecision).eInverseAdd(this, MtcPackage.DECISION__CHOISES, Decision.class, msgs);
			msgs = basicSetDecision(newDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.CHOISE__DECISION, newDecision, newDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoiseValue() {
		return choiseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoiseValue(String newChoiseValue) {
		String oldChoiseValue = choiseValue;
		choiseValue = newChoiseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.CHOISE__CHOISE_VALUE, oldChoiseValue, choiseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MtcPackage.CHOISE__DECISION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDecision((Decision)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MtcPackage.CHOISE__DECISION:
				return basicSetDecision(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MtcPackage.CHOISE__DECISION:
				return eInternalContainer().eInverseRemove(this, MtcPackage.DECISION__CHOISES, Decision.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.CHOISE__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case MtcPackage.CHOISE__DECISION:
				return getDecision();
			case MtcPackage.CHOISE__CHOISE_VALUE:
				return getChoiseValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MtcPackage.CHOISE__TRANSFORMATION:
				setTransformation((Transformation)newValue);
				return;
			case MtcPackage.CHOISE__DECISION:
				setDecision((Decision)newValue);
				return;
			case MtcPackage.CHOISE__CHOISE_VALUE:
				setChoiseValue((String)newValue);
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
			case MtcPackage.CHOISE__TRANSFORMATION:
				setTransformation((Transformation)null);
				return;
			case MtcPackage.CHOISE__DECISION:
				setDecision((Decision)null);
				return;
			case MtcPackage.CHOISE__CHOISE_VALUE:
				setChoiseValue(CHOISE_VALUE_EDEFAULT);
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
			case MtcPackage.CHOISE__TRANSFORMATION:
				return transformation != null;
			case MtcPackage.CHOISE__DECISION:
				return getDecision() != null;
			case MtcPackage.CHOISE__CHOISE_VALUE:
				return CHOISE_VALUE_EDEFAULT == null ? choiseValue != null : !CHOISE_VALUE_EDEFAULT.equals(choiseValue);
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
		result.append(" (choiseValue: ");
		result.append(choiseValue);
		result.append(')');
		return result.toString();
	}

} //ChoiseImpl
