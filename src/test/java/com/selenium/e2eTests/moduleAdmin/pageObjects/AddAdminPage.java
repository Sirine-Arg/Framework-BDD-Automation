package com.selenium.e2eTests.moduleAdmin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddAdminPage {

	/* Locators */
	final static String MENU_ADMIN_ID = "menu_admin_viewAdminModule";
	final static String BUTTON_ADD_ID = "btnAdd";
	final static String EMPLOYEE_NAME_ID = "systemUser_employeeName_empName";
	final static String EMPLOYEE_USERNAME_ID = "systemUser_userName";
	final static String EMPLOYEE_PASSWORD_ID = "systemUser_password";
	final static String EMPLOYEE_CONFIRM_PASSWORD_ID = "systemUser_confirmPassword";
	final static String BUTON_SAVE_ID = "btnSave";

	/* FindBy */
	@FindBy(how = How.ID, using = MENU_ADMIN_ID)
	public static WebElement menuAdmin;
	@FindBy(how = How.ID, using = BUTTON_ADD_ID)
	public static WebElement btnAdd;
	@FindBy(how = How.ID, using = EMPLOYEE_NAME_ID)
	public static WebElement employeeName;
	@FindBy(how = How.ID, using = EMPLOYEE_USERNAME_ID)
	public static WebElement UserName;
	@FindBy(how = How.ID, using = EMPLOYEE_PASSWORD_ID)
	public static WebElement employeePassword;
	@FindBy(how = How.ID, using = EMPLOYEE_CONFIRM_PASSWORD_ID)
	public static WebElement employeeConfirmPassword;
	@FindBy(how = How.ID, using = BUTON_SAVE_ID)
	public static WebElement btnSave;

	/* Methods */
	public void clickModuleAdmin() {
		menuAdmin.click();
	}

	public void clickButtonAdd() {
		btnAdd.click();
	}

	public void fillName(String name) {
		employeeName.sendKeys(name);
	}

	public void fillUserName(String username) {
		UserName.sendKeys(username);
	}

	public void fillEmployeePassword(String password) {
		employeePassword.sendKeys(password);
	}

	public void confirmPassword(String confirmpassword) {
		employeeConfirmPassword.sendKeys(confirmpassword);
	}

	public void clickButtonSave() {
		btnSave.click();
	}

	//public void remplirFormulairUserSys(String name, String username, String password, String confirmpassword) {
		//btnAdd.click();
		//employeeName.sendKeys(name);
		//UserName.sendKeys(username);
		//employeePassword.sendKeys(password);
		//employeeConfirmPassword.sendKeys(confirmpassword);
		//btnSave.click();
	}

