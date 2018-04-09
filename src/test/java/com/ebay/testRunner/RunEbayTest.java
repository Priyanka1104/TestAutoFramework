package com.ebay.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/********************************************************************
 * Class Name: RunEbayTest
 * Generated : 07 April 2018
 * Description: This class that configures Cucumber options and intigrates TestNG with Cucumber.
 * Author : Priyanka
 *******************************************************************/

@CucumberOptions(features = "src/test/java/features/", plugin = { "listener.ExtentReporterNG" }, format = { "pretty",
		"html:target/cucumber", "json:target/cucumber-report.json" }, tags = { "@mobile" }, glue = "steps"

)

public class RunEbayTest extends AbstractTestNGCucumberTests {

}
