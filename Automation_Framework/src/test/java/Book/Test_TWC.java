package Book;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generaticutility.BaseClass;
import generaticutility.ListnerUtility;
import objectrepositry.HomePage;

@Listeners(ListnerUtility.class)
public class Test_TWC extends BaseClass {

	@Test
	public void clickOnBooks()
	{
		test = extentreport.createTest("clickOnBooks");
		hp = new HomePage(driver);
		hp.getBookslink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Books Is not matched");
		test.log(Status.PASS, "Books page is display");
		Report.log("Pass the test",true);
	}
}
