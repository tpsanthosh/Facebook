package com.Step_Definition;

import org.openqa.selenium.WebDriver;

import com.Base_Facebook.Face_Base;
import com.Configuration_Reader.File_Read;
import com.Singleton_Design_Pattern.Singleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Face_Base {

	public static WebDriver driver=Face_Base.driver;
	
	public static Singleton sdp=new Singleton(driver);
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		geturl("https://www.facebook.com/");
	}

	@When("^user enter the email in email field$")
	public void user_enter_the_email_in_email_field() throws Throwable {
		String email=File_Read.getInstanceFR().getInstanceCR().getEmail();
		inputvalues(sdp.getInstanceLogin().getEmail(), email);
		sleep(2000);
	}

	@When("^user enter the password in password fiels$")
	public void user_enter_the_password_in_password_fiels() throws Throwable {
		String pass=File_Read.getInstanceFR().getInstanceCR().getPassword();
		inputvalues(sdp.getInstanceLogin().getPass(), pass);
		sleep(2000);
	}

	@Then("^user click on the login button and it navigate to home page$")
	public void user_click_on_the_login_button_and_it_navigate_to_home_page() throws Throwable {
		clickonelement(sdp.getInstanceLogin().getLog());
		sleep(25000);
		close();
	}
	
	
	
	
	
	
	
}
