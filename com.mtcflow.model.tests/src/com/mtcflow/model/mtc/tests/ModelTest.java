/*******************************************************************************
 * Copyright (c) 2013 Camilo Alvarez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Camilo Alvarez (cadorca@gmail.com)  - initial API and implementation
 ******************************************************************************/
/**
 */
package com.mtcflow.model.mtc.tests;

import junit.textui.TestRunner;

import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.mtcflow.model.mtc.Model#getMainMetamodel() <em>Get Main Metamodel</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ModelTest extends MTCResourceTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ModelTest.class);
  }

  /**
   * Constructs a new Model test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Model getFixture()
  {
    return (Model)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(MtcFactory.eINSTANCE.createModel());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

  /**
   * Tests the '{@link com.mtcflow.model.mtc.Model#getMainMetamodel() <em>Get Main Metamodel</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mtcflow.model.mtc.Model#getMainMetamodel()
   * @generated
   */
  public void testGetMainMetamodel()
  {
    // TODO: implement this operation test method
    // Ensure that you remove @generated or mark it @generated NOT
    fail();
  }

} //ModelTest
