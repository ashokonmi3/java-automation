package javaautomation_06_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framework_02_BmiCalculatorTest {
	public WebDriver driver;
	Framework_02_BmiCalculatorPage bmiCalculatorPage;
	// private static final Logger logger =
	// Logger.getLogger(Framework_02_BmiCalculatorTest.class);

	@BeforeMethod
	public void setUp() {
		Log.info("Setting up WebDriver and navigating to the BMI Calculator page.");
		driver = new ChromeDriver();
		driver.get("http://www.calculator.net/bmi-calculator.html");
		bmiCalculatorPage = new Framework_02_BmiCalculatorPage(driver);
	}

	@Test
	public void testBmiCalculator() throws InterruptedException {
		Log.info("Starting BMI Calculator test.");
		Thread.sleep(3000);
		bmiCalculatorPage.setAge("45");
		Thread.sleep(3000);
		bmiCalculatorPage.setHeight("600");
		Thread.sleep(3000);
		bmiCalculatorPage.setWeight("120");
		Thread.sleep(3000);
		Log.info("Completed BMI Calculator test.");
	}

	@AfterMethod
	public void tearDown() {
		Log.info("Closing the WebDriver.");
		driver.quit();
	}
}
