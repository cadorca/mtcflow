package com.mtcflow.engine.mtc;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.mtcflow.engine.ExecutionListener;
import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.model.mtc.File;
import com.mtcflow.model.mtc.OutputFile;
import com.mtcflow.model.mtc.OutputModel;
import com.mtcflow.model.mtc.Transformation;

public class MTCExecutionListener extends ExecutionListener {

	private MTCTransformationExecutor executor;
	private boolean externalMTC = false;

	public MTCExecutionListener(MTCTransformationExecutor executor) {
		this.executor = executor;
	}

	public void modelReady(com.mtcflow.model.mtc.Model model, Transformation transformation, IExecutionEnvironment executionEnvironment) {
		for (OutputModel omodel : executor.getOutputModels()) {
			if (omodel.getModel().getName().equals(model.getName())) {
				if (externalMTC) {
					// Copy to the other environment
					try {
						FileUtils.copyFile(executionEnvironment.getLocator().getFile(model), executionEnvironment.getLocator().getFile(omodel.getModel()));
					} catch (IOException ex) {
						executor.getConsole().logException("Error copying the generated model from the MTC: " + executor.getTransformation().getName(), ex);
					}
				}
				executor.getExecutionEnvironment().modelReady(omodel.getModel(), executor.getTransformation());
			}
		}
	};

	@Override
	public void fileReady(File file, Transformation transformation, IExecutionEnvironment executionEnvironment) {
		for (OutputFile outFile : executor.getOutputFiles()) {
			if (outFile.getFile().getName().equals(file.getName())) {
				executor.getExecutionEnvironment().fileReady(outFile.getFile(), executor.getTransformation());
			}
		}
	}

}
