package javaautomation_02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Select is a class which is provided by Selenium to perform multiple
 * operations on DropDown object and Multiple Select object. This class can be
 * found under the Selenium’s Support.UI.Select package. As Select is also an
 * ordinary class, so it’s object is also created by a New keyword with regular
 * class creation syntax. It clearly says that Select is asking for a element
 * type object for its constructor. The code will be:
 */
//
//public class SEL_06_dropDownbox {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		String baseURL = "https://ashokonmi3.github.io/Selenium.Pages/SEL_01_WebDriverDemoWebsite.html";
//		driver.get(baseURL);
//		Thread.sleep(3000);
//		Select drpSubject = new Select(driver.findElement(By.name("languages")));
//		drpSubject.selectByIndex(5);// index starts with 0
//		Thread.sleep(5000);
//		drpSubject.selectByVisibleText("JavaScript");
//		Thread.sleep(3000);
//		drpSubject.selectByValue("Python");
//		Thread.sleep(3000);
//		driver.quit();
//	}
//}

// ======================================================
// ===================================
// // Selecting Items in a Multiple SELECT elements
// -------------------------
public class SEL_06_dropDownbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByValue("banana");
		Thread.sleep(2000);
		fruits.selectByValue("orange");
		Thread.sleep(2000);
		fruits.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println(" i am after first select");
		fruits.deselectByValue("orange");
		Thread.sleep(2000);
		fruits.deselectAll();
		Thread.sleep(2000);
		// fruits.selectAll(); Not supported
		driver.quit();
	}
}
//// =====================================================
// Assignment :
// Write a program to select all elements of dropdown
