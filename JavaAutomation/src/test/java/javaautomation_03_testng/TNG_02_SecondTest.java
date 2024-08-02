package javaautomation_03_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TNG_02_SecondTest {
	@Test
	public void verifyTitle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Gmail");
		Thread.sleep(3000);
		driver.close();

	}

	@Test(description = "This test is to demonstrate of the test test failure")
	public void verifyTitleNegative() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Yahoo");
		Thread.sleep(3000);
		System.out.println("Negative test");
		driver.close();

	}

	@Test(description = "This test is to test the wiki selenium home page")

	public void wikiTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("wikipedia.org"));

		// if (url.contains("wikipedia.org")) {
		// System.out.println("It is an Internal Link -Passed");
		// } else {
		// System.out.println("It is an External Link - Failed");
		// }
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("selenium.dev")).click(); // click
		Thread.sleep(2000);
		System.out.println("URL is: " + driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("selenium.dev"));
		//
		// if (driver.getCurrentUrl().contains("selenium.dev")) {
		// System.out.println("It is an External Link -pass");
		// } else {
		//
		// System.out.println("It is an Internal Link - failed");
		// }
		driver.quit();

	}

}
