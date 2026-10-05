package com.businessUtility;

import java.io.IOException;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.CampaignPage;
import com.ObjectRepository.CreateACampaignPage;
import com.ObjectRepository.CreateLeadPage;
import com.ObjectRepository.CreateNewContact;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;

public class BaseClass {
	// driver initialization
	public WebDriver driver = null;
	//declare static driver
	public static WebDriver sdriver;
	

	// create object for Utility class
	public FileUtility futil = new FileUtility();
	public WebDriverUtility webutil = new WebDriverUtility();
	public JavaUtility javaUtil = new JavaUtility();

	// create object for POM Class
	public LoginPage loginPage;
	public HomePage homePage;
	public CampaignPage campaignPage;
	public CreateACampaignPage campaign;
	public CreateNewContact newContact;
	public CreateLeadPage newLead;

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("@BeforeSuite-database connectivity established", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("@AfterSuite - database connectivity terminated", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("@BeforeTest - report starts", true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("@AfterTest - report backed-up", true);
	}
    @Parameters("browser")
	@BeforeClass
	public void beforeClass(String BROWSER) {
		Reporter.log("@BeforeClass - launch browser", true);

		// create object for ChromeDriver Class
	//	driver = new ChromeDriver();
		//String BROWSER = null;
		
		
		if(BROWSER.equalsIgnoreCase("chrome"))   //Because BROWSER comes from the TestNG XML file.
		{
			driver = new ChromeDriver();
			Reporter.log(BROWSER + "launched",true);
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			Reporter.log(BROWSER + "launched",true);
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			Reporter.log(BROWSER + "launched",true);
		}
		else if(BROWSER.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
			Reporter.log(BROWSER + "launched",true);
		}
		else
		{
			Reporter.log("Invalid Input",true);
		}
		
		//assign launched browser object(driver) to sdriver
		sdriver = driver;   //sdriver used to take screenshot   And driver is used to perform TestCase

		// navigate url
		driver.get("http://localhost:8888/");

		// maximize driver
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void afterClass() {

		// Print
		Reporter.log("@AfterClass - close browser", true);

		// close browser
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		// Print
		Reporter.log("@BeforeMethod - login to the application", true);

		// Create object for utility class
		// FileUtility fileUtil = new FileUtility();

		// create object for WebDriver class
		// WebDriverUtility webUtil = new WebDriverUtility();

		// read data from properties file
		String URL = futil.readDataFromPropertiesFile("url");
		String USERNAME = futil.readDataFromPropertiesFile("username");
		String PASSWORD = futil.readDataFromPropertiesFile("password");

		// webUtil.toMaximize(driver);
		// webUtil.toImplicitlyWait(driver);

		// navigate url
		driver.get(URL);

		// Login create object for POM class
		loginPage = new LoginPage(driver);
		loginPage.login(USERNAME, PASSWORD);

//		loginPage.getUserNameTextField().sendKeys(USERNAME);
//		loginPage.getPasswordTextField().sendKeys(PASSWORD);
//		loginPage.getLoginButton().click();
	}

	@AfterMethod
	public void afterbeforeMethod() {
		// print
		Reporter.log("@AfterMethod - logout from the application", true);
		// HomePage homePage = new HomePage(driver);
		// homePage.logout();
	}
}
