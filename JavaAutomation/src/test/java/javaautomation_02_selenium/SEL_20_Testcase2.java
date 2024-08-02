package javaautomation_02_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//======================
//Test Case
//1) Launch the page https://ashokonmi3.github.io/Selenium.Pages/login.html
//2) Login with user root and password root
//3) After login check the current url is https://ashokonmi3.github.io/Selenium.Pages/AlertPage.html

//============================
//public class SEL_20_Testcase2 {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/login.html");
//		driver.findElement(By.name("username")).sendKeys("root");
//		driver.findElement(By.name("password")).sendKeys("root");
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
//		Thread.sleep(2000);
//
//		String url = driver.getCurrentUrl();
//		if (url.equals("https://ashokonmi3.github.io/Selenium.Pages/AlertPage.html")) {
//			System.out.println("Login Successful. Test case passed.");
//		} else {
//			System.out.println("Login Failed. Test case failed.");
//		}
//		Thread.sleep(2000);
//		driver.quit();
//	}
//}

// // ------------------------------
// Negative test case
public class SEL_20_Testcase2 {
	//
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/login.html");
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("root34");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Alert ale = driver.switchTo().alert();
		Thread.sleep(5000);
		String s = ale.getText();
		System.out.println(s);
		ale.dismiss();

		if (s.contains("Invalid Password")) {
			System.out.println("Handling error message. Test case passed.");
		} else {
			System.out.println("Not able to capture error message. Test case failed.");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
