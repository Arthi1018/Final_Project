package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Maven.BaseClass;
import com.Maven.PomOfPom;

public class Adactin extends BaseClass{
	
	public static WebDriver driver=browser_Launch();
	public static PomOfPom p1=new PomOfPom(driver);
	
	@Test(priority = 1)
	private static void url() {
    launch_Url("https://adactinhotelapp.com/");
	}
	@Test(priority = 2)
    private static void login() {
		keys_To_Send("Arthiha1018", p1.getPom().getUsername());
		keys_To_Send("IA779U", p1.getPom().getPassword());
		click(p1.getPom().getLogin());
	}
	@Ignore
	@Test(priority = 3)
	private static void validate_S() {
     String s="Adactin.com - Search Hotel";
     String title = driver.getTitle();
     Assert.assertEquals(title, s, "Not getting navigated");
	}
	@Test(priority = 4)
	private static void verify_S() {
    String t="Adactin.com - Search Hotel";
    SoftAssert s=new SoftAssert();
    s.assertEquals(driver.getTitle(), t);
    System.out.println("TITLE HAS BEEN CAPTURED");
    s.assertAll();
	}
}
