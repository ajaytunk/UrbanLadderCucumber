package com.CucumberUrbanLadder.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="./features",
		glue="com.CucumberUrbanLadder.stepDefinition",
		plugin = { "pretty","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Reports/report.html"},
		monochrome = true)

public class HomePageRunner extends AbstractTestNGCucumberTests{

	
}


