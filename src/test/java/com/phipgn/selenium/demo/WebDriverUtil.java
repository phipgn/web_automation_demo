package com.phipgn.selenium.demo;

public class WebDriverUtil {
	private static WebDriverUtil driver;
	
	private WebDriverUtil() {}
	
	public WebDriverUtil getDriver() {
		if (driver == null)
			driver = new WebDriverUtil();
		return driver;
	}
}
