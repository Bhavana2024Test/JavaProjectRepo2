package com.banking.project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewTariffPlan {

    WebDriver ldriver;

    public AddNewTariffPlan(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//nav[@id='menu']//ul//li[3]//a")
    WebElement addNewTariffPlanLink;

    @FindBy(id="rental1")
    WebElement monthrental;

    @FindBy(id="local_minutes")
    WebElement FreeLocalMinus;

    @FindBy(id="inter_minutes")
    WebElement FreeIntMinus;

    @FindBy(id="sms_pack")
    WebElement FreeSMSPck;

    @FindBy(id="minutes_charges")
    WebElement LocalPerMinCharge;

    @FindBy(id="inter_charges")
    WebElement InternationalPerMinCharges;

    @FindBy(id="sms_charges")
    WebElement SMSPerCharges;


    public void TariffPlanLink()
    {
        addNewTariffPlanLink.click();
    }

    public void setMonthlyRental(String monrental)
    {
        monthrental.sendKeys(monrental);
    }

    public void setFreeLocaMinus(String freelocalmin)
    {
        FreeLocalMinus.sendKeys(freelocalmin);
    }

    public void setFreeIntMinus(String freeIntMinus)
    {
        FreeIntMinus.sendKeys(freeIntMinus);
    }

    public void setFreeSMSPck(String freeSMSPck)
    {
        FreeSMSPck.sendKeys(freeSMSPck);
    }

    public void setLocalPerMinCharge(String localPerMinCharge)
    {
        LocalPerMinCharge.sendKeys(localPerMinCharge);
    }
    public void setInternationalPerMinCharges(String internationalPerMinCharges)
    {
        InternationalPerMinCharges.sendKeys(internationalPerMinCharges);
    }

    public void setSMSPerCharges(String smsPerCharges)
    {
        SMSPerCharges.sendKeys(smsPerCharges);
    }
}
