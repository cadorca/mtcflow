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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import com.mtcflow.engine.eclipse.MTCEclipseUtils;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Model;

public class StartFromModelMenu extends ContributionItem {

	public StartFromModelMenu() {
	}

	public StartFromModelMenu(String id) {
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
		EList<Model> tList = mtc.getModels();
		ArrayList<Model> models = new ArrayList<Model>(tList);
		Collections.sort(models, new Comparator<Model>() {
			@Override
			public int compare(Model t1, Model t2) {
				return t2.getName().compareTo(t1.getName());
			}
		});
		for (final Model model : models) {
			MenuItem menuItem = new MenuItem(menu, SWT.CHECK, index);
			// todo:
			menuItem.setText(model.getName());
			menuItem.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					ArrayList<String> models = new ArrayList<String>();
					models.add(model.getName());
					MTCEclipseUtils.startMTC(resource, null, models, null);
				}
			});

		}

	}

}
