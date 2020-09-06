package com.phipgn.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.phipgn.selenium.utilities.Browser;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void init() {
		Browser.initialize();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (Browser.getDriver() != null)
			Browser.getDriver().quit();
	}

	protected void waitFor(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Browser.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
