/**
 */
package com.mtcflow.model.mtc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.mtcflow.model.mtc.InputModel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Transformation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Input Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.InputModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.InputModelImpl#getModelAlias <em>Model Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.InputModelImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.InputModelImpl#getMetamodelAlias <em>Metamodel Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.InputModelImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputModelImpl extends ConfigurableImpl implements InputModel {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The default value of the '{@link #getModelAlias() <em>Model Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModelAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ALIAS_EDEFAULT = "IN";

	/**
	 * The cached value of the '{@link #getModelAlias() <em>Model Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModelAlias()
	 * @generated
	 * @ordered
	 */
	protected String modelAlias = MODEL_ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation transformation;

	/**
	 * The default value of the '{@link #getMetamodelAlias() <em>Metamodel Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMetamodelAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelAlias() <em>Metamodel Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMetamodelAlias()
	 * @generated
	 * @ordered
	 */
	protected String metamodelAlias = METAMODEL_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InputModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.INPUT_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.INPUT_MODEL__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.INPUT_MODEL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelAlias() {
		return modelAlias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelAlias(String newModelAlias) {
		String oldModelAlias = modelAlias;
		modelAlias = newModelAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.INPUT_MODEL__MODEL_ALIAS, oldModelAlias, modelAlias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (Transformation)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.INPUT_MODEL__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		Transformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.INPUT_MODEL__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getMetamodelAlias() {
		if (metamodelAlias == null || metamodelAlias.isEmpty()) {
			return getModel().getMainMetamodel().getAlias();
		} else {
			return metamodelAlias;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelAlias(String newMetamodelAlias) {
		String oldMetamodelAlias = metamodelAlias;
		metamodelAlias = newMetamodelAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.INPUT_MODEL__METAMODEL_ALIAS, oldMetamodelAlias, metamodelAlias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Integer newIndex) {
		Integer oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.INPUT_MODEL__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.INPUT_MODEL__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case MtcPackage.INPUT_MODEL__MODEL_ALIAS:
				return getModelAlias();
			case MtcPackage.INPUT_MODEL__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case MtcPackage.INPUT_MODEL__METAMODEL_ALIAS:
				return getMetamodelAlias();
			case MtcPackage.INPUT_MODEL__INDEX:
				return getIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MtcPackage.INPUT_MODEL__MODEL:
				setModel((Model)newValue);
				return;
			case MtcPackage.INPUT_MODEL__MODEL_ALIAS:
				setModelAlias((String)newValue);
				return;
			case MtcPackage.INPUT_MODEL__TRANSFORMATION:
				setTransformation((Transformation)newValue);
				return;
			case MtcPackage.INPUT_MODEL__METAMODEL_ALIAS:
				setMetamodelAlias((String)newValue);
				return;
			case MtcPackage.INPUT_MODEL__INDEX:
				setIndex((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MtcPackage.INPUT_MODEL__MODEL:
				setModel((Model)null);
				return;
			case MtcPackage.INPUT_MODEL__MODEL_ALIAS:
				setModelAlias(MODEL_ALIAS_EDEFAULT);
				return;
			case MtcPackage.INPUT_MODEL__TRANSFORMATION:
				setTransformation((Transformation)null);
				return;
			case MtcPackage.INPUT_MODEL__METAMODEL_ALIAS:
				setMetamodelAlias(METAMODEL_ALIAS_EDEFAULT);
				return;
			case MtcPackage.INPUT_MODEL__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MtcPackage.INPUT_MODEL__MODEL:
				return model != null;
			case MtcPackage.INPUT_MODEL__MODEL_ALIAS:
				return MODEL_ALIAS_EDEFAULT == null ? modelAlias != null : !MODEL_ALIAS_EDEFAULT.equals(modelAlias);
			case MtcPackage.INPUT_MODEL__TRANSFORMATION:
				return transformation != null;
			case MtcPackage.INPUT_MODEL__METAMODEL_ALIAS:
				return METAMODEL_ALIAS_EDEFAULT == null ? metamodelAlias != null : !METAMODEL_ALIAS_EDEFAULT.equals(metamodelAlias);
			case MtcPackage.INPUT_MODEL__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} // InputModelImpl
