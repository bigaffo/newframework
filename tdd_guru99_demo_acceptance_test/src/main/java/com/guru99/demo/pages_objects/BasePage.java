package com.guru99.demo.pages_objects;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

}
