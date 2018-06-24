package com.kdcprima.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kdcprima.qa.baseLib.BasePage;



public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@id='navmenu']//descendant::a[text()='Contacts']")
	public WebElement contacts;
	
	@FindBy(xpath="//div[@id='navmenu']//descendant::a[text()='New Contact']")
	private WebElement newcontact;
	public void new_contact()
	{
		contacts.click();
	}

}
