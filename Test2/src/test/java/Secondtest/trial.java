package Secondtest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import myTestHooks.FirstTestHooks;
import pages.Base;
import pages.DashBoard;
import pages.Home;
import pages.LoginPage;

public class trial extends FirstTestHooks{


	
	
//	
//	@Test
//	public void openBroserTest() {
//		String username = "bigaffo@yahoo.co.uk";
//		String password = "Thetime02?";
//		String name = "Afolabi";
//			home.openBrowser();
//			home.populate(username,password);
//			Assert.assertTrue("Does not contain" +name, home.validate(name));
//	}
			
	private String username = "bigaffo@yahoo.co.uk";
	private String password = "Thetime02?";
	private String name = "Olagoke";
	private String baseUrl = "https://web.facebook.com";
			
	@Test
	public void openBroserTest1() {
		DashBoard dashboard =loginPage.openBrowser(baseUrl).populate(username, password);
		Assert.assertTrue("Does not contain" +name, dashboard.validate(name));
	}
	
			
			
		
	
}
