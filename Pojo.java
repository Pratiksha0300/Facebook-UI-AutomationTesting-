package com.generic;

import org.openqa.selenium.WebDriver;

public class Pojo 
{
	
	
	private WebDriver driver;
	private Utilities objUtilities;
	private WrapperFunctionClass objWrapperFunctionClass;
	private HttpUtility objHttpUtility;
	
	
    public HttpUtility getObjHttpUtility() {
		return objHttpUtility;
	}

	public void setObjHttpUtility(HttpUtility objHttpUtility) {
		this.objHttpUtility = objHttpUtility;
	}

	public WrapperFunctionClass getObjWrapperFunctionClass() {
		return objWrapperFunctionClass;
	}

	public void setObjWrapperFunctionClass(WrapperFunctionClass objWrapperFunctionClass) {
		this.objWrapperFunctionClass = objWrapperFunctionClass;
	}

	public WebDriver getDriver() 
	{
		return driver;
	}
    
	public void setDriver(WebDriver driver)
	{
		this.driver = driver;
	}
	
	

	public Utilities getObjUtilities() {
		return objUtilities;
	}

	public void setObjUtilities(Utilities objUtilities) {
		this.objUtilities = objUtilities;
	}
  
}
