package com.TestNG_Aug;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Ignore
	@Test
	private void ChessGame() {
		System.out.println("chees 2024");

	}
	
	@Test(enabled = false)
	private void shuttleGame() {
		System.out.println("Shuttle 2023");

	}
	@Test
	private void hockeyGame() {
		System.out.println("Hockey 2022");
		
	}
	
	@Test
	private void foodBall() {
			System.out.println("FootBall 2019");
	}
}
