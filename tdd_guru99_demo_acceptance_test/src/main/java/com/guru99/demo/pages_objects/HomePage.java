package com.guru99.demo.pages_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	private By usernameField = By.name("uid");
	private By passwordField = By.name("password");
	private By loginField = By.name("btnLogin");

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	public ManagersPage loginToBank(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginField).click();
		return new ManagersPage(driver);
	}

}
