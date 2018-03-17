package AutomationTest;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

import AutomationTestRes.AccountCreation;
import AutomationTestRes.Base_Initialisation;
import AutomationTestRes.Page_Object_Model;

public class AutomationTest10 extends Base_Initialisation{
	WebDriver driver;
@BeforeMethod
public void BeforeAT8() throws IOException 
{
	//driver initialization and go to URL http://live.guru99.com
	driver=Driver_Initialisation();
	 
}
//To verify that you can create account in E-commerce site and can share wishlist to other people using email
@Test
public void AT8() throws IOException, Exception 
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//creating object of page_object_model class and passing driver as parameter
	AccountCreation a=new AccountCreation(driver);
	 
	//clicking "My account" link 
	 a.getaccount().click();
	
	//Login with previous created credentials
     a.signinemail().clear();
	 a.signinemail().sendKeys("chetanbc14@gmail.com");
     a.signinpwd().clear();
	 a.signinpwd().sendKeys("happfaces");
     a.getlogin().click();
     //switching to new window
     for(String handle : driver.getWindowHandles())
     {
    	 driver.switchTo().window(handle);
     }
    
     //click on re-order
     a.getreorder().click();
     //switching to new window
     for(String handle : driver.getWindowHandles())
     {
    	 driver.switchTo().window(handle);
     }
    
     //updating the quantity to 10
     a.getedit().click();
     //switching to new window
     for(String handle : driver.getWindowHandles())
     {
    	 driver.switchTo().window(handle);
     }
    
     a.getqty().clear();
     int qty=10;
     String sty=Integer.toString(qty);
     a.getqty().sendKeys(sty);
     a.updatecart().click();
     //switching to new window
     for(String handle : driver.getWindowHandles())
     {
    	 driver.switchTo().window(handle);
     }
    
     
     //fetching price of one product
     String price1=a.price1().getText();
     
     //fetching total price
     String subtotal=a.getsubtotal().getText();
    
     //verifying the Grand Total has increased or not
     SoftAssert soft=new SoftAssert();
     soft.assertEquals(a.coversion(price1)*qty, a.coversion(subtotal));
     
    	 
     }

@AfterMethod
public void AfterAT8()
{
	//closing the web browser
	driver.close();
}

}





