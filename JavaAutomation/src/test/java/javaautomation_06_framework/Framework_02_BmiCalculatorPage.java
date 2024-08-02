package javaautomation_06_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Framework_02_BmiCalculatorPage {
	WebDriver driver;

	By ageField = By.id("cage");
	By heightField = By.name("cheightmeter");
	By weightField = By.id("ckg");

	public Framework_02_BmiCalculatorPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setAge(String age) {
		driver.findElement(ageField).clear();
		driver.findElement(ageField).sendKeys(age);
	}

	public void setHeight(String height) {
		driver.findElement(heightField).clear();
		driver.findElement(heightField).sendKeys(height);
	}

	public void setWeight(String weight) {
		driver.findElement(weightField).clear();
		driver.findElement(weightField).sendKeys(weight);
	}
}
