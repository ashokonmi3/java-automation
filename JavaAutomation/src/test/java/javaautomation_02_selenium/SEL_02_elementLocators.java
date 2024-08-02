package javaautomation_02_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// 1. ID:
// Priority: Highest
// Reason: IDs are unique identifiers for elements,
// making them the most reliable and fastest to locate.
// 2. Name:
// Priority: Moderate
// Reason: Name attributes might not always be unique,
// but they're often used for form elements
// and can serve as reliable locators.
// 3. CSS Selectors:
// Priority: High
// Reason: CSS selectors offer flexibility and efficiency.
// They can target elements based on various attributes,
// classes, hierarchies, etc.
// 4. XPath:
// Priority: Moderate to Low
// Reason: XPath provides powerful traversal of the HTML document, but it can be
// slower and less readable than CSS selectors.
// 5. Class Name:
// Priority: Moderate to Low
// Reason: While classes can be shared among multiple elements, they're still
// useful, especially when elements have unique classes.
// 6. Tag Name:
// Priority: Low
// Reason: Tag names are the least specific. Using them alone might result in
// locating multiple elements, unless combined with other attributes or
// strategies.
// 7. Link Text & Partial Link Text:
// Priority: Specific to links
// Reason: These are specific to anchor (<a>) elements and are used when
// locating links by their visible text.
// Considerations:
// Uniqueness: Prioritize locators that ensure unique identification of elements
// to avoid ambiguity.
// Readability and Maintenance: Choose locators that are readable and
// maintainable for efficient script maintenance.
// Performance: Prefer faster locators (like ID and CSS selectors) for better
// performance.
// When creating automation scripts, it's a good practice to use a combination
// of locators, starting with the most reliable ones and employing fallback
// strategies if needed. Always test and verify locator reliability across
// different browsers and environments.
// ============================

// Find the element using a element locator
// Perform the operations:
// -- Click
// -- SendKeys
// -- Clear
// -- Select
//
// tags
// -- image -- <img>
// -- Link -- <a>
// -- Table <table>
// -- Dropdown <select>
// -- Edit box <input>
//SEL_01_WebDriverDemoWebsite.html
// ==============================

//public class SEL_02_elementLocators {
//	public static void main(String[] args) throws InterruptedException {
//		// WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.calculator.net/bmi-calculator.html");
//		Thread.sleep(3000);
//		// finding element by id.
//		driver.findElement(By.id("cage")).clear();
//		Thread.sleep(3000);
//		driver.findElement(By.id("cage")).sendKeys("45");
//		Thread.sleep(3000);
//
//		// finding element by name.
//		driver.findElement(By.name("cheightmeter")).clear();// weight
//		Thread.sleep(3000);
//		driver.findElement(By.name("cheightmeter")).sendKeys("600");
//		Thread.sleep(3000);
//
//		// by class name
//		driver.findElement(By.id("ckg")).clear();// height
//		Thread.sleep(3000);
//		driver.findElement(By.id("ckg")).sendKeys("120");
//		Thread.sleep(3000);
//		driver.close();
//	}
//}

// ============================================
//public class SEL_02_elementLocators {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// // // BY link text - no need of plugin .its visible element
//		driver.get("https://www.google.co.in");
//		Thread.sleep(3000);
//
//		driver.findElement(By.linkText("Gmail")).click();
//		Thread.sleep(3000);
//		driver.close();
//	}
//}

// =======================

//public class SEL_02_elementLocators {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// // // BY link text - no need of plugin .its visible element. No need to
//		// inspect element
//		driver.get("https://www.google.co.in");
//		Thread.sleep(3000);
//
//		driver.findElement(By.partialLinkText("Gm")).click();
//		Thread.sleep(3000);
//		driver.close();
//	}
//}

// ===============================
//public class SEL_02_elementLocators {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.rediff.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//
//		driver.findElement(By.className("txt_srchquery")).sendKeys("Reliance");
//		Thread.sleep(3000);
//		driver.close();
//	}
//}

// =================
//public class SEL_02_elementLocators {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/FindElements.html");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#pancakes > a")).click();
//		Thread.sleep(3000);
//		driver.close();
//	}
//}

// ===============
//public class SEL_02_elementLocators {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/css_xpath.html");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='pancakes']/a")).click();
//		Thread.sleep(3000);
//		driver.quit();
//	}
//}
// ====================

public class SEL_02_elementLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		List<WebElement> elems = driver.findElements(By.tagName("img"));
		// javautil
		Thread.sleep(3000);
		System.out.println(elems.size());

		driver.quit();
	}
}
