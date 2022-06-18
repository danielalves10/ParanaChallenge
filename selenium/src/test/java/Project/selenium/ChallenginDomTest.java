package Project.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChallenginDomTest {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
	}
	
	@AfterClass
	public void tearDown() {				
		driver.close();
		driver.quit();
	}

	@Test(priority = 1)
	public void clickButtons() {
		ChallenginDomPage page = new ChallenginDomPage(driver);
		page.clickButtonBar();
		page.clickbuttonBaz();
		page.clickbuttonQux();
	}
	
	@Test(priority = 2)
	public void clickActionButtons() {
		ChallenginDomPage page = new ChallenginDomPage(driver);
		page.tableAction();
	}
}
