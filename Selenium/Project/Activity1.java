package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 {
	WebDriver driver;
   
	@BeforeClass
	  public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		//open page
		driver.get("https://alchemy.hguy.co/lms/");
	  }
	
	@Test
	public void verifyPage() {
		Assert.assertEquals("Alchemy LMS – An LMS Application", driver.getTitle());
		System.out.println("The page title : " + driver.getTitle());
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
