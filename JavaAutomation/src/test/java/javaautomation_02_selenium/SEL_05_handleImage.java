package javaautomation_02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class SEL_05_handleImage {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// // General Image (No functionality)
//		driver.get("https://www.google.com");
//		WebElement element = driver.findElement(By.className("lnXdpd"));//
//		System.out.println(element.isDisplayed());
//		Thread.sleep(3000);
//		Thread.sleep(3000);
//		System.out.println(element.getAttribute("width"));
//		System.out.println(element.getAttribute("src"));
//		element.click();
//		Thread.sleep(3000);
//		driver.quit();
//
//	}
//}

// ================
//public class SEL_05_handleImage {
//	//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// Image Button (Submits)
//		driver.get("http://newtours.demoaut.com/"); // site not working need to be fixed
//		Thread.sleep(3000);
//		WebElement element1 = driver.findElement(By.name("login"));
//		String src = element1.getAttribute("src");
//		System.out.println(src);
//		Thread.sleep(3000);
//		element1.click();
//		Thread.sleep(3000);
//		driver.quit();
//
//	}
//
//}
// =====================
// // image as a link to be corrected
// -------------------------
//
public class SEL_05_handleImage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.seleniumhq.org/");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.className("cls-1"));//
		element.click();

		// driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/center/a/img")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
// ====================
