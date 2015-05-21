package com.mtcflow.engine;

import com.mtcflow.engine.transformation.ITransformationExecutor;


public interface ITransformationScheduler {
	
	public void execute(String name, ITransformationExecutor executor, Runnable task);

}
