package com.sampl.bdd.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sampl.bdd.enumerations.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void launchDriver(BrowserType browser) {
		switch(browser) {
		case Chrome:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case Firefox:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
	}
	
}
