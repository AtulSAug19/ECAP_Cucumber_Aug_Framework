package appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import ulility.ConfigReader;

public class ApplicationHooks {
	
	private Properties prop;
	private ConfigReader configreader;
	private DriverFactory driverfactory;
	private WebDriver driver;
	
	@Before(order=0)
	public void getProperty()
	{
		ConfigReader configreader = new ConfigReader();
		prop = configreader.init_Properties();
	}
	
	@Before(order=1)
	public void getBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverfactory = new  DriverFactory();
		driver = driverfactory.initBrowser(browserName);
		driver.get("http://automationbykrishna.com/#");
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
