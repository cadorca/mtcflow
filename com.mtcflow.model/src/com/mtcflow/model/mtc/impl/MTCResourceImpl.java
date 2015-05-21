/**
 */
package com.mtcflow.model.mtc.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.ReferencedResource;
import com.mtcflow.model.mtc.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTC Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.MTCResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.MTCResourceImpl#getURI <em>URI</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.MTCResourceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.MTCResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.MTCResourceImpl#getReferencedResources <em>Referenced Resources</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.MTCResourceImpl#getExecutionInformation <em>Execution Information</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.MTCResourceImpl#getTechnology <em>Technology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MTCResourceImpl extends ConfigurableImpl implements MTCResource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedResources() <em>Referenced Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferencedResource> referencedResources;

	/**
	 * The cached value of the '{@link #getExecutionInformation() <em>Execution Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionInformation()
	 * @generated
	 * @ordered
	 */
	protected Map<Object, Object> executionInformation;

	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTCResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.MTC_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC_RESOURCE__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, MtcPackage.MTC_RESOURCE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC_RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferencedResource> getReferencedResources() {
		if (referencedResources == null) {
			referencedResources = new EObjectResolvingEList<ReferencedResource>(ReferencedResource.class, this, MtcPackage.MTC_RESOURCE__REFERENCED_RESOURCES);
		}
		return referencedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Object, Object> getExecutionInformation() {
		return executionInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionInformation(Map<Object, Object> newExecutionInformation) {
		Map<Object, Object> oldExecutionInformation = executionInformation;
		executionInformation = newExecutionInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC_RESOURCE__EXECUTION_INFORMATION, oldExecutionInformation, executionInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.MTC_RESOURCE__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inWorkspace() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.MTC_RESOURCE__NAME:
				return getName();
			case MtcPackage.MTC_RESOURCE__URI:
				return getURI();
			case MtcPackage.MTC_RESOURCE__TAGS:
				return getTags();
			case MtcPackage.MTC_RESOURCE__DESCRIPTION:
				return getDescription();
			case MtcPackage.MTC_RESOURCE__REFERENCED_RESOURCES:
				return getReferencedResources();
			case MtcPackage.MTC_RESOURCE__EXECUTION_INFORMATION:
				return getExecutionInformation();
			case MtcPackage.MTC_RESOURCE__TECHNOLOGY:
				return getTechnology();
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
			case MtcPackage.MTC_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case MtcPackage.MTC_RESOURCE__URI:
				setURI((String)newValue);
				return;
			case MtcPackage.MTC_RESOURCE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case MtcPackage.MTC_RESOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MtcPackage.MTC_RESOURCE__REFERENCED_RESOURCES:
				getReferencedResources().clear();
				getReferencedResources().addAll((Collection<? extends ReferencedResource>)newValue);
				return;
			case MtcPackage.MTC_RESOURCE__EXECUTION_INFORMATION:
				setExecutionInformation((Map<Object, Object>)newValue);
				return;
			case MtcPackage.MTC_RESOURCE__TECHNOLOGY:
				setTechnology((String)newValue);
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
			case MtcPackage.MTC_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MtcPackage.MTC_RESOURCE__URI:
				setURI(URI_EDEFAULT);
				return;
			case MtcPackage.MTC_RESOURCE__TAGS:
				getTags().clear();
				return;
			case MtcPackage.MTC_RESOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MtcPackage.MTC_RESOURCE__REFERENCED_RESOURCES:
				getReferencedResources().clear();
				return;
			case MtcPackage.MTC_RESOURCE__EXECUTION_INFORMATION:
				setExecutionInformation((Map<Object, Object>)null);
				return;
			case MtcPackage.MTC_RESOURCE__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
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
			case MtcPackage.MTC_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MtcPackage.MTC_RESOURCE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case MtcPackage.MTC_RESOURCE__TAGS:
				return tags != null && !tags.isEmpty();
			case MtcPackage.MTC_RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MtcPackage.MTC_RESOURCE__REFERENCED_RESOURCES:
				return referencedResources != null && !referencedResources.isEmpty();
			case MtcPackage.MTC_RESOURCE__EXECUTION_INFORMATION:
				return executionInformation != null;
			case MtcPackage.MTC_RESOURCE__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
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
		result.append(", URI: ");
		result.append(uri);
		result.append(", description: ");
		result.append(description);
		result.append(", executionInformation: ");
		result.append(executionInformation);
		result.append(", technology: ");
		result.append(technology);
		result.append(')');
		return result.toString();
	}

} //MTCResourceImpl
