package javaautomation_02_selenium;

/*C:\My\P\Study\javaselenium>java -jar selenium-server-standalone-3.141.59 -role hub
 * 
 * run to register the node to hub
 * java -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://localhost:4444/grid/register -port 5566

 */

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// Standalone
		// java -jar selenium-server-4.15.0.jar standalone

		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.setCapability("browserVersion", "119");
		// chromeOptions.setCapability("platformName", "Windows 11");
		// Showing a test name instead of the session id in the Grid UI
		chromeOptions.setCapability("se:name", "My simple test");
		// Other type of metadata can be seen in the Grid UI by clicking on the
		// session info or via GraphQL
		chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);

		driver.get("http://www.google.com");
		Thread.sleep(3000);

		driver.quit();

	}
}

// =================================

// public class GridDemo {
// public static WebDriver driver;
//
// public static void main(String[] args) throws MalformedURLException,
// InterruptedException {
//
// ChromeOptions chromeOptions = new ChromeOptions();
// // chromeOptions.setCapability("browserVersion", "119");
// // chromeOptions.setCapability("platformName", "Windows 11");
// // Showing a test name instead of the session id in the Grid UI
// chromeOptions.setCapability("se:name", "My simple test");
// // Other type of metadata can be seen in the Grid UI by clicking on the
// // session info or via GraphQL
// chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");
// WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),
// chromeOptions);
//
//
// driver.get("http://www.google.com");
// Thread.sleep(3000);
//
// driver.quit();
//
// }
// }

// public class GridDemo {

// WebDriver driver;
// String baseUrl, nodeURL;
// @BeforeTest
// public void setUpWthrows MalformedURLException {
// baseUrl = "http://newtours.demoaut.com/";
// nodeURL = "http://192.168.1.4:5566/wd/hub";
// DesiredCapabilities capability = DesiredCapabilities.firefox();
// capability. setBrowserName("firefox");
// capability. setPlatform(Platform.XP);
// driver = new RemoteWebDriver(new URL(nodeURL), capability);
// }
// @AfterTest
// public void afterTest() {
// driver.quit();
// }
// @Test
// public void simpleTest() {
// driver.get(baseUr1);
// Assert.assertEquas("Welcome: Mercury Tours", driver.getTitle()); }
// }