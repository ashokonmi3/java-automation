package javaautomation_02_selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// =====================================
// Partial Link
//public class SEL_04_HandleLink {
//	public static void main(String[] args) throws InterruptedException {
//		String baseUrl = "https://ashokonmi3.github.io/Selenium.Pages/FindElements.html";
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseUrl);
//		Thread.sleep(5000);
//		driver.findElement(By.partialLinkText("Selenium")).click();
//		System.out.println("title of page is: " + driver.getTitle());
//		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.findElement(By.linkText("Selenium Webdriver")).click();
//		Thread.sleep(3000);
//		if (driver.getTitle().equals("Selenium")) {
//			System.out.println("title of page is correct: " + driver.getTitle());
//		} else {
//			System.out.println("title of page is not correct: " + driver.getTitle());
//		}
//		driver.quit();
//	}
//}
// =====================

//public class SEL_04_HandleLink {
//	public static void main(String[] args) throws InterruptedException {
//		String baseUrl = "https://ashokonmi3.github.io/Selenium.Pages/FindElements.html";
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseUrl);
//		Thread.sleep(5000);
//		WebElement link = driver.findElement(By.partialLinkText("Selenium"));
//		if (link != null) {
//			System.out.println("Link is present");
//		}
//		String href = link.getAttribute("href");
//		System.out.println("Link href: " + href);
//		// String color = link.getAttribute("color");
//		// System.out.println("Color href: " + color);
//
//		link.click();
//		System.out.println("title of page is: " + driver.getTitle());
//		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.findElement(By.linkText("Selenium Webdriver")).click();
//		Thread.sleep(3000);
//		System.out.println("title of page is: " + driver.getTitle());
//		driver.quit();
//	}
//}
// =====================
// Key Differences:
//
// getAttribute() is used for retrieving HTML attribute values.
// getCssValue() is used for retrieving CSS property values.
// getCssValue() is more suitable for getting style-related information, like
// colors, fonts, etc.
// The values returned by getCssValue() are often in computed form, such as RGB
// values for colors.
// When you're interested in retrieving styles, colors, or other visual
// properties, getCssValue() is more appropriate.
// If you need to retrieve HTML attribute values (e.g., id, name, value), then
// getAttribute() is the method to use.

// ===========================
// Find out which link is working and which is not in the home page of website
// Step1 : Collect all the hyper links present in the webpage the hyper links
// will have anchor tag <a>
// Step 2
//
public class SEL_04_HandleLink {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		WebDriver driver = new ChromeDriver();

		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(baseUrl);
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));// util
		String[] linkTexts = new String[linkElements.size()];// created to store the
		// link text of each <a> tag element
		int i = 0;

		// extract the link texts of each link element
		// [webelement1, webelement2 , webelement3 ,.....]

		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}

		System.out.println(linkElements);
		System.out.println("*********************************************");

		System.out.println(Arrays.toString(linkTexts));

		// test each link
		// [ Home, Flights,Hotels, Car Rentals, Vacation,...]
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			Thread.sleep(2000);
			if (driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
			}
			driver.navigate().back();
		}
		driver.quit();
	}
}
