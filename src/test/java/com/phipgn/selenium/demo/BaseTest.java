package com.phipgn.selenium.demo;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	protected WebDriver driver;
	
	protected void waitFor(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
