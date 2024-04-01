package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScript;

public class LoginPage extends DriverScript {

//************** Page Elements**************//
	@FindBy(name = "Email")
	WebElement emailInputBox;
	@FindBy(name = "Password")
	WebElement passwordInputBox;
	@FindBy(xpath = "//body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-wrapper-main']/div[@class='center-2']//form[@action='/login']//input[@value='Log in']")
	WebElement loginButton;
	@FindBy(linkText = "Forgot password?")
	WebElement forgotPasswordLink;
//************** Page initialization********//

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
//************** Page Methods/Actions*******//

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public void enterEmail(String email) {
		emailInputBox.clear();
		emailInputBox.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordInputBox.clear();
		passwordInputBox.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public boolean isForgotPasswordLinkDisplayed() {
		return forgotPasswordLink.isDisplayed();
	}
	
	public void clickForgotPasswordLink() {
		forgotPasswordLink.click();
	}
}
