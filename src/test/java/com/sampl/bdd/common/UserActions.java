package com.sampl.bdd.common;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sampl.bdd.enumerations.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public WebDriver driver;

	public void launchApplication(String url, BrowserType browser) {
		switch (browser) {
		case Chrome:
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("--no-sandbox");
			options.addArguments("disable-dev-shm-usage");
			// options.addArguments("--headless");
			driver = new ChromeDriver(options);
			break;
		case Firefox:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case GRID_CHROME:
			try {
				ChromeOptions opts = new ChromeOptions();
				opts.setCapability(CapabilityType.BROWSER_NAME, org.openqa.selenium.remote.BrowserType.CHROME);
				opts.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);

				// Test Name opts.setCapability("name", "myTestName"); //Build Name
				opts.setCapability("build", "myTestBuild"); // Idle TimeOut
				opts.setCapability("idleTimeout", 150); // Screen Resolution
				opts.setCapability("screenResolution", "1920x1080"); // Disable Video
				opts.setCapability("tz", "Europe/Berlin");

				// opts.addArguments("--no-sandbox");
				opts.addArguments("disable-dev-shm-usage");
				// opts.addArguments("--headless");
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), opts);
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
