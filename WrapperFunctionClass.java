package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WrapperFunctionClass 
{
	private Pojo objPojo;
	
	WrapperFunctionClass(Pojo objPojo)
	{
		this.objPojo= objPojo;
	}  
	
	public boolean clickUsingJavascript(By locator)
	{
		try 
		{
			WebElement webElement = objPojo.getDriver().findElement(locator);
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) objPojo.getDriver();
			javascriptExecutor.executeScript("return arguments[0].click();", webElement);
			return true;
		} catch (Exception e) {
			System.out.println("I got exception" + e.getMessage());
			return false;
		}
	} 
	
	public boolean clickUsingAction(By locator) 
	{ 
		try 
		{
			WebElement webElement = objPojo.getDriver().findElement(locator);
			Actions actions = new Actions(objPojo.getDriver());
			actions.click(webElement).perform();
			return true;
		} catch (Exception e) {
			System.out.println("I got exception" + e.getMessage());
			return false;
		}
	} 
	
	public boolean sendKeysUsingJavascript(By locator,String str)
	{
		try 
		{
			WebElement webElement = objPojo.getDriver().findElement(locator);
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) objPojo.getDriver();
			
			javascriptExecutor.executeScript("return arguments[0].value='str';", webElement);
			return true;
		} catch (Exception e) {
			System.out.println("I got exception" + e.getMessage());
			return false;
		}
	} 
	
	public boolean sendKeysUsingAction(By locator,String str) 
	{ 
		try 
		{
			WebElement webElement = objPojo.getDriver().findElement(locator);
			Actions actions = new Actions(objPojo.getDriver());
			actions.sendKeys(webElement, str).perform();
			return true;
		} catch (Exception e) {
			System.out.println("I got exception" + e.getMessage());
			return false;
		}
	} 
	
	public boolean selectdropdownUsingSelect(By locator,String str)
	{
		try 
		{
			WebElement webElement = objPojo.getDriver().findElement(locator);
			Select select = new Select(webElement);
			select.selectByValue(str);
//			select.deselectByVisibleText(str);
			return true;
		} catch (Exception e) {
			System.out.println("I got exception" + e.getMessage());
			return false;
		} 
		
		
	}
}
