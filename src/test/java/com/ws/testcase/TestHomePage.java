package com.ws.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BaseTest {
	
	@Test(priority=1)
	public void testGetHomePageTitle() {
		String title = homepage.getHomePageTitle();
		Assert.assertTrue(title.equals("Demo Web Shop"));
	}
	
	@Test(priority=2)
	public void testClickLoginLing() {
		homepage.clickLoginLink();
	}
}
