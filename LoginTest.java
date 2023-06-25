package LinkedIn;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;

public class LoginTest extends BaseTest {
	
	LoginPage loginPage;
	
	@BeforeClass
	public void setupClass() {
		 
		   loginPage = new LoginPage(basePageDriver);
	}

  @Test 
  public void Login_with_Valid_Phone_Number_and_Password() throws IOException {
	  PropertiesClass.readConfig();
	  loginPage.loginWithUsernameAndPassword(PropertiesClass.getUsername,PropertiesClass.getPassword);
	  Assert.assertEquals(BasePage.findActualResult(Locators.actualResult),"Messaging");

  }
    
   } 
