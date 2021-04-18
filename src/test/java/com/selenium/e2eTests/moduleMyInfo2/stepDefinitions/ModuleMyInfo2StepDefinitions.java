package com.selenium.e2eTests.moduleMyInfo2.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.selenium.e2eTests.moduleMyInfo2.pageObjects.ModuleMyInfo2Page;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModuleMyInfo2StepDefinitions {

	public ModuleMyInfo2Page moduleInfo2Page = new ModuleMyInfo2Page();
	public WebDriver driver;
	
	public ModuleMyInfo2StepDefinitions() {
		driver=Setup.driver;
		PageFactory.initElements(driver, moduleInfo2Page);
	}
	
	@When("^JE clique sur le boutton Edit$")
	public void jeCliqueSurLeBouttonEdit() throws Throwable {
		moduleInfo2Page.clickBouttonEdit();
	}

	@When("^je selectionne le type du sang$")
	public void jeSelectionneLeTypeDuSang() throws Throwable {
		moduleInfo2Page.selectEmplyeeBloodType();
	}

	@Then("^Je clique sur le boutton save$")
	public void jeCliqueSurLeBouttonSave() throws Throwable {
		moduleInfo2Page.clickBouttonSave();
	}
	
}
