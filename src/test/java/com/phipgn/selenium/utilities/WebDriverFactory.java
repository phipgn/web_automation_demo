package com.phipgn.selenium.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class WebDriverFactory {
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String INTERNET_EXPLORER = "ie";

	private WebDriverFactory() {
	}

	public static WebDriver getInstance(String browserName) {
		WebDriver webDriver = null;

		switch (browserName) {
		case CHROME:
			ChromeDriverManager.getInstance().setup("85.0.4183.83");
			webDriver = new ChromeDriver();
			break;
		case FIREFOX:
			FirefoxDriverManager.getInstance().setup();
			webDriver = new FirefoxDriver();
			break;
		case INTERNET_EXPLORER:
			InternetExplorerDriverManager.getInstance().setup();
			webDriver = new InternetExplorerDriver();
			break;
		default:
			throw new IllegalArgumentException("Blah! Unsupported browser!");
		}

		return webDriver;
	}
}
