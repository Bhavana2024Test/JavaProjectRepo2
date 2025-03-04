package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.AddTariffPlanToCustomer;
import com.banking.project.pageObjects.TelecomLink;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_TeleComAddTariffPlanToCust extends BaseClass {

    @Test
    public void addTariffPlanToCustomer() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().window().maximize();
        TelecomLink tl= new TelecomLink(driver);
        tl.linktoTelecom();
        Thread.sleep(3000);
        tl.Menu();
        Thread.sleep(3000);
        AddTariffPlanToCustomer tp= new AddTariffPlanToCustomer(driver);
        tp.tariffPlanToCustlink();
        Thread.sleep(3000);
        tp.setCustID(customerId);
        Thread.sleep(3000);
        tp.clickonSubbtn();
        Thread.sleep(3000);

        Assert.assertEquals(tp.custStatus(),"ACTIVE");
        Thread.sleep(3000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,320)");
        Thread.sleep(3000);

       WebElement radio= driver.findElement(By.xpath("//table//tbody//tr//td[1]//input[@id='sele']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio);
        Thread.sleep(3000);
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        String status1=driver.findElement(By.xpath("//section[@id='main']/div[1]/h2[1]")).getText();
        System.out.println(status1);
        Thread.sleep(3000);
        Assert.assertEquals(status1,"Congratulation Tariff Plan assigned");
        driver.findElement(By.xpath("//section[@id='main']//ul//li[1]//a")).click();
        Thread.sleep(3000);

    }
}
