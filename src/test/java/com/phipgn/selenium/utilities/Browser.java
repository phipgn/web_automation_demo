package com.phipgn.selenium.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Browser {

	private static String BaseURL = "https://www.facebook.com/";
	private static String BrowserName = "chrome";
	private static WebDriver webDriver;

	public static void initialize() {
		webDriver = WebDriverFactory.getInstance(BrowserName);
		goTo("");
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	public static String getTitle() {
		return webDriver.getTitle();
	}

	public static void goTo(String url) {
		webDriver.get(BaseURL + url);
	}

	public static void close() {
		webDriver.close();
	}

	public static WebDriver getDriver() {
		return webDriver;
	}
}
