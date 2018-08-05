package myTestHooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Base;
import pages.LoginPage;


public class FirstTestHooks {
	



	
	
	private Base base;
	protected LoginPage loginPage;
	



	@Before
	public void browserSetup() {
	System.setProperty("webdriver.chrome.driver", "C:\\driver_hub\\chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "C:\\driver_hub\\geckodriver.exe");
	WebDriver driver = new ChromeDriver();
	
	this.base = new Base(driver);
	this.loginPage = new LoginPage(driver);
	
	
	
	
	}
	
	
	@After
	public void closeBrower(){
		base.tearDown();
	}
	


}
