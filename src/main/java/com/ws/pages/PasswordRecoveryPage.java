package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScript;

public class PasswordRecoveryPage extends DriverScript {
	// ************** Page Elements**************//
	@FindBy(xpath = "//h1[text()='Password recovery']")
	WebElement passwordRecoveryText;

	@FindBy(id = "Email")
	WebElement passwordRecoveryemailInputBox;

	@FindBy(name = "send-email")
	WebElement passwordRecoveryButton;

	@FindBy(xpath = "//span[@for='Email']")
	WebElement wrongEmailMsg;
	
	@FindBy(xpath = "//span[text()='Enter your email']")
	WebElement enterEmailMsg;
	
	@FindBy(xpath = "//div[@class='result']")
	WebElement successfullEmailSubmissionMsg;

	// ************** Page initialization********//
	public PasswordRecoveryPage() {
		PageFactory.initElements(driver, this);
	}
	// ************** Page Methods/Actions*******//

	public String getPasswordRecoveryText() {
		return passwordRecoveryText.getText();
	}
	
	public boolean isPasswordRecoveryTextDisplayed() {
		return passwordRecoveryText.isDisplayed();
	}
	
	public void enterUserEmail(String email) {
		passwordRecoveryemailInputBox.clear();
		passwordRecoveryemailInputBox.sendKeys(email);
	}

	public void clickPasswordRecoveryButton() {
		passwordRecoveryButton.click();
	}
	
	public String getWrongEmailMsg() {
		return wrongEmailMsg.getText();
	}
	public String getSuccessfullEmailSubmissionMsg() {
		return successfullEmailSubmissionMsg.getText();
	}
}
