package com.guru99.demo.pages_objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import com.guru99.demo.utils.Screenshot;

public class BasePage {
	
	protected WebDriver driver;
	private FileInputStream fis;
	private Properties config = new Properties();
	protected static Logger logger = LogManager.getLogger("TestLogger");

	public BasePage(WebDriver driver) {
		this.driver = driver;
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
	}
	public HomePage loadDefaultPage() {
		driver.navigate().to(config.getProperty("baseUrl"));
		logger.info("Application homepage loaded successfully");
		return new HomePage(driver);
	}

}
