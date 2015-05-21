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

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>mtc</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtcTests extends TestSuite
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(suite());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Test suite()
  {
    TestSuite suite = new MtcTests("mtc Tests");
    suite.addTestSuite(MetamodelTest.class);
    suite.addTestSuite(ReferencedResourceTest.class);
    suite.addTestSuite(FileTest.class);
    suite.addTestSuite(ModelTest.class);
    suite.addTestSuite(ValidationTest.class);
    suite.addTestSuite(HOTransformationTest.class);
    suite.addTestSuite(M2MTransformationTest.class);
    suite.addTestSuite(M2TTransformationTest.class);
    suite.addTestSuite(MTCTransformationTest.class);
    suite.addTestSuite(T2MTransformationTest.class);
    suite.addTestSuite(InputModelTest.class);
    suite.addTestSuite(OutputModelTest.class);
    suite.addTestSuite(LibraryTest.class);
    suite.addTestSuite(ScriptTest.class);
    return suite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MtcTests(String name)
  {
    super(name);
  }

} //MtcTests
