package com.vtiger.contacts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.CreateNewContact;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class TC002_VerifyUserIsAbleToCreateANewContactsWithAllFields extends BaseClass
{
	@Test
	public void tC002_VerifyUserIsAbleToCreateANewContactWithAllFields()
	{
		

		// Create Object with Utility Classes
		FileUtility fileUtil = new FileUtility();
    	WebDriverUtility webUtil = new WebDriverUtility();
	    JavaUtility javaUtil = new JavaUtility();
//		
//		// Read Data from Utility Files
//		String URL = fileUtil.readDataFromPropertiesFile("url");//
//		String USERNAME = fileUtil.readDataFromPropertiesFile("username");
//		String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
//
//		WebDriver driver = new ChromeDriver();
//		webUtil.toMaximize(driver);
//		webUtil.toImplicitlyWait(driver);
		String TIMESTAMP  = javaUtil.timeStamp();
//		//driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get(URL);
//		
//		
//		//Login
//		LoginPage loginpage = new LoginPage(driver);
//		loginpage.login(USERNAME, PASSWORD);
//		loginpage.getUserNameTextField().sendKeys(USERNAME);
//		loginpage.getPasswordTextField().sendKeys(PASSWORD);
//		loginpage.getLoginButton().click();

		// navigate to contacts
//		driver.findElement(By.cssSelector("a[href='index.php?module=Contacts&action=index']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();

		homePage = new HomePage(driver);
		homePage.createANewContact();
		newContact = new CreateNewContact(driver);
		newContact.createANewContactWithAllFields();
//		WebElement salutationDropdown = driver.findElement(By.name("salutationtype"));
//		salutationDropdown.click();
//		Select dropdown = new Select(salutationDropdown);
//		dropdown.selectByValue("Mr.");
//		driver.findElement(By.name("firstname")).sendKeys("Bimalendu");
//		driver.findElement(By.name("lastname")).sendKeys("Behera");
//		driver.findElement(By.xpath("//input[@value='U']")).click();
//		driver.findElement(By.xpath("//input[contains(@class,'crmbutton small save')]")).click();
//		Thread.sleep(7000);
//		driver.quit();
	}
}

	

