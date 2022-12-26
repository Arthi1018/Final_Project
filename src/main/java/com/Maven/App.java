package com.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class App extends BaseClass
{
  private String car() {
   String a="Arun"; //local variable
   return a;
}
  
  public App(int a) {
	  System.out.println(a);
}
  public static void main(String[] args) {
	App obj=new App(10);
	System.out.println(obj.car());
}
    
}
