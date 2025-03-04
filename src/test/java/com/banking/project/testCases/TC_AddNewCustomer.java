package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.NewCustomerLink;
import org.testng.annotations.Test;

public class TC_AddNewCustomer extends BaseClass {

    @Test
    public void addCustomer() throws InterruptedException {
        driver.get(addCustPage);
        driver.manage().window().maximize();
        NewCustomerLink ncl= new NewCustomerLink(driver);
        ncl.setCustName("John");
        Thread.sleep(1000);
        ncl.setCustGenderFemale();
        Thread.sleep(1000);
        ncl.setcustDOB("02-02-1995");
        Thread.sleep(1000);
        ncl.setCustAddress("AjabNagar");
        Thread.sleep(1000);
        ncl.setCustCity("pune");
        Thread.sleep(1000);
        ncl.setCustState("MH");
        Thread.sleep(1000);
        ncl.setCustPIN("431205");
        Thread.sleep(1000);
        ncl.setTelephone("9876543210");
        Thread.sleep(1000);
        ncl.setEmailId("john@getnada.com");
        Thread.sleep(3000);
        ncl.clickOnSubmitbtn();
        Thread.sleep(3000);
    }
}
