package tectNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelTest {
	
	@Test
	private void openGoogle() {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\TestNG\\drivers\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.google.co.in");
			driver.quit();
	}
	@Test
	private void openFirefox() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.firefox.com/");
			driver.quit();

	}

}
