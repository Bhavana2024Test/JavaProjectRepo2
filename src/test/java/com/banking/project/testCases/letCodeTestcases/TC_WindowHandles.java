package com.banking.project.testCases.letCodeTestcases;

import com.banking.project.baseUtilities.BaseClass2;
import com.banking.project.pageObjects.letCodeObjects.WindowHandles_PO;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_WindowHandles extends BaseClass2 {

    @Test(priority = 0)
    public void windowHandleMethod() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WindowHandles_PO wh= new WindowHandles_PO(driver);
        wh.WindowHandleLink();

        Thread.sleep(3000);

       wh.ClickonHomPageBtn();
        Thread.sleep(3000);
        wh.SwitchTOChildWindow();
        wh.getTitle();
        Thread.sleep(3000);
        wh.SwitchToParentWindow();
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);


    }

    @Test(priority = 1)
    public void MultipleWindowHandles() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WindowHandles_PO wh= new WindowHandles_PO(driver);
        wh.WindowHandleLink();

        Thread.sleep(3000);
        wh.ClickonMultipleWindowBtn();
        Thread.sleep(3000);
        wh.getAllTitles();
        Thread.sleep(3000);
        driver.quit();

    }
}
