package com.banking.project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBill {
    WebDriver ldriver;

    public PayBill(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//nav[@id='menu']//ul//li[5]//a")
    WebElement payBillLink;

    public void paybillLink()
    {
        payBillLink.click();
    }
}
