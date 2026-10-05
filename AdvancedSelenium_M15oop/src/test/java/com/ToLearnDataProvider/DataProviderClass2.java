package com.ToLearnDataProvider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass2 {
	
	@DataProvider
	public Object[][] dataprovider()
	{
		Object[][] objarr = new Object[3][2];
		
		objarr[0][0] = "admin1";
		objarr[0][1] = "admin@1";
		objarr[1][0] = "admin2";
		objarr[1][1] = "admin@2";
		objarr[2][0] = "admin3";
		objarr[2][1] = "admin@3";
		
		return objarr;
	}
	@Test (dataProvider = "dataprovider")
	
	 public void test(String username,String password)
	 {
		Reporter.log(username,true);
		Reporter.log(password,true);
	 }
	}


