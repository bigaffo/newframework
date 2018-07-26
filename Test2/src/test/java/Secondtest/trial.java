package Secondtest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Base;
import pages.Home;

public class trial {
		@Test
	public void openBroserTest() {
			Base base = new Base();
			WebDriver driver = base.testing();
	
			
			Home home = new Home(driver);
			home.openBrowser();
			home.tearDown();
	
		
		
	}
	
}
