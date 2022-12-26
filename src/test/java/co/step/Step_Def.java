package co.step;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Maven.BaseClass;
import com.Maven.PomOfPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends BaseClass{
	
	public static WebDriver driver=browser_Launch();
	public static PomOfPom p=new PomOfPom(driver);
	
	@Given("^Launch the browser and and pass the URL$")
	public void launch_the_browser_and_and_pass_the_URL() { 
    launch_Url("https://adactinhotelapp.com/");
	}
	@When("^User enter \"([^\"]*)\" in the username field$")
	public void user_enter_in_the_username_field(String arg1) {
	  keys_To_Send(arg1, p.getPom().getUsername());
	}

	@When("^User enters \"([^\"]*)\" in the password field$")
	public void user_enters_in_the_password_field(String arg1) {
	 keys_To_Send(arg1, p.getPom().getPassword());
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button(){
	click(p.getPom().getLogin());
	}

	@Then("^User should get navigated to Search Hotels page$")
	public void user_should_get_navigated_to_Search_Hotels_page() {
	String t="Adactin.com - Search Hotel";
	String title = title();
	Assert.assertEquals(title, t);
	}



}
