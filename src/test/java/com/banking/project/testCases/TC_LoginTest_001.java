package com.banking.project.testCases;

import com.banking.project.pageObjects.NewCustomerLink;
import com.banking.project.pageObjects.Resgistration;
import com.banking.project.pageObjects.TelecomLink;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.loginPage;

import java.time.Duration;

public class TC_LoginTest_001 extends BaseClass {

	@Test(priority = 0)
	public void loginTest() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
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
	@Test(priority = 1)//failed testcase
	public void account() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Telecom Project1"));
		Thread.sleep(3000);;



	}
	@Test(priority = 2 , dependsOnMethods = "account")//skipped testcase
	public void ForgetPwd()
	{

	}
}
