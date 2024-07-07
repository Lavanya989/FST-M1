package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {

	WebDriver driver;
  @BeforeClass
  public void setUp() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
		//open page
		driver.get("https://alchemy.hguy.co/lms/");
  }

  @Test
  public void getHeader() {
	  //verifyHeader
	  String header = driver.findElement(By.className("uagb-ifb-title")).getText();
	  Assert.assertEquals("Learn from Industry Experts", header);
	  System.out.println("Header of the page is :" +header);
  }
  @AfterClass
  public void teardwon() {
	  driver.quit();
  }

}
