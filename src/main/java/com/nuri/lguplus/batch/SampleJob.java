package com.nuri.lguplus.batch;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SampleJob implements Job {

	public SampleJob() {
	}

	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.err.println("Sample Job Executing");
	}
	
}