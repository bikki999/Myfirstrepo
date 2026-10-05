package com.vtiger.contacts;

import org.openqa.selenium.By;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.CreateNewContact;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;
import com.businessUtility.BaseClass;

public class TC001_VerifyIsAbleToCreateANewContactsWithMandatoryFields extends BaseClass 
{
	@Test
	public void tC001_VerifyUserIsAbleToCreateANewContactWithMandatoryFields()
	{
		
//		FileUtility fileUtil = new FileUtility();
//		WebDriverUtility webUtil = new WebDriverUtility();
//		String URL = fileUtil.readDataFromPropertiesFile("url");
//		String USERNAME = fileUtil.readDataFromPropertiesFile("username");
//		String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
//		
//		//WebDriver driver = new ChromeDriver();
//		webUtil.toMaximize(driver);
//		webUtil.toImplicitlyWait(driver);
//		//String TIMESTAMP  = javaUtil.timeStamp();
//		driver.get(URL);
//		
//     	//Login
//		LoginPage login = new LoginPage(driver);
//		login.login(USERNAME, PASSWORD);
		
		//create object of HomePage
		homePage = new HomePage(driver);
		
		homePage.createANewContact();
		//Navighate to contacts
		homePage.getMoreButton().click();
		homePage.getContactsButton().click();
		
		newContact = new CreateNewContact(driver);
		
		// Click on Create New Contact / Plus button
	//	newContact.createANewContactWithMandatoryFields();
		
		//Enter last Name
	//		driver.findElement(By.name("lastname")).sendKeys("Endu");
	//		
	//	
	//		driver.findElement(By.xpath("//input[@value='U']")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'crmbutton small save')]")).click();
		
	}


	}


