package com.ws.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{
	
	@Test(priority=1)
	public void testGetLoginPageTitle() {
		logger = report.createTest("Test getting login page Title");
		homepage.clickLoginLink();
		logger.pass("clicked Log in link");
		String title = loginpage.getLoginPageTitle();
		Assert.assertTrue(title.contains("Login"));
		logger.pass("Login Page title verified successfully");
	}
	
	@Test(priority=2)
	public void testLoginFunctionality() {
		logger = report.createTest("Testing Login functionality");
		homepage.clickLoginLink();
		logger.pass("clicked Log in link");
		loginpage.enterEmail("dumitest2@gmail.com");
		logger.pass("entered email");
		loginpage.enterPassword("test123");
		logger.pass("entered password");
		loginpage.clickLoginButton();
		logger.pass("clicked the login button");
		boolean isLogoutLinkDisplayed = userhomepage.isLogoutLinkDisplayed();
		Assert.assertTrue(isLogoutLinkDisplayed);
		logger.pass("User logged in successfully");
		
	}
}
