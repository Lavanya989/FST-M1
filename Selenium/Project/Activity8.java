package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity8 {
  
  WebDriver driver;
  @BeforeClass
  public void setUp() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
		//open page
		driver.get("https://alchemy.hguy.co/lms/");
	  }
  
  @Test
  public void contact() throws InterruptedException {
	  //click on Contact
	  driver.findElement(By.xpath("//li[@id='menu-item-1506']/a")).click();
	  Thread.sleep(1000);
	  //filling the form
	  driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Lavanya");
	  driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']")).sendKeys("sampleLav@gmail.com");
	  driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']")).sendKeys("English");
	  driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("Thanks for the great course");
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
	  String text = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText();
	  System.out.println("Message after submit: " +text);
	  Thread.sleep(1000);
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
