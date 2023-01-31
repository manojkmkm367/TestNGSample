package org.reportModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportTesting {
WebDriver driver;
ExtentReports extent = new ExtentReports();
ExtentSparkReporter extSparkReporter = new ExtentSparkReporter("MyextSparkReporter.html");
ExtentTest test;

	@Test
	private void openFacebook() {
		 test = extent.createTest("Facebook");
		 test.info("Launching Facebook");		
		driver.get("https://www.facebook.com/");
		test.pass("Facebook running successfully");
	}
	@Test
	private void openRedBus() {
		test = extent.createTest("Redbus");
		test.info("Launching Redbus");
		driver.get("https://www.redbus.in/");
		test.pass("RedBus running successfully");
	}
	@Test
	private void openFlipkart() {
		test = extent.createTest("Flipkart");
		test.info("Launching flipkart");
		driver.get("https://www.flipkart.com/");
		test.pass("Flipkart running successfully");

	}
	
	@BeforeSuite
	private void openChrome() {
		System.out.println("run 1");
	 extent.attachReporter(extSparkReporter);		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\TestNG\\drivers\\chromedriver.exe");
		 driver= new ChromeDriver();

	}
	
	@AfterSuite
	private void closeChrome() {
		extent.flush();
		driver.quit();

	}
	}
