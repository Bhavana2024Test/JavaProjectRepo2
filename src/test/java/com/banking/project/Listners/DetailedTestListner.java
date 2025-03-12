package com.banking.project.Listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.banking.project.baseUtilities.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
        sparkReporter= new ExtentSparkReporter(".\\test-output\\reports\\"+repName);

        sparkReporter.config().setDocumentTitle("Automation report");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.STANDARD);
        // sparkReporter.config().setTimeStampFormat("EEEE, MM dd, yyyy, hh:mm a '('zzz')'");

        extent= new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Browser name","chrome"); //static way


       extent.setSystemInfo("Tester name","ABC");


       extent.setSystemInfo("operating system","Windows 11");

       List<String> includedGroups= context.getCurrentXmlTest().getIncludedGroups();
       if (!includedGroups.isEmpty())
       {
           extent.setSystemInfo("Group",includedGroups.toString());
       }



    }
    public void onTestStart(ITestResult result)
    {
        System.out.println("Test Execution onTestStart started");
    }

    public void onTestSuccess(ITestResult result)
    {
        test= extent.createTest(result.getTestClass().getName());// create a new entry in the report
        test= test.assignCategory(result.getMethod().getGroups());//to display groups in report
        test.log(Status.PASS, result.getName()+": Test case Passed");//update status p/f/s
        //System.out.println("Test Execution Success");
    }

    public void onTestFailure(ITestResult result)
    {
        test= extent.createTest(result.getTestClass().getName());// create a new entry in the report
        test= test.assignCategory(result.getMethod().getGroups());//to display groups in report
        test.log(Status.FAIL, result.getName()+": Test case Passed");//update status p/f/s


       // test.log(Status.FAIL,"Test case Failed is :"+ result.getName());//update status p/f/s
        test.log(Status.INFO, result.getThrowable().getMessage());

        try{
            String imgPath = new BaseClass().captureScreen(result.getName());
            test.addScreenCaptureFromPath(imgPath);
        } catch (IOException e1)
        {
            e1.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result)
    {
        test= extent.createTest(result.getTestClass().getName());// create a new entry in the report
        test= test.assignCategory(result.getMethod().getGroups());//to display groups in report
        test.log(Status.SKIP, result.getName()+": Test case got Skipped");
        test.log(Status.INFO, result.getThrowable().getMessage());

    }

    public void onFinish(ITestContext context)
    {
        extent.flush();


        // to open the report automatocally after execution below is the code
        String pathOfExtentReport= System.getProperty("user.dir")+"\\test-output\\reports\\"+repName;
        File extentReport= new File(pathOfExtentReport);

        try {
            Desktop.getDesktop().browse(extentReport.toURI());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
