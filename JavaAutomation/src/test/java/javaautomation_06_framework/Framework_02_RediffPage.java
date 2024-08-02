package javaautomation_06_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Framework_02_RediffPage {
	WebDriver driver;

	By searchBox = By.className("txt_srchquery");

	public Framework_02_RediffPage(WebDriver driver) {
		this.driver = driver;
	}

	public void search(String query) {
		driver.findElement(searchBox).sendKeys(query);
	}
}
