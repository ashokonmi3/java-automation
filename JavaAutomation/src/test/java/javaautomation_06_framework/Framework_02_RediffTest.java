package javaautomation_06_framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framework_02_RediffTest {
	public WebDriver driver;
	Framework_02_RediffPage rediffPage;
	private static final Logger logger = Logger.getLogger(Framework_02_RediffTest.class);

	@BeforeMethod
	public void setUp() {
		Log.info("Setting up WebDriver and navigating to Rediff.");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		rediffPage = new Framework_02_RediffPage(driver);
	}

	@Test
	public void testSearch() throws InterruptedException {
		Log.info("Starting Rediff search test.");
		Thread.sleep(5000);
		rediffPage.search("Reliance");
		Thread.sleep(3000);
		Log.info("Completed Rediff search test.");
	}

	@AfterMethod
	public void tearDown() {
		Log.info("Closing the WebDriver.");
		driver.quit();
	}
}
