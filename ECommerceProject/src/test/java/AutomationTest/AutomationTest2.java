package AutomationTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import AutomationTestRes.Base_Initialisation;
import AutomationTestRes.Page_Object_Model;

public class AutomationTest2 extends Base_Initialisation{
	WebDriver driver;
@BeforeMethod
public void BeforeAT2() 
{
	driver=null;
	 
}
// Test to verify the title
@Test
public void AT2() throws IOException 
{
	//driver initialisation
	driver=Driver_Initialisation();
	Page_Object_Model o=new Page_Object_Model(driver);
	o.getmobile().click();
	
	//Wait has been added
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    
	//fetching and verifying the title
	String title1=driver.getTitle();
	Assert.assertEquals(title1, "Mobile");
}

@AfterMethod
public void AfterAT2()
{
	driver.close();
}

}
