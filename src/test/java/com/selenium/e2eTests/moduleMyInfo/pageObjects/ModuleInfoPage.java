package com.selenium.e2eTests.moduleMyInfo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ModuleInfoPage {

	
	/* Locators */
	final static String MODULE_MYINFO_ID = "menu_pim_viewMyDetails";
	final static String BUTTON_EDIT_ID = "btnSave";
	final static String EMPLOYEE_NAME_ID = "personal_txtEmpFirstName";
	final static String BUTTON_SAVE_ID = "btnSave";

	/* FindBy */
	@FindBy(how = How.ID, using = MODULE_MYINFO_ID)
	public static WebElement moduleMyInfo;
	@FindBy(how = How.ID, using = BUTTON_EDIT_ID)
	public static WebElement btnEdit;
	@FindBy(how = How.ID, using = EMPLOYEE_NAME_ID)
	public static WebElement employeeName;
	@FindBy(how = How.ID, using = BUTTON_SAVE_ID)
	public static WebElement btnSave;
	
	/* Methods */
	public void clickModuleMyInfo(){
		moduleMyInfo.click();
	}
	public void clickBouttonEdit(){
		btnEdit.click();
	}
	public void fillEmplyeeName(String name){
		employeeName.sendKeys(name);
	}
	public void clickBouttonSave() {
		btnSave.click();
	}
}

