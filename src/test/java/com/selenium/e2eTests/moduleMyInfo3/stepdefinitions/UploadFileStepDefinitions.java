package com.selenium.e2eTests.moduleMyInfo3.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleMyInfo2.pageObjects.ModuleMyInfo2Page;
import com.selenium.e2eTests.moduleMyInfo3.pageObjects.UploadFilePageObject;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;

public class UploadFileStepDefinitions {

	public UploadFilePageObject uploadFilePage = new UploadFilePageObject();
	public WebDriver driver;
	
	public UploadFileStepDefinitions() {
		driver=Setup.driver;
		PageFactory.initElements(driver, uploadFilePage);
	}
	
	
	@Then("^Je clique sur le boutton AddFile$")
	public void jeCliqueSurLeBouttonAddFile() throws Throwable {
		uploadFilePage.clickBouttonChosseFile();;
	}

	@Then("^Je choisis un fichiers$")
	public void jeChoisisUnFichiers() throws Throwable {
		uploadFilePage.clickBouttonUploadFile();
	}

	@Then("^Je clique sur le boutton upload$")
	public void jeCliqueSurLeBouttonUpload() throws Throwable {
		uploadFilePage.clickBouttonUploadFile();
	}
}
