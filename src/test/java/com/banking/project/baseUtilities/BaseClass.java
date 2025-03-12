package com.banking.project.baseUtilities;

import com.banking.project.utilities.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	//@Parameters("browser")
	public void setUp()
	{
		driver= new ChromeDriver();
		js=(JavascriptExecutor) driver;
		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");


		/*if(br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.get(baseUrl);*/

	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	public String captureScreen(String tname) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());

		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		File sourceFile= takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath =System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timeStamp+".png";
		File targetFile= new File(targetFilePath);

		sourceFile.renameTo(targetFile);

		return  targetFilePath;

	}

}
