package com.pagefactory;
import com.generic.Pojo;
import com.generic.Screenshot;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class SignUpPage 
{  
	private Pojo objPojo ;
	private Screenshot objScreenshot;
	public SignUpPage(Pojo pojo) {
		this.objPojo=pojo;
		 objScreenshot = new Screenshot(objPojo);
	}
	public void setFirstname(String strfirstname)
    { 
		By locator=By.xpath("//input[@name='firstname']");
//		objPojo.getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys(strfirstname);
		
		objPojo.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		assertTrue(objPojo.getObjWrapperFunctionClass().sendKeysUsingAction(locator, strfirstname));
		System.out.println("Set Firstname:" + strfirstname);
    	
    } 
 
    public void setLastname(String strlastname)
    {  
    	By locator=By.xpath("//input[@name='lastname']");
//       objPojo.getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys(strlastname);
		
		objPojo.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		assertTrue(objPojo.getObjWrapperFunctionClass().sendKeysUsingJavascript(locator, strlastname));
    	System.out.println("Set Lastname:" + strlastname);
    } 
 
   public void setMobileNo(String strmobileno)
    {
	   objPojo.getDriver().findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(strmobileno);
		
		objPojo.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   System.out.println("Set Mobile no:" + strmobileno);
    	
    }  
   
   public void setEmail(String stremail)
   {   
//	   objPojo.getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys(strfirstname);
//		
//		objPojo.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   System.out.println("Set Email:" + stremail);
   	
   }
   
 
   public void setPassword(String passStr)
    {  
//	    WebDriver driver1=objPojo.getDriver();
	    Wait<WebDriver> wait=new WebDriverWait(objPojo.getDriver(),Duration.ofSeconds(2));
	    WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//input[@name='reg_passwd__']")));
	    element.sendKeys(passStr);
		
//		objPojo.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	passStr="1234";
    	 System.out.println("Set password:" + passStr);
    }  
 
   public void setDate(String date)
    {  
	   String[] dateArray=date.split("-");
	   By locator=By.xpath("//select[@name='birthday_day']");
//	   WebElement element=objPojo.getDriver().findElement(By.xpath("//select[@name='birthday_day']"));

	   assertTrue(objPojo.getObjWrapperFunctionClass().selectdropdownUsingSelect(locator, dateArray[0]));
	   
	   By locator1=By.xpath("//select[@name='birthday_month']");
//	   WebElement element1=objPojo.getDriver().findElement(By.xpath("//select[@name='birthday_month']"));

	   assertTrue(objPojo.getObjWrapperFunctionClass().selectdropdownUsingSelect(locator1, dateArray[1]));
	   
	   By locator2=By.xpath("//select[@name='birthday_year']");
//	   WebElement element2=objPojo.getDriver().findElement(By.xpath("//select[@name='birthday_year']"));

	   assertTrue(objPojo.getObjWrapperFunctionClass().selectdropdownUsingSelect(locator2, dateArray[2]));

	   
	   
	 System.out.println("Set Date:" + date);
	 
	}  
 
   public void setGender(String  gender)
    {  
	   By locator=By.xpath("//label[.='Female']");
	   objPojo.getDriver().findElement(locator).click();
	 
		
		objPojo.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 System.out.println("Set Gender:" + gender);
    } 
   
  
   
}
