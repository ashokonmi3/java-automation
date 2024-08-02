package javaautomation_05_grid;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grid_01_Chrome2 extends Baseclass {
	public WebDriver driver;

	@Test
	public void f() {
		driver.get("https://www.google.com/");
	}

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		driver = initializebrowser("firefox");
	}

	@AfterMethod
	public void teardown() throws MalformedURLException {
		driver.quit();
	}
}
