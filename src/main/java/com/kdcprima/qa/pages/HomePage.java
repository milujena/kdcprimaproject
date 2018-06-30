package com.kdcprima.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kdcprima.qa.baseLib.BasePage;



public class HomePage extends BasePage{
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	 public WebElement newContactLink;
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void new_contactLink()
	{
		newContactLink.click();
	}

	
	
	
	
	

}
