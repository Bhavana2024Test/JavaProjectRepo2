package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.Resgistration;
import com.banking.project.pageObjects.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_Registration_002 extends BaseClass {


    @Test
    public void registration() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver.get(baseUrl);
        driver.manage().window().maximize();

        js.executeScript("window.scrollBy(0,350)");

        Resgistration rp= new Resgistration(driver);
        rp.hereLink();

        rp.setEmail("demo2024@gmail.com");

        rp.sbtn();

        rp.uname();

        rp.pass();
        Thread.sleep(3000);



    }
}
