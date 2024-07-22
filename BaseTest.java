package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest extends Pojo 
{
	
	private Utilities objUtilities;
	public WebDriver driver;
	private WrapperFunctionClass objWrapperFunctionClass;
	private HttpUtility objHttpUtility;
	
	public void testEnvironment(int wait)
	{  
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	    this.setDriver(driver);
	    driver.get("https://www.facebook.com/");
	    
	    objUtilities = new Utilities(this);
	    this.setObjUtilities(objUtilities);
	    objWrapperFunctionClass  = new WrapperFunctionClass(this);
	    this.setObjWrapperFunctionClass(objWrapperFunctionClass); 
	    objHttpUtility = new HttpUtility();
	    this.setObjHttpUtility(objHttpUtility);
	    
	    System.out.println("Chrome driver should be launched");
		    
	} 
	
	public void teardown()
	{ 
		this.getDriver().close();
		System.out.println("Browser is closed");
	} 
	
	
}
