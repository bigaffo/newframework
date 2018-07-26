package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver testing() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver_hub\\chromedriver.exe");
		//	System.setProperty("webdriver.gecko.driver", "C:\\driver_hub\\geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver;
	}
		
			
	}
		
		

