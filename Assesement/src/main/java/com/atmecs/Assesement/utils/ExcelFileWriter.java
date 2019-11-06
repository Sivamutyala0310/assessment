package com.atmecs.Assesement.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

import com.atmecs.Assesement.reports.LogReports;



public class ExcelFileWriter 
{
		static int rowIndex=1;
		static int columnIndex=5;
		static XSSFWorkbook workbook;
		static LogReports reports=new LogReports();

		public static void test(String data)
		{ try
		{
			File file= new File("ConstantFilePaths.USERTESTDATA_FILE");
			
			FileInputStream inputStreams=new FileInputStream(file);
			
			 workbook=new XSSFWorkbook(inputStreams);
			XSSFSheet sheet=workbook.getSheetAt(0);
			
			sheet.createRow( rowIndex).createCell(columnIndex).setCellValue(data);
			FileOutputStream write=new FileOutputStream(file);
			
			workbook.write(write);                                       // writing details to excel file.
			
			reports.info("storing user profile creation details in  excel file");
			 rowIndex++;
		}
		catch(Exception e)
		{
			reports.info(" storing  user profile creation details in excel file  failed");
		}

		}
		@AfterTest
		public void workBookClose() throws Exception
		{
			workbook.close();
		}

	}

