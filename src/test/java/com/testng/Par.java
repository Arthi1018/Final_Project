package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Maven.BaseClass;
import com.Maven.PomOfPom;

public class Par extends BaseClass{
	
	public static WebDriver driver=browser_Launch();
	public static PomOfPom p1=new PomOfPom(driver);
	
	@Ignore
	@Test(dataProvider = "username")
	private static void user(String a) {
    System.out.println(a);
	}
	
	@Test(dataProvider = "username")
    private static void login(String a, String b) {
		launch_Url("https://adactinhotelapp.com/");
		keys_To_Send(a, p1.getPom().getUsername());
		keys_To_Send(b, p1.getPom().getPassword());
	//	click(p1.getPom().getLogin());
	}
	
	@DataProvider(name = "username")
	private Object[][] data() {
  return new Object[][] {{"Arthi", "1234"},{"Gopi","5678"},{"Arun","0987"}};
	}

}
