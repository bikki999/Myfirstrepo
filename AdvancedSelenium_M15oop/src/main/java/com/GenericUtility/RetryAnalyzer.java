package com.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * This class is used to re run failed test case for 3 times becoz upper limit is- 3
 */

public class RetryAnalyzer implements IRetryAnalyzer {

	   int num = 0;
	   int upperlimit = 3;
	   
	   @Override
	   public boolean retry(ITestResult result)
	   {
		   if(num < upperlimit)
		   {
			   num++;
			   return true;
		   }
		   return false;
	   }
}
