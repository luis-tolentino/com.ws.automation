package com.ws.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPasswordRecoveryPage extends BaseTest {

	@Test(priority = 1)
	public void testPasswordRecoveryPage() {
		logger = report.createTest("Test Password Recovery page");
		homepage.clickLoginLink();
		logger.pass("clicked login link");
		boolean flag = loginpage.isForgotPasswordLinkDisplayed();
		Assert.assertTrue(flag);
		logger.pass("forgot passoword link is displayed");
		loginpage.clickForgotPasswordLink();
		logger.pass("clicked the forgot password link");
		boolean flag2 = passwordRecoveryPage.isPasswordRecoveryTextDisplayed();
		Assert.assertTrue(flag2);
		logger.pass("Forgot password text is present");
		String text = passwordRecoveryPage.getPasswordRecoveryText();
		Assert.assertTrue(text.contains("Password recovery"));
		System.out.println(text);
		logger.pass("Recovery text validated");

	}

	@Test(priority = 2)
	public void testInvalidEmailAddress() {
		logger = report.createTest("Test with invalid email address");
		homepage.clickLoginLink();
		logger.pass("clicked login link");
		boolean flag = loginpage.isForgotPasswordLinkDisplayed();
		Assert.assertTrue(flag);
		logger.pass("forgot passoword link is displayed");
		loginpage.clickForgotPasswordLink();
		logger.pass("clicked the forgot password link");
		boolean flag2 = passwordRecoveryPage.isPasswordRecoveryTextDisplayed();
		Assert.assertTrue(flag2);
		logger.pass("Forgot password text is present");

		passwordRecoveryPage.enterUserEmail("ss");
		logger.pass("entered invalid email address");
		passwordRecoveryPage.clickPasswordRecoveryButton();
		logger.pass("clicked the password recovery button");
		String wrongEmailText = passwordRecoveryPage.getWrongEmailMsg();
		System.out.println(wrongEmailText);
		Assert.assertTrue(wrongEmailText.contains("Wrong email"));
		logger.pass("verified the Wrong Email message successfully");
	}

	@Test(priority = 3)
	public void testEmptyEmailAddress() {
		logger = report.createTest("Test with empty email address");
		homepage.clickLoginLink();
		logger.pass("clicked login link");
		boolean flag = loginpage.isForgotPasswordLinkDisplayed();
		Assert.assertTrue(flag);
		logger.pass("forgot passoword link is displayed");
		loginpage.clickForgotPasswordLink();
		logger.pass("clicked the forgot password link");
		boolean flag2 = passwordRecoveryPage.isPasswordRecoveryTextDisplayed();
		Assert.assertTrue(flag2);
		logger.pass("Forgot password text is present");
		passwordRecoveryPage.clickPasswordRecoveryButton();
		logger.pass("clicked the password recovery button");
		String emptyEmailText = passwordRecoveryPage.getWrongEmailMsg();
		Assert.assertTrue(emptyEmailText.contains("Enter your email"));
		logger.pass("verified the Empty Email message successfully");

	}

	@Test(priority = 4)
	public void testValidEmailAddress() {
		logger = report.createTest("Test with valid email address");
		homepage.clickLoginLink();
		logger.pass("clicked login link");
		boolean flag = loginpage.isForgotPasswordLinkDisplayed();
		Assert.assertTrue(flag);
		logger.pass("forgot passoword link is displayed");
		loginpage.clickForgotPasswordLink();
		logger.pass("clicked the forgot password link");
		boolean flag2 = passwordRecoveryPage.isPasswordRecoveryTextDisplayed();
		Assert.assertTrue(flag2);
		logger.pass("Forgot password text is present");

		passwordRecoveryPage.enterUserEmail("dumitest2@gmail.com");
		logger.pass("entered valid Email");
		passwordRecoveryPage.clickPasswordRecoveryButton();
		logger.pass("clicked the password recovery button");
		String sucessMessage = passwordRecoveryPage.getSuccessfullEmailSubmissionMsg();
		Assert.assertTrue(sucessMessage.contains("instructions has been sent to you"));
		logger.pass("verified email sent successfully");

	}
}
