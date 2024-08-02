package javaautomation_02_selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class O0019_UploadFile {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		// System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
//		String baseUrl = "http://demo.guru99.com/selenium/upload/";
//		WebDriver driver = new ChromeDriver();
//		Thread.sleep(3000);
//		driver.get(baseUrl);
//		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
//		Thread.sleep(4000);
//		// enter the file path onto the file-selection input field
//		uploadElement.sendKeys("C:\\My\\error.png");
//		Thread.sleep(3000);
//		// check the "I accept the terms of service" check box
//		driver.findElement(By.id("terms")).click();
//
//		// click the "UploadFile" button
//		driver.findElement(By.name("send")).click();
//
//		Thread.sleep(3000);
//		driver.quit();
//	}
//
//}

//================================

public class O0019_UploadFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/selenium/upload/";
		Thread.sleep(3000);
		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.click();
		// String autoITexe =
		// "C:\\My\\users\\eclipse-workspace\\Selenium\\src\\Resource\\FileUpload.exe";
		// Runtime.getRuntime().exec(autoITexe);
		Runtime.getRuntime().exec("C:\\My\\users\\eclipse-workspace\\Selenium\\src\\Resource\\FileUpload.exe");

		Thread.sleep(3000);
		//
		driver.findElement(By.id("terms")).click();
		// //
		// // // click the "UploadFile" button
		driver.findElement(By.name("send")).click();
		// //
		Thread.sleep(5000);
		driver.quit();

	}
}