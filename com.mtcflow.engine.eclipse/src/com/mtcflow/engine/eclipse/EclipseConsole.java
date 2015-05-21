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
package com.mtcflow.engine.eclipse;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import com.mtcflow.engine.IMTCConsole;

public class EclipseConsole implements IMTCConsole {

	public final static org.eclipse.swt.graphics.Color ERROR_COLOR = new org.eclipse.swt.graphics.Color(null, 255, 0, 0);
	public final static org.eclipse.swt.graphics.Color INTERNAL_COLOR = new org.eclipse.swt.graphics.Color(null, 84, 84, 84);
	public final static org.eclipse.swt.graphics.Color INFO_COLOR = new org.eclipse.swt.graphics.Color(null, 0, 0, 255);

	MessageConsole console;

	public EclipseConsole(MessageConsole console) {
		this.console = console;
	}

	@Override
	public PrintStream getPrintStream() {
		final MessageConsoleStream ist = console.newMessageStream();

		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				ist.setColor(INTERNAL_COLOR);
			}
		});

		return new PrintStream(ist);

	}

	@Override
	public void println(final String message) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				MessageConsoleStream st = console.newMessageStream();
				st.setColor(INFO_COLOR);
				st.println(message);
			}
		});

	}

	@Override
	public void print(final String message) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				MessageConsoleStream st = console.newMessageStream();
				st.setColor(INFO_COLOR);
				st.print(message);
			}
		});
	}

	@Override
	public void clear() {
		console.clearConsole();
	}

	@Override
	public void printError(final String message) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				MessageConsoleStream st = console.newMessageStream();
				st.setColor(ERROR_COLOR);
				st.println(message);
			}
		});
	}

	@Override
	public void logException(final String message, final Throwable t) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				MessageConsoleStream st = console.newMessageStream();
				st.setColor(ERROR_COLOR);
				if (message != null) {
					st.println(message);
				}
				StringWriter sw = new StringWriter();
				PrintWriter pw = new PrintWriter(sw, true);
				t.printStackTrace(pw);
				printError(sw.getBuffer().toString());
			}
		});
	}

}
