package com.RestfulBooker.Utility;

import com.RestfulBooker.Testbase.Testbase;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetUp extends Testbase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info(result.getName()+"test is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(result.getName()+"test completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info(result.getName()+"test is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info(result.getName()+"test skipped");
	}

	
}
