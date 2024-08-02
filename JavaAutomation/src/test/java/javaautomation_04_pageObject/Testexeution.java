package javaautomation_04_pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Test cases
//1) Launch the page login.html
//2) Validate the title of page is login paget
//3) Enter user name
//4) Enter password
//5) Validate that after login the User name from Home Page is google

//Pages
//Login Page - username , password edit box, login button
//Home Page - text for user name

public class Testexeution {

	WebDriver driver;

	Login objLogin;

	HomePage objHomePage;

	@BeforeTest

	public void setup() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://ashokonmi3.github.io/Selenium.Pages/login.html");

	}

	@Test(priority = 0)

	public void test_Home_Page_Appear_Correct() {

		// Create Login Page object

		objLogin = new Login(driver);

		// Verify login page title

		String loginPageTitle = objLogin.getLoginTitle();

		Assert.assertTrue(loginPageTitle.toLowerCase().contains("login paget"));

		// login to application

		objLogin.loginTo("root", "root");

		// go the next page

		objHomePage = new HomePage(driver);

		// Verify home page

		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("google"));

	}

	@AfterTest

	public void teardown() {

		driver.quit();

	}

}