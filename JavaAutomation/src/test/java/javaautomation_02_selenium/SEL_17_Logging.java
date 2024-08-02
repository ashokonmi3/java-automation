package javaautomation_02_selenium;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

//ALL	All levels including custom levels.
//DEBUG	Designates fine-grained informational events that are most useful to debug an application.
//INFO	Designates informational messages that highlight the progress of the application at coarse-grained level.
//WARN	Designates potentially harmful situations.
//ERROR	Designates error events that might still allow the application to continue running.
//FATAL	Designates very severe error events that will presumably lead the application to abort.
//OFF	The highest possible rank and is intended to turn off logging.
//TRACE	Designates finer-grained informational events than the DEBUG. */
//ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF.

//==================================
public class SEL_17_Logging {
	static Logger log = Logger.getLogger(SEL_17_Logging.class);

	public static void main(String[] args) {
		// PropertiesConfigurator is used to configure logger from properties file
		PropertyConfigurator
				.configure("C:\\My\\users\\eclipse-workspace\\Selenium\\src\\Resource\\log4j-html.properties");

		log.debug("This is a debug message new");
		log.trace("This is a trace message new ");
		log.info("This is an info message new");
		log.warn("This is an warn message");
		log.error("This is an error message");
		log.fatal("This is an fatal message");
		System.out.println("Done");
	}
}

// ========================

// public class SEL_17_Logging {
// // static Logger log = Logger.getLogger(SEL_20_Logging.class.getName());
// // Logger log = Logger.getLogger("devpinoyLogger");
//
// public static void main(String[] args) throws InterruptedException {
// Logger log = Logger.getLogger("devpinoyLogger");
//
// PropertyConfigurator.configure("C:\\My\\users\\eclipse-workspace\\Selenium\\src\\Resource\\log4j.properties");
//
// log.info("----------starting the test case ---- ");
//
// WebDriver driver = new ChromeDriver();
//
// if (driver != null) {
// log.info("----------driver object is created ---- ");
//
// } else {
// log.error("----------driver object is not created ---- ");
//
// }
// log.debug("----------starting the test case ---- ");
//
// driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
// log.trace("the current url is ");
// log.info("This is an info message");
// log.warn("This is an warn message");
// log.error("This is an error message");
// log.fatal("This is an fatal message");
// // WebDriver driver = new ChromeDriver();
//
// // try {
// //
// driver.get("file:///C:/My/Study/javaselenium/webpages/login.html");
//
// driver.findElement(By.name("username")).sendKeys("root");
// driver.findElement(By.name("password")).sendKeys("root34");
// driver.findElement(By.xpath("/html/body/form/input[3]")).click();
// // String url = driver.getCurrentUrl();
// // } catch (Exception e) {
// // System.out.println(" i am in to exception");
//
// Alert ale = driver.switchTo().alert();
// Thread.sleep(5000);
// String s = ale.getText();
// System.out.println(s);
// ale.dismiss();
//
// log.debug("Alert text is " + s);
// log.debug("Expected Alert text is This is Alert");
//
// if (s.contains("Invalid Password")) {
// log.info("Handling error message. Test case passed.");
// } else {
// log.error("NOt able to capture error message. Test case failed.");
// }
// Thread.sleep(5000);
// driver.close();
// }
//
// }

// ==========================

// public class SEL_17_Logging {
// public static void main(String[] args) {
// // Set up logging
// Logger logger = Logger.getLogger("SeleniumLogging");
// FileHandler fh;
//
// try {
// // This block configure the logger with handler and formatter
// fh = new FileHandler("selenium.log");
// logger.addHandler(fh);
// SimpleFormatter formatter = new SimpleFormatter();
// fh.setFormatter(formatter);
//
// // Add timestamp to log messages
// System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF %1$tT
// %4$s %5$s%6$s%n");
//
// // Initialize WebDriver
// WebDriver driver = new ChromeDriver();
//
// // Set implicit wait
// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
// // Log that we are navigating to the login page
// logger.info("Navigating to login page");
//
// // Open the login page
// driver.get("https://google.com");
//
// // Find the username and password input fields and enter the credentials
// // WebElement usernameInput = driver.findElement(By.id("username")); //
// Replace
// // "username" with the actual ID of the username input field
// // WebElement passwordInput = driver.findElement(By.id("password")); //
// Replace
// // "password" with the actual ID of the password input field
// //
// // // Enter your username and password
// // usernameInput.sendKeys("your_username");
// // logger.info("Entered username");
// // passwordInput.sendKeys("your_password");
// // logger.info("Entered password");
// //
// // // Find and click the login button
// // WebElement loginButton =
// // driver.findElement(By.xpath("//button[contains(text(), 'Login')]")); //
// // Replace with the XPath of the login button
// // loginButton.click();
// // logger.info("Clicked login button");
// //
// // // Optionally, wait for the page to load after login
// // // WebDriverWait wait = new WebDriverWait(driver, 10);
// // //
// wait.until(ExpectedConditions.urlToBe("https://example.com/dashboard"));
// // // Replace with the URL of the dashboard page
// //
// // // Log that login was successful
// // logger.info("Login successful");
// //
// // // Your code for interacting with the logged-in pages goes here
// //
// // // Close the browser
// driver.quit();
// logger.info("Browser closed");
//
// } catch (Exception e) {
// logger.severe("Exception occurred: " + e.getMessage());
// }
// }
// }
