package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By emailID = By.id("unameSignin");
	private By pwd = By.id("pwdSignin");
	private By submit = By.id("btnsubmitdetails");
	private By registration = By.id("registration2");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void enterUserName(String userName) {
		driver.findElement(emailID).sendKeys(userName);
	}

	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}

	public void clickOnRegistrationLink() {
		driver.findElement(registration).click();
	}

	public void clickOnSubmit() {
		driver.findElement(submit).click();
	}
	
	public void login(String userName,String password)
	{
		clickOnRegistrationLink();
		enterUserName(userName);
		enterPassword(password);
		clickOnSubmit();
	}
	
	public Alert verifyAlertPresent()
	{
		return driver.switchTo().alert();
	}

}
