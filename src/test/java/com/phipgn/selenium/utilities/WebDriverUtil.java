package com.phipgn.selenium.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
	private WebDriver driver;
	
	public WebDriverUtil() {
		System.setProperty("webdriver.chrome.driver", "C:/workspace/web_automation_demo/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
}
