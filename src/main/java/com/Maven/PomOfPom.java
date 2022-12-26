package com.Maven;

import org.openqa.selenium.WebDriver;

public class PomOfPom {
	
	public static WebDriver driver;//new ChromeDriver
	
	public Pom p; //Class variable
	
	public Search_Hotels s;

	
	public PomOfPom(WebDriver driver2) {
	this.driver=driver2;
	}


	public Pom getPom() {
     p=new Pom(driver);  //Local variable
     return p;
	}
	
	public Search_Hotels getS() {
	s=new Search_Hotels(driver);
	return s;
	}

}
