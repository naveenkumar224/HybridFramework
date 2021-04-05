package com.leafBot.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leafBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	public String dataSheetName;

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(dataSheetName);
	}

	@BeforeMethod
	public void beforeMethod() {
		// driver = startApp("chrome", "http://leaftaps.com/opentaps");
		driver = startApp("chrome", "https://dev68594.service-now.com/");
		node = test.createNode(testCaseName);
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}

}
