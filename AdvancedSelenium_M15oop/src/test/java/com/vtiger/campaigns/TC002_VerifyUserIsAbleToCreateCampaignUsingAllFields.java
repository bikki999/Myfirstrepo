package com.vtiger.campaigns;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;

import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.CreateACampaignPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;
import com.businessUtility.BaseClass;

public class TC002_VerifyUserIsAbleToCreateCampaignUsingAllFields extends BaseClass
{
	@Test
	public void tc002_VerifyUserIsAbleToCreateCampaignUsingAllFields() throws InterruptedException, IOException {
		
//GenericUtility		
	   FileUtility fileUtil = new FileUtility();
	   WebDriverUtility webUtil = new WebDriverUtility();
	   String URL = fileUtil.readDataFromPropertiesFile("url");//
		String USERNAME = fileUtil.readDataFromPropertiesFile("username");
		String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
		
		//Launch Browser 
	    driver = new ChromeDriver();
	    webUtil.toMaximize(driver);
		webUtil.toImplicitlyWait(driver);
		String TIMESTAMP = javaUtil.timeStamp();
	    driver.get(URL);
	
	
    	//Login
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(USERNAME, PASSWORD);
	    driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		
		//navigating to page
		HomePage homePage = new HomePage(driver);
		homePage.getMoreButton().click();
		homePage.getCampaignsButton().click();
		driver.findElement(By.xpath("//a[@href='javascript:;'][normalize-space()='More']")).click();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		
		
		//fill all details
		campaign = new CreateACampaignPage(driver);
				
		campaign.createCampaignWithAllFields(TIMESTAMP);
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("Camp_002"+ TIMESTAMP);
	    driver.findElement(By.xpath("//input[@value='T']")).click();
		WebElement dropdownElement = driver.findElement(By.name("assigned_user_id"));
		dropdownElement.click();
		
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("Support Group");
		driver.findElement(By.name("closingdate")).clear();
		driver.findElement(By.name("closingdate")).sendKeys("2026-09-15");
		driver.findElement(By.id("targetaudience")).sendKeys("18+");
		driver.findElement(By.name("budgetcost")).sendKeys("100000");

		driver.findElement(By.xpath("//input[contains(@class,'crmbutton small save')]")).click();

	}
}



