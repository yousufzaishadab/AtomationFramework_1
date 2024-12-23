package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generaticutility.BaseClass;
import objectrepositry.HomePage;

public class Test_Computer extends BaseClass {

	@Test
	public void clickOnComputers()
	{
		test = extentreport.createTest("clickOnComputers");
		hp = new HomePage(driver);
		hp.getcomputerslink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","Computers Is not matched");
		test.log(Status.PASS, "Computers page is display");
	}
}
