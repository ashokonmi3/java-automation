package javaautomation_02_selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//public class SEL_18_Propertyfile {
//	public static void main(String[] args) throws IOException, InterruptedException {
//		// 1. Create a property file with data
//		// 2. Create an input stream from property file
//		// 3. Create an property object
//		// 4. Load the input stream from property using load function
//		// 5. Getproperty function will return the property want to read
//		//
//
//		// create file input stream object for the properties file
//		FileInputStream fis = new FileInputStream(
//				"D:\\Study\\Java_Automation_git\\Selenium_Learning\\learning\\src\\main\\java\\selenium\\learning\\config.properties");
//		// create Properties class object to access properties file
//		Properties prop = new Properties();
//		// load the properties file
//		prop.load(fis);
//		// get the property of "url" using getProperty()
//		String url = prop.getProperty("url");
//		String user = prop.getProperty("user");
//		System.out.println(user);
//		// get the property of "url" using get()
//		String pass = prop.getProperty("password");
//		System.out.println(pass);
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys(user);
//		Thread.sleep(2000);
//		driver.findElement(By.name("password")).sendKeys(pass);
//		Thread.sleep(2000);
//		driver.quit();
//	}
//}

// ==============================
public class SEL_18_Propertyfile {
	public static void main(String[] args) throws IOException {
		// create file output stream object for the properties file
		FileOutputStream fis = new FileOutputStream(
				"D:\\Study\\Java_Automation_git\\Selenium_Learning\\learning\\src\\main\\java\\selenium\\learning\\config-write.properties");
		// create Properties class object to access properties file
		Properties prop = new Properties();
		// load the properties file
		// set the properties
		prop.setProperty("Selenium", "https://selenium.org");
		prop.setProperty("Google", "https://google.com");
		prop.setProperty("Yahoo", "https://yahoo.com");
		// store the file into local system
		prop.store(fis, "This is property file for test");
		System.out.println("Execution completed");

	}
}