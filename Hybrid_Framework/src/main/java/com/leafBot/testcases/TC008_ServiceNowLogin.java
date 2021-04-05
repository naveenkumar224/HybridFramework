package com.leafBot.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.ServiceNow_LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC008_ServiceNowLogin extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut Service now ";
		testDescription = "Login testCase using service now";
		nodes = "Leads";
		authors = "Naveen";
		category = "Smoke";

	}

	@Test
	public void ExecuteTC() throws IOException {
		ServiceNow_LoginPage obj = new ServiceNow_LoginPage(driver, node);
		obj.EnterUsername().EnterPassword().ClickLoginButton().ValidateHomepresence();

	}

}
