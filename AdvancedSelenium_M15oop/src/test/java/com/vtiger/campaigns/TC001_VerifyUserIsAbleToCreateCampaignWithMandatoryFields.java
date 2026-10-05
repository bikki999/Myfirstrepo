package com.vtiger.campaigns;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ObjectRepository.CampaignPage;
import com.ObjectRepository.CreateACampaignPage;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class TC001_VerifyUserIsAbleToCreateCampaignWithMandatoryFields extends BaseClass{


	@Test
	public void  tC001_VerifyUserIsAbleToCreateCampaignWithhMandatoryFields() throws IOException
	{
		//fetching the file
//		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
//		
//		//create object for file type class(Properties)
//		Properties prop = new Properties();
//		
//		//load the data to test-script
//		prop.load(fis);
//		
//		//Create Object for Utility Class
//		FileUtility fileUtil = new FileUtility();
//		WebDriverUtility webUtil = new WebDriverUtility();
//		
//		//Read Data from Utility Files
//		
//		String URL = fileUtil.readDataFromPropertiesFile("url");
//		String USERNAME = fileUtil.readDataFromPropertiesFile("username");
//		String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
//		
//		webUtil.toMaximize(driver);
//     	webUtil.toImplicitlyWait(driver);
		String TIMESTAMP  = javaUtil.timeStamp();
//	    //driver.manage().window().maximize();
//	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	     driver.get(URL);
//	     
	   //Login
//		LoginPage loginpage = new LoginPage(driver);
//		loginpage.login(USERNAME, PASSWORD);
//		loginpage.getUserNameTextField().sendKeys(USERNAME);
//		loginpage.getPasswordTextField().sendKeys(PASSWORD);
//		loginpage.getLoginButton().click();
//		
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//	    driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//	    driver.findElement(By.id("submitButton")).click();
//               
//	    //navigate to campaign
	    homePage = new HomePage(driver);
		homePage.getMoreButton().click();
		homePage.getCampaignsButton().click();
////		driver.findElement(By.xpath("//a[@href='javascript:;'][normalize-space()='More']")).click();
////		driver.findElement(By.name("Campaigns")).click();
//		
		campaignPage = new CampaignPage(driver);
		//Thread.sleep(5000);
		campaignPage.getCreateNewCampaignIcon().click();
	 campaign = new CreateACampaignPage(driver);
		campaign.createCampaignWithMandatoryFields(TIMESTAMP);
		driver.findElement(By.cssSelector("img[title='Create Campaign...']")).click();
		
		//Fill mandatory details
		campaign = new CreateACampaignPage(driver);
		campaign.createCampaignWithMandatoryFields(TIMESTAMP);
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("Camp_"+TIMESTAMP);
//		driver.findElement(By.xpath("//input[@value='T']")).click();
//		driver.findElement(By.name("closingdate")).clear();
//		driver.findElement(By.name("closingdate")).sendKeys("2026-09-15");
		//driver.findElement(By.xpath("//input[contains(@class,'crmbutton small save')]")).click();
		
		


		
		







	}

}
