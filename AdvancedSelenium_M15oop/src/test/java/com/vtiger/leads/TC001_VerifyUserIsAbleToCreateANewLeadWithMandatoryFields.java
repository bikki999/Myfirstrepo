package com.vtiger.leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.CreateLeadPage;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class TC001_VerifyUserIsAbleToCreateANewLeadWithMandatoryFields  extends BaseClass
{
	@Test
	public void tC001_VerifyUserIsAbleToCreateANewLeadWithMandatoryFields() throws InterruptedException
	{
//		FileUtility fileUtil = new FileUtility();
//		WebDriverUtility webUtil = new WebDriverUtility();
//	    JavaUtility javaUtil = new JavaUtility();
//		String URL = fileUtil.readDataFromPropertiesFile("url");//
//		String USERNAME = fileUtil.readDataFromPropertiesFile("username");
//		String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
//		
//		WebDriver driver = new ChromeDriver();
//	    webUtil.toMaximize(driver);
//		webUtil.toImplicitlyWait(driver);
		String TIMESTAMP  = javaUtil.timeStamp();
//		driver.get(URL);
//		
//		//Login
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
		
		//navigate to Leads
		homePage = new HomePage(driver);
		homePage.getLeadsButton().click();
		
		newLead = new CreateLeadPage(driver);
		newLead.createANewLeadWithMandatoryFields();
		
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
		driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("Endu");
		driver.findElement(By.name("company")).sendKeys("Global"+TIMESTAMP);
		driver.findElement(By.xpath("//input[@value='T']")).click();
		WebElement assigned_group_id = driver.findElement(By.name("assigned_group_id"));
		assigned_group_id.click();
		Select dropdown = new Select(assigned_group_id);
		dropdown.selectByValue("3");
		driver.findElement(By.xpath("//input[contains(@class,'crmbutton small save')]")).click();
		//hard wait
	    Thread.sleep(7000);
	    
		driver.quit();
	}
}

	


