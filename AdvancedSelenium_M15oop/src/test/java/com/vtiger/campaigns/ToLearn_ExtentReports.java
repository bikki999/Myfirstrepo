package com.vtiger.campaigns;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.RetryAnalyzer;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearn_ExtentReports
{
	@Test (retryAnalyzer = RetryAnalyzer.class)
			
	
	public void test()

	{
		//create object forExtentSparkReporter class
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/report.html");
		
		//create object for ExtentReports class
		ExtentReports reports = new ExtentReports();
		
		//call attachReporter() and pass spark reference
		reports.attachReporter(spark);
		
		//call createTest() and store it
		ExtentTest test = reports.createTest("Sample test Reports");
		
		//printing statement
		Reporter.log("Testcase executed",true);
		Assert.assertEquals("abc","abc");
		//Assert.assertEquals("abc","acc");
		
		//call log() and pass argument
		test.log(Status.PASS,"Test case pass");
		test.log(Status.FAIL,"Test case Failed");
		test.log(Status.SKIP,"Test case Skipped");
		
		//save the report
		reports.flush();
		
	}
}
