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
    public String uname;
    public String password;

    public Resgistration(WebDriver rdriver)//its a constructor
        {
            ldirver=rdriver;
            PageFactory.initElements(rdriver,this);
        }

        @FindBy(linkText = "here")
        WebElement herelink;

         @FindBy(name="emailid")
         WebElement email;

        @FindBy(name="btnLogin")
        WebElement submitbtn;

        @FindBy(xpath = "//table//tbody//tr[4]//td[2]")
        WebElement username;

        @FindBy(xpath = "//table//tbody//tr[5]//td[2]")
        WebElement pwd;

        //action methods
        public void hereLink()
        {
            herelink.click();
        }


        public void setEmail(String uemail)
        {
            email.sendKeys(uemail);
        }
       public void sbtn()
       {
           submitbtn.click();
       }

        public void uname()
        {
             uname= username.getText();
            System.out.println(uname);
        }

        public void pass()
        {
            password= pwd.getText();
            System.out.println(password);
        }

}
