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
package com.mtcflow.project.ui.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import com.mtcflow.engine.eclipse.MTCEclipseUtils;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Transformation;

public class StartFromTransformationMenu extends ContributionItem {

	public StartFromTransformationMenu() {
	}

	public StartFromTransformationMenu(String id) {
		super(id);
	}

	@Override
	public boolean isDynamic() {
		return true;
	}

	@Override
	public void fill(Menu menu, int index) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window.getActivePage().getSelection();
		Object selectedResource = selection.getFirstElement();
		if(!(selectedResource instanceof IResource)){
			return;
		}
		final IResource resource = (IResource) selectedResource;

		MTC mtc = MTCEclipseUtils.loadModel(resource);
		EList<Transformation> tList = mtc.getTransformations();
		ArrayList<Transformation> transformations = new ArrayList<Transformation>(tList);
		Collections.sort(transformations, new Comparator<Transformation>() {
			@Override
			public int compare(Transformation t1, Transformation t2) {
				return t2.getName().compareTo(t1.getName());
			}
		});
		for (final Transformation transformation : transformations) {
			MenuItem menuItem = new MenuItem(menu, SWT.CHECK, index);
			menuItem.setText(transformation.getName() + " (" + transformation.eClass().getName() + ")");
			menuItem.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					MTCEclipseUtils.startMTC(resource, transformation.getName(), null, null);
				}
			});

		}

	}

	IResource extractResource(IEditorPart editor) {
		IEditorInput input = editor.getEditorInput();
		if (!(input instanceof IFileEditorInput))
			return null;
		return ((IFileEditorInput) input).getFile();
	}

}
