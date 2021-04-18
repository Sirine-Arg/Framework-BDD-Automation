package com.selenium.e2eTests.moduleBuzz.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleBuzz.pageObjects.ModuleBuzzPage;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class ModuleBuzzStepDefinition {

	public ModuleBuzzPage moduleBuzzPage = new ModuleBuzzPage();
	public WebDriver driver;
	
	public ModuleBuzzStepDefinition() {
		driver=Setup.driver;
		PageFactory.initElements(driver, moduleBuzzPage);
	}
	
	@When("^Je clique sur le module Buzz$")
	public void jeCliqueSurLeModuleBuzz() throws Throwable {
		moduleBuzzPage.clickModuleBuzz();
	}

	@When("^Je saisie un message dans le champ Update Status \"([^\"]*)\"$")
	public void jeSaisieUnMessageDansLeChampUpdateStatus(String message) throws Throwable {
		moduleBuzzPage.fillMessageInUpdateStatus(message);
	}

}
