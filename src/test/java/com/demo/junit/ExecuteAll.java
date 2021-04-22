package com.demo.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteAll {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(JunitClasses.class, JunitSample.class);
		System.out.println("Ignore count is " + r.getIgnoreCount());
		System.out.println("Run count is" + r.getRunCount());
		System.out.println("Run time is" + r.getRunTime());
		System.out.println("Failure count is" + r.getFailureCount());
		List<Failure> failures = r.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}
	}

}
