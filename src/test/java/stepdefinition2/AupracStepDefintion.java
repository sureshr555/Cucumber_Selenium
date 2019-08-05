package stepdefinition2;


import Cucumber_Selenium.Cucumber_Selenium.BaseClass;
import Runner.HomePage;

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

public class AupracStepDefintion extends BaseClass {
	
	public static WebDriver driver;
	
	
	@Given("^User launched the automationpratice\\.com  application$")
	public void user_launched_the_automationpratice_com_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver = getBrowser("chrome");
	    getURl(" http://automationpractice.com/index.php");
	    
	}

	@When("^User clicks on signin button in the header$")
	public void user_clicks_on_signin_button_in_the_header() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
HomePage hp=new HomePage(driver);
hp.getLogin().click();
		
		
		
	}

	@When("^User enter emailid 'kkgan@gmail\\.com' in the signin page$")
	public void user_enter_emailid_kkgan_gmail_com_in_the_signin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enter password 'qwerty' in the signin page$")
	public void user_enter_password_qwerty_in_the_signin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks signin button in signin page$")
	public void user_clicks_signin_button_in_signin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User verify username 'kakkaak dadaefa' displayed in the header$")
	public void user_verify_username_kakkaak_dadaefa_displayed_in_the_header() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enter emailid 'mahesathya(\\d+)@gmail\\.com' in the signin page$")
	public void user_enter_emailid_mahesathya_gmail_com_in_the_signin_page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enter password '(\\d+)' in the signin page$")
	public void user_enter_password_in_the_signin_page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User verify username 'Sathya Mahe' displayed in the header$")
	public void user_verify_username_Sathya_Mahe_displayed_in_the_header() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}