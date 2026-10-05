package com.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001_VerifyUserIsAbleToCreateCampaignWithMandatoryField 
{
	@Test
	public  void tC001_VerifyUserIsAbleToCreateCampaignWithMandatoryField () throws InterruptedException
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
		
		//Print
		Reporter.log("Login Successfull",true);
		
		}

}
