/**
 */
package com.mtcflow.model.mtc.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HO Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.impl.HOTransformationImpl#getOutputTransformations <em>Output Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HOTransformationImpl extends M2TTransformationImpl implements HOTransformation {
	/**
	 * The cached value of the '{@link #getOutputTransformations() <em>Output Transformations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> outputTransformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HOTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtcPackage.Literals.HO_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getOutputTransformations() {
		if (outputTransformations == null) {
			outputTransformations = new EObjectResolvingEList<Transformation>(Transformation.class, this, MtcPackage.HO_TRANSFORMATION__OUTPUT_TRANSFORMATIONS);
		}
		return outputTransformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtcPackage.HO_TRANSFORMATION__OUTPUT_TRANSFORMATIONS:
				return getOutputTransformations();
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
			case MtcPackage.HO_TRANSFORMATION__OUTPUT_TRANSFORMATIONS:
				getOutputTransformations().clear();
				getOutputTransformations().addAll((Collection<? extends Transformation>)newValue);
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
			case MtcPackage.HO_TRANSFORMATION__OUTPUT_TRANSFORMATIONS:
				getOutputTransformations().clear();
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
			case MtcPackage.HO_TRANSFORMATION__OUTPUT_TRANSFORMATIONS:
				return outputTransformations != null && !outputTransformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HOTransformationImpl
