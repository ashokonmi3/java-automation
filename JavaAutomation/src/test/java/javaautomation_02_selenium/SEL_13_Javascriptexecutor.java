package javaautomation_02_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class SEL_13_Javascriptexecutor {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,800)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,800)");
//		Thread.sleep(2000);
//		driver.quit();
//	}
//}

// ===================================
public class SEL_13_Javascriptexecutor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String DomainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of the site = " + DomainName);

		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site = " + url);
		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page = " + TitleName);

		System.out.println("success");
		driver.quit();
	}
}