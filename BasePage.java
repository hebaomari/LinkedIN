package LinkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	 static WebDriver classDriver;
	 static WebElement webElement;
	 
	
	
	public BasePage(WebDriver driver) {
		classDriver = driver; }

	public static void clickElement(By signIn) {
		
		classDriver.findElement(signIn).click();
	}
	
	public static void setFieldText(By username, String username2) {
		try {
			webElement = classDriver.findElement(username); 
			webElement.sendKeys(username2);
		} catch (Exception e) {
			
			e.printStackTrace();}
		}
	
     public static String findActualResult(By actualResult) {
		
    	 return classDriver.findElement(actualResult).getText();
	}

	
	}


