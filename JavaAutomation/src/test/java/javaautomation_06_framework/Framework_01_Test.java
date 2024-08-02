package javaautomation_06_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class Framework_01_Test {
	WebDriver driver;
	Framework_01_homepage homePage;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://rediff.com");
		homePage = new Framework_01_homepage(driver);
		Log.info("Browser opened and navigated to rediff.com");
	}

	@Test
	public void testHomePageTitle() {
		String title = homePage.getHomePageTitle();
		Log.info("Page title: " + title);
		Assert.assertEquals(title, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	}

	@Test
	public void testCurrentUrl() {
		String currentUrl = homePage.getCurrentUrl();
		Log.info("Current URL: " + currentUrl);
		Assert.assertEquals(currentUrl, "https://www.rediff.com/");
	}

	@Test
	public void testPageSource() {
		String pageSource = homePage.getPageSource();
		Log.info("Page Source length: " + pageSource.length());
		Assert.assertTrue(pageSource.contains("Rediff.com"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		Log.info("Browser closed");
	}
}
