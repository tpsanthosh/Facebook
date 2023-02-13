package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	@FindBy(xpath=("//input[@id='email']"))
	private WebElement email;
	
	@FindBy(xpath=("//input[@id='pass']"))
	private WebElement pass;
	
	@FindBy(xpath=("//button[@name='login']"))
	private WebElement log;
	
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getLog() {
		return log;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
