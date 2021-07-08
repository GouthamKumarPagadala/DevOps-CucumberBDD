package com.sampl.java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.demoqa.com/text-box"); //-> This will help to launch the url 
		//By.className("") -> // this will be used to indetify the locator using class 
		//By.id("") -> // this will be used to identify the locator using ID
		//By.linkText("") -> This will be used to identify the hyperlinks -> Tag name ( anchor -> a)
		//By.partialLinkText("A/B Testing") -> This will be used to identify the link text using contains
		//By.tagName("") -> This will be used to identify the locator using tag name
		//By.xpath("") -> 
		//	1. Absolute XPATH -> /html/body/div/ul/li/a
		//	2. Relative XPATH -> //tagname[@attribute='value']
		//		a. multiple attributes //tagname[@attribute1='value' and @attribute2='value']
		//		b. attribute contains //tagname[contains(@attribute,'value')]
		//		c. text //tagname[text()='value']
		//		d. text - contains //tagname[contains(text(),'value')]
		driver.findElement(By.id("userName")).sendKeys("Full Name By Chandrika");
		driver.findElement(By.id("userEmail")).sendKeys("sample@gmail.com");
		//HW
		//enter current address
		//enter permanenet address
		//perform click on link text "https://www.demoqa.com/links"
		driver.get("https://www.demoqa.com/links");
		driver.findElement(By.linkText("Created")).click();
		System.out.println(driver.findElement(By.id("linkResponse")).getText());
		//driver.close() -> will close the current context window
		driver.quit(); // this will close all the context windows
		
		//Try to fill this practive form "https://www.demoqa.com/automation-practice-form"
		
		//Java Basics -> Refresh
		//	How to creat a class
		//	how to create a method
		//	When to use if Condition
		//	When to use for loop
		//	when to use while loop
		//	when to use switch case
		//How to setup a maven project
		//How to import a maven project
		//How to initalize a git repo
		//How to maintain a git repo
		//How to use BDD, Page object model
		//How to use Maven
		//How to send api request from java code
		
		
		//TestNg -> Framewrok
				
		// -> Developers -> Git repository/Bit Bucket repository
		// Developer -> Push the code to repo
		// Devops team will deploy this application code into environment( SIT/UAT )
		// They will provide url to access the application
		// CR -> Change Request -> Development code will be changed -> Deploy -> Regression
		
		
		
	}

}
