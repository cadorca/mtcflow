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
package com.mtcflow.project.wizard;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import com.mtcflow.project.ui.ProjectInfoPage;
import com.mtcflow.project.util.MTCProjectSupport;

public class NewMTCProjectWizard extends Wizard implements INewWizard {

	private ProjectInfoPage pinfo;
	private WizardNewProjectCreationPage basicPInfo;
	private boolean canFinish = true;

	public NewMTCProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canFinish() {
		// TODO Auto-generated method stub
		return super.canFinish();
	}

	@Override
	public boolean performFinish() {
		// Print the result to the console
		// System.out.println(pinfo.getText1());
		canFinish =false;
		getContainer().updateButtons();

		URI location = null;
		if (!basicPInfo.useDefaults()) {
			location = basicPInfo.getLocationURI();
		} // else location == null
		basicPInfo.setPageComplete(true);
		IWorkbench workbench = PlatformUI.getWorkbench();
		IProject project = MTCProjectSupport.createProject(basicPInfo.getProjectName(), location);
		
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		final IWorkbenchPart activePart = page.getActivePart();
		IFile diagramFile  = project.getFile("mtcs/default.mtcd");
		if (activePart instanceof ISetSelectionTarget) {
			final ISelection targetSelection = new StructuredSelection(diagramFile);
			getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					((ISetSelectionTarget) activePart).selectReveal(targetSelection);
				}
			});
		}

		// Open an editor on the new file.
		//

		try {
			page.openEditor(new FileEditorInput(diagramFile), workbench.getEditorRegistry().getDefaultEditor(diagramFile.getFullPath().toString()).getId());
		} catch (PartInitException exception) {
		//	MessageDialog.openError(workbenchWindow.getShell(), TransformationEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
			return true;
		}
		 
		canFinish =true;
		getContainer().updateButtons();
		
		return true;
	}

	@Override
	public void addPages() {
		pinfo = new ProjectInfoPage();
		basicPInfo = new WizardNewProjectCreationPage("MTC Project");
		basicPInfo.setTitle("New MTC Project");
		basicPInfo.setDescription("Create a new Model Transformation Chain (MTC) from scratch.");
		pinfo = new ProjectInfoPage();
		addPage(basicPInfo);
		// addPage(pinfo);
	}

}
