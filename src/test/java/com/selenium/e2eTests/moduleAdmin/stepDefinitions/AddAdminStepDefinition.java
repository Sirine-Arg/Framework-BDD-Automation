package com.selenium.e2eTests.moduleAdmin.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleAdmin.pageObjects.AddAdminPage;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAdminStepDefinition {
	public WebDriver driver;
	public AddAdminPage addAdminPage = new AddAdminPage();
	
	//Constructor
	public AddAdminStepDefinition () {
		driver=Setup.driver;
		PageFactory.initElements(driver, addAdminPage);
	}
	
	@When("^Je clique sur le module Admin$")
	public void jeCliqueSurLeModuleAdmin() throws Throwable {
		addAdminPage.clickModuleAdmin();
	}

	@When("^Je clique sur le boutton Add$")
	public void jeCliqueSurLeBouttonAdd() throws Throwable {
		addAdminPage.clickButtonAdd();
	}

	@When("^je saisie le champ Employee Name \"([^\"]*)\"$")
	public void jeSaisieLeChampEmployeeName(String employeename) throws Throwable {
		addAdminPage.fillUserName(employeename);
	}

	@When("^je saisie le champ Username \"([^\"]*)\"$")
	public void jeSaisieLeChampUsername(String username) throws Throwable {
		addAdminPage.fillName(username);
	}

	@When("^je saisie le champ Password \"([^\"]*)\"$")
	public void jeSaisieLeChampPassword(String password) throws Throwable {
		addAdminPage.fillEmployeePassword(password);
	}

	@When("^je saisie le champ Confirm Password \"([^\"]*)\"$")
	public void jeSaisieLeChampConfirmPassword(String confirmpassword) throws Throwable {
		addAdminPage.confirmPassword(confirmpassword);
	}

	@Then("^je clique sur le boutton Save$")
	public void jeCliqueSurLeBouttonSave() throws Throwable {
		addAdminPage.clickButtonSave();
	}
}
