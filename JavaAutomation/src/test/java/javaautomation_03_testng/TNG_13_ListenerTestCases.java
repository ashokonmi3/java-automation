package javaautomation_03_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TNG_13_ListenerClass.class)
public class TNG_13_ListenerTestCases {
	WebDriver driver = new ChromeDriver();

	@Test
	public void testLogin() {
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/login.html");
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("root");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.quit();
	}

	// Forcefully failed this test as verify listener.
	@Test
	public void testToFail() {
		System.out.println("This method to test fail");
		Assert.assertTrue(false);
	}

	@Test
	public void testSkipped() {
		// This test will be skipped intentionally
		throw new org.testng.SkipException("Skipping this test intentionally");
	}

	@Test(dependsOnMethods = "testLogin")
	public void testDependency() {
		// This test will be executed after testLogin
		System.out.println("Executing testDependency after testLogin");
	}
}
