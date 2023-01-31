package tectNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {	
		System.out.println("********8 open browser ********");
		switch (browser) {
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\TestNG\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox" :
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\TestNG\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();		
		}
	}	
	@Test
	public void navigatePage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://adactinhotelapp.com/index.php");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
