/**
 */
package com.mtcflow.model.mtc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.MtcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.MetamodelImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.MetamodelImpl#isAutoregister <em>Autoregister</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.MetamodelImpl#getMetamodelURI <em>Metamodel URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends MTCResourceImpl implements Metamodel {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoregister() <em>Autoregister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoregister()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOREGISTER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoregister() <em>Autoregister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoregister()
	 * @generated
	 * @ordered
	 */
	protected boolean autoregister = AUTOREGISTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelURI() <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelURI() <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelURI()
	 * @generated
	 * @ordered
	 */
	protected String metamodelURI = METAMODEL_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.METAMODEL__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoregister() {
		return autoregister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoregister(boolean newAutoregister) {
		boolean oldAutoregister = autoregister;
		autoregister = newAutoregister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.METAMODEL__AUTOREGISTER, oldAutoregister, autoregister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelURI() {
		return metamodelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelURI(String newMetamodelURI) {
		String oldMetamodelURI = metamodelURI;
		metamodelURI = newMetamodelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.METAMODEL__METAMODEL_URI, oldMetamodelURI, metamodelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.METAMODEL__ALIAS:
				return getAlias();
			case MtcPackage.METAMODEL__AUTOREGISTER:
				return isAutoregister();
			case MtcPackage.METAMODEL__METAMODEL_URI:
				return getMetamodelURI();
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
			case MtcPackage.METAMODEL__ALIAS:
				setAlias((String)newValue);
				return;
			case MtcPackage.METAMODEL__AUTOREGISTER:
				setAutoregister((Boolean)newValue);
				return;
			case MtcPackage.METAMODEL__METAMODEL_URI:
				setMetamodelURI((String)newValue);
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
			case MtcPackage.METAMODEL__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case MtcPackage.METAMODEL__AUTOREGISTER:
				setAutoregister(AUTOREGISTER_EDEFAULT);
				return;
			case MtcPackage.METAMODEL__METAMODEL_URI:
				setMetamodelURI(METAMODEL_URI_EDEFAULT);
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
			case MtcPackage.METAMODEL__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case MtcPackage.METAMODEL__AUTOREGISTER:
				return autoregister != AUTOREGISTER_EDEFAULT;
			case MtcPackage.METAMODEL__METAMODEL_URI:
				return METAMODEL_URI_EDEFAULT == null ? metamodelURI != null : !METAMODEL_URI_EDEFAULT.equals(metamodelURI);
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
		result.append(" (alias: ");
		result.append(alias);
		result.append(", autoregister: ");
		result.append(autoregister);
		result.append(", metamodelURI: ");
		result.append(metamodelURI);
		result.append(')');
		return result.toString();
	}

} //MetamodelImpl
