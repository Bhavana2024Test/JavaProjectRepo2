package com.banking.project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTariffPlanToCustomer {
    WebDriver ldriver;

    public AddTariffPlanToCustomer(WebDriver rdriver) {
        this.ldriver = rdriver;

        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//nav[@id='menu']//ul//li[4]//a")
    WebElement addTariffPlanToCustLink;



    @FindBy(id="customer_id")
    WebElement custID;

    @FindBy(name = "submit")
    WebElement submitbtn;

    @FindBy(xpath = "//section[@id='main']//div//p//font")
    WebElement status;

    @FindBy(xpath = "//section[@id='main']/div[1]/h2[1]")
    WebElement congMsg;

    @FindBy(xpath = "//section[@id='main']//ul//li[1]//a")
    WebElement homePageBtn;

    public void tariffPlanToCustlink()
    {
        addTariffPlanToCustLink.click();
    }
    public void setCustID(String custid) {
        custID.sendKeys(custid);
    }
    public void clickonSubbtn()
    {
        submitbtn.click();
    }

    public String custStatus()
    {
      return  status.getText();
    }

    public String congMsgOnPage()
    {
        return congMsg.getText();
    }

    public void HomePageBtnLink()
    {
        homePageBtn.click();
    }
}
