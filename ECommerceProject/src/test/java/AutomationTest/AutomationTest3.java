package AutomationTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import AutomationTestRes.Base_Initialisation;
import AutomationTestRes.Page_Object_Model;

public class AutomationTest3 extends Base_Initialisation{
	WebDriver driver;
@BeforeMethod
public void BeforeAT3() 
{
	driver=null;
	 
}

//Test case to verify that products are sorted by name on clicking sortby name option
@Test
public void AT3() throws IOException 
{
	// driver initialisation
	driver=Driver_Initialisation();
	Page_Object_Model o=new Page_Object_Model(driver);
	o.getmobile().click();
	ArrayList<String> list1=new ArrayList<String>();
	int count=0;
	int size=o.getnames().size();
	
	//fetching all the elements in the list
	for(int i=0;i<size;i++)
    {
    	String element=o.getnames().get(i).getText();
    	list1.add(element);
    	
    }
	
	//Selecting option from drop down using select class
    Select s=new Select(o.getdropdown());
    s.selectByVisibleText("Name");
    ArrayList<String> list2=new ArrayList<String>();
    for(int i=0;i<size;i++)
    {
    	String element=o.getnames().get(i).getText();
    	list2.add(element);
    	
    }
    
    //sorting the elements of list
    Collections.sort(list1);
    
    //validating whether the elements are matching or not after sorting
    for(int i=0;i<size;i++)
    {
    	
    	if(list1.get(i).equalsIgnoreCase(list2.get(i)))
    	{
    		 count=count + 1;
    	}
    }
    
    //verifying the count
    Assert.assertEquals(3, count);
    
}

@AfterMethod
public void AfterAT3()
{
	// closing the driver
	driver.close();		
}

}
