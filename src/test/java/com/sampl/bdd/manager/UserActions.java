package com.sampl.bdd.manager;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sampl.bdd.enumerations.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	WebDriver driver;

	public void launchApplication(String url, BrowserType browser) {
		switch (browser) {
		case Chrome:
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("disable-dev-shm-usage");
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			break;
		case Firefox:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case GRID_CHROME:
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		default:
			break;
		}
		driver.get(url);
	}

	public void quit() {
		driver.quit();
	}
}
