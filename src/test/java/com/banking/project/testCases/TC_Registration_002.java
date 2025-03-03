package com.banking.project.testCases;

import com.banking.project.baseUtilities.BaseClass;
import com.banking.project.pageObjects.Resgistration;
import com.banking.project.pageObjects.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Registration_002 extends BaseClass {


    @Test
    public void registration() throws InterruptedException {


        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(3000);
        //driver.findElement(By.linkText("here")).click();


        Resgistration rp= new Resgistration(driver);
        rp.hereLink();
        Thread.sleep(3000);
        rp.setEmail("demo2024@gmail.com");
        Thread.sleep(3000);
        rp.sbtn();
        Thread.sleep(3000);


        rp.uname();
        Thread.sleep(3000);


        rp.pass();
        Thread.sleep(3000);



    }
}
