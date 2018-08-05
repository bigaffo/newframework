package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	protected WebDriver driver;

	

	

	public Base(WebDriver driver) {
		this.driver = driver;
		
	
		
		
	}
	
	public LoginPage openBrowser(String baseUrl) {
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		return new LoginPage(driver);
	}
	
	public void tearDown() {
		driver.quit();
	}	
	
			
	}
		
		

