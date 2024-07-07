package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	WebDriver driver;
	  @BeforeClass
	  public void setUp() {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
			//open page
			driver.get("https://alchemy.hguy.co/lms/");
	  }
  @Test
  public void firstInfoBox() {
	  String firstInfoBoxName = driver.findElement(By.xpath("(//div[@class='uagb-ifb-title-wrap']/h3)[1]")).getText();
      //assert verify
	  Assert.assertEquals("Actionable Training", firstInfoBoxName);
	  System.out.println("The firstInfo box title: " +firstInfoBoxName);
  }
  
  @AfterClass
  public void teardown() {
	  driver.quit();
	  }

}
