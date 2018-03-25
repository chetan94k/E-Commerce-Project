package AutomationTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import AutomationTestRes.Base_Initialisation;
public class AutomationTest1 extends Base_Initialisation{
	WebDriver driver;
@BeforeMethod
public void BeforeAT1() 
{
	driver=null;
	 
}

//Test case to verify the title
@Test
public void AT1() throws IOException 
{
	// driver initialisation
	driver=Driver_Initialisation();
	
	//getting title of the webpage
	String Hometitle=driver.getTitle();
	
	//Verifying the title
	Assert.assertEquals(Hometitle,"THIS IS DEMO SITE");
}
@AfterMethod
public void AfterAT1()
{
	driver.close();;
}
}
