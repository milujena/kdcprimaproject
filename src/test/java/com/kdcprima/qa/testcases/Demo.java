package com.kdcprima.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kdcprima.qa.util.TestUtils;

public class Demo {
	@Test
	public void demo()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Project Management\\kdcprima.project\\driver\\chromedriver.exe" );
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
			driver.get("https://www.freecrm.com/index.html");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("milu123");
	}

}
