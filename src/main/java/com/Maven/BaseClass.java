package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver; //null
	
	public static WebDriver browser_Launch() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\OneDrive\\Desktop\\Sel2\\chromedriver.exe");
		driver=new ChromeDriver(); //local varaiable
	    return driver;
	}
	
	public static void launch_Url(String url) {
      driver.get(url);
      driver.manage().window().maximize();
	}
	public static void keys_To_Send(String send, WebElement element) {
     element.sendKeys(send);
	}
	
	public static void click(WebElement element) {
     element.click();
	}
	
	public static void dropdown(String method, WebElement element, String text) {
    Select s=new Select(element);
    if (method.equals("value")) {
		s.selectByValue(text);
	}else if (method.equals("text")) {
		s.selectByVisibleText(text);
	}else {
		int i = Integer.parseInt(text);
		s.selectByIndex(i);
	}
	}
	public static void refresh() {
     driver.navigate().refresh();
	}
	public static String title() {
     String title = driver.getTitle();
     return title;
	}

}
