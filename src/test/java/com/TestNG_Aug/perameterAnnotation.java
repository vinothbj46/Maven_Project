package com.TestNG_Aug;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class perameterAnnotation {
	
				@Test
				@Parameters({"Username","Password"})
				private void creandentialData(@Optional("root") String Username,@Optional("root123") String Password) {
					System.out.println("UNAME: "+Username);
					System.out.println("PASS:"+Password);
					
				}

}
