package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.Resgistration;
import com.banking.project.pageObjects.TelecomLink;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(com.banking.project.Listners.TestListner.class)
public class TC_TeleCom001 extends BaseClass {

    @Test
    public void telecom() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseUrl);
        driver.manage().window().maximize();
        TelecomLink tl= new TelecomLink(driver);
        tl.linktoTelecom();

        tl.Menu();

        tl.AddCust();

        js.executeScript("window.scrollBy(0,350)");

        tl.setBgcheckDone();


        tl.setFname("John");

        tl.setLName("frazer");

        tl.setEmail("Johnf@getnada.com");

       tl.setMessage("John is added");


        tl.setTelephone("9089785654");
       // js.executeScript("window.scrollBy(0,350)");

        tl.ClickOnSubmit();


    setCustomerId(tl.getCustId());

        Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class='table-wrapper']//ul//li//a")).click();

    }



}
