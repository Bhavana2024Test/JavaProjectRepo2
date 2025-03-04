package com.banking.project.baseUtilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseUrl="https://demo.guru99.com/V1/index.php";
	public String busername="mngr613120";
	public String bpassword="enagYdy";
	public String addCustPage="https://demo.guru99.com/V1/html/addcustomerpage.php";



	public String customerId ="391410";
	public static WebDriver driver;
	public static Logger logger;

	public JavascriptExecutor js;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		System.out.println(this.customerId);
	}
	@BeforeClass
	public void setUp()
	{
		driver= new ChromeDriver();

		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");
		js=(JavascriptExecutor) driver;
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
