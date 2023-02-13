package com.Configuration_Reader;

import java.io.IOException;

public class File_Read {

	private File_Read() {
		
	}
	
	public static File_Read getInstanceFR() {
		File_Read fr=new File_Read();
		return fr;
	}
	
	public static Config_Read getInstanceCR() throws Throwable {
		Config_Read cr=new Config_Read();
		return cr;
	}
}
