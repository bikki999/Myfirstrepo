package com.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 

public class UsingMouseHoverVerifyCampaignAndExpect_Date 
{
	@Test
     public void usingMouseHoverVerifyCampaignAndExpect_Date() throws InterruptedException
     {
    	 //Create object for Chrome Driver Class
 		
 		ChromeDriver driver = new ChromeDriver();
 		
 		//maximize browser
 		driver.manage().window().maximize();
 		
 		//navigate to URL
 		driver.get("http://localhost:8888/");
 		
 		//Enter user name into user name text field
 		driver.findElement(By.name("user_name")).sendKeys("admin");
 		
 		//Enter password into password text field
 		
 		driver.findElement(By.name("user_password")).sendKeys("admin@gmail.com");
 		
 		//click on login button
 		driver.findElement(By.id("submitButton")).click();
 				
 	    //hard wait
 	     Thread.sleep(2000);
 	     
 	     //create action class object
 	    Actions ac = new Actions(driver);
 	    
 	    WebElement more = driver.findElement(By.xpath("//a[contains(text(),'More')]"));
 	   
 	    ac.moveToElement(more).perform();
 	    
 	    //hard wait
 	    Thread.sleep(2000);
                          		
 	   WebElement campaigns = driver.findElement( By.xpath("//a[contains(text(),'Campaigns')]"));
 	   
 	  campaigns.click();
 	  
 	  //hard wait
 	  Thread.sleep(2000);
 	  
 	  //mouse hover on + Symbol
 	  
 	   WebElement plus = driver.findElement(By.xpath("//img[contains(@src,'btnL3Add')]"));
 	 
 	   ac.moveToElement(plus).perform();
 	   
 	   //hard wait
 	    Thread.sleep(1000);
 	  
 	     plus.click();
 	 
 	    Thread.sleep(2000);
 	  
 	  
 	 WebElement newCampaign = driver.findElement(By.xpath("//input[@value='New Campaign']"));
 	 
 	   newCampaign.click();
 	   
 	   //hard wait
 	   Thread.sleep(2000);
 	   
 	  WebElement campaignName = driver.findElement(By.name("campaignname"));

 	   ac.moveToElement(campaignName).perform();
 	   
 	  WebElement expectedDate = driver.findElement(By.name("expecteddate"));
 	  
      // Mouse hover on Expected Date
      ac.moveToElement(expectedDate).perform();
      
      //hard wait
      Thread.sleep(2000);
      
     // Click Expected Date
      expectedDate.click();
      
    //hard wait
      Thread.sleep(2000);
      
   // Close browser
      driver.quit();
  }

}

