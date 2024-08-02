package javaautomation_02_selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEL_16_Screencapture {

	public static void main(String args[]) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		TakesScreenshot screenshot = (TakesScreenshot) driver; // Take screenshot and store as a file format

		Thread.sleep(3000);
		File src = screenshot.getScreenshotAs(OutputType.FILE); // Get the screenshot as an image File
		Thread.sleep(3000);
		String currentDirectory = System.getProperty("user.dir");
		System.out.println("Current directory " + currentDirectory);
		FileUtils.copyFile(src, new File(currentDirectory + "/" + "error222.png"));
		System.out.println("Scrren captured");

		driver.quit();
	}
}