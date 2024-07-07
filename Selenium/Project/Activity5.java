package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
  
  WebDriver driver;
  @BeforeClass
  public void setUp() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
		//open page
		driver.get("https://alchemy.hguy.co/lms/");
  }
  @Test
  public void myAccount() throws InterruptedException {
	  driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li[5]")).click();
	  Thread.sleep(2000);
	  String myAccountTitle = driver.findElement(By.xpath("//div[@class='uagb-ifb-title-wrap']/h1")).getText();
      Assert.assertEquals(myAccountTitle, "My Account");
      System.out.println("The Title of the current page is: " +myAccountTitle);
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
