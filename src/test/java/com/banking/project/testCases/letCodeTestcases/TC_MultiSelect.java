package com.banking.project.testCases.letCodeTestcases;

import com.banking.project.baseUtilities.BaseClass2;
import com.banking.project.pageObjects.letCodeObjects.MultiSelect_PO;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_MultiSelect extends BaseClass2 {

    @Test
    public void MultiSelectMethod() throws InterruptedException {
        driver.get(baseURL);
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(320,0)");
        MultiSelect_PO ms= new MultiSelect_PO(driver);
        ms.multiselectLink();
        Thread.sleep(3000);
    }
}
