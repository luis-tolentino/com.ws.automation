package com.ws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ws.base.DriverScript;

public class BooksPage extends DriverScript {
//***************** Page Elements*********//
	@FindBy(xpath="//h1[text()='Books']")WebElement booksPageText;
	@FindBy(name="products-orderby")WebElement booksDropDown;
	@FindBy(name="products-pagesize")WebElement booksDisplayQuantity;
	@FindBy(name="products-viewmode")WebElement booksDisplayOrientation;
	
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
	
	public void sortBooksByVisibleText(String text) {
		Select sel = new Select(booksDropDown);
		sel.selectByVisibleText(text.trim());
	}
	
	public void displayBooksQuantityByVisibleText(String quantity) {
		Select sel = new Select(booksDisplayQuantity);
		sel.selectByVisibleText(quantity.trim());
	}
	
	public void viewBooksDisplayOrientationByVisibleText(String orientation) {
		Select sel = new Select(booksDisplayOrientation);
		sel.selectByVisibleText(orientation.trim());
	}
}
