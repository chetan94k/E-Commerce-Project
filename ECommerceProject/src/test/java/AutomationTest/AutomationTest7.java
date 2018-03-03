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
public void BeforeAT6() 
{
	driver=null;
	 
}

@Test
public void AT6() throws IOException, Exception 
{
	driver=Driver_Initialisation();
	Base_Initialisation b=new Base_Initialisation();
	Page_Object_Model o=new Page_Object_Model(driver);
	o.getmobile().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	o.getsonycompare().click();
	o.getiphonecompare().click();
	o.getcompare().click();
    Set<String> s=driver.getWindowHandles();
	Iterator<String> i=s.iterator();
	String parent=i.next();
	String child=i.next();
	driver.switchTo().window(child);
    driver.manage().window().maximize();
    WebDriverWait d=new WebDriverWait(driver,30);
    d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='top']/body/div[1]/div[2]/button")));
    b.getScreenshot("popup");
    o.closecompare().click();
    
}

@AfterMethod
public void AfterAT6()
{
	driver.close();
}

}
