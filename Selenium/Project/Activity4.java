package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity4 {
	WebDriver driver;
	  @BeforeClass
	  public void setUp() {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
			//open page
			driver.get("https://alchemy.hguy.co/lms/");
	  }
  @Test
  public void secondPopularCourse() {
	  String secondPopularCourseTitle = driver.findElement(By.xpath("(//div[@class='caption']/h3)[2]")).getText();
      Assert.assertEquals("Email Marketing Strategies", secondPopularCourseTitle);
	  System.out.println("The Second most popular course name is: "+secondPopularCourseTitle);
  }
 

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
