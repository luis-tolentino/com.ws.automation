package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScript;

public class UserHomePage extends DriverScript {
//************** Page Elements***************//
	@FindBy(linkText="Log out")WebElement logoutLink;
	@FindBy(linkText="BOOKS")WebElement booksPageLink;
//************** Page initialization***************//
	public UserHomePage() {
		PageFactory.initElements(driver, this);
	}
	
//************** Page Methods/Actions***************//
	public boolean isLogoutLinkDisplayed() {
		return logoutLink.isDisplayed();
	}
	
	public void clickBooksPageLink() {
		booksPageLink.click();
	}
}
