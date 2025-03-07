package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.AddTariffPlanToCustomer;
import com.banking.project.pageObjects.PayBill;
import com.banking.project.pageObjects.TelecomLink;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_TeleComPayBill extends BaseClass {

    @Test
    public void paybill() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseUrl);
        driver.manage().window().maximize();
        TelecomLink tl= new TelecomLink(driver);
        tl.linktoTelecom();
        tl.Menu();

        PayBill pb = new PayBill(driver);
        pb.paybillLink();

        AddTariffPlanToCustomer tpc= new AddTariffPlanToCustomer(driver);
        tpc.setCustID(customerId);

        tl.ClickOnSubmit();

        Thread.sleep(3000);


    }
}
