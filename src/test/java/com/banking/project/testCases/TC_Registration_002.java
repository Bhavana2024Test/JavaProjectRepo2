package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.Resgistration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Registration_002 extends BaseClass {


    @Test
    public void registration() throws InterruptedException {


        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(3000);


        driver.findElement(By.linkText("here")).click();
        Thread.sleep(3000);

        Resgistration rp= new Resgistration(driver);
        rp.setEmail("demp2024@gmail.com");
        rp.sbtn();
        Thread.sleep(3000);
    }
}
