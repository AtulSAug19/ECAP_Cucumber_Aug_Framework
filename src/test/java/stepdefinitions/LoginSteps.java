package stepdefinitions;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("User click on registration link")
	public void user_click_on_registration_link() {
		loginPage.clickOnRegistrationLink();
		
	}
	@When("user enter username {string}")
	public void user_enter_username(String string) {
		loginPage.enterUserName("QWERRRFDS");
	   
	}
	@When("user enter password {string}")
	public void user_enter_password(String string) {
		loginPage.enterPassword("asfsdfsdff");
	   
	}
	@When("user click on Submit button")
	public void then_click_on_submit_button() {
		loginPage.clickOnSubmit();
	   
	}
	@Then("Alert should be displayed")
	public void alert_should_be_displayed() {
		Alert alert = loginPage.verifyAlertPresent();
		Assert.assertTrue(true,"Alert is present");
		alert.accept();
	  
	}

}
