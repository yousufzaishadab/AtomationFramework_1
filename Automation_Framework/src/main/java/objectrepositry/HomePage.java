package objectrepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText="Log out")
	private WebElement logoutlink;
	
	@FindBy(partialLinkText="Books")
	private WebElement bookslink;
	
	@FindBy(xpath="(//a[normalize-space()='Computers'])[3]")
	private WebElement computerslink;
			
	@FindBy(xpath="(//a[normalize-space()='Electronics'])[3]")
	private WebElement electroinicslink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getlogoutlink()
	{
		return logoutlink;
	}
	
	public WebElement getBookslink()
	{
		return bookslink;
	}
	
	public WebElement getcomputerslink()
	{
		return computerslink;
	}
	
	public WebElement getelectroinicslink()
	{
		return electroinicslink;
	}
}


