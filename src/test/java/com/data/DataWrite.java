package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\welcome\\OneDrive\\Desktop\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		wb.getSheetAt(0).getRow(3).createCell(1).setCellValue("abc");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		wb.write(fos);
		
		
		
		
	}

}
