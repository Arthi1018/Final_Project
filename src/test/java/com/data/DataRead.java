package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	
	public static void main(String[] args) throws IOException {
		
    File f=new File("C:\\Users\\welcome\\eclipse-workspace\\workspace-Mani\\Maven\\Book1.xlsx");
    FileInputStream fis=new FileInputStream(f);
    
    Workbook w=new XSSFWorkbook(fis);
    
    Sheet s = w.getSheetAt(0);
    
    Row r = s.getRow(1);
    
    Cell c = r.getCell(1);
    
    double d = c.getNumericCellValue();
    int i=(int) d;
    System.out.println(i);
	}

}
