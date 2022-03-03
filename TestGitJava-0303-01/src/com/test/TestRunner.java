package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles\\LoginToFacebook.feature", glue = "com.stepdefinitions", dryRun=true)
public class TestRunner {

}
