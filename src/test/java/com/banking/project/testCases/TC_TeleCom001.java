package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.TelecomLink;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_TeleCom001 extends BaseClass {

    @Test
    public void telecom() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().window().maximize();
        TelecomLink tl= new TelecomLink(driver);
        tl.linktoTelecom();
        Thread.sleep(3000);


        tl.Menu();

        Thread.sleep(3000);

        tl.AddCust();

        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(3000);
        tl.setBgcheckDone();


        Thread.sleep(3000);
        tl.setFname("John");
        Thread.sleep(3000);
        tl.setLName("frazer");
        Thread.sleep(3000);
        tl.setEmail("Johnf@getnada.com");
        Thread.sleep(3000);
       tl.setMessage("John is added");

        Thread.sleep(3000);
        tl.setTelephone("9089785654");
       // js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(3000);
        tl.ClickOnSubmit();

        Thread.sleep(3000);
    setCustomerId(tl.getCustId());

        Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class='table-wrapper']//ul//li//a")).click();

    }
}
