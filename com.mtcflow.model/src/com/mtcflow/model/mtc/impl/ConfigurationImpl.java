/**
 */
package com.mtcflow.model.mtc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.mtcflow.model.mtc.Configuration;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.ModelEnvironment;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Script;
import com.mtcflow.model.mtc.Tag;
import com.mtcflow.model.mtc.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ConfigurationImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ConfigurationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ConfigurationImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ConfigurationImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.ConfigurationImpl#getEnvironments <em>Environments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Configuration";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> scripts;

	/**
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelEnvironment> environments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, MtcPackage.CONFIGURATION__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, MtcPackage.CONFIGURATION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<Library>(Library.class, this, MtcPackage.CONFIGURATION__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getScripts() {
		if (scripts == null) {
			scripts = new EObjectContainmentEList<Script>(Script.class, this, MtcPackage.CONFIGURATION__SCRIPTS);
		}
		return scripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelEnvironment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<ModelEnvironment>(ModelEnvironment.class, this, MtcPackage.CONFIGURATION__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MtcPackage.CONFIGURATION__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case MtcPackage.CONFIGURATION__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case MtcPackage.CONFIGURATION__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case MtcPackage.CONFIGURATION__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
			case MtcPackage.CONFIGURATION__ENVIRONMENTS:
				return ((InternalEList<?>)getEnvironments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.CONFIGURATION__NAME:
				return getName();
			case MtcPackage.CONFIGURATION__VARIABLES:
				return getVariables();
			case MtcPackage.CONFIGURATION__TAGS:
				return getTags();
			case MtcPackage.CONFIGURATION__LIBRARIES:
				return getLibraries();
			case MtcPackage.CONFIGURATION__SCRIPTS:
				return getScripts();
			case MtcPackage.CONFIGURATION__ENVIRONMENTS:
				return getEnvironments();
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
			case MtcPackage.CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case MtcPackage.CONFIGURATION__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case MtcPackage.CONFIGURATION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case MtcPackage.CONFIGURATION__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case MtcPackage.CONFIGURATION__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends Script>)newValue);
				return;
			case MtcPackage.CONFIGURATION__ENVIRONMENTS:
				getEnvironments().clear();
				getEnvironments().addAll((Collection<? extends ModelEnvironment>)newValue);
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
			case MtcPackage.CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MtcPackage.CONFIGURATION__VARIABLES:
				getVariables().clear();
				return;
			case MtcPackage.CONFIGURATION__TAGS:
				getTags().clear();
				return;
			case MtcPackage.CONFIGURATION__LIBRARIES:
				getLibraries().clear();
				return;
			case MtcPackage.CONFIGURATION__SCRIPTS:
				getScripts().clear();
				return;
			case MtcPackage.CONFIGURATION__ENVIRONMENTS:
				getEnvironments().clear();
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
			case MtcPackage.CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MtcPackage.CONFIGURATION__VARIABLES:
				return variables != null && !variables.isEmpty();
			case MtcPackage.CONFIGURATION__TAGS:
				return tags != null && !tags.isEmpty();
			case MtcPackage.CONFIGURATION__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case MtcPackage.CONFIGURATION__SCRIPTS:
				return scripts != null && !scripts.isEmpty();
			case MtcPackage.CONFIGURATION__ENVIRONMENTS:
				return environments != null && !environments.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
