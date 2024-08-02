package javaautomation_02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//===========
/*1. Click 
2. isSelected
3. isDisplayed
4. isEnabled
*/
// ==============Radio Button==============

//public class SEL_08_Radio_CheckBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/SEL_01_WebDriverDemoWebsite.html");
//		WebElement radio1 = driver.findElement(By.id("novels-radio-btn"));
//		System.out.println("By default status of novel radio button :" + radio1.isSelected());
//		Thread.sleep(3000);
//		System.out.println("Going to select the novel radio button");
//		radio1.click();
//		Thread.sleep(3000);
//		System.out.println("After clicking of novel Radio Button isSelected output is  " + radio1.isSelected());
//		System.out.println("isDisplayed() :" + radio1.isDisplayed());
//
//		driver.quit();
//	}
//}
// =====================================
// // Selecting CheckBox
public class SEL_08_Radio_CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/Web_Elements.html");
		WebElement option1 = driver.findElement(By.id("bicycle-checkbox"));
		Thread.sleep(5000);
		System.out.println("Before clicking bicycle-checkbox " + option1.isSelected());
		// // This will Toggle the Check box
		option1.click();
		Thread.sleep(5000);
		System.out.println("After clicking bicycle-checkbox " + option1.isSelected());
		Thread.sleep(5000);
		option1.click();
		System.out.println("After clicking 2nd time bicycle-checkbox " + option1.isSelected());
		// // // Check whether the Check box is toggled on
		Thread.sleep(5000);

		option1 = driver.findElement(By.id("tricycle-checkbox"));
		System.out.println("Tricycle check box enable status " + option1.isEnabled());

		driver.quit();
	}
}

// ====================================
