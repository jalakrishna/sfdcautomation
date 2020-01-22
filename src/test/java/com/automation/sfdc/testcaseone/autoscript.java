package com.automation.sfdc.testcaseone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoscript {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.youtube.com");
	}

	
	
	
}
