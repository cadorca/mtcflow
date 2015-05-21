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
package com.mtcflow.engine;

import java.io.PrintStream;

public interface IMTCConsole {

	public PrintStream getPrintStream();

	public void printError(String message);

	public void println(String message);

	public void print(String message);

	public void clear();

	public void logException(String message, Throwable t);
}
