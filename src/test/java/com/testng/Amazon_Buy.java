package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_Buy {
	
	@BeforeSuite
	private static void browser_Launch() {
    System.out.println("THE BROWSER IS LAUNCHED");
	}
	@BeforeTest
    private static void url() {
    System.out.println("PASS THE URL");
	}
	@BeforeClass
    private static void maximize() {
    System.out.println("WINDOW HAS BEEN MAXIMIZED");
	}
	@BeforeMethod
    private static void product_Search() {
    System.out.println("SEARCH FOR IPHONE");
	}
    @Test
    private static void click_On_Iphone() {
    System.out.println("CLICK ON IPHONE 14 PRO MAX");
	}
    @AfterMethod
    private static void screenshot() {
    System.out.println("SCREENSHOT HAS BEEN CAPTURED");
	}
    @AfterClass
    private static void logout() {
    System.out.println("LOGOUT OF AMAZON");
	}
    @AfterTest
    private static void delete_All_Cookies() {
    System.out.println("DELETING ALL THE COOKIES");
	}
    @AfterSuite
    private static void close() {
    System.out.println("CLOSE THE BROWSER");
	}
    
    
}
