package com.GenericUtility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
/**
 * This class is used to fetch test data from external resource file
 * @author Bikashendu
 */

public class FileUtility
{
	/**
	 * This method is used to fetch test data from Properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertiesFile(String key) throws IOException
	{
	//public void readDataFromPropertiesFile(String key)
	//create objects for FileInputStream class From java
		
	//Fetching the file
	FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
	
	//// Create object of Properties class
	//create object for file type class(properties)
	//open the file
	Properties prop = new Properties();
	
	//load the data into test script
	 prop.load(fis);
	 
	 //read data from loaded file
	// Read data using key
	 String value = prop.getProperty(key);
	 
	 return value;
	 

}

	

}
