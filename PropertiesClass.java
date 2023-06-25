package LinkedIn;

import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import org.testng.annotations.BeforeClass;

public class PropertiesClass {
	
	public static Properties propertyObject = new Properties();
	static String getChromeBrowser;
	static String getGeckoBrowser;
	static String getChromePath;
	static String getGeckoPath;
	static String getWebUrl;
	static String getUsername;
	static String getPassword;
     
	@BeforeClass
    public static void readConfig() throws IOException {
    	try {
    	  FileReader reader = new FileReader("C:\\Users\\HoMari\\eclipse-workspace\\MAVEN-PROJECT\\LinkedIn\\recourses\\config.properties");
          propertyObject.load(reader); 
		} catch (Exception e) {
			System.err.print("Config file not found");
		}
       getChromeBrowser = propertyObject.getProperty("chromeBrowser");
       getGeckoBrowser = propertyObject.getProperty("geckoBrowser");
       getChromePath = propertyObject.getProperty("chromePath");
       getGeckoPath = propertyObject.getProperty("geckoPath");
       getWebUrl = propertyObject.getProperty("webUrl");
       getUsername = propertyObject.getProperty("validUsername");
       getPassword = propertyObject.getProperty("validPassword");
	}
       		 
	   }
