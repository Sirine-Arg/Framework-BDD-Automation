package com.selenium.e2eTests.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.pageObjects.AuthentificationPage;
import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {

	public WebDriver driver;
	public AuthentificationPage authentificationPage = new AuthentificationPage();
	public CommonMethods commonMethods = new CommonMethods();
	//Constructor
	public AuthentificationStepDefinition() {
		driver=Setup.driver;
	}
	
	@Given("^J'ouvre l'application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
		commonMethods.openApplication();
	}

	@When("^Je saisie le username \"([^\"]*)\"$")
	public void jeSaisieLeUsername(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.fillUserName(name);
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String password) throws Throwable {
		authentificationPage.fillPassword(password);
	}

	@When("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		authentificationPage.clickOnBtnLogin();
	}

	@Then("^Redirection vers la page home OrangeHRM \"([^\"]*)\"$")
	public void redirectionVersLaPageHomeOrangeHRM(String textMessage) throws Throwable {
		String adminUser = AuthentificationPage.messageWelcome.getText();
		Assert.assertEquals(textMessage, adminUser);
	    
	}

}
