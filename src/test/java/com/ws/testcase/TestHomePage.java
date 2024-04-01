package com.ws.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BaseTest {
	
	@Test(priority=1)
	public void testGetHomePageTitle() {
		logger = report.createTest("Test Login Page");
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.equals("Demo Web Shop"));
		logger.pass("Homepage verification successful");
	}
	
	@Test(priority=2)
	public void testClickLoginLink() {
		logger = report.createTest("Test clicking Login page link");
		homepage.clickLoginLink();
		String title = loginpage.getLoginPageTitle();
		Assert.assertTrue(title.contains("Login"));
		logger.pass("Login Page link clicked successfully");
	}
}
