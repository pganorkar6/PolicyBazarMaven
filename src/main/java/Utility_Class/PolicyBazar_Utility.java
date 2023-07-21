package Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.asm.Advice.Return;

public class PolicyBazar_Utility 
{
public static void takescreenshot(WebDriver driver,String fileName) throws IOException
{
File SCR = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Prateek\\Desktop\\DESKTOP\\Velocity Classes\\"+fileName+"png");
FileHandler.copy(SCR, dest);
Reporter.log("Taking Screenshot", true);
Reporter.log("Destination of the screenshot is "+dest+" ", true);
}
public static void scrollintoview(WebDriver driver,WebElement element)
{
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
Reporter.log("Scrolling to the element", true);
}
public static String readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream myfile=new FileInputStream("C:\\Users\\Prateek\\Desktop\\DESKTOP\\Velocity Classes\\Selenium\\ExcelSheet\\For Practice.xlsx");
	Reporter.log("Reading data from excel file", true);
	String Value = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
	return Value;
}
public static void wait(int waittime) throws InterruptedException
{
	Thread.sleep(waittime);
	Reporter.log("Applying a sleep of "+waittime+" ", true);
}
public static String readdatafrompropertiesfile(String key) throws IOException
{
Properties prop=new Properties();
FileInputStream myfile=new FileInputStream("C:\\Users\\Prateek\\eclipse-workspace\\SeleniumExcelTestNG_Projects\\Prop.properties");
prop.load(myfile);
String value=prop.getProperty(key);
Reporter.log("Reading data for "+key+" from property file", true);
return value;
}
}