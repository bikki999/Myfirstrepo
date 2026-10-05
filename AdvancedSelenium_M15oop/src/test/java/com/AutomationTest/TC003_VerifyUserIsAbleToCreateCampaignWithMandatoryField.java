package com.AutomationTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.LoginPage;

public class TC003_VerifyUserIsAbleToCreateCampaignWithMandatoryField
{
	
	
	@Test
	
	public  void tC003_VerifyUserIsAbleToCreateCampaignWithMandatoryField() throws IOException, InterruptedException
	{
		//Create object for FileInputStream class from java
		//fetching the file
	   FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		
		//Create object for file type class(Properties)
		//open the file
	     Properties prop = new Properties();
		
		//load the data into test script
		//prop.load(fis);
		
		//Read data from the load file
	    //   String URL = prop.getProperty("url");
	    //  String USERNAME = prop.getProperty("username");
	    //  String PASSWORD = prop.getProperty("password");
	    
	    //Create object for Utility class
	      
	     FileUtility fileUtil = new FileUtility();
	     JavaUtility javaUtil = new JavaUtility();
	     
	     //time stamp
	     String timestamp = javaUtil.timeStamp();
	     
	    // Read data from properties file
	     String URL = fileUtil.readDataFromPropertiesFile("url");
	     String USERNAME = fileUtil.readDataFromPropertiesFile("username");
	     String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
	     
	     String ORGANIZATIONNAME = fileUtil.readDataFromPropertiesFile(timestamp);
		
	     //Create object for ChromeDriver class
	      ChromeDriver driver = new ChromeDriver();
	     
	       //maximize browser
			driver.manage().window().maximize();
			
			WebDriverUtility webUtil = new WebDriverUtility();
			webUtil.toMaximize(driver);
			
			//navigate to URL
			//driver.get("http://localhost:8888/");
			//This is the main purpose of commondata.properties.
			driver.get(URL);
			
			//Enter user name into user name text field
			//driver.findElement(By.name("user_name")).sendKeys("admin");
			//Now the username comes from the properties file.
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			
			//Enter password into password text field
			//driver.findElement(By.name("user_password")).sendKeys("admin@gmail.com");
			
			//Again, password comes from the properties file.
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			
			//click on login button
			driver.findElement(By.id("submitButton")).click();
			
			//create object for POM Class
			LoginPage loginpage = new LoginPage(driver);
			
			//Enter user name into user name text field
		//	loginpage.getUserNameTextField().sendKeys(USERNAME);
			
			//Enter password into password text field
		//	loginpage.getPasswordTextField().sendKeys(PASSWORD);
			
			//CLICK ON LOGIN BUTTON
			//loginpage.getLoginButton().click();
			
			loginpage.login(USERNAME, PASSWORD);
			
			driver.findElement(By.xpath("")).sendKeys(ORGANIZATIONNAME+timestamp);
			
			
			
			//hard wait
			Thread.sleep(2000);
			
			//TestNG report
			//print
			Reporter.log("Login Successfull",true);
			
	}

}
