package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{
	
	private By loginEmail = By.id("email");
	private By loginPassword = By.id("pass");
	private By loginClick = By.id("u_0_2");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public DashBoard populate(String username,String password) {
		driver.findElement (loginEmail).sendKeys(username);
		driver.findElement(loginPassword).sendKeys(password);
		driver.findElement(loginClick).click();
		return new DashBoard(driver);
		
	}
	
}
