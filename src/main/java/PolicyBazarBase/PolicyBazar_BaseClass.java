package PolicyBazarBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import Utility_Class.PolicyBazar_Utility;

public class PolicyBazar_BaseClass {
	static protected WebDriver driver;
	public void launchbrowser()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		Reporter.log("launching browser", true);
		
	}
	public void launchbrowserusingpropertyfile() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(PolicyBazar_Utility.readdatafrompropertiesfile("URL"));
		Reporter.log("Launching browser", true);
	}
	public void closebrowser() throws InterruptedException
	{
		PolicyBazar_Utility.wait(2000);
		Reporter.log("closing browser", true);
		driver.quit();
	}

}
