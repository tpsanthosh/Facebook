package com.Face_Runner;

import org.openqa.selenium.WebDriver;

import com.Base_Facebook.Face_Base;
import com.Configuration_Reader.File_Read;
import com.Singleton_Design_Pattern.Singleton;

public class Runner_class extends Face_Base{

	public static WebDriver driver=Face_Base.get_Driver();
	
	public static Singleton sdp=new Singleton(driver);
	
	public static void main(String[] args) throws Throwable {
		
		geturl("https://www.facebook.com/");
		
	String email=File_Read.getInstanceFR().getInstanceCR().getEmail();
	inputvalues(sdp.getInstanceLogin().getEmail(), email);
	sleep(2000);
	String pass=File_Read.getInstanceFR().getInstanceCR().getPassword();
	inputvalues(sdp.getInstanceLogin().getPass(), pass);
	sleep(2000);
	clickonelement(sdp.getInstanceLogin().getLog());
	sleep(11000);
	close();
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
