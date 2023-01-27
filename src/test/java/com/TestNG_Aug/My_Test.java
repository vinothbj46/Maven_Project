package com.TestNG_Aug;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
			
			@Test(retryAnalyzer = Retry_Class.class)
			private void softwareTesting() {
				//Assert.assertEquls(actual,expected)
				String actual="vinoth";
				String expected="vinoth";
				Assert.assertEquals(actual, expected);
				System.out.println("Pass");
				
			}
			
			@Test
			private void softwareDevloper() {
				String actual="vijay";
				String expected="vijay";
				Assert.assertEquals(actual, expected);
				System.out.println("Fail");
				
			}

}
