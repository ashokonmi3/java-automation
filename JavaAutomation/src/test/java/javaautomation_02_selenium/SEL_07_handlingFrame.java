package javaautomation_02_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// ==========================

// switching from frame to top window
// driver.switchTo().defaultContent();

// /*
// * Navigation:
// *
// * > Launch the page > Switch to 1st frame > Operate an element > Back to Top
// * window > Switch to 1st frame > Operate an element
// */
////

public class SEL_07_handlingFrame {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Navigate to the HTML file containing the frames
		// driver.get(
		// "file:D:\\Study\\Java_Automation_git\\Selenium_Learning\\learning\\src\\main\\java\\selenium\\learning\\frame.html");
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/frame.html");
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("mainWindowHandle : " + mainWindowHandle);

		// Switch to frame1 and click the Google link
		driver.switchTo().frame("frame1");
		WebElement googleLink = driver.findElement(By.linkText("Google"));
		googleLink.click();
		Thread.sleep(5000);

		// Switch to the newly opened tab (Google)
		switchToNewTab(driver, mainWindowHandle);

		// Close the Google tab
		driver.close();

		// Switch back to the main window
		driver.switchTo().window(mainWindowHandle);

		// Switch to frame2 and click the Yahoo link
		driver.switchTo().frame("frame2");
		WebElement yahooLink = driver.findElement(By.linkText("Yahoo"));
		yahooLink.click();
		Thread.sleep(5000);

		// Switch to the newly opened tab (Yahoo)
		switchToNewTab(driver, mainWindowHandle);

		// Close the Yahoo tab
		driver.close();

		// Switch back to the main window
		driver.switchTo().window(mainWindowHandle);

		// Switch to frame3 and click the Rediff link
		driver.switchTo().frame("frame3");
		WebElement rediffLink = driver.findElement(By.linkText("Rediff"));
		rediffLink.click();
		Thread.sleep(5000);

		// Switch to the newly opened tab (Rediff)
		switchToNewTab(driver, mainWindowHandle);

		// Close the Rediff tab
		driver.close();

		// Close the main window
		driver.quit();

	}

	private static void switchToNewTab(WebDriver driver, String mainWindowHandle) {
		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();
		// Iterate over each handle
		System.out.println("windowHandles : " + windowHandles);

		for (String handle : windowHandles) {
			// Switch to the handle if it's not the main window handle
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				// Break the loop after switching to the new tab
				break;
			}
		}
	}
}