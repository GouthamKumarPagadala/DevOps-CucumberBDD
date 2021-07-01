package com.sampl.bdd.stepdefs;
import com.sampl.bdd.manager.UserActions;

import io.cucumber.java.en.Given;

public class StepDefinitions {
	
	UserActions userActions;
	
	public StepDefinitions() {
	}
	public StepDefinitions(UserActions userActions) {
		this.userActions = userActions;
	}


	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	 
	}


	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
