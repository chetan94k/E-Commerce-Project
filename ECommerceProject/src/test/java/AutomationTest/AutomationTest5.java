package AutomationTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import AutomationTestRes.Base_Initialisation;
import AutomationTestRes.Page_Object_Model;

public class AutomationTest5 extends Base_Initialisation{
	WebDriver driver;
@BeforeMethod
public void BeforeAT5() 
{
	driver=null;
	 
}

@Test
public void AT5() throws IOException 
{
	driver=Driver_Initialisation();
	Page_Object_Model o=new Page_Object_Model(driver);
	o.getmobile().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    o.addtocart().click();
    o.getqty().sendKeys(Keys.BACK_SPACE);
    o.getqty().sendKeys("1000");
    o.getupdatebutton().click();
    
    
}

@AfterMethod
public void AfterAT5()
{
	//driver.close();
}

}
