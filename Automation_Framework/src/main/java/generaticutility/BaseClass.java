package generaticutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepositry.HomePage;
import objectrepositry.LoginPage;
import objectrepositry.WelcomePage;

@Listeners
public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports extentreport;
	public static ExtentTest test;
	
	public JavaUtility jLib = new JavaUtility();
	public FileUtility fLib = new FileUtility();
	
	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;
	
	@BeforeSuite
	public void reportconfig()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/"+jLib.getSystemTime()+".html");
		extentreport = new ExtentReports(); 
		extentreport.attachReporter(spark);
	}
	
	@Parameters("Browser")
	@BeforeClass
	public void launchbrowser(@Optional("chrome") String browserName ) throws IOException
	{
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fLib.getDatafromProperty("url"));
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		wp = new WelcomePage(driver);
		wp.getloginlink().click();
		
		lp = new LoginPage(driver);
		lp.getemailTextfiled().sendKeys(fLib.getDatafromProperty("email"));
		lp.getpassswordTextfiled().sendKeys(fLib.getDatafromProperty("password"));
		lp.getloginbutton().click();
	}
	
	@AfterMethod
	public void logout()
	{
		hp = new HomePage(driver);
		hp.getlogoutlink().click();
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
	
	@AfterSuite
	public void reportbackup()
	{
		extentreport.flush();
	}
}
