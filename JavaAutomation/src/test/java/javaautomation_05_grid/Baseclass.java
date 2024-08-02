package javaautomation_05_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Baseclass {

	public WebDriver initializebrowser(String browsername) throws MalformedURLException {

		WebDriver driver;
		DesiredCapabilities dc = new DesiredCapabilities();
		if (browsername.equals("chrome")) {
			dc.setBrowserName("chrome");
		} else if (browsername.equals("firefox")) {
			dc.setBrowserName("firefox");
		}

		else if (browsername.equals("edge")) {
			dc.setBrowserName("MicrosoftEdge");
		}

		driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);

		return driver;
	}
}