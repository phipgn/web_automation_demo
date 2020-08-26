package com.phipgn.selenium.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DemoTest extends BaseTest {
	
	@BeforeMethod
	public void beforeMethod() {
		if (driver == null)
			driver = new WebDriverUtil().getDriver();
		driver.navigate().to("https://www.fb.com");
	}
	
	@AfterMethod
	public void afterMethod() {
		waitFor(1000);
		driver.close();
		driver = null;
	}
	
	@Test
	public void test01() {
		
	}

}
