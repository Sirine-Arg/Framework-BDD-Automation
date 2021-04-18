package com.selenium.e2eTests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		//glue = {"src/test/java"},
		plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/OrangeHRM-report.html"}, 
		snippets = SnippetType.CAMELCASE,
	    //tags = {("@info3")},
	     tags = {("@tag1")},
		//tags = {("@myinfo")},
		//tags = {("@Admin")},
		//tags = {("@connexion, @buzz")}
		monochrome = true
		
		)

public class TestRunner {
	@AfterClass
	
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}

}
