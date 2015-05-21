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
package com.mtcflow.engine.core.validation;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;

import com.mtcflow.engine.validation.IValidationMessage.MessageType;
import com.mtcflow.engine.validation.IValidationResult;
import com.mtcflow.engine.validation.ValidationExecutor;
import com.mtcflow.engine.validation.ValidationResult;

public class ConformanceValidationExecutor extends ValidationExecutor {

	@Override
	public IValidationResult execute() {
		Resource res = executionEnvironment.getResourceSet().getResource(locator.getEMFURI(model), true);
		EObject obj = res.getContents().get(0);

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(obj);
		final List<Diagnostic> diags = diagnostic.getChildren();
		ValidationResult vr = new ValidationResult();
		vr.setSuccess(diagnostic.getSeverity() == Diagnostic.OK);
		for (Diagnostic diag : diags) {
			vr.addMessage(diag.getMessage(), getType(diag));
		}
		return vr;
	}

	public MessageType getType(Diagnostic diag) {
		if (diag.getSeverity() == Diagnostic.OK) {
			return MessageType.OK;
		} else if (diag.getSeverity() == Diagnostic.CANCEL) {
			return MessageType.CANCEL;
		} else if (diag.getSeverity() == Diagnostic.ERROR) {
			return MessageType.ERROR;
		} else if (diag.getSeverity() == Diagnostic.INFO) {
			return MessageType.INFO;
		} else if (diag.getSeverity() == Diagnostic.WARNING) {
			return MessageType.WARNING;
		}
		return MessageType.OTHER;
	}

}
