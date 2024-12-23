package objectrepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="Email")
	private WebElement emailTextfiled;
	
	@FindBy(id="Password")
	private WebElement passswordTextfiled;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbuton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getemailTextfiled()
	{
		return emailTextfiled;
	}
	
	public WebElement getpassswordTextfiled()
	{
		return passswordTextfiled;
	}
	
	public WebElement getloginbutton()
	{
		return loginbuton;
	}
}
