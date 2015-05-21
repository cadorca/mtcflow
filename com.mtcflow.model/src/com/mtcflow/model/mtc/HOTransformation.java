/**
 */
package com.mtcflow.model.mtc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HO Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.HOTransformation#getOutputTransformations <em>Output Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getHOTransformation()
 * @model annotation="gmf.node label.icon='false' label='name' tool.small.path='icons/hot.png' tool.name='HOT - High Order Tranformation' tool.description='Create a new High Order Transformation' size='200,49' border.color='0,0,0'"
 * @generated
 */
public interface HOTransformation extends M2TTransformation, T2MTransformation, M2MTransformation {
	/**
	 * Returns the value of the '<em><b>Output Transformations</b></em>' reference list.
	 * The list contents are of type {@link com.mtcflow.model.mtc.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Transformations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Transformations</em>' reference list.
	 * @see com.mtcflow.model.mtc.MtcPackage#getHOTransformation_OutputTransformations()
	 * @model annotation="gmf.link label='GEN' target.decoration='filledclosedarrow' tool.name='Generated Transformations' width='3' color='77,77,77' style='solid' incoming='true' tool.small.path='icons/link.png'"
	 * @generated
	 */
	EList<Transformation> getOutputTransformations();

} // HOTransformation
