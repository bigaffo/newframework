package com.guru99.demo.pages_objects;

import org.openqa.selenium.WebDriver;

public class ManagersPage extends BasePage {

	public ManagersPage(WebDriver driver) {
		super(driver);
	
	}

	public boolean validateLogin(String message) {
		return driver.getPageSource().contains(message);
	}


}
