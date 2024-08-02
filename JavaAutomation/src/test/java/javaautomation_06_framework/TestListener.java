package javaautomation_06_framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		Object currentClass = result.getInstance();
		WebDriver driver = ((Framework_01_Test) currentClass).driver;

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("screenshots/" + result.getName() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Log.error("Test failed: " + result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		Log.info("Test started: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Log.info("Test passed: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Log.info("Test skipped: " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		Log.info("Test suite started: " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		Log.info("Test suite finished: " + context.getName());
	}
}
