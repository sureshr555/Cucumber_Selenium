package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;
	
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement login;
	
	

	
	 public static WebDriver getDriver() {
		return driver;
	}




	public WebElement getLogin() {
		return login;
	}




	public HomePage(WebDriver fdriver) 
	{
		this.driver=fdriver;
		PageFactory.initElements(driver, this);
	}
	
	
}
