package com.banking.project.testCases.letCodeTestcases;

import com.banking.project.baseUtilities.BaseClass2;
import com.banking.project.pageObjects.letCodeObjects.AlertPO;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_Alert extends BaseClass2 {

    @Test(priority = 1)
    public void alertMethod() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,350)");

        AlertPO hp= new AlertPO(driver);
        hp.AlertLink();

        Thread.sleep(3000);

    }
    @Test(priority = 2)
    public void simpleAlert() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,350)");

        AlertPO hp= new AlertPO(driver);
        hp.AlertLink();

        hp.AcceptAlet();

        Thread.sleep(3000);
    }


    @Test(priority = 3)
    public void ConfirmAlert() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,350)");

        AlertPO hp= new AlertPO(driver);
        hp.AlertLink();

        hp.ConfirmALert();

       // hp.dismissAlert();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void PromptAlert() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,350)");

        AlertPO hp= new AlertPO(driver);
        hp.AlertLink();

       hp.prompAlert();
        Thread.sleep(3000);
    }



    @Test(priority = 5)
    public void ModernAlert() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,350)");

        AlertPO hp= new AlertPO(driver);
        hp.AlertLink();

        hp.modernAlert();
        Thread.sleep(3000);
    }
}
