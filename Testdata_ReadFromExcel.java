package com.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdata_ReadFromExcel 

{  
   
   public Cell dataToReadFirstname() throws IOException
   {
	   FileInputStream fs = new FileInputStream("C:\\Users\\lenovo\\Desktop\\DSR\\FacebookTestdata.xlsx");
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row2 = sheet.getRow(1);
		Cell firstname = row2.getCell(0);
		
	    return firstname ;

   } 
   
   public Cell dataToReadLastname() throws IOException
   {
	   FileInputStream fs = new FileInputStream("C:\\Users\\lenovo\\Desktop\\DSR\\FacebookTestdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row3 = sheet.getRow(1);
		Cell lastname = row3.getCell(1);
		return lastname ;

   }
}
