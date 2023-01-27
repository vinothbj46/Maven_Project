package com.TestNG_Aug;

import org.testng.annotations.Test;

public class Grouping {
	
			@Test(groups = "Games")
			private void chessGame() {
				System.out.println("Game-Chess");

			}
			
			@Test(groups = "SocialMedia")
			private void faceBook() {
				System.out.println("Social-Facebook");
			}
			@Test(groups = "Games")
			private void criket() {
				System.out.println("Game-criket");
			}
			
			@Test(groups = "UG")
			private void computerScience() {
				 System.out.println("Course-ComputerScience");
			}
			@Test(groups = "SocialMedia")
			private void Instagram() {
				System.out.println("Social-Instagram");
			}
			@Test(groups = "Education")
			private void SeleniumCourse() {
				System.out.println("Course-SeleniumCourse");
			}
			@Test(groups = "Education")
			private void apiTesting() {
				System.out.println("Course-ApiTesting");
				
			}
			
			@Test(groups = "SocialMedia")
			private void Twitter() {
				System.out.println("social-Twitter");

			}
			@Test(groups = "Games")
			private void foodBall() {
				System.out.println("Game-Foodball");

			}
			@Test(groups = "UG")
			private void chemistry() {
				System.out.println("Course-Chemistry");
				
			}
			@Test(groups = "Education")
			private void socialScience() {
				System.out.println("Course-Socialscience");
			}
			
			@Test(groups = "SocialMedia")
				private void Youtube() {
					System.out.println("social-Youtube");
			
			

			}
			
}
