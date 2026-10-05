package com.AutomationTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.LoginPage;

public class TestNGAnnotations 
{
	WebDriverUtility webUtil = new WebDriverUtility();
	WebDriver driver = null;
	@BeforeSuite
		public void beforeSuite() {
			Reporter.log("@BeforeSuite - database connectivity established",true);
		}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("@AfterSuite - database connectivity terminated",true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("@BeforeTest - report starts",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("@AfterTest - report backed-up",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("@BeforeClass - launch browser",true);
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("@AfterClass - close browser",true);
		driver.quit();
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		Reporter.log("@BeforeMethod - login to the application",true);
		FileUtility fileUtil = new FileUtility();
		String URL = fileUtil.readDataFromPropertiesFile("url");
		String USERNAME = fileUtil.readDataFromPropertiesFile("username");
		String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
		
		WebDriver driver = new ChromeDriver();
		webUtil.toMaximize(driver);
		webUtil.toImplicitlyWait(driver);
		driver.get(URL);		
		//Login
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(USERNAME, PASSWORD);
	}
	@AfterMethod
	public void afterbeforeMethod() {
		Reporter.log("@AfterMethod - logout from the application",true);
	}
	@Test
public void testNG() {
	// Write Test case
	Reporter.log("@Test - Testcase executed",true);
}
}


