package com.helperFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configuration_Readers {
	public static Properties p;
	public configuration_Readers() throws IOException {
		
		File f = new File("C:\\Users\\vinot\\eclipse-workspace\\Maven_pro1\\src\\main\\java\\com\\helperFile\\Congratulation_properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
		
	}
	
		public String getUsername() {
			 String Username = p.getProperty("user");
			 return Username;
			

		}
		public String getPassword() {
			String Password = p.getProperty("password");
			return Password;
		}
		
	}


