package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
  
  WebDriver driver;
  @BeforeClass
  public void setUp() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
		//open page
		driver.get("https://alchemy.hguy.co/lms/");
  }
  
   
  
  @Test(priority=1)
  public void myAccount() throws InterruptedException {
	 	  driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li[5]")).click();
	  //Thread.sleep(2000);
	  String myAccountTitle = driver.findElement(By.xpath("//div[@class='uagb-ifb-title-wrap']/h1")).getText();
      Assert.assertEquals(myAccountTitle, "My Account");
      System.out.println("The Title of the current page is: " +myAccountTitle);
  }
  @Test(priority=2)
  public void logIn() throws InterruptedException {
	  driver.findElement(By.xpath("//div[@class='learndash-wrapper']/a")).click();
	  //Thread.sleep(2000);
	  //Find and enter username
	  driver.findElement(By.id("user_login")).sendKeys("root");
	  //Find and enter password
	  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	  //click on login button
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	 
	  //verify if user logged in
	  String loginmessage = driver.findElement(By.xpath("//span[@class='display-name']")).getText();
      Assert.assertEquals(loginmessage, "root");
	  //print log message
	  System.out.println("Logged in message is: " +loginmessage);
  }
  

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
