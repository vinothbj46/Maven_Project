package com.TestNG_Aug;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
				@Test(dependsOnMethods = "laptopOffer")
				private void mobileOffer() {
					System.out.println("Dewali Offer 20%");
				}
				
				@Test 
				private void laptopOffer() {
					System.out.println("NewYear 15% offer in laptop");
				}
				@Test(dependsOnMethods = "mobileOffer")
				private void DwaliDiscount() {
					System.out.println("Diwali Discounts");
				}

}
