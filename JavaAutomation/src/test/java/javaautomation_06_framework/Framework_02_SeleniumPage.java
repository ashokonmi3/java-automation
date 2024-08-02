package javaautomation_06_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Framework_02_SeleniumPage {
	WebDriver driver;

	By pancakesLink = By.cssSelector("#pancakes > a");
	By pancakesXpathLink = By.xpath("//*[@id='pancakes']/a");

	public Framework_02_SeleniumPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPancakes() {
		driver.findElement(pancakesLink).click();
	}

	public void clickPancakesXpath() {
		driver.findElement(pancakesXpathLink).click();
	}
}
