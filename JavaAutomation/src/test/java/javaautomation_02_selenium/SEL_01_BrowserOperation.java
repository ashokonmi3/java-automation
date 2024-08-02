package javaautomation_02_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//======================================
//SELENIUM ARCHITECTURE
//1. Selenium libraries ( Java , Python, Ruby, C# , Java Script)
//2) Browser Driver (Gecko driver - firefox, chrome driver- chrome. Ieserver- internet explorer)
//
//
//Selenium library ----> Webdriver -----> Real Browser 
//                W3C protocol   Request HTTP
//Sele library              resp         <-------- Response HTTP 
//
//
//Communication :
//Webdriver -- Real browser ( Through HTTP Protocol)
//Webriver --> Selenium Library ( Java code ) Through W3C protocol (Before Json WIRE Protocol)
//=====================================
// Selenium Installation steps
//		1. In Eclipse go to  File --> New --> Other --> Maven --> Maven --> Maven Project
//		Group Id and Artifact id (Project name)
//		A POM.xml will be created
//      Go to google and search the maven dependency for selenium 4  
//      create a tag <dependencies> </dependencies>Copy the dependency of selenium in between .

//<dependencies>
//<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
//<dependency>
//    <groupId>org.seleniumhq.selenium</groupId>
//    <artifactId>selenium-java</artifactId>
//    <version>4.16.1</version>
//</dependency>
//</dependencies>

//in the POM.xml file
// Save file

//Group ID (groupId):
//Group Identifier: The groupId is a unique identifier for a project's group or organization.
//Reverse Domain Name: Often, it follows the convention of a reverse domain name (e.g., com.example).
//Naming Conventions: It should be a unique identifier to avoid conflicts when publishing artifacts to repositories.
//Example: For an organization named "example" with a project named "myproject," the groupId might be com.example.myproject.
//Artifact ID (artifactId):
//Artifact Identifier: The artifactId identifies the specific artifact (usually a JAR, WAR, or other output) produced by the project.
//Naming: It should be descriptive but simple, denoting the name of the specific project or module.
//Unique within Group: The combination of groupId and artifactId uniquely identifies the artifact within the repository.
//Example: For the "myproject" mentioned earlier, the artifactId might also be myproject.

// Example of web page
// SEL_01_WebDriverDemoWebsite.html

// ==========================================
//public class SEL_01_BrowserOperation {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/Web_Elements.html");
//		Thread.sleep(3000);
//
//		driver.quit();
//	}
//
//}
// =======================
//public class SEL_01_BrowserOperation {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
//
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/Web_Elements.html");
//		// driver1.get("https://www.rediff.com");
//		Thread.sleep(3000);
//
//		driver.quit();
//	}
//
//}

// ====================
/*
 * Difference between close and quit: 1) Close browser closes the current
 * browser window, Quit browser will close the all the browser windows opened by
 * the driver
 * 
 * 2) Quit browser will not only just closes the browser windows , quit() also
 * terminates the driverserver from the CPU process which save us some memory
 * but close() will not do it.
 * 
 * Once quit() is used the driver object becomes not-reachable so you cannot
 * perform any operation on the driver object. Close() browser make the driver
 * object still avail to the user.
 *
 * 
 * Get method We can open the browser by using get() a non static method present
 * in the FirefoxDriver class, it accepts a string as arguments and the string
 * should be the website address. A special thing about this get() method is it
 * will not give control to the next line till the page loads completely. What
 * is protocol ? Protocol is simple it mention what kind of site is that. Eg for
 * protocol: -http -https -ftp -file
 * 
 */

// ===============================
// Work offline
//public class SEL_01_BrowserOperation {
//	//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		String currentDirectory = System.getProperty("user.dir");// it gives the
//		// current directory
//		System.out.println("Current directory " + currentDirectory);
//		String url = currentDirectory + "\\SEL_01_WebDriverDemoWebsite.html";
//		url = currentDirectory + "\\SEL_01_WebDriverDemoWebsite.html";
//		System.out.println("url is : " + url);
//
//		driver.get(
//				"file:///D:/Study/Java_Automation_git/Selenium_Learning/learning/src/main/java/selenium/learning/SEL_01_WebDriverDemoWebsite.html");
//		Thread.sleep(3000);
//		driver.manage().window().maximize();// We do not have any method to
//
//		Thread.sleep(3000);
//		driver.quit();
//	}
//
//}
// ===================

// Open a url
// Maximize
// Close
// Minimize
// Resize
// Navigation to different tab
// close tab
// refresh
// Navigate back and forward
// Title of web page
// page source
// Resize the browser size

// =========================
// driver.manage().window().maximize() is a fluent method chaining technique,
// where each method call returns an object that allows the invocation of
// subsequent methods.
// driver.manage() returns an instance of Options for managing browser settings.
// window() returns an instance of Window for managing window-specific settings.
// maximize() maximizes the browser window to the full available screen space,
// providing a larger viewing area for web content.

// driver.manage().window().maximize === maximize the window
// driver.manage().window().getsize() === REturn the current size of window
// driver.manage().window().setsize(Dimension )
// dimesion = new Dimension(700,300)
// =======================================
//public class SEL_01_BrowserOperation {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in");
//
//		String str1 = new String("Selenium Testing");
//		str1.trim();
//
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		// Options a = driver.manage();
//		// Window b = a.window();
//		// b.maximize();
//		System.out.println(driver.manage().window().getSize());
//		System.out.println(driver.manage().window().getSize().getHeight());
//		System.out.println(driver.manage().window().getSize().getWidth());
//		Thread.sleep(3000);
//		driver.manage().window().setSize(new Dimension(720, 200));// import org.openqa.selenium.Dimension;
//
//		Thread.sleep(3000);
//		System.out.println("current size is " + driver.manage().window().getSize());
//		if (driver.manage().window().getSize().getHeight() == 200
//				&& driver.manage().window().getSize().getWidth() == 720) {
//			System.out.println("the size is set correctly as 720 and 200 ");
//
//		} else {
//			System.out.println("the size is not set correctly as 720 and 200 ");
//		}
//		Thread.sleep(3000);
//		driver.quit();
//	}
//
//}

// ============================
//public class SEL_01_BrowserOperation {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// driver.get("https://www.google.co.in");
//		driver.navigate().to("https://www.google.co.in");
//		String expectedtitle = "Google";
//		Thread.sleep(3000);
//		String URL = driver.getCurrentUrl();
//		System.out.println(URL);
//		String Title = driver.getTitle();// Title of webpage
//		System.out.println("Title of webpage is " + Title);
//		if (expectedtitle.equals(Title)) {
//			System.out.println("test pass");
//		}
//		driver.navigate().to("https://login.yahoo.com/");
//		Thread.sleep(3000);
//		String URL1 = driver.getCurrentUrl();
//		System.out.println(URL1);
//		// navigate().back()-It moves a single item back in the Browser history.
//		driver.navigate().back();
//		Thread.sleep(3000);
//		String URL2 = driver.getCurrentUrl();
//		System.out.println(URL2);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//
//		driver.quit();
//
//	}
//}

// ==================
//public class SEL_01_BrowserOperation {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// driver.get("https://www.google.co.in");
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/Web_Elements.html");
//		Thread.sleep(3000);
//
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		// pageSource.
//		System.out.println(
//				"PAGE SOURCE CONTAINS Copyright Info " + pageSource.contains("Copyright(c)2010 Robert Kieffer"));
//		driver.quit();
//	}
//}
// =======================

public class SEL_01_BrowserOperation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		Thread.sleep(2000);

		System.out.println(driver.manage().window().getSize());
		System.out.println("Title : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

		driver.quit();

	}
}

// Write a
// program to
// launch a website,
// print title
// of webpage, check
// the defaultsize,
// get
// current url, get
// page source and do
// some validation
// in the
// source code.

// 2004 - selenium core
// 2006 - selenium IDE - record the interaction with the browser , it will
// generate test script , (any programming language)
// 2007 - Selenium webdriver
// 2011- Selenium Grid 2
// 2018 - Selenium 4
// ==============
// Selenium Architecture
// 1) Selenoum Client Libraries : Libraries to provide methods, classes to
// create webdriver instances, manipulate
// web elements, and execute the commands.
// 2) Webdriver API :
// 3) Broswer Driver :
// 4) JSON Wire protocol:
