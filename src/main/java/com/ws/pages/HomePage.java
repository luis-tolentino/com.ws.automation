package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScript;

public class HomePage extends DriverScript {
	
//************* Select Elements **********//
	@FindBy(linkText="Log in") WebElement loginLink;
	
//************* Initialize Elements ******//
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
//************* Element Actions/Methods **//
	public String getHomePageTitle() {
		String title = driver.getTitle();
		System.out.println("Page Title:"+title);
		return title;
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}
}
