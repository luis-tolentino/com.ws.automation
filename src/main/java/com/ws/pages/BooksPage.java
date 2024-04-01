package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ws.base.DriverScript;

public class BooksPage extends DriverScript {
//***************** Page Elements*********//
	@FindBy(xpath="//h1[text()='Books']")WebElement booksPageText;
	
	
	//*************Page initialization****//
	
	public BooksPage() {
		PageFactory.initElements(driver, this);
	}
	
	//************* Page Methods/Action***//
	public String getBooksPageText() {
		return booksPageText.getText();
	}
	
	public boolean isBooksPageTextDisplayed() {
		return booksPageText.isDisplayed();
	}
}
