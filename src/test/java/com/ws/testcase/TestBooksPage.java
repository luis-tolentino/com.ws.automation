package com.ws.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBooksPage extends BaseTest {
	@Test
	public void testBooksPage() {
		logger = report.createTest("Test books Page");
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
		userhomepage.clickBooksPageLink();
		logger.pass("books page link clicked");
		Assert.assertTrue(booksPage.isBooksPageTextDisplayed());
		logger.pass("books page Text is visible");
		String text = booksPage.getBooksPageText();
		Assert.assertTrue(text.contains("Books"));
		logger.pass("books page text is present");
		
	}
}
