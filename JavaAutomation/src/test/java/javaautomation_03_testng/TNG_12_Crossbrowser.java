package javaautomation_03_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG_12_Crossbrowser {

	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		switch (browser.toLowerCase()) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			throw new Exception("Invalid browser: " + browser);
		}
	}

	@Test
	public void testGmail() {
		driver.get("http://www.gmail.com/");
		Assert.assertEquals(driver.getTitle(), "Gmail");
	}

	@Test
	public void testLogin() {
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/login.html");
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("root");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://ashokonmi3.github.io/Selenium.Pages/AlertPage.html");
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
