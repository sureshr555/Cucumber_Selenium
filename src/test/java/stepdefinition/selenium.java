package stepdefinition;

import Cucumber_Selenium.Cucumber_Selenium.BaseClass;
import Runner.HomePage;
import Runner.SignIn;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class selenium  extends BaseClass{
	public static WebDriver driver;

	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver =getBrowser("chrome");
	
		getURl("http://automationpractice.com/index.php");
	 
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {

		SignIn sign=new SignIn(driver);
	
		clickonWebelement(sign.getSignIn());
	
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		
		HomePage hp=new HomePage(driver);
		
		   
		inputValuestoWebelement(hp.getEmail(),"kkgan@gmail.com");
		
		inputValuestoWebelement(hp.getPass(),"qwerty");
		clickonWebelement(hp.getlogin());
		
		
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
}