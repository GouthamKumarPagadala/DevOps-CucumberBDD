package com.sampl.bdd.stepdefs;

import com.sampl.bdd.enumerations.BrowserType;
import com.sampl.bdd.junit.RunCucumberChrome;
import com.sampl.bdd.manager.UserActions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	UserActions userActions;
	
	public Hooks() {
	}
	
	public Hooks(UserActions userActions) {
		
		this.userActions = userActions;
	}

	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Before("@chrome")
	public void beforeChrome() {
		System.out.println("Before Chrome");
		if(RunCucumberChrome.useGrid) {
			userActions.launchApplication("https://google.com", BrowserType.GRID_CHROME);
		}else {
			userActions.launchApplication("https://google.com", BrowserType.Chrome);
		}

	}
	
	@After("@chrome")
	public void afterChrome() {
		System.out.println("After Chrome");
		userActions.quit();
	}
	
	@Before("@firefox")
	public void beforeFirefox() {
		System.out.println("Before Firefox");
		userActions.launchApplication("https://facebook.com", BrowserType.Firefox);
	}
	
	@After("@firefox")
	public void afterFirefox() {
		System.out.println("After Firefox");
		userActions.quit();
	}
	
	
	@After
	public void after() {
		System.out.println("After");
	}
	
}
