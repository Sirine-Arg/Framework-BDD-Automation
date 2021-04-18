package com.selenium.e2eTests.moduleMyInfo.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.selenium.e2eTests.moduleMyInfo.pageObjects.ModuleInfoPage;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModuleInfoStepDefinitions {

	public ModuleInfoPage moduleInfoPage = new ModuleInfoPage();
	public WebDriver driver;
	
	public ModuleInfoStepDefinitions() {
		driver=Setup.driver;
		PageFactory.initElements(driver, moduleInfoPage);
	}
	
	@When("^Je clique sur le module My Info$")
	public void jeCliqueSurLeModuleMyInfo() throws Throwable {
		moduleInfoPage.clickModuleMyInfo();
	}

	@When("^Je clique sur le boutton Edit$")
	public void jeCliqueSurLeBouttonEdit() throws Throwable {
		moduleInfoPage.clickBouttonEdit();
	}

	@When("^je saisie le champ Full Name \"([^\"]*)\"$")
	public void jeSaisieLeChampFullName(String Sirine) throws Throwable {
		moduleInfoPage.fillEmplyeeName(Sirine);
	}

	@Then("^Je clique sur le boutton Save$")
	public void jeCliqueSurLeBouttonSave() throws Throwable {
		moduleInfoPage.clickBouttonSave();
	}
}
