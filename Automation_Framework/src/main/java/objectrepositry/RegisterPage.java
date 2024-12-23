package objectrepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement genderbuttonfiled;
	
	@FindBy(css ="#FirstName")
	private WebElement firstnameTextfiled;
	
	@FindBy(css="#LastName")
	private WebElement lastnameTextfiled;
	
	@FindBy(css="#Email")
	private WebElement emailTextfiled;
	
	@FindBy(css="#Password")
	private WebElement passwordTextfiled;
	
	@FindBy(css="#ConfirmPassword")
	private WebElement conpasswordTextfiled;
	
	@FindBy(css="#register-button")
	private WebElement registerbutton;
	
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getgenderbuttonfiled()
	{
		return genderbuttonfiled;
	}
	
	public WebElement getfirstnameTextfiled()
	{
		return firstnameTextfiled;
	}
	
	public WebElement getlastnameTextfiled()
	{
		return lastnameTextfiled;
	}
	
	public WebElement getemailTextfiled()
	{
		return emailTextfiled;
	}
	
	public WebElement getpasswordTextfiled()
	{
		return passwordTextfiled;
	}
	
	public WebElement getconpasswordTextfiled()
	{
		return conpasswordTextfiled;
	}
	
	public WebElement getregisterbutton()
	{
		return registerbutton;
	}
}

