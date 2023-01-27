package com.TestNG_Aug;

import org.testng.annotations.Test;

public class ExcepectedException {
	
			@Test(expectedExceptions =ArithmeticException.class)
			private void calculation_Math() {
				int a=1/0;
				System.out.println(a);
				System.out.println("Arithmetic Exception program");
				
			}

}
