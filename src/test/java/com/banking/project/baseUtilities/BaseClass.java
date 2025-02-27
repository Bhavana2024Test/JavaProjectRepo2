package com.banking.project.baseUtilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseUrl="https://demo.guru99.com/V1/index.php";
	public String username="mngr613120";
	public String password="enagYdy";
	
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setUp()
	{
		driver= new ChromeDriver();
		
		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
