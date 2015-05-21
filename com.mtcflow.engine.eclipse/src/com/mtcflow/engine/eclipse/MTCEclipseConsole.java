package com.mtcflow.engine.eclipse;

import java.io.PrintStream;

import com.mtcflow.engine.ExecutionListener;
import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Transformation;

public class MTCEclipseConsole extends ExecutionListener {

	private PrintStream originalOut;

	public MTCEclipseConsole() {
		originalOut = System.out;
	}

	@Override
	public void beforeExecuteTransformation(MTC mtc, String modelPath, Transformation transformation, IExecutionEnvironment executionEnvironment) {
		System.setOut(executionEnvironment.getConsole().getPrintStream());
	}

	@Override
	public void afterExecuteTransformation(MTC mtc, String modelPath, Transformation transformation, IExecutionEnvironment executionEnvironment) {
		System.setOut(originalOut);
	}

}
