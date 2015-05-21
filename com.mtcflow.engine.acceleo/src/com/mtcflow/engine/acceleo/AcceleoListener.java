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
package com.mtcflow.engine.acceleo;

import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;

import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.model.mtc.Transformation;

public class AcceleoListener implements IAcceleoTextGenerationListener {

	private IMTCConsole console;
	private Transformation transformation;
	private int totalGeneratedFiles = 0;

	public AcceleoListener(Transformation transformation, IMTCConsole console) {
		this.console = console;
		this.transformation = transformation;
	}

	@Override
	public void textGenerated(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void filePathComputed(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void fileGenerated(AcceleoTextGenerationEvent event) {
		console.println("Transf: " + transformation.getName() + " ---------> Generated File " + event.getText());
		totalGeneratedFiles++;
	}

	@Override
	public void generationEnd(AcceleoTextGenerationEvent event) {
	}

	@Override
	public boolean listensToGenerationEnd() {
		return false;
	}

	public int getTotalGeneratedFiles() {
		return totalGeneratedFiles;
	}

}
