package com.mtcflow.engine.eclipse;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.mtcflow.engine.ITransformationScheduler;
import com.mtcflow.engine.transformation.ITransformationExecutor;

public class JobExecutorService implements ITransformationScheduler {

	@Override
	public void execute(String name, ITransformationExecutor executor, final Runnable task) {
		
		Job job = new Job(name) {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				task.run(); 
				return Status.OK_STATUS;
			}
		};
		
		job.schedule();

	}

}
