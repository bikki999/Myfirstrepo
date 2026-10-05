package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Declaration
	@FindBy (name = "user_name")
	private WebElement UserNameTextField;
	
	@FindBy (name = "user_password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "//input[@id='submitButton']")
    private WebElement LoginButton;
			
	
	
	//initiallization
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Getters

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}
		
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	/**
	 * 
	 * This method is used to login to application
	 * @param USERNAME
	 * @param PASSWORD
	 */
	
	//create Scenario based methods--(object)
	public void login(String USERNAME,String PASSWORD)
	{
		UserNameTextField.sendKeys(USERNAME);
		PasswordTextField.sendKeys(PASSWORD);
		LoginButton.click();
		
	}

	
	
	

	

}
