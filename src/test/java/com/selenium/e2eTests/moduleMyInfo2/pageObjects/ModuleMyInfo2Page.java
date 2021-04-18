package com.selenium.e2eTests.moduleMyInfo2.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ModuleMyInfo2Page {

	/* Locators */
	final static String MODULE_MYINFO_ID = "menu_pim_viewMyDetails";
	final static String BUTTON_EDIT_ID = "btnEditCustom";
	final static String EMPLOYEE_BLOODTYPE_LINK_TEXT = "AB+";
	final static String BUTTON_SAVE_ID = "btnEditCustom";

	/* FindBy */
	@FindBy(how = How.ID, using = MODULE_MYINFO_ID)
	public static WebElement moduleMyInfo2;
	@FindBy(how = How.ID, using = BUTTON_EDIT_ID)
	public static WebElement btnEdit;
	@FindBy(how = How.NAME, using = EMPLOYEE_BLOODTYPE_LINK_TEXT)
	public static WebElement linkText;
	@FindBy(how = How.ID, using = BUTTON_SAVE_ID)
	public static WebElement btnSave;
	
	
	/* Methods */
	public void clickModuleMyInfo2Page(){
		moduleMyInfo2.click();
	}
	public void clickBouttonEdit(){
		btnEdit.click();
	}
	public void selectEmplyeeBloodType(){
		linkText.click();
	}
	public void clickBouttonSave() {
		btnSave.click();
	}
	
}
