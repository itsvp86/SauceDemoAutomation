package com.automation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseTest {
	protected WebDriver driver;
  
  
  @BeforeClass
  public void setup()
  
  {
	   driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.saucedemo.com/");
	  
  }
  @AfterClass
  public void tearDown() 
  {
      if (driver != null)
      {
          driver.quit(); 

          System.out.println("Browser closed successfully.");
      }
  }
}