package AutomationTestRes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Base_Initialisation 
{
public static WebDriver driver;
String geturl;	
	
public WebDriver Driver_Initialisation() throws IOException
{
    FileInputStream fis=new FileInputStream("C:\\Users\\chetan\\git\\E-Commerce-Project\\ECommerceProject\\src\\main\\java\\AutomationTestRes\\Resources.properties");
	Properties prop=new Properties();
	prop.load(fis);
    if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
    {
    	System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.18.0-win32//geckodriver.exe");
        driver=new FirefoxDriver();
        geturl=prop.getProperty("url");
		driver.get(geturl);

	}
	else if(prop.getProperty("browser").equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32/chromedriver.exe");
		 driver=new ChromeDriver();
	      geturl=prop.getProperty("url");
		driver.get(geturl);
		
	}
	else
	{
		System.out.println("New Webbrowser");
	}
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
return driver;
}
public void getScreenshot(String name) throws IOException
{
 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
 Files.copy(src, new File("C://Screenshots//"+name+"_failure.png"));
}

}
