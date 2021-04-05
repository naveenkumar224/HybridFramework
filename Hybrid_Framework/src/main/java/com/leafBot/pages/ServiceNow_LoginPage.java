package com.leafBot.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ServiceNow_LoginPage extends ProjectSpecificMethods {

	public ServiceNow_LoginPage(RemoteWebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public ServiceNow_LoginPage EnterUsername() {

		WebElement login_frame = driver.findElement(By.id("gsft_main"));
		switchToFrame(login_frame);
		locateElement("id", "user_name").sendKeys("admin");

		return this;

	}

	public ServiceNow_LoginPage EnterPassword() throws IOException {
		locateElement("id", "user_password").sendKeys("India@123");
		return this;

	}

	public ServiceNow_HomePage ClickLoginButton() {
		locateElement("xpath", "//button[text()='Login']").click();
		return new ServiceNow_HomePage(driver, node);

	}

}
