package com.phipgn.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.phipgn.selenium.utilities.Browser;

public class BaseTest {
	protected WebDriver driver;

	@BeforeClass
	public void init() {
		Browser.initialize();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		if (Browser.getDriver() != null)
			Browser.getDriver().quit();
	}

	protected void waitFor(int time) {
		Browser.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
