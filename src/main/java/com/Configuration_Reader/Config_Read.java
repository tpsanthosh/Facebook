package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Read {

	public static Properties p;
	
	public Config_Read() throws IOException {
		
		File f=new File(
				"C:\\Users\\Santhosh kumar\\eclipse-workspace\\Facebook\\src\\main\\java\\com\\Config_Properties\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	
	public String getEmail() {
		String email=p.getProperty("email");
		return email;
	}
	
	public String getPassword() {
		String pass=p.getProperty("password");
		return pass;
	}
	
	
	
	
	
	
	
}
