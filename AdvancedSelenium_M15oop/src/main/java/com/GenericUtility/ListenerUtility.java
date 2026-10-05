package com.GenericUtility;

import java.io.File;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;

import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.businessUtility.BaseClass;

public class ListenerUtility implements ITestListener,ISuiteListener {

	ExtentReports reports;
	ExtentTest test;
	
	
	@Override
	public void onStart(ISuite suite) {
	Reporter.log("onStart Executed-STARTED",true);
	
	//create object forExtentSparkReporter class
	ExtentSparkReporter spark = new ExtentSparkReporter("./reports/report.html");
	
	//create object for ExtentReports class
	reports = new ExtentReports();
	
	//call attachReporter() and pass spark reference
	reports.attachReporter(spark);
	
	//call createTest() and store it
	test = reports.createTest(suite.getName());

	}

	@Override
	public void onFinish(ISuite suite) {
	Reporter.log("onFinished Executed-ENDED", true);
	
	//save the report
	reports.flush();

	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("onTestSuccess Executed-PASS", true);	
	
	//call log() and pass argument
	test.log(Status.PASS,"Test case pass - "+result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure Executed - FAILED",true);
		
		//create object for chrome  driver class
		//WebDriver driver = new ChromeDriver();
		
		//Store Screenshot syntax in onTestFailure()
		//Type cast driver reference into TakeScreen reference
         //Use ScreenShot in ListenerUtility,when Testscript fails ,Then We take Screenshot	
		TakesScreenshot ts = (TakesScreenshot) /*BaseClass.driver*/BaseClass.sdriver;
		
		//call gets ScreenshotAs() and pass OutputType argument,Store it
		//This takes the screenshot and stores it temporarily in a File
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		String time = LocalDateTime.now().toString().replace(":","_");
		
		//Create destination file path ,Create object for File class,This creates the final location with time
		File dest = new File("./errorshots/img_"+result+"_"+time+".png");
		
		//copy temporary(temp) Screenshot into destination(dest)
		try {
			FileHandler.copy(temp, dest);
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
		test.log(Status.FAIL,"Test case Failed - "+result.getMethod().getMethodName());
		
		//take screenshot with time
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64),"screenshot_"+result+"_"+time);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log("onTestSkipped Executed-SKIPPED",true);
		
	test.log(Status.SKIP,"Test case Skipped - "+result.getMethod().getMethodName());
	
	}
}