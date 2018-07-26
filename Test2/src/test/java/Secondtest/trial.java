package Secondtest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trial {

	@Test
	public void testing() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver_hub\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\driver_hub\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://127.0.0.1:8080/");
		driver.navigate().to("https://chinabestmart.com/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		
	}
	
}
