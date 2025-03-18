package com.banking.project.testCases.letCodeTestcases;

import com.banking.project.baseUtilities.BaseClass2;
import com.banking.project.pageObjects.letCodeObjects.Frame;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_Frames extends BaseClass2 {

    @Test
    public void frameMethod() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseURL);
        driver.manage().window().maximize();

        Frame f= new Frame(driver);
        f.frameLink();
        Thread.sleep(3000);
        f.parentFrame();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,300)");
        f.childFrame();
        Thread.sleep(3000);
    }
}
