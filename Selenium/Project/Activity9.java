package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class Activity9 {
	WebDriver driver;
	
	  @BeforeClass
	  public void setUp() {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
			//open page
			driver.get("https://alchemy.hguy.co/lms/");
		  }

	  @Test(priority=1)
	  public void login() {
		  //click on my account
		  driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li[5]")).click();
		  //login
		  driver.findElement(By.xpath("//div[@class='learndash-wrapper']/a")).click();
		  
		  //Find and enter username
		  driver.findElement(By.id("user_login")).sendKeys("root");
		  //Find and enter password
		  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		  //click on login button
		  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		 
		   }
	
	  
	  @Test(priority=2)
	  public void allCoursesClick() throws InterruptedException {
	
		  //click on all courses
		  driver.findElement(By.xpath("//a[text()='All Courses']")).click();
//		  Thread.sleep(1500);
		  //select first course
		  driver.findElement(By.xpath("(//div[@class='ld_course_grid col-sm-8 col-md-4 '])[1]")).click();
//		  Thread.sleep(3500);
	 }
	  @Test(priority=3)
	  public void courseComplete() throws InterruptedException
	  {
		  driver.findElement(By.xpath("//div[@class='ld-item-title']")).click();
		  //verifying the title of the course
//		  Thread.sleep(2000);
		  String courseTitle = driver.findElement(By.xpath("//div[@class='ld-focus-content']/h1")).getText();
		  System.out.print("Course Title is : " + courseTitle);
		  Assert.assertEquals(courseTitle, "Developing Strategy");
		  String status = driver.findElement(By.xpath("//span[@class='ld-lesson-list-progress']")).getText();
		  Assert.assertEquals(status, "100% COMPLETE");
		  
	  }
  

  @AfterClass
  public void tearDown() {
	 driver.quit();
  }

}
