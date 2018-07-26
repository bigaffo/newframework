package pages;

import org.openqa.selenium.WebDriver;

public class Home {
	
	private WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void openBrowser() {
		driver.manage().window().maximize();
		//driver.get("http://127.0.0.1:8080/");
		driver.navigate().to("https://chinabestmart.com/");
		
		}
	
	public void tearDown() {
		driver.quit();
	}

}
