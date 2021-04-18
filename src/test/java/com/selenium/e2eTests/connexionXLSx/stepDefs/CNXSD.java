package com.selenium.e2eTests.connexionXLSx.stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.utils.Constant;
import com.selenium.e2eTests.utils.ExcelUtils;
import com.selenium.e2eTests.utils.Setup;
import cucumber.api.java.en.When;
import com.selenium.e2eTests.connexionXLSx.page.*;

public class CNXSD {

	public WebDriver driver;
	public CNXP cNXP = new CNXP();
	//Constructor
	public CNXSD() {
		driver=Setup.driver;
	}

	@When("^I SignIn From XLSx$")
	public void signInXlsx() throws Throwable {
		
		// Read 
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, " Sheet1");
		PageFactory.initElements(driver, CNXP.class);
		CNXP.signInXlsX();
		
		// Write
		ExcelUtils.setCellData("Pass", 1, 3);
		
	}

}
