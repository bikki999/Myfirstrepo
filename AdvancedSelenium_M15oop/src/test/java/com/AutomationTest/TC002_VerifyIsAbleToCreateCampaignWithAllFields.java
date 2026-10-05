package com.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002_VerifyIsAbleToCreateCampaignWithAllFields 
{
	@Test
	
	public void tc002_VerifyIsAbleToCreateCampaignWithAllFields () throws InterruptedException
	
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
				
				//click on more Action
				driver.findElement(By.linkText("More")).click();
				
				//click on campaign modules
				
				driver.findElement(By.name("Campaigns")).click();
				
				//click On REATE COMPAIGN Button
				driver.findElement(By.cssSelector("[title='Create Campaign...']")).click();
				
				//Enter Campaign name into Campaign Name Text Field
				driver.findElement(By.name("campaignname")).sendKeys("Camp_003");
				
				//clear the data in text Field
				driver.findElement(By.id("jscal_field_closingdate")).clear();
				
				//enter closing date
				driver.findElement(By.id("jscal_field_closingdate")).sendKeys("2026-09-25");
				
				//enter target audience
				driver.findElement(By.id("targetaudience")).sendKeys("18 + Age Boys And Girls");
				
				//click on save button
				driver.findElement(By.name("button")).click();
	}

}
