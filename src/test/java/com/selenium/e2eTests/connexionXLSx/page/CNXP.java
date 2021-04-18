package com.selenium.e2eTests.connexionXLSx.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.selenium.e2eTests.utils.ExcelUtils;

public class CNXP {

	/* Locators */
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSEWORD_ID = "txtPassword";
	
	/* FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSEWORD_ID)
	public static WebElement passWord;
	
	
	
	public static void signInXlsX() {
		String sUserName = ExcelUtils.getCellData(1, 1);
		String sPassword = ExcelUtils.getCellData(1, 2);
		userName.sendKeys(sUserName);
		passWord.sendKeys(sPassword);
	}
}
