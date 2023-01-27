package com.TestNG_Aug;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer{

			int count=1;
			int limit=3;
			public boolean retry(ITestResult result) {
				
				count++;
				if(count <limit) { //0<3
					return true;
				}
			
				return false;
			}
}
