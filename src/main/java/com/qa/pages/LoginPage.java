package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//img[@class='text-center']")
	  WebElement kiposLogo;
	
	@FindBy(xpath="//h3[@class='text-center pt-3']")
	  WebElement posUserText;
	
	@FindBy(xpath="//input[@id='emailId']")
	  WebElement emailId;
	
	@FindBy(xpath="//input[@id='password']")
	  WebElement password;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	  WebElement loginButton;

	
	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	
	}
	
	public boolean validateKiposLogo()
	{
		return kiposLogo.isDisplayed();
		
	}
	
	public String validatePOSText()
	{
		return posUserText.getText();
	}
	
	public void validateEmail()
	{
		 emailId.sendKeys(prop.getProperty("username"));
	}
	
	public void validatePassword()
	{
		password.sendKeys(prop.getProperty("password"));
	}
	 
	public OpenRegister validateLogin()
	{
		loginButton.click();
		
		return new OpenRegister();
	}
	
	

}
