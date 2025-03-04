package com.banking.project.testCases;

import com.banking.project.pageObjects.NewCustomerLink;
import com.banking.project.pageObjects.Resgistration;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.loginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseUrl);
		logger.info("url is opened");
		driver.manage().window().maximize();
		loginPage lp= new loginPage(driver);
		lp.setUsername(busername);
		logger.info("Entered username");
		
		lp.setPwd(bpassword);
		logger.info("Entered password");
		
		lp.login();
		
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			Assert.assertFalse(false);
			logger.info("login test failed");
		}
		
		Thread.sleep(3000);
		NewCustomerLink ncl= new NewCustomerLink(driver);
		ncl.ClickonNewCustLink();
		logger.info("Clicked on new customer link");

	}
}
