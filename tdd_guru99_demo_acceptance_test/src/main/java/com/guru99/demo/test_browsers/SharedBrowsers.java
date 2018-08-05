package com.guru99.demo.test_browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SharedBrowsers {
//	TestLogger
	private WebDriver driver;
	private FileInputStream fis;
	private Properties config = new Properties();
	protected static Logger logger = LogManager.getLogger("TestLogger");
	
	public void initialiseBrowser() throws Exception {
		if(driver == null) {
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\resources\\environment_testdata.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver_browser\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if(config.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\driver_browser\\geckodriver.exe");
				driver = new FirefoxDriver();
			}else {
				throw new Exception("Your browser is not supported on this framwork");
			}
		}
	}
	public void setupBrowser() {
		try {
		driver.manage().deleteAllCookies();
		logger.info("All cookies deleted successfully");
		driver.manage().window().maximize();
		logger.info("Browser has been maximized successfully");
		}catch(Exception e) {
			logger.error("Browser failed setup with this meassage: ", e);
		}
	}
	public void tearDownBrowser() {
		try {
			if(driver != null) {
				driver.quit();
				logger.info("Setup successfully closed");
			}
		}catch(Exception e){
			logger.error("Setup failed to close due to error message: ", e);
				
				
			}
		}
	}

