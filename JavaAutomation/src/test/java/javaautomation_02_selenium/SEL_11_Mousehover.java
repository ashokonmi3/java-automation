package javaautomation_02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//public class SEL_11_Mousehover {
//
//	public static void main(String... args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file://D:\\Study\\javaselenium\\webpages\\selectable.html");
//		// driver.get("https://ashokonmi3.github.io/Selenium.Pages/selectable.html");
//
//		WebElement one = driver.findElement(By.name("one"));
//		WebElement three = driver.findElement(By.name("three"));
//		WebElement five = driver.findElement(By.name("five"));
//		// Add all the actions into the Actions builder.
//		Actions builder = new Actions(driver);
//		builder.keyDown(Keys.CONTROL).click(one).perform();
//		Thread.sleep(2000);
//		builder.keyDown(Keys.CONTROL).click(three).perform();
//		Thread.sleep(2000);
//		builder.keyDown(Keys.CONTROL).click(five).perform();
//		Thread.sleep(2000);
//		builder.keyDown(Keys.CONTROL).click(one).perform();
//		Thread.sleep(2000);
//		builder.keyDown(Keys.CONTROL).click(three).perform();
//		Thread.sleep(2000);
//		builder.keyDown(Keys.CONTROL).click(five).perform();
//		Thread.sleep(2000);
//		driver.quit();
//
//	}
//}

// ==============================
// / The build() method is used compile all the listed actions into a single
// step.
// ---------------------------------

public class SEL_11_Mousehover {
	public static void main(String... args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file://D:\\Study\\javaselenium\\webpages\\selectable.html");
		//
		//
		driver.get("file://D:\\Study\\javaselenium\\webpages\\selectable.html");
		WebElement one = driver.findElement(By.name("one"));
		WebElement three = driver.findElement(By.name("three"));
		WebElement five = driver.findElement(By.name("five"));
		Actions builder = new Actions(driver);
		Action compositeAction = builder.keyDown(Keys.CONTROL).click(one).click(three).click(five).keyUp(Keys.CONTROL)
				.build();// org.openqa.selenium.interactions.Actions;

		compositeAction.perform();
		Thread.sleep(4000);

		driver.close();

	}
}
// =======================
