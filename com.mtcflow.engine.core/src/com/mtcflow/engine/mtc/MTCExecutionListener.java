package com.mtcflow.engine.mtc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

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

	public void modelReady(com.mtcflow.model.mtc.Model model, Transformation transformation,
			IExecutionEnvironment executionEnvironment) {
		for (OutputModel omodel : executor.getOutputModels()) {
			if (omodel.getModel().getName().equals(model.getName())) {
				if (externalMTC) {
					// Copy to the other environment
					try {
						copyFileUsingFileChannels(executionEnvironment.getLocator().getFile(model),
								executionEnvironment.getLocator().getFile(omodel.getModel()));
					} catch (IOException ex) {
						executor.getConsole().logException("Error copying the generated model from the MTC: "
								+ executor.getTransformation().getName(), ex);
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

	private static void copyFileUsingFileChannels(java.io.File source, java.io.File dest) throws IOException {
		FileInputStream inputStream = null;
		FileOutputStream outStream = null;
		FileChannel inputChannel = null;
		FileChannel outputChannel = null;
		try {
			inputStream = new FileInputStream(source);
			outStream = new FileOutputStream(dest);
			inputChannel = inputStream.getChannel();
			outputChannel = outStream.getChannel();
			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		} finally {
			try {
				inputChannel.close();
			} catch (Exception ex) {
			}
			try {
				outputChannel.close();
			} catch (Exception ex) {
			}
			try {
				inputStream.close();
			} catch (Exception ex) {
			}
			try {
				outStream.close();
			} catch (Exception ex) {
			}
		}
	}

}
