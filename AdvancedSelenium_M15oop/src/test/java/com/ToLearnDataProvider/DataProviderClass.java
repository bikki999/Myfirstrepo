
package com.ToLearnDataProvider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass
{
	@DataProvider
	public String[][] dataprovider()
	{
		// Storing Data
		String data[][] =
		{
			{"admin1", "admin@1"},
			{"admin2", "admin@2"},
			{"admin3", "admin@3"}
		};

		// Returning Data
		return data;
	}

	@Test(dataProvider = "dataprovider")
	public void test(String username, String password)
	{
		Reporter.log(username, true);
		Reporter.log(password, true);
	}

}


