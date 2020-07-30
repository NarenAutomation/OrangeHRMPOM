import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.mypages.AbstractPage;
import com.qa.mypages.BasePage;

public class BaseTest {
	WebDriver driver;	
	 AbstractPage abstractPage;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\narendran.r\\eclipse-workspace\\FreeCRMTest\\drivers\\chromedriver-83\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		abstractPage=new BasePage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
