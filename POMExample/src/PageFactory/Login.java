package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	/**
	 * 
	 * All WebElements are identified by @FindBy annotation
	 * 
	 */

	WebDriver driver;
	// By userName = By.name("username");
	@FindBy(name = "username")
	WebElement username; // driver.findElement(By.name("username"));
	// username.sendKeys(strUserName);

	@FindBy(name = "password")
	WebElement password;

	@FindBy(linkText = "Google")
	WebElement titleText;

	@FindBy(xpath = "/html/body/form/input[3]")
	WebElement login;

	public Login(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	// Set user name in textbox

	public void setUserName(String strUserName) {
		username.sendKeys(strUserName);

	}

	// Set password in password textbox

	public void setPassword(String strPassword) {

		password.sendKeys(strPassword);

	}

	// Click on login button

	public void clickLogin() {

		login.click();

	}

	// Get the title of Login Page

	public String getLoginTitle() {

		String Title = driver.getTitle();
		return Title;
	}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPasword
	 * 
	 * @return
	 * 
	 */

	public void loginTo(String strUserName, String strPasword) {

		// Fill user name

		this.setUserName(strUserName);

		// Fill password

		this.setPassword(strPasword);

		// Click Login button

		this.clickLogin();

	}

}