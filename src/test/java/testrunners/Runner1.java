package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/AppFeatures/Login.feature" }, glue = { "stepdefinitions", "appHooks" }, plugin = {
		"pretty",
		"rerun:target/rerun.txt" }, monochrome = true)
public class Runner1 {

}
