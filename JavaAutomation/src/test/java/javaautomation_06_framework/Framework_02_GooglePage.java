package javaautomation_06_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Framework_02_GooglePage {
	WebDriver driver;

	By gmailLink = By.linkText("Gmail");
	By partialGmailLink = By.partialLinkText("Gm");

	public Framework_02_GooglePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickGmail() {
		driver.findElement(gmailLink).click();
	}

	public void clickPartialGmail() {
		driver.findElement(partialGmailLink).click();
	}
}
