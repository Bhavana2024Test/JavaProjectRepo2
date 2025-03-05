package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.AddTariffPlanToCustomer;
import com.banking.project.pageObjects.TelecomLink;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_TeleComAddTariffPlanToCust extends BaseClass {

    @Test
    public void addTariffPlanToCustomer() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseUrl);
        driver.manage().window().maximize();
        TelecomLink tl= new TelecomLink(driver);
        tl.linktoTelecom();

        tl.Menu();

        AddTariffPlanToCustomer tp= new AddTariffPlanToCustomer(driver);
        tp.tariffPlanToCustlink();

        tp.setCustID(customerId);

        tp.clickonSubbtn();


        Assert.assertEquals(tp.custStatus(),"ACTIVE");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,320)");


       WebElement radio= driver.findElement(By.xpath("//table//tbody//tr//td[1]//input[@id='sele']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio);

        driver.findElement(By.name("submit")).click();

        //String status1=driver.findElement(By.xpath("//section[@id='main']/div[1]/h2[1]")).getText();
        System.out.println(tp.congMsgOnPage());

        Assert.assertEquals(tp.congMsgOnPage(),"Congratulation Tariff Plan assigned");
       tp.HomePageBtnLink();
        Thread.sleep(3000);

    }
}
