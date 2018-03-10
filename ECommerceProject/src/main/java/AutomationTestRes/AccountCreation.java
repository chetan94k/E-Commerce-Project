package AutomationTestRes;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreation
{
WebDriver driver;
public AccountCreation(WebDriver driver)
{
	this.driver=driver;
}
By getaccount =By.xpath("//*[@id='top']/body/div[1]/div/div[3]/div/div[4]/ul/li[1]/a");
By createaccount =By.xpath("//*[@id='login-form']/div/div[1]/div[2]/a/span/span");
By getfirstname =By.xpath("//*[@id='firstname']");
By getmiddlename =By.xpath("//*[@id='middlename']");
By getlastname =By.xpath("//*[@id='lastname']");
By getpwd =By.xpath("//*[@id='password']");
By confirmpwd =By.xpath("//*[@id='confirmation']");
By register =By.xpath("//*[@id='form-validate']/div[2]/button");
By getemail=By.xpath("//*[@id='email_address']");
By gettv =By.xpath("//*[@id='nav']/ol/li[2]/a");
By addtowishlist =By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a");
By sharewishlist=By.xpath("//*[@id='wishlist-view-form']/div/div/button[1]");
By getmessage =By.xpath("//*[@id='message']");
By getsharelist=By.xpath("//*[@id='form-validate']/div[2]/button");
By getfinalmsg= By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span");
By getnewusername=By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/p[1]/strong");
public WebElement getaccount()
{
return driver.findElement(getaccount);	
}
public WebElement createaccount()
{
return driver.findElement(createaccount);	
}
public WebElement getfirstname()
{
return driver.findElement(getfirstname);	
}
public WebElement getmiddlename()
{
return driver.findElement(getmiddlename);	
}
public WebElement getlastname()
{
return driver.findElement(getlastname);	
}
public WebElement getpwd()
{
return driver.findElement(getpwd);	
}
public WebElement confirmpwd()
{
return driver.findElement(confirmpwd);	
}
public WebElement register()
{
return driver.findElement(register);	
}
public WebElement getemail()
{
return driver.findElement(getemail);	
}
public WebElement gettv()
{
return driver.findElement(gettv);	
}
public WebElement addtowishlist()
{
return driver.findElement(addtowishlist);	
}
public WebElement sharewishlist()
{
return driver.findElement(sharewishlist);	
}
public WebElement getmessage()
{
return driver.findElement(getmessage);	
}
public WebElement getsharelist()
{
return driver.findElement(getsharelist);	
}
public WebElement getfinalmsg()
{
return driver.findElement(getfinalmsg);	
}
public WebElement getnewusername()
{
return driver.findElement(getnewusername);	
}

}
