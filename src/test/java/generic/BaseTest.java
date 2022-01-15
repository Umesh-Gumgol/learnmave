package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements IAutoConst {
	public WebDriver driver;
    
	
	static 
	{
		WebDriverManager.chromedriver().setup();
	}
	@BeforeMethod
	public void openApp() {

		
		driver=new ChromeDriver();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		String App_URL=Property.getProperty(PPT_PATH,"URL");
		driver.get("https://www.google.com/");
		
//		driver.manage().window().maximize();

	}
	
	@AfterMethod
	public void closeApp() {
//		Reporter.log("Closing the Browser",true);
		driver.quit();
	}
	
}
