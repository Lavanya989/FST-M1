package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Activity7 {
  
  WebDriver driver;
  @BeforeClass
  public void setUp() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
		//open page
		driver.get("https://alchemy.hguy.co/lms/");
		
  }
  @Test
  public void allCoursesClick() throws InterruptedException {
	  //click on all courses
	  driver.findElement(By.xpath("//a[text()='All Courses']")).click();
	  Thread.sleep(1500);
	  List<WebElement> courses = driver.findElements(By.xpath("//div[@class='ld-course-list-items row']/div"));
      System.out.println("Number of Courses available: " +courses.size());
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
