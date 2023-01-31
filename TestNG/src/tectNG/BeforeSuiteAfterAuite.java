package tectNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuiteAfterAuite {
	WebDriver driver;
	long startTime1;
	 long endTime1;
	//
	 @BeforeSuite
	private void openChrome() {
		 startTime1 = System.currentTimeMillis();
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\tectNG\\drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	 }

	@Test
	private void openGoogle() {
		driver.navigate().to("https://www.google.com/");

	}
	@Test
	private void openBing() {
		driver.navigate().to("https://www.bing.com/");

	}
	@Test
	private void openYahoo() {
		driver.navigate().to("https://in.yahoo.com");

	}
	@AfterSuite
	private void closeChrome() {
		driver.close();
	  endTime1 = System.currentTimeMillis();
	  long tot = endTime1-startTime1;
	 System.out.println(startTime1 +"  - "+ endTime1+"  tot = "+ tot);
	 //System.out.println(endTime1 - startTime1 );
	}
	
	
}
