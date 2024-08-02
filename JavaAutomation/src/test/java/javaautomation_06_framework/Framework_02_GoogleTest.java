package javaautomation_06_framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framework_02_GoogleTest {
	public WebDriver driver;
	Framework_02_GooglePage googlePage;

	@BeforeMethod
	public void setUp() {
		Log.info("Setting up WebDriver and navigating to Google.");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		googlePage = new Framework_02_GooglePage(driver);
	}

	@Test
	public void testGmailLink() throws InterruptedException {
		Log.info("Starting Gmail Link test.");
		Thread.sleep(3000);
		googlePage.clickGmail();
		Thread.sleep(3000);
		Log.info("Completed Gmail Link test.");
	}

	@Test
	public void testPartialGmailLink() throws InterruptedException {
		Log.info("Starting Partial Gmail Link test.");
		Thread.sleep(3000);
		googlePage.clickPartialGmail();
		Thread.sleep(3000);
		Log.info("Completed Partial Gmail Link test.");
	}

	@AfterMethod
	public void tearDown() {
		Log.info("Closing the WebDriver.");
		driver.quit();
	}
}
