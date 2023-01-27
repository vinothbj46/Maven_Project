package com.TestNG_Aug;

import org.testng.annotations.Test;

public class TimeOutException {
	
	@Test(timeOut=4000)
	private void loginPage() throws InterruptedException {
		System.out.println("Username");
		
		Thread.sleep(3000);
		
		System.out.println("Password");

	}

}
