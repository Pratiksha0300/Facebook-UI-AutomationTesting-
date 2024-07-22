package com.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ReportListeners implements ITestListener
{
	public void onTestStart(ITestResult result) {

		// TODO Auto-generated method stub

		

	}

 

	public void onTestSuccess(ITestResult result) {

 

		System.setProperty("org.uncommons.reportng.escape-output","false");

		Reporter.log("C:\\Users\\lenovo\\Pictures\\Screenshots\\Screenshot (1128).png");
//
//		Reporter.log("<br>");
//
//		Reporter.log("<a href=\"C:\\Automation-Workspace\\VS-TestNG-Framework\\target\\failedScreenshot\\download.png\" target=\"_blank\"><img hight=200 width=200 src=\"C:\\Automation-Workspace\\VS-TestNG-Framework\\target\\failedScreenshot\\download.png\"></a>");
//
//		

		

 

		System.out.println("Passed Test - "+result.getName());

		

	}

 

	public void onTestFailure(ITestResult result) {

 

		System.setProperty("org.uncommons.reportng.escape-output","false");

//		Reporter.log("<a href=\"C:\\Automation-Workspace\\VS-TestNG-Framework\\target\\failedScreenshot\\errorSpanshot.jpg\" target=\"_blank\">Screenshot link</a>");
//
//		Reporter.log("<br>");
//
//		Reporter.log("<a href=\"C:\\Automation-Workspace\\VS-TestNG-Framework\\target\\failedScreenshot\\errorSpanshot.jpg\" target=\"_blank\"><img hight=200 width=200 src=\"C:\\Automation-Workspace\\VS-TestNG-Framework\\target\\failedScreenshot\\errorSpanshot.jpg\"></a>");
//
//		

		

		System.out.println("Capturing Screenshot for the Failed test -- "+result.getName());

		

	}

 

	public void onTestSkipped(ITestResult result) {

		// TODO Auto-generated method stub

		

	}

 

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		// TODO Auto-generated method stub

		

	}

 

	public void onStart(ITestContext context) {

		// TODO Auto-generated method stub

		

	}

 

	public void onFinish(ITestContext context) {

		// TODO Auto-generated method stub

	}
}
