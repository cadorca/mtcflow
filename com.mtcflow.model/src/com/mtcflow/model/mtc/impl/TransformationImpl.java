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

import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Script;
import com.mtcflow.model.mtc.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.TransformationImpl#getImplementationClass <em>Implementation Class</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.TransformationImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.TransformationImpl#getPreExecutionScript <em>Pre Execution Script</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.TransformationImpl#getPostExecutionScript <em>Post Execution Script</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.TransformationImpl#getModelDependencies <em>Model Dependencies</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.TransformationImpl#getFileDependencies <em>File Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransformationImpl extends MTCResourceImpl implements Transformation {
	/**
	 * The default value of the '{@link #getImplementationClass() <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationClass() <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected String implementationClass = IMPLEMENTATION_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getPreExecutionScript() <em>Pre Execution Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreExecutionScript()
	 * @generated
	 * @ordered
	 */
	protected Script preExecutionScript;

	/**
	 * The cached value of the '{@link #getPostExecutionScript() <em>Post Execution Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostExecutionScript()
	 * @generated
	 * @ordered
	 */
	protected Script postExecutionScript;

	/**
	 * The cached value of the '{@link #getModelDependencies() <em>Model Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> modelDependencies;

	/**
	 * The cached value of the '{@link #getFileDependencies() <em>File Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<File> fileDependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationClass() {
		return implementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationClass(String newImplementationClass) {
		String oldImplementationClass = implementationClass;
		implementationClass = newImplementationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.TRANSFORMATION__IMPLEMENTATION_CLASS, oldImplementationClass, implementationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectResolvingEList<Library>(Library.class, this, MtcPackage.TRANSFORMATION__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getPreExecutionScript() {
		if (preExecutionScript != null && preExecutionScript.eIsProxy()) {
			InternalEObject oldPreExecutionScript = (InternalEObject)preExecutionScript;
			preExecutionScript = (Script)eResolveProxy(oldPreExecutionScript);
			if (preExecutionScript != oldPreExecutionScript) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.TRANSFORMATION__PRE_EXECUTION_SCRIPT, oldPreExecutionScript, preExecutionScript));
			}
		}
		return preExecutionScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script basicGetPreExecutionScript() {
		return preExecutionScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreExecutionScript(Script newPreExecutionScript) {
		Script oldPreExecutionScript = preExecutionScript;
		preExecutionScript = newPreExecutionScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.TRANSFORMATION__PRE_EXECUTION_SCRIPT, oldPreExecutionScript, preExecutionScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getPostExecutionScript() {
		if (postExecutionScript != null && postExecutionScript.eIsProxy()) {
			InternalEObject oldPostExecutionScript = (InternalEObject)postExecutionScript;
			postExecutionScript = (Script)eResolveProxy(oldPostExecutionScript);
			if (postExecutionScript != oldPostExecutionScript) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.TRANSFORMATION__POST_EXECUTION_SCRIPT, oldPostExecutionScript, postExecutionScript));
			}
		}
		return postExecutionScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script basicGetPostExecutionScript() {
		return postExecutionScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostExecutionScript(Script newPostExecutionScript) {
		Script oldPostExecutionScript = postExecutionScript;
		postExecutionScript = newPostExecutionScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.TRANSFORMATION__POST_EXECUTION_SCRIPT, oldPostExecutionScript, postExecutionScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModelDependencies() {
		if (modelDependencies == null) {
			modelDependencies = new EObjectResolvingEList<Model>(Model.class, this, MtcPackage.TRANSFORMATION__MODEL_DEPENDENCIES);
		}
		return modelDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFileDependencies() {
		if (fileDependencies == null) {
			fileDependencies = new EObjectResolvingEList<File>(File.class, this, MtcPackage.TRANSFORMATION__FILE_DEPENDENCIES);
		}
		return fileDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.TRANSFORMATION__IMPLEMENTATION_CLASS:
				return getImplementationClass();
			case MtcPackage.TRANSFORMATION__LIBRARIES:
				return getLibraries();
			case MtcPackage.TRANSFORMATION__PRE_EXECUTION_SCRIPT:
				if (resolve) return getPreExecutionScript();
				return basicGetPreExecutionScript();
			case MtcPackage.TRANSFORMATION__POST_EXECUTION_SCRIPT:
				if (resolve) return getPostExecutionScript();
				return basicGetPostExecutionScript();
			case MtcPackage.TRANSFORMATION__MODEL_DEPENDENCIES:
				return getModelDependencies();
			case MtcPackage.TRANSFORMATION__FILE_DEPENDENCIES:
				return getFileDependencies();
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
			case MtcPackage.TRANSFORMATION__IMPLEMENTATION_CLASS:
				setImplementationClass((String)newValue);
				return;
			case MtcPackage.TRANSFORMATION__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case MtcPackage.TRANSFORMATION__PRE_EXECUTION_SCRIPT:
				setPreExecutionScript((Script)newValue);
				return;
			case MtcPackage.TRANSFORMATION__POST_EXECUTION_SCRIPT:
				setPostExecutionScript((Script)newValue);
				return;
			case MtcPackage.TRANSFORMATION__MODEL_DEPENDENCIES:
				getModelDependencies().clear();
				getModelDependencies().addAll((Collection<? extends Model>)newValue);
				return;
			case MtcPackage.TRANSFORMATION__FILE_DEPENDENCIES:
				getFileDependencies().clear();
				getFileDependencies().addAll((Collection<? extends File>)newValue);
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
			case MtcPackage.TRANSFORMATION__IMPLEMENTATION_CLASS:
				setImplementationClass(IMPLEMENTATION_CLASS_EDEFAULT);
				return;
			case MtcPackage.TRANSFORMATION__LIBRARIES:
				getLibraries().clear();
				return;
			case MtcPackage.TRANSFORMATION__PRE_EXECUTION_SCRIPT:
				setPreExecutionScript((Script)null);
				return;
			case MtcPackage.TRANSFORMATION__POST_EXECUTION_SCRIPT:
				setPostExecutionScript((Script)null);
				return;
			case MtcPackage.TRANSFORMATION__MODEL_DEPENDENCIES:
				getModelDependencies().clear();
				return;
			case MtcPackage.TRANSFORMATION__FILE_DEPENDENCIES:
				getFileDependencies().clear();
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
			case MtcPackage.TRANSFORMATION__IMPLEMENTATION_CLASS:
				return IMPLEMENTATION_CLASS_EDEFAULT == null ? implementationClass != null : !IMPLEMENTATION_CLASS_EDEFAULT.equals(implementationClass);
			case MtcPackage.TRANSFORMATION__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case MtcPackage.TRANSFORMATION__PRE_EXECUTION_SCRIPT:
				return preExecutionScript != null;
			case MtcPackage.TRANSFORMATION__POST_EXECUTION_SCRIPT:
				return postExecutionScript != null;
			case MtcPackage.TRANSFORMATION__MODEL_DEPENDENCIES:
				return modelDependencies != null && !modelDependencies.isEmpty();
			case MtcPackage.TRANSFORMATION__FILE_DEPENDENCIES:
				return fileDependencies != null && !fileDependencies.isEmpty();
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
		result.append(" (implementationClass: ");
		result.append(implementationClass);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
