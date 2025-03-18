package com.banking.project.pageObjects.letCodeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame {
    WebDriver ldriver;
    public Frame( WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(linkText = "Inner HTML")
    public WebElement frameLink;

    @FindBy(id="firstFr")
    public WebElement parentFrame;

    @FindBy(name="fname")
    public WebElement fname;

    @FindBy(name="lname")
    public WebElement lname;

    @FindBy(xpath = "//iframe[@src='innerframe']")
    public  WebElement childFrame;

    @FindBy(name = "email")
    public WebElement email;


    public void frameLink()
    {
        frameLink.click();
    }

    public void childFrame()
    {
       // ldriver.switchTo().frame(parentFrame);
        ldriver.switchTo().frame(childFrame);
        email.sendKeys("demo@gmail.com");

    }

    public void parentFrame()
    {
        ldriver.switchTo().frame(parentFrame);
        fname.sendKeys("John");
        lname.sendKeys("stark");
    }

    public void titleParent()
    {
        
    }
}
