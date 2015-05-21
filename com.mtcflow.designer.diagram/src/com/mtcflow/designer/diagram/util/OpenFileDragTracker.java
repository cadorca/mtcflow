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
package com.mtcflow.designer.diagram.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.wizards.IWizardDescriptor;

import com.mtcflow.engine.eclipse.EclipseResourceLocator;
import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCResource;

public class OpenFileDragTracker extends DragEditPartsTrackerEx {

	private final EObject bObject;
	private EclipseResourceLocator locator;
	private final IProject project;
	private final MTC mtc;

	public OpenFileDragTracker(EditPart owner, EObject bObject) {
		super(owner);
		this.bObject = bObject;
		IWorkbench iworkbench = PlatformUI.getWorkbench();
		IWorkbenchWindow iworkbenchwindow = iworkbench.getActiveWorkbenchWindow();
		IWorkbenchPage iworkbenchpage = iworkbenchwindow.getActivePage();
		IEditorPart ieditorpart = iworkbenchpage.getActiveEditor();
		IResource resource = extractResource(ieditorpart);
		project = resource.getProject();
		// Get the MTC
		mtc = (MTC) ((MTCResource) bObject).eContainer();
	}

	@Override
	public void mouseDoubleClick(MouseEvent me, EditPartViewer viewer) {
		if (locator == null) {
			locator = new EclipseResourceLocator(project, mtc);
		}
		// MTCChore
		final MTCResource resource = (MTCResource) bObject;
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IFile file = null;
		String path = locator.getPath(resource);
		if (path.endsWith(".ecore")) {
			IFile diagramFile = project.getFile(locator.getPath(resource).replaceAll("[.]ecore", ".ecorediag").replaceAll("/" + project.getName() + "/", ""));
			if (diagramFile.exists()) {
				file = diagramFile;
			} else {
				diagramFile = project.getFile(locator.getPath(resource).replaceAll("[.]ecore", ".ecore_diagram").replaceAll("/" + project.getName() + "/", ""));
				if (diagramFile.exists()) {
					file = diagramFile;
				} else {
					file = locator.getResourceSourceAs(IFile.class, resource);
				}
			}
		}
		if (path.endsWith(".mtc")) {
			IFile diagramFile = project.getFile(locator.getPath(resource).replaceAll("[.]mtc", ".mtcdiag").replaceAll("/" + project.getName() + "/", ""));
			if (diagramFile.exists()) {
				file = diagramFile;
			}
		} else {
			file = locator.getResourceSourceAs(IFile.class, resource);
		}
		if (file.exists()) {
			try {
				IEditorDescriptor desc = null;
				if (file.getContentDescription() != null) {
					desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName(), file.getContentDescription().getContentType());
				} else {
					desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
				}
				page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			boolean result = MessageDialog.openConfirm(null, "Confirm", "The " + resource.eClass().getName() + " " + resource.getName() + " at /" + file.getProjectRelativePath() + " doesnt exists.\n Would you like to create it?");

			if (result) {
				IStructuredSelection selection = new IStructuredSelection() {

					@Override
					public boolean isEmpty() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public List toList() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public Object[] toArray() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public int size() {
						// TODO Auto-generated method stub
						return 1;
					}

					@Override
					public Iterator iterator() {
						// TODO Auto-generated method stub
						return new Iterator() {
							boolean next = true;

							@Override
							public boolean hasNext() {
								return next;
							}

							@Override
							public void remove() {

							}

							@Override
							public Object next() {
								next = false;
								return locator.getResourceSourceAs(IFile.class, resource).getParent();
							}
						};
					}

					@Override
					public Object getFirstElement() {
						return locator.getResourceSourceAs(IFile.class, resource).getParent();
					}
				};
				// OK Button selected do something
				if (resource instanceof M2MTransformation) {
					IWizardDescriptor category = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard("atlFileWizard");
					try {
						IWorkbenchWizard wiz = category.createWizard();
						wiz.init(PlatformUI.getWorkbench(), selection);
						WizardDialog wd = new WizardDialog(null, wiz);
						wd.setTitle(wiz.getWindowTitle());
						wd.open();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (resource instanceof M2TTransformation) {
					IWizardDescriptor category = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard("org.eclipse.acceleo.ide.ui.wizards.newfile.AcceleoModuleWizard");
					try {
						IWorkbenchWizard wiz = category.createWizard();
						wiz.init(PlatformUI.getWorkbench(), selection);
						WizardDialog wd = new WizardDialog(null, wiz);
						wd.setTitle(wiz.getWindowTitle());
						wd.open();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} else {
				// Cancel Button selected do something
			}
		}

		super.mouseDoubleClick(me, viewer);
	}

	IResource extractResource(IEditorPart editor) {
		IEditorInput input = editor.getEditorInput();
		if (!(input instanceof IFileEditorInput))
			return null;
		return ((IFileEditorInput) input).getFile();
	}
}
