/**
 */
package com.mtcflow.model.mtc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.ModelProducerTransformation;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.OutputModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.OutputModelImpl#getModelAlias <em>Model Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.OutputModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.OutputModelImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.impl.OutputModelImpl#getMetamodelAlias <em>Metamodel Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputModelImpl extends ConfigurableImpl implements OutputModel {
	/**
	 * The default value of the '{@link #getModelAlias() <em>Model Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ALIAS_EDEFAULT = "OUT";

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
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected ModelProducerTransformation transformation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.OUTPUT_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.OUTPUT_MODEL__MODEL_ALIAS, oldModelAlias, modelAlias));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.OUTPUT_MODEL__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.OUTPUT_MODEL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelProducerTransformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (ModelProducerTransformation)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtcPackage.OUTPUT_MODEL__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelProducerTransformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(ModelProducerTransformation newTransformation) {
		ModelProducerTransformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.OUTPUT_MODEL__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelAlias(String newMetamodelAlias) {
		String oldMetamodelAlias = metamodelAlias;
		metamodelAlias = newMetamodelAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtcPackage.OUTPUT_MODEL__METAMODEL_ALIAS, oldMetamodelAlias, metamodelAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.OUTPUT_MODEL__MODEL_ALIAS:
				return getModelAlias();
			case MtcPackage.OUTPUT_MODEL__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case MtcPackage.OUTPUT_MODEL__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case MtcPackage.OUTPUT_MODEL__METAMODEL_ALIAS:
				return getMetamodelAlias();
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
			case MtcPackage.OUTPUT_MODEL__MODEL_ALIAS:
				setModelAlias((String)newValue);
				return;
			case MtcPackage.OUTPUT_MODEL__MODEL:
				setModel((Model)newValue);
				return;
			case MtcPackage.OUTPUT_MODEL__TRANSFORMATION:
				setTransformation((ModelProducerTransformation)newValue);
				return;
			case MtcPackage.OUTPUT_MODEL__METAMODEL_ALIAS:
				setMetamodelAlias((String)newValue);
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
			case MtcPackage.OUTPUT_MODEL__MODEL_ALIAS:
				setModelAlias(MODEL_ALIAS_EDEFAULT);
				return;
			case MtcPackage.OUTPUT_MODEL__MODEL:
				setModel((Model)null);
				return;
			case MtcPackage.OUTPUT_MODEL__TRANSFORMATION:
				setTransformation((ModelProducerTransformation)null);
				return;
			case MtcPackage.OUTPUT_MODEL__METAMODEL_ALIAS:
				setMetamodelAlias(METAMODEL_ALIAS_EDEFAULT);
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
			case MtcPackage.OUTPUT_MODEL__MODEL_ALIAS:
				return MODEL_ALIAS_EDEFAULT == null ? modelAlias != null : !MODEL_ALIAS_EDEFAULT.equals(modelAlias);
			case MtcPackage.OUTPUT_MODEL__MODEL:
				return model != null;
			case MtcPackage.OUTPUT_MODEL__TRANSFORMATION:
				return transformation != null;
			case MtcPackage.OUTPUT_MODEL__METAMODEL_ALIAS:
				return METAMODEL_ALIAS_EDEFAULT == null ? metamodelAlias != null : !METAMODEL_ALIAS_EDEFAULT.equals(metamodelAlias);
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
		result.append(')');
		return result.toString();
	}

} //OutputModelImpl
