package com.helperFile;

import java.io.IOException;

public class FileReadManager {
	
	//private method
	
	private FileReadManager() {
		
		
	}
	
	//static method------> creating object for this class
	public static FileReadManager instanceFRM() {
		FileReadManager frm=new FileReadManager();
		return frm;
		
	}
	//non static ---------> creating for CR class
	
	public configuration_Readers instanceCR() throws IOException  {
		configuration_Readers reader= new configuration_Readers();
		return reader;
		
		

	}

	
	
	
	
	
}
