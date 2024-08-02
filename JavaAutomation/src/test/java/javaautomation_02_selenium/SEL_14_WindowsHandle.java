package javaautomation_02_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class SEL_14_WindowsHandle {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/browser-windows");
//		Thread.sleep(2000);
//		String originalWindow = driver.getWindowHandle();
//		System.out.println(originalWindow + " originalWindow");
//
//		// Open new window by clicking the button
//		driver.findElement(By.id("windowButton")).click();
//		//
//		Thread.sleep(2000);
//		System.out.println(" clicked on element");
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));// java.time
//		//
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		System.out.println(" after wait");
//		System.out.println("total windows : " + driver.getWindowHandles().size());
//
//		Set<String> winHandles = driver.getWindowHandles();
//		// Set does not contain any duplicate value
//		// // // Loop through all handles
//		for (String handle : winHandles) {
//			if (!handle.equals(originalWindow)) {
//				driver.switchTo().window(handle);
//				Thread.sleep(2000);
//				WebElement text = driver.findElement(By.id("sampleHeading"));
//				System.out.println("Heading of child window is " + text.getText());
//				System.out.println("Closing the new window...");
//				driver.close();
//			}
//		}
//		// // System.out.println("Closing the parent window...");
//		driver.switchTo().window(originalWindow);
//		//
//		System.out.println("Title of Patent window is " + driver.getTitle());
//
//		// Click on the new window element and read the text displayed on the window
//		driver.quit();
//	}
//}

// =======================
// TAb handling
//
// public class SEL_14_WindowsHandle {
// public static void main(String[] args) throws InterruptedException {
// WebDriver driver = new ChromeDriver();
// // driver.manage().window().maximize();
// driver.get("https://demoqa.com/browser-windows");
// Thread.sleep(2000);
// String originalWindow = driver.getWindowHandle();
// System.out.println(originalWindow + " originalWindow");
//
// // Open new window by clicking the button
// driver.findElement(By.id("tabButton")).click();
//
// Thread.sleep(2000);
// System.out.println(" clicked on element");
//
// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
//
// wait.until(ExpectedConditions.numberOfWindowsToBe(2));
// System.out.println(" after wait");
// System.out.println("total windows : " + driver.getWindowHandles().size());
//
// Set<String> winHandles = driver.getWindowHandles();
// // // Loop through all handles
// for (String handle : winHandles) {
// if (!handle.equals(originalWindow)) {
// driver.switchTo().window(handle);
// Thread.sleep(2000);
// WebElement text = driver.findElement(By.id("sampleHeading"));
// System.out.println("Heading of child window is " + text.getText());
// System.out.println("Closing the new window...");
// driver.close();
// }
// }
// // System.out.println("Closing the parent window...");
// driver.switchTo().window(originalWindow);
//
// System.out.println("Title of Patent window is " + driver.getTitle());
//
// // Click on the new window element and read the text displayed on the window
// driver.quit();
// }
// }
// ===================

//public class SEL_14_WindowsHandle {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// driver.manage().window().maximize();
//		driver.get("https://google.com");
//		Thread.sleep(2000);
//		String originalWindow = driver.getWindowHandle();
//		System.out.println(originalWindow + " originalWindow");
//
//		// Open new window by clicking the button
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://yahoo.com");
//
//		Thread.sleep(2000);
//
//		System.out.println("total windows : " + driver.getWindowHandles().size());
//		//
//		Set<String> winHandles = driver.getWindowHandles();
//		// // // Loop through all handles
//		for (String handle : winHandles) {
//			if (!handle.equals(originalWindow)) {
//				driver.switchTo().window(handle);
//				Thread.sleep(2000);
//				System.out.println("Title of webpage" + driver.getTitle());
//				System.out.println("Closing the new window...");
//				driver.close();
//			}
//		}
//		// // System.out.println("Closing the parent window...");
//		driver.switchTo().window(originalWindow);
//		//
//		System.out.println("Title of child window is " + driver.getTitle());
//
//		// Click on the new window element and read the text displayed on the window
//		driver.quit();
//	}
//}
//===============================

public class SEL_14_WindowsHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		System.out.println(originalWindow + " originalWindow");

		// Open new window by clicking the button
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("messageWindowButton")).click();

		Thread.sleep(2000);
		System.out.println(" clicked on element");

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));//
		// time

		// wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(" after wait");
		System.out.println("total windows : " + driver.getWindowHandles().size());

		Set<String> winHandles = driver.getWindowHandles();
		// // Loop through all handles
		for (String handle : winHandles) {
			if (!handle.equals(originalWindow)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				// WebElement text = driver.findElement(By.id("sampleHeading"));
				// System.out.println("Heading of child window is " + text.getText());
				System.out.println("Closing the new window...");
				driver.close();
			}
		}
		// System.out.println("Closing the parent window...");
		driver.switchTo().window(originalWindow);

		System.out.println("Title of Patent window is " + driver.getTitle());

		// Click on the new window element and read the text displayed on the window
		driver.quit();
	}
}