/**
 */
package com.mtcflow.model.mtc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.Metamodel#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Metamodel#isAutoregister <em>Autoregister</em>}</li>
 *   <li>{@link com.mtcflow.model.mtc.Metamodel#getMetamodelURI <em>Metamodel URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mtcflow.model.mtc.MtcPackage#getMetamodel()
 * @model annotation="gmf.node label.icon='false' label='name' figure='polygon' polygon.x='0 0 10 10 8 8 10 8 0' polygon.y='0 10 10 2 2 0 2 0 0' border.color='88,88,88' tool.small.path='icons/metamodel.png' size='83,105'"
 * @generated
 */
public interface Metamodel extends MTCResource {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMetamodel_Alias()
	 * @model required="true"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Metamodel#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Autoregister</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoregister</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoregister</em>' attribute.
	 * @see #setAutoregister(boolean)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMetamodel_Autoregister()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAutoregister();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Metamodel#isAutoregister <em>Autoregister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoregister</em>' attribute.
	 * @see #isAutoregister()
	 * @generated
	 */
	void setAutoregister(boolean value);

	/**
	 * Returns the value of the '<em><b>Metamodel URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel URI</em>' attribute.
	 * @see #setMetamodelURI(String)
	 * @see com.mtcflow.model.mtc.MtcPackage#getMetamodel_MetamodelURI()
	 * @model
	 * @generated
	 */
	String getMetamodelURI();

	/**
	 * Sets the value of the '{@link com.mtcflow.model.mtc.Metamodel#getMetamodelURI <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel URI</em>' attribute.
	 * @see #getMetamodelURI()
	 * @generated
	 */
	void setMetamodelURI(String value);

} // Metamodel
