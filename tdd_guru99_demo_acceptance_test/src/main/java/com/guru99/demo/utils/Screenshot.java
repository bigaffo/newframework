package com.guru99.demo.utils;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot extends TestWatcher{

	private WebDriver driver;

	public Screenshot(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	protected void failed(Throwable e, Description description) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		Date dateobj = new Date();
		String timestamp = df.format(dateobj);
		String projectDirPath = "src\\main\\resources\\test_ouput\\sreenshot_reports";
		
		File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+ projectDirPath + description + timestamp + "jpeg" );
		 
			
		}
		
	}

	
		



