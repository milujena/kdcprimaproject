package com.kdcprima.qa.baseLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.kdcprima.qa.util.TestUtils;


public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeTest
	public void precondition() throws IOException
	{
	
		Properties prop=new Properties();
	FileInputStream ip=new FileInputStream("D:\\Project Management\\kdcprima.project\\src\\main\\java\\com\\kdcprima\\qa\\config\\config.properties");
	prop.load(ip);
		
		
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","D:\\Project Management\\kdcprima.project\\driver\\chromedriver.exe" );
	    driver=new ChromeDriver();
	} 
	else if(browserName.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Project Management\\kdcprima.project\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	@AfterTest
	public void postconditon()
	{
		driver.close();
	}
	


}
