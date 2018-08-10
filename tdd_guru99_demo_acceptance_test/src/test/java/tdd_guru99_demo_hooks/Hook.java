package tdd_guru99_demo_hooks;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;

import com.guru99.demo.pages_objects.HomePage;
import com.guru99.demo.test_browsers.SharedBrowsers;
import com.guru99.demo.utils.Screenshot;

public class Hook{
	protected HomePage homePage;
	private SharedBrowsers sharedBrowsers;
	private WebDriver driver;
	
	@Rule
	public Screenshot screenshot = new Screenshot(driver);
	
	@Before
	public void testPrecondition() {
		sharedBrowsers = new SharedBrowsers();
		try {
			homePage = sharedBrowsers.initialiseBrowser().setupBrowser().loadDefaultPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = sharedBrowsers.getDriver();
		
		
		
	}
	
	@After
	public void testPostcondition() {
		sharedBrowsers.tearDownBrowser();
		
	}

}
