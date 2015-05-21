package com.mtcflow.engine;

import java.util.concurrent.Executors;

import com.mtcflow.engine.transformation.ITransformationExecutor;

public class ExecutorService implements ITransformationScheduler {
	
	private final static java.util.concurrent.ExecutorService EXECUTOR = Executors.newCachedThreadPool();

	@Override
	public void execute(String name, ITransformationExecutor executor, Runnable task) {
		EXECUTOR.submit(task);
	}
}
