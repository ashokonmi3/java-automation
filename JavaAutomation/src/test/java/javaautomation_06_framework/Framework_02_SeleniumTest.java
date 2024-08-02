package javaautomation_06_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framework_02_SeleniumTest {
	public WebDriver driver;
	Framework_02_SeleniumPage seleniumPages;

	@BeforeMethod
	public void setUp() {
		Log.info("Setting up WebDriver.");
		driver = new ChromeDriver();
	}

	@Test
	public void testCssSelector() throws InterruptedException {
		Log.info("Starting CSS Selector test.");
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/FindElements.html");
		seleniumPages = new Framework_02_SeleniumPage(driver);
		Thread.sleep(3000);
		seleniumPages.clickPancakes();
		Thread.sleep(3000);
		Log.info("Completed CSS Selector test.");
	}

	@Test
	public void testXpath() throws InterruptedException {
		Log.info("Starting XPath test.");
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/css_xpath.html");
		seleniumPages = new Framework_02_SeleniumPage(driver);
		Thread.sleep(2000);
		seleniumPages.clickPancakesXpath();
		Thread.sleep(3000);
		Log.info("Completed XPath test.");
	}

	@AfterMethod
	public void tearDown() {
		Log.info("Closing the WebDriver.");
		driver.quit();
	}
}
