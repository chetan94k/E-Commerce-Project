package AutomationTestRes;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Object_Model
{
WebDriver driver;
public Page_Object_Model(WebDriver driver)
{
	this.driver=driver;
}

By getmobile=By.xpath("//*[@id='nav']/ol/li[1]/a");
By getdropdown=By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select");
By getname=By.xpath("//h2[@class='product-name']/a");
By getprice=By.xpath("//*[@id='product-price-1']/span");
By getsonyimage=By.xpath("//*[@id='product-collection-image-1']");
By getdetailedprice=By.xpath("//*[@id='product-price-1']/span");
By addtocart =By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button");
By getqty =By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/input");
By getupdatebutton =By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/button");
By getsonycompare =By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a");
By getiphonecompare =By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a");
By getcompare =By.xpath("//button[@title='Compare']");
By closecompare =By.xpath("//*[@id='top']/body/div[1]/div[2]/button");


public WebElement getmobile()
{
  return driver.findElement(getmobile);	
}
public WebElement getdropdown()
{
  return driver.findElement(getdropdown);	
}
public List<WebElement> getnames()
{
  return driver.findElements(getname);	
}
public WebElement getprice()
{
  return driver.findElement(getprice);	
}
public WebElement getsonyimage()
{
  return driver.findElement(getsonyimage);	
}
public WebElement getdetailedprice()
{
  return driver.findElement(getdetailedprice);	
}
public WebElement addtocart()
{
  return driver.findElement(addtocart);	
}
public WebElement getqty()
{
  return driver.findElement(getqty);	
}
public WebElement getupdatebutton()
{
  return driver.findElement(getupdatebutton);	
}
public WebElement getsonycompare()
{
  return driver.findElement(getsonycompare);	
}
public WebElement getiphonecompare()
{
  return driver.findElement(getiphonecompare);	
}
public WebElement getcompare()
{
  return driver.findElement(getcompare);	
}
public WebElement closecompare()
{
  return driver.findElement(closecompare);	
}

}
