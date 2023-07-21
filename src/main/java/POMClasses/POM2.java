package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM2 {
     @FindBy(xpath = "//div[contains(@class,'textCapitalize sc-ckVGcZ kWpXlQ')]")private WebElement Mynameverification;
     @FindBy(xpath = "//input[@value='25/07/1997']")private WebElement BirthDateVerification;
     
     public POM2(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void verifymyname()
     {
    	 System.out.println(Mynameverification.getText());
     }
     public void validateusername()
     {
    	 String ActualUN=Mynameverification.getText();
    	 String ExpUN="Prateek Ganorkar";
    	 Assert.assertEquals(ActualUN,ExpUN, "Username is matching");
     }
     public void vlidatedateofbirth()
     {
    	 BirthDateVerification.click();
    	 String ActualDoB=BirthDateVerification.getText();
    	 String ExpectedDoB="25/07/1997";
    	 Assert.assertEquals(ActualDoB,ExpectedDoB, "Date of Birth is not matching");
     }
}
