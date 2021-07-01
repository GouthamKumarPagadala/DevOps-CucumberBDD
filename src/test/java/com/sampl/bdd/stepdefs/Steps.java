package com.sampl.bdd.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Steps {

    @Given("I want to write a step with precondition{int}")
    public void iWantToWriteAStepWithPrecondition(int arg0) {
        System.out.println("Hello");
    }

    @And("some other precondition{int}")
    public void someOtherPrecondition(int arg0) {
        System.out.println("Trail");
    }
}
