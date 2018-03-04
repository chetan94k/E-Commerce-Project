package AutomationTest;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

import com.google.common.io.Files;

import AutomationTestRes.Base_Initialisation;
import AutomationTestRes.Page_Object_Model;

public class AutomationTest7 extends Base_Initialisation{
	WebDriver driver;
@BeforeMethod
public void BeforeAT7() 
{
	driver=null;
	 
}

@Test
public void AT7() throws IOException, Exception 
{
	//driver initialisation and go to URL http://live.guru99.com
	driver=Driver_Initialisation();
	
	//creating object of page_object_model class and passing driver as parameter
	Page_Object_Model o=new Page_Object_Model(driver);
	
	//clicking mobile menu
	o.getmobile().click();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//Store the title of two mobiles so that latter can be compare when pop up comes
	String getsonytxt =o.getsonytext().getText();
	String getiphonetxt =o.getiphonetext().getText();
	o.getsonycompare().click();
	o.getiphonecompare().click();
	
	//clicking the compare button
	o.getcompare().click();
    
	//moving to the pop up window
	Set<String> s=driver.getWindowHandles();
	Iterator<String> i=s.iterator();
	String parent=i.next();
	String child=i.next();
	driver.switchTo().window(child);
    
	//maximize the pop up window
	driver.manage().window().maximize();
    
	//explicitly wait has been added
	WebDriverWait d=new WebDriverWait(driver,30);
    d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='top']/body/div[1]/div[2]/button")));
    String getheading=o.getheading().getText();
    
    //Comparing the heading of pop up window
    Assert.assertEquals(getheading,"COMPARE PRODUCTS");
    
    //storing the tittle of selected mobile from pop up window
    String getsonytxt1 =o.getsonytext1().getText();
	String getiphonetxt1 =o.getiphonetext1().getText();
	
	//comparing the titles of selected mobiles 
	Assert.assertEquals(getsonytxt,getsonytxt1);
	Assert.assertEquals(getiphonetxt,getiphonetxt1);
	
	//closing the pop up window
	o.closecompare().click();
    
	//returning back from pop up window
	driver.switchTo().window(parent);
}

@AfterMethod
public void AfterAT7()
{
	//closing the web browser
	driver.close();
}

}
