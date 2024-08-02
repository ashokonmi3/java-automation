package javaautomation_04_pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	By homePageUserName = By.xpath("//*[@id=\"linkTabs\"]/li[1]/a");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	// Get the User name from Home Page

	public String getHomePageDashboardUserName() {

		return driver.findElement(homePageUserName).getText();

	}

}

// ===================
// Page Class:
//
// Each web page is represented by a separate class, known as the Page Class.
// The class contains all the methods and properties related to that particular
// page.
// Methods generally represent the actions that can be performed on the page
// (e.g., clicking a button, filling a form).

// public class LoginPage {
// // WebElements and methods for the login page
//
// public void login(String username, String password) {
// // Code to perform the login
// }
//
// public void enterUsername("user123");
// public void loginenterPassword("pass456");
// public void loginclickLoginButton();
//
// }
//
// public class LoginPage {
// // WebElement locators
// By usernameLocator = By.id("username");
// By passwordLocator = By.id("password");
// By loginButtonLocator = By.id("loginButton");
//
// // Methods to interact with WebElements
// public void enterUsername(String username) {
// // Code to interact with the username field
// }
// public void enterUsername("user123");
// public void loginenterPassword("pass456");
// public void loginclickLoginButton();
// // Similar methods for password and login button
// }
//
//
//
// public class LoginTest {
// @Test
// public void testLogin() {
// // Create an instance of the LoginPage class
// LoginPage loginPage = new LoginPage();
//
// // Use methods of LoginPage to perform the login
// loginPage.enterUsername("user123");
// loginPage.enterPassword("pass456");
// loginPage.clickLoginButton();
//
// // Additional assertions and verifications
// }
// }
//
//
// Pages
// Edit box
// Handle link
// Alert
// javascriptexecutor
//
//
//
// TestNG class
// Editbox
// Handlelink
// Alert
//
//
// MasterTestNG suite.xml
//
// <class name="tng.framework.editbox"/>
// <class name="tng.framework.Alert"/>
// <class name="tng.framework.handlelink"/>
