package com.kdcprima.qa.testcases;

import org.testng.annotations.Test;

import com.kdcprima.qa.baseLib.BaseTest;
import com.kdcprima.qa.pages.HomePage;
import com.kdcprima.qa.pages.LogInPage;
import com.kdcprima.qa.util.TestUtils;

public class CreateNewContactTest extends BaseTest 
{
	@Test
	public void createNewContactTest()
	{
		LogInPage lp=new LogInPage(driver);
		

		lp.user_name("milu123");
		lp.pass_word("milu123");
		lp.login_btn();
		HomePage hm=new HomePage(driver);
		driver.switchTo().frame("mainpanel");
		

		TestUtils.moveToElement(hm.contactsLink);
		hm.new_contactLink();
		
		
		
	}

}
