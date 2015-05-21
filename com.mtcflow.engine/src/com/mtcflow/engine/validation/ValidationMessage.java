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

public class ValidationMessage implements IValidationMessage {

	protected String message;
	protected MessageType messageType;

	public ValidationMessage() {
	}

	public ValidationMessage(String message, MessageType messageType) {
		super();
		this.message = message;
		this.messageType = messageType;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}

}
