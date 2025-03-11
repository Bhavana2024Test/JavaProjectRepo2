package com.banking.project.baseUtilities;

import com.banking.project.utilities.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	ReadConfig rdc= new ReadConfig();
	public String baseUrl=rdc.getApplicationURL();
	public String busername=rdc.getUsername();
	public String bpassword=rdc.getPassword();
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
	@Parameters("browser")
	public void setUp(String br)
	{
		//driver= new ChromeDriver();
		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");


		if(br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.get(baseUrl);
		js=(JavascriptExecutor) driver;
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
