package Electronicslink;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generaticutility.BaseClass;
import objectrepositry.HomePage;

public class Test_Electronicslink extends BaseClass {

	@Test
	public void clickOnElectrnoics()
	{
		test = extentreport.createTest("clickOnElectrnoics");
		hp = new HomePage(driver);
		hp.getelectroinicslink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics","Electronics Is not matched");
		test.log(Status.PASS, "Electronics page is display");
	}
}
