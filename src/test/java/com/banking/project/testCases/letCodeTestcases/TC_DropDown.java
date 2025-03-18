package com.banking.project.testCases.letCodeTestcases;

import com.banking.project.baseUtilities.BaseClass2;
import com.banking.project.pageObjects.letCodeObjects.DropDown_PO;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_DropDown extends BaseClass2 {

    @Test
    public void SimpledropDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();

        DropDown_PO dd= new DropDown_PO(driver);
        dd.DropDownLink();
        dd.SelectDropDownByVisibleText();
        Thread.sleep(3000);
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        dd.SelectMultipleOptions();
        Thread.sleep(3000);
        dd.deSelectOptionFromMultiSelect();
        dd.selectLastOptionFromTheDropDown();
        Thread.sleep(3000);
        dd.selectSecondLastOptionFromTheDropDown();
        Thread.sleep(3000);
        dd.selectByValueAndPrintSelectOption();

    }

}
