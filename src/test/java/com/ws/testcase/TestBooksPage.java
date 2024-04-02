package com.ws.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBooksPage extends BaseTest {
	@Test(priority=1)
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
	
	@Test(priority=2)
	public void SortBooksByVisibleText() {
		logger = report.createTest("Test sorting books by visible text");
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
		booksPage.sortBooksByVisibleText("Price: High to Low");
		logger.pass("books successfully sorted by visible text");
	}
	
	@Test(priority=3)
	public void testDisplayBooksQuantityByVisibleText() {
		logger = report.createTest("Test display books quantity by visible text");
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
		booksPage.displayBooksQuantityByVisibleText("4");
		logger.pass("books quantity successfully displayed by visible text");
	}
	
	@Test(priority=4)
	public void testViewBooksDisplayOrientationByVisibleText() {
		logger = report.createTest("Test display books quantity by visible text");
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
		booksPage.viewBooksDisplayOrientationByVisibleText("List");
		logger.pass("books orientation successfully displayed by visible text");
	}
}
