package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot 
{ 
	private Pojo objPojo;
	
	public Screenshot(Pojo objPojo)
	{
		 this.objPojo=objPojo;
	}
	public  void TakeScreenshot(String FileName)throws IOException{
	        
	        File File = ((TakesScreenshot) objPojo.getDriver())
	                        .getScreenshotAs(OutputType.FILE);
	        String strScreenCapturePathString = System.getProperty("user.dir");
	        System.out.println("Current Dir :: "+strScreenCapturePathString);
	        FileUtils.copyFile(File,new File(strScreenCapturePathString+"\\Facebook\\FacebookTAF\\Screenshots" + "\\"+FileName + ".png"));
	    }
}
