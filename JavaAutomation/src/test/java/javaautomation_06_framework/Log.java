package javaautomation_06_framework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	static Logger logger = Logger.getLogger(Log.class);

	static {
		PropertyConfigurator.configure(
				"D:\\Study\\eclipse-workspace\\JavaAutomation\\src\\test\\java\\javaautomation_06_framework\\log4j.properties");
	}

	public static void info(String message) {
		logger.info(message);
	}

	public static void error(String message) {
		logger.error(message);
	}

	public static void debug(String message) {
		logger.debug(message);
	}
}
