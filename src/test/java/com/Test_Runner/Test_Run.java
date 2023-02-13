package com.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Facebook.Face_Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Santhosh kumar\\eclipse-workspace\\Facebook\\src\\test\\java\\com\\Featurefile\\Feature_1.feature",

		glue="com.Step_Definition",
		monochrome = true,
		dryRun = false,
		strict = true,

		plugin= {"html:Report/htmlReport",
				"pretty",
		}
)
public class Test_Run {

	public static WebDriver driver;
	
	@BeforeClass
	public static void Set_up() {
		driver=Face_Base.get_Driver();
	}

	@AfterClass
	public static void Tear_down() {

	driver.close();		
	}

	
	
}
