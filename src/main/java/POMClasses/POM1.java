package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Class.PolicyBazar_Utility;

public class POM1 {
	//variable
	
   @FindBy(xpath = "//a[@class='sign-in']")private WebElement signinbuttonHomePage;
   @FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobilenumber;
   @FindBy(xpath = "(//span[text()='Sign in with Password'])[2]")private WebElement signinwithPassword;
   @FindBy(xpath = "//input[@id='central-login-password']")private WebElement enterpassword;
   @FindBy(xpath = "//span[text()='Sign in']")private WebElement signin;
   @FindBy(xpath = "//div[text()='My Account']")private WebElement myaccount;
   @FindBy(xpath = "//span[text()=' My profile ']")private WebElement MyProfile;
   @FindBy(xpath = "//div[contains(@class,'textCapitalize sc-ckVGcZ kWpXlQ')]")private WebElement myname;
   
   //constructor
   public POM1(WebDriver driver)
   {
	PageFactory.initElements(driver,this);  
   }
   
   //methods
   public void clicksigninhomepage()
   {
	   signinbuttonHomePage.click();
   }
   public void enterMBN(String MN)
   {
	   mobilenumber.sendKeys(MN);
   }
   public void loginwithpassword()
   {
	   signinwithPassword.click();
   }
   public void enterpassword(String pw)
   {
	   enterpassword.sendKeys(pw);
   }
   public void clickonsignin()
   {
	   signin.click();
   }
   public void myaccountclick()
   {
	   myaccount.click();
   }
   public void clickonmyprofile()
   {
	   MyProfile.click();
   }
   public void getmyname()
   {
	   System.out.println(myname.getText());
   }
   
   
}
