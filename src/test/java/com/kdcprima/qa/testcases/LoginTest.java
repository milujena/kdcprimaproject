package com.kdcprima.qa.testcases;

import org.testng.annotations.Test;

import com.kdcprima.qa.ExtentReportListener.ExtentReport;
import com.kdcprima.qa.baseLib.BaseTest;
import com.kdcprima.qa.pages.LogInPage;



public class LoginTest extends BaseTest{
	

	String loginPageTitle="Free CRM software in the cloud powers sales and customer service";
	String HomePageTitle="CRMPRO";
	
	@Test
	public void loginTest() 
	{
	
		LogInPage lp=new LogInPage(driver);
		System.out.println("hi");
	
	//lp.verifyTitle(loginPageTitle);
	lp.user_name("milu123");
	lp.pass_word("milu123");
	lp.login_btn();
	//lp.verifyTitle(HomePageTitle);
	System.out.println("bye");
	}

}
