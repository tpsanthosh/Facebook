package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.Login;

public class Singleton {

	public WebDriver driver;
	
	private Login logi;
	
	public Singleton(WebDriver driver2) {
		this.driver=driver2;
	}
	public Login getInstanceLogin() {
		logi=new Login(driver);
		return logi;
		
	}
	
}
