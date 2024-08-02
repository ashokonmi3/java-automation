package javaautomation_02_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// ===============================
/*
 *
 * Implicit Wait WebDriver waits for an element if they are not
 * immediately*available.So, WebDriver does not throw NoSuchElementException
 * immediately.* This is known as
 * 
 * implicitlyWait() Disadvantage(i) In any case, it blindly wait for given
 * seconds. (ii) Once set, the implicit wait is set for the life of the
 * WebDriver object instance. ////polling period is not 0.5 seconds
 * 
 */
//
//public class SEL_12_Waits {
//	//
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		System.out.println("Launching google website");
//		driver.get("https://www.google.com");
//		System.out.println("Launched google website");
//		System.out.println("Finding element now");
//		driver.findElement(By.id("identifierId")).sendKeys("India");
//		driver.quit();
//	}
//}
// =============================
//public class SEL_12_Waits {
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		System.out.println("Launching google website");
//
//		driver.get("https://www.google.com");
//		System.out.println("Launched google website");
//		System.out.println("Finding element now");
//
//		driver.findElement(By.id("identifierId")).sendKeys("India");
//		System.out.println("after the wait");
//		driver.quit();
//	}
//}

// If a test case is failing because of element not found we will get the error
// message only after 15 seconds.
//// ======================================

/*
 * Explicit Wait WebDriver waits for an element if they are not immediately
 * available. So, WebDriver does not throw NoSuchElementException immediately.
 * This is known as implicitlyWait() Disadvantage(i) In any case, it blindly
 * wait for given seconds. (ii) Once set, the implicit wait is set for the life
 * of the WebDriver object instance.Implicitly Wait is applicable only to
 * findElement and findElements no other statement in selenium. Explicit wait
 * polls the DOM every 500ms.
 */
//public class SEL_12_Waits {
//	public static void main(String[] args) throws InterruptedException {
//		// open firefox/
//		WebDriver driver = new ChromeDriver();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
//
//		// open google.com
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages//ExplicitlyWait.html");
//		driver.findElement(By.xpath("//button[@id='alert']")).click();
//		// throws TimeoutException if no alert is present
//		wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println("alert popped up");
//		Thread.sleep(5000);
//		driver.switchTo().alert().dismiss();
//
//		Thread.sleep(5000);
//		driver.quit();
//
//	}
//}

// ===============
////
public class SEL_12_Waits {

	public static void main(String[] args) throws InterruptedException {
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://ashokonmi3.github.io/Selenium.Pages//SEL_12_Waits.html");
			driver.findElement(By.id("enable-button")).click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));

			// throws TimeoutException if element does not become as clickable in given
			// time
			wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
			// wait.until(ExpectedConditions.);
			Thread.sleep(5000);

			driver.findElement(By.id("enable-button")).click();

			System.out.println("Button is clickable now");

			Thread.sleep(5000);

			driver.quit();

		}
	}
}
// ====================
// The following are the Expected Conditions that can be used in Explicit Wait
// alertIsPresent()
// elementSelectionStateToBe()
// elementToBeClickable()
// elementToBeSelected()
// frameToBeAvaliableAndSwitchToIt()
// invisibilityOfTheElementLocated()
// invisibilityOfElementWithText()
// presenceOfAllElementsLocatedBy()
// presenceOfElementLocated()
// textToBePresentInElement()
// textToBePresentInElementLocated()
// textToBePresentInElementValue()
// titleIs()
// titleContains()
// visibilityOf()
// visibilityOfAllElements()
// visibilityOfAllElementsLocatedBy()
// visibilityOfElementLocated()

// =========================

// public class SEL_12_Waits {
// public static void main(String[] args) {
// WebDriver driver = new ChromeDriver();
// driver.get("https://www.example.com");
//
// FluentWait<WebDriver> wait = new
// FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
// .pollingEvery(Duration.ofSeconds(5)).ignoring(org.openqa.selenium.NoSuchElementException.class);
//
// WebElement element = wait.until(new Function<WebDriver, WebElement>() {
// public WebElement apply(WebDriver driver) {
// return driver.findElement(By.id("elementId"));
// }
// });
//
// // Perform actions on the element after it's found
// element.click();
//
// driver.quit();
// }
// }
