package co.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\file\\Adactin.feature", glue = "co.step", monochrome = true,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Report/Extentreport.html"})
public class Runner {

}
