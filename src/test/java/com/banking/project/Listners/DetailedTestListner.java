package com.banking.project.Listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailedTestListner implements ITestListener {
    public ExtentSparkReporter sparkReporter;  //UI of the report
    public ExtentReports extent; //populate common info on the report
    public ExtentTest test; //creating test case entries in the report and update the status of the test methods

    String repName;
    //change access modifier by default to public because to increase the accessibility of below methods
    public void onStart(ITestContext context)
    {
        String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        repName="Test-Report-"+timeStamp+".html";
        sparkReporter= new ExtentSparkReporter(".\\test-output\\"+repName);

        sparkReporter.config().setDocumentTitle("Automation report");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.STANDARD);
        // sparkReporter.config().setTimeStampFormat("EEEE, MM dd, yyyy, hh:mm a '('zzz')'");

        extent= new ExtentReports();
        extent.attachReporter(sparkReporter);

        //extent.setSystemInfo("Browser name","chrome"); static way

       String browser= context.getCurrentXmlTest().getParameter("browser"); //dynamic way
       extent.setSystemInfo("Browser name",browser);

       extent.setSystemInfo("Tester name","ABC");


    }
    public void onTestStart(ITestResult result)
    {
        System.out.println("Test Execution onTestStart started");
    }

    public void onTestSuccess(ITestResult result)
    {
        test= extent.createTest(result.getName());// create a new entry in the report
        test.log(Status.PASS,"Test case Passed is :"+ result.getName());//update status p/f/s
        //System.out.println("Test Execution Success");
    }

    public void onTestFailure(ITestResult result)
    {
        test= extent.createTest(result.getName());// create a new entry in the report
        test.log(Status.FAIL,"Test case Failed is :"+ result.getName());//update status p/f/s
        test.log(Status.FAIL,"Test Case Files is:" + result.getThrowable());
        // System.out.println("Test Execution Failed");
    }

    public void onTestSkipped(ITestResult result)
    {
        test= extent.createTest(result.getName());// create a new entry in the report
        test.log(Status.SKIP,"Test case Skipped is :"+ result.getName());//update status p/f/s
        //System.out.println("Test Execution Skipped");
    }

    public void onFinish(ITestContext context)
    {
        extent.flush();
        System.out.println("Test Execution Finished");
    }
}
