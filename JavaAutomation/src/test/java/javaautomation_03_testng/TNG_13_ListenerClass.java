package javaautomation_03_testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*Listeners are required to generate 
 * logs or customize TestNG reports in Selenium Webdriver.
There are many types of listeners and can be used as per requirements.
Listeners are interfaces used in selenium web driver script
Demonstrated the use of Listener in Selenium
Implemented the Listeners for multiple classes
*/
public class TNG_13_ListenerClass implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		// Executed after the test suite finishes
		System.out.println("Test Suite Finished: " + context.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// Executed before the test suite starts
		System.out.println("Test Suite Started: " + context.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Executed if a test method fails within success percentage
		System.out.println("Test Failed But Within Success Percentage: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// Executed if a test method fails
		System.out.println("Test Failed: " + result.getName());
		// Capture screenshot, log failure details, etc.
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// Executed if a test method is skipped
		System.out.println("Test Skipped: " + result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		// Executed before each test method starts
		System.out.println("Test Started: " + result.getName());
		// Create log file, initialize logging, etc.
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// Executed if a test method passes
		System.out.println("Test Passed: " + result.getName());
	}

}
