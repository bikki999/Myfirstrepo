package com.AutomationTest;

import java.util.Random;

import java.util.UUID;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_LearnLocalDateTime1 
{
	@Test
	
	public void test()
	{

		
		String data = generateRandomData();
		
		Reporter.log(data,true);
		
		
	}
	public String generateRandomData()

	{
		String data = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "");
		
		return data;
	}
}
