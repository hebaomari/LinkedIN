package LinkedIn;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	public static WebDriver basePageDriver;
	public static LoginPage loginPage;

	 @BeforeClass
	 @Parameters({"browser"})
	 public void Open_Browser(String browser) throws IOException  {
		 PropertiesClass.readConfig();  
		 if (browser.equals("chrome")) {
		 System.setProperty(PropertiesClass.getChromeBrowser, PropertiesClass.getChromePath);
		 basePageDriver = new ChromeDriver();
		 basePageDriver.get(PropertiesClass.getWebUrl);
	   } else if (browser.equals("firefox")) {
			 System.setProperty(PropertiesClass.getGeckoBrowser, PropertiesClass.getGeckoPath);
			 basePageDriver = new FirefoxDriver();
			 basePageDriver.get(PropertiesClass.getWebUrl);
		 }
	  }
} 