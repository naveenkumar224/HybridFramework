package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ServiceNow_HomePage extends ProjectSpecificMethods {

	public ServiceNow_HomePage(RemoteWebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public void ValidateHomepresence() {
		String text = locateElement("xpath", "//span[contains(@class,'sn-widget-list-title nav-favorite-title')]")
				.getText();
		String Expected = "Home";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(text, Expected);
		sa.assertAll();

	}

}
