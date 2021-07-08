package com.sampl.bdd.junit;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(Cucumber.class)
@CucumberOptions(
		glue={"com.sampl.bdd.manager","com.sampl.bdd.stepdefs"},
		plugin = { "pretty" ,"json:target/results.json"},
		features = "classpath:Features/",
		monochrome = true)
public class RunCucumberChrome {

	static Logger LOGGER = LoggerFactory.getLogger(RunCucumberChrome.class);
	public static boolean useGrid = false;
	
}
