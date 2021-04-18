package com.selenium.e2eTests.authentification.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {

	/* Locators */
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSEWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN_ID = "btnLogin";
	final static String MESSAGE_WELCOME_ID = "welcome";
	
	/* FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSEWORD_ID)
	public static WebElement passWord;
	@FindBy(how = How.ID, using = BUTTON_LOGIN_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = MESSAGE_WELCOME_ID)
	public static WebElement messageWelcome;
	
	//@FindBy(id = "idOfYourElement")
	//WebElement myLocator;

	/* Methods */
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}

	public void fillPassword(String password) {
		passWord.sendKeys(password);
	}

	public void clickOnBtnLogin() {
		btnLogin.click();
	}

}
