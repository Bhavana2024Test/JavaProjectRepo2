package com.banking.project.pageObjects.letCodeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveToElement_PO {

    WebDriver ldriver;

    public MoveToElement_PO(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(linkText = "AUI - 3")
    public WebElement moveToElementLink;

    @FindBy(xpath = "//*[@id='sample-box1'][2]")
    public  WebElement fromElement1;

    @FindBy(xpath = "//div[@class='example-container'][2]//div[3]")
    public WebElement toElement1;


    @FindBy(xpath = "//div[@class='example-container'][2]//div[2]")
    public WebElement fromDone;

    @FindBy(xpath = "//div[@class='cdk-drop-list example-list'][1]//div[2]")
    public WebElement toDoEle;

    public void MoveToElementLink()
    {
       moveToElementLink.click();

    }
    public void moveToDone() throws InterruptedException {
        Actions actions = new Actions(ldriver);
        Thread.sleep(3000);
        actions.clickAndHold(fromElement1).moveToElement(toElement1).moveByOffset(40,50).release().perform();

        Thread.sleep(3000);
        actions.clickAndHold(fromDone).moveToElement(toDoEle).moveByOffset(40,50).release().perform();
        Thread.sleep(3000);
    }
}
