package pages;

import org.openqa.selenium.WebDriver;

public class DashBoard extends Base{

	public DashBoard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean validate(String name) {
		boolean ans = driver.getPageSource().contains(name);
		return ans;
	}

}
