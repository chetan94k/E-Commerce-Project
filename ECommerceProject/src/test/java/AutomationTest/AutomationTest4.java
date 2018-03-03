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

public class AutomationTest4 extends Base_Initialisation{
	WebDriver driver;
@BeforeMethod
public void BeforeAT4() 
{
	driver=null;
	 
}

@Test
public void AT4() throws IOException 
{
	driver=Driver_Initialisation();
	Page_Object_Model o=new Page_Object_Model(driver);
	o.getmobile().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	String price=o.getprice().getText();
    o.getsonyimage().click();
    String detailedprice=o.getdetailedprice().getText();
    Assert.assertEquals(price,detailedprice);
    
    }

@AfterMethod
public void AfterAT4()
{
//	driver.close();
}

}
