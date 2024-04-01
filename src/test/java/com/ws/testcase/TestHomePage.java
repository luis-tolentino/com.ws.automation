package com.ws.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BaseTest {
	
	@Test(priority=1)
	public void testGetHomePageTitle() {
		logger = report.createTest("Test Home Page");
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.equals("Demo Web Shop"));
		logger.pass("Homepage verification successful");
	}
}
