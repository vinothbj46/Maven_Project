package com.RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vinot\\eclipse-workspace\\Maven_pro1\\src\\test\\java\\Adactin_Feature\\Login.Feature",
								glue = "com.Stepdefinition",
								publish = true
								)

public class Test_Runner {

}
