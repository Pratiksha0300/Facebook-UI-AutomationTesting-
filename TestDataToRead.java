package com.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataToRead 
{
	public static void main (String [] args) throws IOException{
		//Path of the excel file
		FileInputStream fs = new FileInputStream("C:\\Users\\lenovo\\Desktop\\DSR\\FacebookTestdata.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		Row row2 = sheet.getRow(1);
		Cell firstname = row2.getCell(0);
		System.out.println(sheet.getRow(1).getCell(0));
		System.out.println(firstname);
		Row row3 = sheet.getRow(1);
		Cell lastname = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		System.out.println(lastname);
		String cellval = cell.getStringCellValue();
		System.out.println(cellval);
		}

}
