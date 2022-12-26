package com.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Pom of Pom
public class Runner extends BaseClass{
	public static WebDriver driver;
public static void main(String[] args) throws IOException {
	
	browser_Launch();
	launch_Url("https://adactinhotelapp.com/");
	PomOfPom p1=new PomOfPom(driver);
	
    
	keys_To_Send("Arthiha1018", p1.getPom().getUsername());

	keys_To_Send("IA779U", p1.getPom().getLogin());
	click(p1.getPom().getLogin());
	
	dropdown("value", p1.getS().getLocation(), "Sydney");
 
	
}
}
