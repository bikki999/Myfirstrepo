package com.vtiger.campaigns;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericUtility.RetryAnalyzer;
import com.businessUtility.BaseClass;



//@Listeners(com.GenericUtility.ListenerUtility.class)

public class TC003_VerifyUserIsAbleToCreateCampaignWithMandatoryFields extends BaseClass {

	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void tC003_VerifyUserIsAbleToCreateCampaignWithMandatoryFields() throws Throwable
	{
		Reporter.log("Testcase executing...",true);
		String ExpectedResult = futil.readDataFromPropertiesFile("campname");  //case_001
		String CAMPAIGNNAME = futil.readDataFromPropertiesFile("campname"); //case_001
		//String ExpectedResult = "Title page";
		//Reporter.log("Testcase executing...",true);
		//Assert.assertEquals("abc","acc");
		//Reporter.log("Testcase executed...",true);
		
		WebElement element = driver.findElement(By.xpath(""));
		element.sendKeys(CAMPAIGNNAME);
		
		
		//HARD WAIT
		Thread.sleep(5000);
		element.click();
		//driver.getTitle();
		String ActualResult = driver.getTitle();
		
		Assert.assertEquals(ActualResult,ExpectedResult);
	}
}
