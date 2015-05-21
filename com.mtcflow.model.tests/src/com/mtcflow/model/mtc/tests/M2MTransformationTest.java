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

import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.MtcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>M2M Transformation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class M2MTransformationTest extends ModelProducerTransformationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(M2MTransformationTest.class);
  }

  /**
   * Constructs a new M2M Transformation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public M2MTransformationTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this M2M Transformation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected M2MTransformation getFixture()
  {
    return (M2MTransformation)fixture;
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
    setFixture(MtcFactory.eINSTANCE.createM2MTransformation());
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

} //M2MTransformationTest
