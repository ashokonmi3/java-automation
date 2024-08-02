package javaautomation_02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// public class EditBox
// Type in edit box--
// sendKeys()
// clear
// isenabled
// isdisplayed
// Getattribute
// ===============================
//public class SEL_03_EditBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/login.html");
//		driver.findElement(By.name("username")).sendKeys("root");
//		Thread.sleep(5000);
//		driver.findElement(By.name("username")).clear();
//		Thread.sleep(5000);
//		driver.findElement(By.name("username")).sendKeys("root");
//		Thread.sleep(5000);
//		driver.findElement(By.name("password")).sendKeys("root");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys(Keys.ENTER);
//		// driver.findElement(By.id("tdb1")).sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}
// =============================
//
//public class SEL_03_EditBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		// send multiple string in send keys
//		String a = "java ";
//		driver.findElement(By.name("q")).sendKeys(a, "Selenium -", "varargs");
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}
// ================
//public class SEL_03_EditBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		// send multiple string in send keys
//		// press number 1
//		driver.findElement(By.name("q")).sendKeys(Keys.NUMPAD1);
//		driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.SHIFT, "UserName", "abc"));
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}

// ======================
//public class SEL_03_EditBox {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/login.html");
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("root"); // Entering values in edit box
//		String text = username.getAttribute("value");
//		System.out.println(" The current value in user name edit box is " + text);//
//		// Return the value in the edit box
//		System.out.println("isDisplayed: " + username.isDisplayed());// Return the
//		// Displayed status
//		System.out.println("Is Enabled: " + username.isEnabled());// Return the
//		// enabled status
//		Thread.sleep(5000);
//		driver.quit();
//	}
//}

// ==============

public class SEL_03_EditBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://ashokonmi3.github.io/Selenium.Pages/disabledEditBox.html");
			Thread.sleep(5000);

			WebElement username = driver.findElement(By.name("lname"));
			// username.sendKeys("admin"); // Entering values in edit box
			Thread.sleep(5000);

			System.out.println("isDisplayed: " + username.isDisplayed()); // Return the
			// displayed status
			System.out.println("isEnabled: " + username.isEnabled()); // Return the
			// enabled status

			Thread.sleep(5000);
		} finally {
			driver.quit();
		}
	}
}
