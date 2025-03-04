package com.banking.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelecomLink
{
    WebDriver ldriver;


    public TelecomLink(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(linkText = "Telecom Project")
    WebElement telecomlink;

    @FindBy(xpath = "//span[@id='header']//a")
    WebElement teleMenu;

    @FindBy(xpath = "//nav[@id='menu']//ul//li[2]//a")
    WebElement addCustLink;

    @FindBy(xpath = "//input[@id='done']")
    WebElement bgDone;

    @FindBy(id="pending")
    WebElement bgPending;

    @FindBy( id="fname")
    WebElement fName;

    @FindBy( id="lname")
    WebElement lName;

    @FindBy( id="email")
    WebElement custemail;

    @FindBy( xpath = "//textarea[@name='addr']")
    WebElement message;

    @FindBy( id="telephoneno")
    WebElement telephoneno;

    @FindBy(name="submit")
    WebElement submit;

    @FindBy(xpath ="//input[@value='Reset']" )
    WebElement reset;

    @FindBy(xpath = "//table//tbody//tr//td[2]//h3")
    WebElement custId;

    public void linktoTelecom()
    {
        telecomlink.click();
    }

    public void Menu()
    {
        teleMenu.click();
    }

    public void AddCust()
    {
     addCustLink.click();
    }

    public void setBgcheckDone()
    {

        ((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", bgDone);

    }
    public void setBgcheckPending()
    {
        bgPending.click();
    }

    public void setFname(String namef)
    {
        fName.sendKeys(namef);
    }

    public void setLName(String namel)
    {
        lName.sendKeys(namel);
    }
     public void setEmail(String email)
     {
         custemail.sendKeys(email);
     }

     public void setMessage(String msg)
     {
         message.sendKeys(msg);

     }

     public void setTelephone(String teleph)
     {
         telephoneno.sendKeys(teleph);
     }

     public void ClickOnSubmit()
     {
         submit.click();
     }

    public String getCustId()
    {
       return custId.getText();

    }


}
