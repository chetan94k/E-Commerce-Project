package AutomationTest;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

public class AutomationTest8 extends Base_Initialisation{
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
	String firstname="Chetan3";
	String lastname="Sharma";
	//creating object of page_object_model class and passing driver as parameter
	AccountCreation a=new AccountCreation(driver);
	 
	//clicking "My account" link 
	 a.getaccount().click();
	a.createaccount().click();
	
	
	//Filling the details in the form
    a.getfirstname().sendKeys(firstname);
    a.getmiddlename().sendKeys("Kumar");
    a.getlastname().sendKeys(lastname);
    a.getemail().sendKeys("chetanbc2@gmail.com");
    a.getpwd().sendKeys("happfaces");
    a.confirmpwd().sendKeys("happfaces");
    a.register().click();
    
    //creating expected welcome text after registration
    String welcome="Welcome"+firstname+" "+lastname+"!";
	
    //verifying the registration by comparing welcome text
    SoftAssert s=new SoftAssert();
    s.assertNotEquals(a.getnewusername().getText(),welcome);
	
    //clicking tv menu button
    a.gettv().click();
    
    //adding product to wish list
    a.addtowishlist().click();
    
    //share wishlist
    a.sharewishlist().click();
    a.getemail().sendKeys("adb23@gmail.com");
    a.getmessage().sendKeys("This LCD TV is worth purchasing,just have a look");
    a.getsharelist().click();
   
    //Wishlist shared validation 
    s.assertEquals(a.getfinalmsg().getText(),"Your Wishlist has been shared.");
    s.assertAll();
    
}

@AfterMethod
public void AfterAT8()
{
	//closing the web browser
	//driver.close();
}

}
