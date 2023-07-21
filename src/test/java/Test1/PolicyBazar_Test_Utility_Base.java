package Test1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClasses.POM1;
import POMClasses.POM2;
import PolicyBazarBase.PolicyBazar_BaseClass;
import Utility_Class.PolicyBazar_Utility;

public class PolicyBazar_Test_Utility_Base extends PolicyBazar_BaseClass {
	POM1 login;
	POM2 myacc;

	@BeforeClass
	public void launchpolicybazar() throws IOException, InterruptedException {
		PolicyBazar_Utility.wait(1000);
		launchbrowserusingpropertyfile();
		login = new POM1(driver);
		myacc = new POM2(driver);

	}

	@BeforeMethod
	public void SigninToPolicyBazar() throws IOException, InterruptedException {
		PolicyBazar_Utility.wait(1000);
		login.clicksigninhomepage();
		PolicyBazar_Utility.wait(2000);
		login.enterMBN(PolicyBazar_Utility.readdatafrompropertiesfile("MN"));
		PolicyBazar_Utility.wait(2000);
		login.loginwithpassword();
		PolicyBazar_Utility.wait(1000);
		login.enterpassword(PolicyBazar_Utility.readdatafrompropertiesfile("pw"));
		PolicyBazar_Utility.wait(1000);
		login.clickonsignin();
		PolicyBazar_Utility.wait(1000);
		login.myaccountclick();
		PolicyBazar_Utility.wait(1000);
		login.clickonmyprofile();
		PolicyBazar_Utility.wait(1000);
		Set<String> allH = driver.getWindowHandles();
		List<String> Handles = new ArrayList<>(allH);
		driver.switchTo().window(Handles.get(1));
		PolicyBazar_Utility.wait(1000);
	}

	@Test
	public void verifyusername() 
	{
		myacc.verifymyname();
	}
//	@Test
//	public void CheckDOB() throws InterruptedException
//	{
//		PolicyBazar_Utility.wait(1000);
//		myacc.vlidatedateofbirth();
//	}

}
