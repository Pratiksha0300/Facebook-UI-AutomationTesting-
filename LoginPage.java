package com.pagefactory;



import org.openqa.selenium.By;

import com.generic.Pojo;

import org.junit.Assert;

public class LoginPage

{
	private Pojo objPojo;

	public LoginPage(Pojo pojo) {
		this.objPojo = pojo;
	}

	

	public void setFirstname(String strusername) {
		System.out.println("Set username:" + strusername);

	}

	public void setpassword(String strpassword) {
		System.out.println("Set password:" + strpassword);

	}  
	
//	public void createNewAccount()
//	{
//		By locator= By.xpath("//a[.='Create new account'][contains(@data-testid,'registration')]");
//		
//		boolean binflag=objPojo.getObjWrapperFunctionClass().clickUsingAction(locator);
//		Assert.assertTrue(binflag);
//		System.out.println("Click on create new Account" + binflag);
//		
//		
//	}

	
}
