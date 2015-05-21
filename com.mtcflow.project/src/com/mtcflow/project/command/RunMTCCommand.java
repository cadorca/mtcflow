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
package com.mtcflow.project.command;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.mtcflow.engine.eclipse.MTCEclipseUtils;
import com.mtcflow.model.mtc.MTC;

public class RunMTCCommand implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException { 
		String tags = null; 
		if (event.getCommand().getId().equals("mtc.transformation.run.tags.command")) {
			InputDialog dlg = new InputDialog(Display.getCurrent().getActiveShell(), "Tags", "Insert the tags names splited by comma.", "", new IInputValidator() {

				@Override
				public String isValid(String newText) {
					return null;
				}
			});
			if (dlg.open() == Window.OK) {
				tags = dlg.getValue();
			}
		}
		if (tags != null && tags.isEmpty()) {
			tags = null;
		}
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		if (window == null)
			return null;
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		IResource resource=null;
		resource = (IResource) selection.getFirstElement();
		ArrayList<String> tagList = new ArrayList<String>();
		if (tags != null) {
			String[] tagsList = tags.split(",");
			for (String tag : tagsList) {
				tagList.add(tag);
			}
		}
		MTC mtc = MTCEclipseUtils.startMTC(resource, null, null, tagList).getMtc();
		System.out.println(mtc.getName());
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
