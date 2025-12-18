package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.baseTest;
import com.automation.pages.LoginPage;

public class LoginTest extends baseTest {
  @Test
  public void  verifyLogin() throws InterruptedException 
  {
	

	        LoginPage login = new LoginPage(driver);
	        login.loginToApp("standard_user", "secret_sauce");

	        Thread.sleep(4000);
	        System.out.println("Login successful, pageTitle: " + driver.getTitle());
	        

	     // Validate Products page title
	        String productTitle = driver.findElement(By.className("title")).getText();
	        Assert.assertEquals(productTitle, "Products", "Login failed — Products page title mismatch");
     	// validate login validation
	       //String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
	        //Assert.assertEquals(errorMsg, "Epic sadface: Username and password do not match any user in this service", "Error message mismatch");
	  
	      String expurl = "https://www.saucedemo.com/inventory.html";
	      String acturl = driver.getCurrentUrl();
	      Assert.assertEquals(acturl, expurl, "Login failed — user not redirecte to Product page");
	
	      System.out.println(" Login test passed successfully");
	    }
	  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	  
	  
//	  String title=driver.getTitle(); 
//	  System.out.println("Title of the page is "+title);
//	  
//	  Assert.assertEquals(title,"Swag Labs");
//	   System.out.println("Login Successfully");
//	   
	  
	  
	  
	  
	  
	  
	  
	  
  
}
