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

public class AutomationTest9 extends Base_Initialisation{
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
	//creating object of page_object_model class and passing driver as parameter
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	AccountCreation a=new AccountCreation(driver);
	 
	//clicking "My account" link 
	 a.getaccount().click();
	
	//Login 
    a.signinemail().clear();
	 a.signinemail().sendKeys("chetanbc14@gmail.com");
    a.signinpwd().clear();
	 a.signinpwd().sendKeys("happfaces");
    a.getlogin().click();
    
    
    //clicking the wishlist,adding product to cart and checkout
     a.getmywishlist().click();
     //getting price of product
     String baseprice=a.getbaseprice().getText();
     a.addtocart().click();
     a.getcheckout().click();

    //Filling shipping details
     a.getaddress().clear();
     a.getaddress().sendKeys("ABC");
     a.getcity().clear();
     a.getcity().sendKeys("NewYork");
     a.getzipcode().clear();
     a.getzipcode().sendKeys("542846");
     Select s=new Select(a.getcountry());
     s.selectByVisibleText("United States");
     Select s1=new Select(a.getstate());
     s1.selectByVisibleText("New York");
     a.gettelephone().clear();
     a.gettelephone().sendKeys("12345678");
     a.getcontinue().click();
     
     //Verifying shipping cost
     SoftAssert soft=new SoftAssert();
     soft.assertEquals(a.getshippingcost().getText(),"$5.00");
     
     a.getcontinue1().click();
     
     a.getcheckradio().click();
     
     a.getcontinue2().click();
     
     double totalprice=a.coversion(a.getshippingcost().getText()) + a.coversion(a.getbaseprice().getText());
     String totalprice1=String.valueOf(totalprice);
	 String totalprice2="$"+totalprice1+"0";
	 System.out.println(totalprice2);
	 
	//verifying the total price of the product
	 soft.assertEquals(a.gettotalprice().getText(), totalprice2);
     
     
     a.orderplaced().click();
     
     soft.assertEquals(a.confirmationmessage().getText(),"YOUR ORDER HAS BEEN RECEIVED");
     
     System.out.println("Your order id is:"+a.getorderid().getText());
     
     soft.assertAll();
     
     
     
     
}

@AfterMethod
public void AfterAT8()
{
	//closing the web browser
	driver.close();
}

}
