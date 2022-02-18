package com.sampl.bdd.stepdefs;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {


    WebDriver driver;
    @Given("I want to write a step with precondition{int}")
    public void iWantToWriteAStepWithPrecondition(int arg0) {
        System.out.println("Hello");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        Hooks.scenario.log("Goutham Report Log");
    }

    @And("some other precondition{int}")
    public void someOtherPrecondition(int arg0) {
        System.out.println("Trail");
        Hooks.scenario.log("Goutham Report Log2 ");
    }

    @Given("I want to write a step with precondition")
    public void iWantToWriteAStepWithPrecondition() {
       
    }

    @And("some other precondition")
    public void someOtherPrecondition() {
        driver.quit();
    }
}
