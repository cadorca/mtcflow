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
package com.mtcflow.engine.validation;

import java.util.ArrayList;
import java.util.List;

import com.mtcflow.engine.validation.IValidationMessage.MessageType;

public class ValidationResult implements IValidationResult {

	protected boolean success = true;
	protected ArrayList<IValidationMessage> messages = new ArrayList<IValidationMessage>();

	public ValidationResult() {

	}

	public ValidationResult(boolean success) {
		this.success = success;
	}

	public ValidationResult(boolean success, ArrayList<IValidationMessage> messages) {
		this.success = success;
		this.messages = messages;
	}

	@Override
	public boolean isSuccess() {
		return success;
	}

	@Override
	public List<IValidationMessage> getMessages() {
		return messages;
	}

	public void addMessage(String message, MessageType type) {
		ValidationMessage vm = new ValidationMessage(message, type);
		messages.add(vm);
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setMessages(ArrayList<IValidationMessage> messages) {
		this.messages = messages;
	}

	@Override
	public String getMessage() {
		StringBuilder builder = new StringBuilder();
		for (IValidationMessage msg : messages) {
			builder.append(msg.getMessage()).append("\n");
		}
		return builder.toString();
	}

}
