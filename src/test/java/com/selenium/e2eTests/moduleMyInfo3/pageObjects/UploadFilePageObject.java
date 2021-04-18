package com.selenium.e2eTests.moduleMyInfo3.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UploadFilePageObject {


	/* Locators */
	final static String MODULE_MYINFO_ID = "menu_pim_viewMyDetails";
	final static String BUTTON_CHOOSEFILE_ID = "btnAddAttachment";
	final static String BUTTON_UPLOAD_ID = "btnSaveAttachment";
	
	/* FindBy */
	@FindBy(how = How.ID, using = MODULE_MYINFO_ID)
	public static WebElement moduleMyInfo3;
	@FindBy(how = How.ID, using = BUTTON_CHOOSEFILE_ID)
	public static WebElement btnChooseFile;
	@FindBy(how = How.ID, using = BUTTON_UPLOAD_ID)
	public static WebElement btnUploadFile;
	
	/* Methods */
	public void clickModuleMyInfo3Page(){
		moduleMyInfo3.click();
	}
	public void clickBouttonChosseFile(){
		btnChooseFile.click();
	}
	
	public void clickBouttonUploadFile(){
		btnUploadFile.click();
	}
}

