package com.banking.project.pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Resgistration  {

    WebDriver ldirver;


    public Resgistration(WebDriver rdriver)//its a constructor
        {
            ldirver=rdriver;
            PageFactory.initElements(rdriver,this);
        }

         @FindBy(name="emailid")
         WebElement email;

        @FindBy(name="btnLogin")
        WebElement submitbtn;

        public void setEmail(String uemail)
        {
            email.sendKeys(uemail);
        }
       public void sbtn()
       {
           submitbtn.click();
       }



}
