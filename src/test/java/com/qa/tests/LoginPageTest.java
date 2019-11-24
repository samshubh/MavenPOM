package com.qa.tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage;
import com.qa.pages.OpenRegister;
import com.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	OpenRegister openregister;
	 
	public LoginPageTest() throws IOException
	{
		super();
		
	}
	
	@BeforeMethod
	  public void setUp() throws IOException
	  {
		intialization();
		
		loginpage =  new LoginPage();
	  }
	
	@Test(priority=1)
	 public void verifyKiposLogo()
	 {
		 boolean b = loginpage.validateKiposLogo();
		 Assert.assertTrue(b);
	 }
	
	@Test(priority=2)
	  public void verifyPOSText()
	  {
		String text = loginpage.validatePOSText();
		  System.out.println(text);
	  }
	
	@Test(priority=3)
	public void verifyEmail()
	{
		loginpage.validateEmail();
	}
	
	@Test(priority=4)
	public void verifyPassword()
	{
		loginpage.validatePassword();
	}
	

	@Test(priority=5)
	public void verifyLogin() throws InterruptedException
	{
		loginpage.validateEmail();
		Thread.sleep(4000);
		
		loginpage.validatePassword();
		Thread.sleep(4000);
		
		 openregister = loginpage.validateLogin();
		   Thread.sleep(3000);
	}
	@AfterMethod
	  public void tearDown()
	  {
		driver.quit();
	  }

}
