package AutomationTestRes;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreation
{
WebDriver driver;
String price;
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
By signinemail =By.xpath("//*[@id='email']");
By signinpwd =By.xpath("//*[@id='pass']");
By getlogin =By.xpath("//*[@id='send2']");
By getmywishlist =By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a");
By addtocart =By.xpath("//button[@class='button btn-cart']");
By getcheckout =By.xpath("//button[@title='Proceed to Checkout']");
By getaddress =By.xpath("//*[@id='billing:street1']");
By getcity =By.xpath("//*[@id='billing:city']");
By getstate =By.xpath("//*[@id='billing:region_id']");
By getzipcode =By.xpath("//*[@id='billing:postcode']");
By getcountry =By.xpath("//*[@id='billing:country_id']");
By gettelephone =By.xpath("//*[@id='billing:telephone']");
By getcontinue =By.xpath("//*[@id='billing-buttons-container']/button");
By getshippingcost=By.xpath("//*[@id='checkout-shipping-method-load']/dl/dd/ul/li/label/span");
By getcontinue1=By.xpath("//*[@id='shipping-method-buttons-container']/button");
By getcheckradio =By.xpath("//*[@id='p_method_checkmo']");
By getcontinue2=By.xpath("//*[@id='payment-buttons-container']/button");
By orderplaced =By.xpath("//*[@id='review-buttons-container']/button");
By confirmationmessage=By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div/div[1]/h1");
By getorderid=By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div/p[1]/a");
By getbaseprice =By.xpath("//*[@id='product-price-4']");
By gettotalprice=By.xpath("//*[@id='checkout-review-table']/tfoot/tr[3]/td[2]/strong/span");
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
public WebElement signinemail()
{
return driver.findElement(signinemail);	
}
public WebElement signinpwd()
{
return driver.findElement(signinpwd);	
}
public WebElement getlogin()
{
return driver.findElement(getlogin);	
}
public WebElement getmywishlist()
{
return driver.findElement(getmywishlist);	
}
public WebElement addtocart()
{
return driver.findElement(addtocart);	
}
public WebElement getcheckout()
{
return driver.findElement(getcheckout);	
}
public WebElement getaddress()
{
return driver.findElement(getaddress);	
}
public WebElement getcity()
{
return driver.findElement(getcity);	
}
public WebElement getstate()
{
return driver.findElement(getstate);	
}
public WebElement getzipcode()
{
return driver.findElement(getzipcode);	
}
public WebElement getcountry()
{
return driver.findElement(getcountry);	
}
public WebElement gettelephone()
{
return driver.findElement(gettelephone);	
}
public WebElement getcontinue()
{
return driver.findElement(getcontinue);	
}
public WebElement getshippingcost()
{
return driver.findElement(getshippingcost);	
}
public WebElement getcontinue1()
{
return driver.findElement(getcontinue1);	
}
public WebElement getcheckradio()
{
return driver.findElement(getcheckradio);	
}
public WebElement getcontinue2()
{
return driver.findElement(getcontinue2);	
}
public WebElement orderplaced()
{
return driver.findElement(orderplaced);	
}
public WebElement confirmationmessage()
{
return driver.findElement(confirmationmessage);	
}
public WebElement getorderid()
{
return driver.findElement(getorderid);	
}
public WebElement getbaseprice()
{
return driver.findElement(getbaseprice);	
}
public WebElement gettotalprice()
{
return driver.findElement(gettotalprice);	
}


public  Double coversion(String s)
{
	price="";
	int size=s.length();
	for(int i=1;i<size;i++)
    {
		String l=Character.toString(s.charAt(i));
    	if(s.equalsIgnoreCase("$"))
    	{
    		continue;
    	}
    	 price=price+l;
    }

    return Double.parseDouble(price);
}

}
