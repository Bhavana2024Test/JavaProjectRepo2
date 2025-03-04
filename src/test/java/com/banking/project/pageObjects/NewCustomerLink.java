package com.banking.project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerLink {

    WebDriver ldriver ;

    public NewCustomerLink(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(linkText = "New Customer")
    WebElement newCustLink;

    @FindBy(name = "name")
    WebElement custName;

    @FindBy(xpath = "//table//tbody//tr[5]//td[2]//input[1]")
    WebElement genderMale;

    @FindBy(xpath = "//table//tbody//tr[5]//td[2]//input[2]")
    WebElement genderFemale;

    @FindBy(name = "dob")
    WebElement custDOB;

    @FindBy(name = "addr")
    WebElement custAddress;

    @FindBy(name="city")
    WebElement custCity;

    @FindBy(name = "state")
    WebElement custState;

    @FindBy(name="pinno")
    WebElement custPinNo;

    @FindBy(name="telephoneno")
    WebElement custTele;

    @FindBy(name="emailid")
    WebElement custEmail;

    @FindBy(name = "sub")
    WebElement custSubmitBtn;


    public void ClickonNewCustLink()
    {
        newCustLink.click();
    }


    public void setCustName(String cname)
    {
        custName.sendKeys(cname);
    }

    public void setCustGenderMale()
    {
        genderMale.click();
    }
    public void setCustGenderFemale()
    {
        genderFemale.click();
    }

    public void setcustDOB(String cdob)
    {
        custDOB.sendKeys(cdob);
    }

    public void setCustAddress(String add)
    {
        custAddress.sendKeys(add);
    }

    public void setCustCity(String city)
    {
        custCity.sendKeys(city);
    }

    public void setCustState(String state)
    {
        custState.sendKeys(state);
    }

    public void setCustPIN(String pin)
    {
        custPinNo.sendKeys(pin);
    }

    public void setTelephone(String tele)
    {
        custTele.sendKeys(tele);
    }
    public void setEmailId(String email)
    {
        custEmail.sendKeys(email);
    }

    public void clickOnSubmitbtn()
    {
        custSubmitBtn.click();
    }


}
