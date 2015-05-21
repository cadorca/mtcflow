package com.mtcflow.engine.core;

import com.mtcflow.engine.exception.TransformationNotSupportedException;
import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;

public class NotSupportedTransformationExecutor extends TransformationExecutor {

	private final String tranformationName;
	
	public NotSupportedTransformationExecutor(String tranformationName) {
		this.tranformationName = tranformationName;
	}
	
	@Override
	public void executeTransformation(IExecutionInformation information) throws Exception {
		throw new TransformationNotSupportedException(tranformationName);
	}

}
