package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.AddNewTariffPlan;
import com.banking.project.pageObjects.AddTariffPlanToCustomer;
import com.banking.project.pageObjects.TelecomLink;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC_TeleComAddNewTarifPlan extends BaseClass {

    @Test
    public void addNewTariffPlan() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseUrl);
        driver.manage().window().maximize();
        TelecomLink tl= new TelecomLink(driver);
        tl.linktoTelecom();
        tl.Menu();
        AddNewTariffPlan ntp= new AddNewTariffPlan(driver);
        ntp.TariffPlanLink();

        ntp.setMonthlyRental("500");

        ntp.setFreeLocaMinus("345");

        ntp.setFreeIntMinus("300");

        ntp.setFreeSMSPck("100");

        ntp.setLocalPerMinCharge("2");

        ntp.setInternationalPerMinCharges("4");

        ntp.setSMSPerCharges("1");

        tl.ClickOnSubmit();

        AddTariffPlanToCustomer tp= new AddTariffPlanToCustomer(driver);
        Assert.assertEquals(tp.congMsgOnPage(),"Congratulation you add Tariff Plan");

        tp.HomePageBtnLink();
        Thread.sleep(3000);
    }
}
