package javaautomation_02_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SEL_15_CrossBrowser {
	public static WebDriver driver;
	public static int browser;
	public static String BrowserName;

	public static void main(String[] args) throws InterruptedException {

		for (browser = 1; browser <= 3; browser++) {
			if (browser == 1) {
				driver = new ChromeDriver();

				BrowserName = "Chrome Browser: ";
			} else if (browser == 2) {
				driver = new FirefoxDriver();

				BrowserName = "Firefox  Browser: ";

			} else if (browser == 3) {

				Thread.sleep(5000);
				driver = new EdgeDriver();
				BrowserName = "IE  Browser: ";
			}

			driver.get("https://www.google.com");

			String PageTitle = driver.getTitle();

			if (PageTitle.equals("Google")) {
				System.out.println(BrowserName + " - Google Application Launched - Passed");
			} else {
				System.out.println(BrowserName + " - Google Application Not Launched -Failed");
			}
			driver.quit();
		}
	}
}
