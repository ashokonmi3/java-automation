package javaautomation_06_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Framework_01_homepage {
	WebDriver driver;

	By title = By.tagName("title");

	public Framework_01_homepage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public void printBrowserSize() {
		System.out.println(driver.manage().window().getSize());
	}
}
