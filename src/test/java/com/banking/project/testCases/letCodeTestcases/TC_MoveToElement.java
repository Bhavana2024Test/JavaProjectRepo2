package com.banking.project.testCases.letCodeTestcases;

import com.banking.project.baseUtilities.BaseClass2;
import com.banking.project.pageObjects.letCodeObjects.MoveToElement_PO;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_MoveToElement extends BaseClass2 {

    @Test
    public void moveToElementMethod() throws InterruptedException {

        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        MoveToElement_PO mp= new MoveToElement_PO(driver);
        mp.MoveToElementLink();
        mp.moveToDone();
        Thread.sleep(3000);
    }
}
