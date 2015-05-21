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
package com.mtcflow.project.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class ProjectInfoPage extends WizardPage {

	/**
	 * Create the wizard.
	 */
	public ProjectInfoPage() {
		super("wizardPage");
		setTitle("MTC Project configuration");
		setDescription("Configure MTC parameters");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(1, false));

		Group grpBasicInformation = new Group(container, SWT.NONE);
		grpBasicInformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpBasicInformation.setText("Basic Information");
		grpBasicInformation.setLayout(new GridLayout(2, false));

		Label lblNewLabel = new Label(grpBasicInformation, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("MTC Type:");

		Combo combo = new Combo(grpBasicInformation, SWT.READ_ONLY);
		combo.setItems(new String[] { "Simple", "Compound" });
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblMmTechnology = new Label(grpBasicInformation, SWT.NONE);
		lblMmTechnology.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMmTechnology.setText("M2M Technology:");

		Combo combo_2 = new Combo(grpBasicInformation, SWT.READ_ONLY);
		combo_2.setItems(new String[] { "ATL - ATLAS Transformation Language", "ETL - Epsilon Transformation Language", "QVTO - QVT Operational" });
		combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblMtTechnology = new Label(grpBasicInformation, SWT.NONE);
		lblMtTechnology.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMtTechnology.setText("M2T Technology:");

		Combo combo_3 = new Combo(grpBasicInformation, SWT.READ_ONLY);
		combo_3.setItems(new String[] { "Acceleo", "EGL - Epsilon Generation Language" });
		combo_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblMtcOutput = new Label(grpBasicInformation, SWT.NONE);
		lblMtcOutput.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMtcOutput.setText("MTC Output Type:");

		Combo combo_1 = new Combo(grpBasicInformation, SWT.READ_ONLY);
		combo_1.setItems(new String[] { "Java Code", "Aspects", "Other" });
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblDescription = new Label(grpBasicInformation, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescription.setText("Description:");

		StyledText styledText = new StyledText(grpBasicInformation, SWT.BORDER);
		GridData gd_styledText = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_styledText.heightHint = 42;
		styledText.setLayoutData(gd_styledText);

		Composite composite_2 = new Composite(container, SWT.NONE);
		GridData gd_composite_2 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite_2.heightHint = 77;
		composite_2.setLayoutData(gd_composite_2);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));

		Group grpEcoreMetamodelsUtils = new Group(composite_2, SWT.NONE);
		grpEcoreMetamodelsUtils.setText("ECORE Metamodel Utils");

		Button btnAutoregisterMetamodels = new Button(grpEcoreMetamodelsUtils, SWT.CHECK);
		btnAutoregisterMetamodels.setSelection(true);
		btnAutoregisterMetamodels.setBounds(10, 10, 206, 18);
		btnAutoregisterMetamodels.setText("Autoregister Metamodels");

		Button btnValidateMetamodelsAutomatticlly = new Button(grpEcoreMetamodelsUtils, SWT.CHECK);
		btnValidateMetamodelsAutomatticlly.setSelection(true);
		btnValidateMetamodelsAutomatticlly.setBounds(10, 34, 242, 18);
		btnValidateMetamodelsAutomatticlly.setText("Validate Metamodels On-Save");

		Group grpUmlUtils = new Group(composite_2, SWT.NONE);
		grpUmlUtils.setText("UML Utils");
		grpUmlUtils.setLayout(new GridLayout(1, false));

		Button btnGenerateEpackageFor = new Button(grpUmlUtils, SWT.CHECK);
		btnGenerateEpackageFor.setSelection(true);
		btnGenerateEpackageFor.setText("Generate EPackage for Profiles");

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		Group grpFf = new Group(composite, SWT.NONE);
		grpFf.setText("Model To Model (M2M) Technologies");
		grpFf.setLayout(new GridLayout(1, false));

		Button btnEnableAtl_1 = new Button(grpFf, SWT.BORDER | SWT.CHECK);
		btnEnableAtl_1.setSelection(true);
		btnEnableAtl_1.setText("Enable ATL");

		Button btnEanableQvt = new Button(grpFf, SWT.CHECK);
		btnEanableQvt.setSelection(true);
		btnEanableQvt.setText("Enable QVT");

		Button btnEnableEtl_1 = new Button(grpFf, SWT.CHECK);
		btnEnableEtl_1.setSelection(true);
		btnEnableEtl_1.setText("Enable ETL");

		Group grpModelToText = new Group(composite, SWT.NONE);
		grpModelToText.setText("Model To Text (M2T) Technologies");
		grpModelToText.setLayout(new GridLayout(1, false));

		Button btnEnableAcceleo = new Button(grpModelToText, SWT.CHECK);
		btnEnableAcceleo.setSelection(true);
		btnEnableAcceleo.setText("Enable Acceleo");

		Button btnEnableEgl = new Button(grpModelToText, SWT.CHECK);
		btnEnableEgl.setSelection(true);
		btnEnableEgl.setText("Enable EGL");

		Button btnXpand = new Button(grpModelToText, SWT.CHECK);
		btnXpand.setSelection(true);
		btnXpand.setText("Enable XPand (Not Implemented)");

		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		Group grpModelValidationTechnology = new Group(composite_1, SWT.NONE);
		grpModelValidationTechnology.setText("Model Validation Technologies");
		grpModelValidationTechnology.setLayout(new GridLayout(1, false));

		Button btnEnable = new Button(grpModelValidationTechnology, SWT.CHECK);
		btnEnable.setSelection(true);
		btnEnable.setText("Enable EVL");

		Group grpMjj = new Group(composite_1, SWT.NONE);
		grpMjj.setText("Model Merging Technologies");
		grpMjj.setLayout(new GridLayout(1, false));

		Button btnEnable_1 = new Button(grpMjj, SWT.CHECK);
		btnEnable_1.setSelection(true);
		btnEnable_1.setText("Enable EML");

		Group grpPrueba = new Group(container, SWT.NONE);
		grpPrueba.setLayout(new GridLayout(1, false));
		GridData gd_grpPrueba = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_grpPrueba.heightHint = 62;
		grpPrueba.setLayoutData(gd_grpPrueba);
		grpPrueba.setText("Programmatically Model Transformation Technologies");

		Button btnEnableEol = new Button(grpPrueba, SWT.CHECK);
		btnEnableEol.setSelection(true);
		btnEnableEol.setText("Enable EOL");
	}
}
