package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
public WebDriver driver; //null --> Not initialized

@FindBy(id = "username")
private WebElement username;        //@FindBy --> Alternate for findElement --> PageFactory

@FindBy(id = "password")
private WebElement password;

@FindBy(id = "login")
private WebElement login;

public Pom(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this); //re-initialize
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}


}
