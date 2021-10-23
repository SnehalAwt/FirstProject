package com.listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersEx implements ITestListener {
	private Logger log = Logger.getLogger(ListenersEx.class);

	public void onTestStart(ITestResult result) {
		log.info("Test case started with name: " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		log.info("Testcase passed with name: " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		log.info("Testcase failed with name: " + result.getName());
		log.info("Testcase failed due to the reason:" + result.getThrowable());

	}

	public void onTestSkipped(ITestResult result) {

		log.info("Testcase skipped with name: " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		log.info("Test suite is ready to start the execution");

	}

	public void onFinish(ITestContext context) {

		log.info("Test suite is fnished with  the execution");
	}

}
