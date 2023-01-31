package org.reportModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;



public class ReportBeforExtent {
	WebDriver driver;
	
	//ExtentReports extent = new ExtentReports();
	
		@Test
		private void openFacebook() {
					
			driver.get("https://www.facebook.com/");
		
		}
		@Test
		private void openRedBus() {
			
			driver.get("https://www.redbus.in/");
			
		}
		@Test
		private void openFlipkart() {
			
			driver.get("https://www.flipkart.com/");
			

		}
		
		@BeforeSuite
		private void openChrome() {
			System.out.println("run 1");
			
			System.out.println("run 2");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\dell\\eclipse-workspace\\TestNG\\drivers\\chromedriver.exe");
			 driver= new ChromeDriver();

		}
		
		@AfterSuite
		private void closeChrome() {
		
			driver.quit();

		}
		

}
