package com.banking.project.pageObjects.letCodeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultiSelect_PO {

    WebDriver ldriver;

    public MultiSelect_PO(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//div[@id='container']//div//div[1]")
    WebElement sel1;

    @FindBy(linkText = "AUI - 4")
    WebElement MultiSelectLink;

    public void multiselectLink()
    {
        MultiSelectLink.click();
    }

}
