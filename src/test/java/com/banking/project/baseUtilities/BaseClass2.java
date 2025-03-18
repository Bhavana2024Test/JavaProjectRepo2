package com.banking.project.baseUtilities;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass2 {
    public String baseURL="https://letcode.in/test";

    public static WebDriver driver;
    public JavascriptExecutor js;
    @BeforeClass
    public void setUpBase2()
    {
        driver = new ChromeDriver();
        js =(JavascriptExecutor) driver;
    }

    @AfterClass
    public void tierDownBase2()
    {
        driver.quit();
    }
}
