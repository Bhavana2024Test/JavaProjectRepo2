package com.banking.project.pageObjects.letCodeObjects;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPO {
    WebDriver ldriver;

    public AlertPO(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(linkText = "Dialog")
    public WebElement alertLink;

    @FindBy(id="accept")
    public WebElement simpleAcceptAlert;

    @FindBy(id="confirm")
    public WebElement confirmAlert;

    @FindBy(id="prompt")
    public WebElement promptAlert;

    @FindBy(id="modern")
    public WebElement modernAlert;


    @FindBy(xpath = "//div//div//button[@aria-label='close']")
    public  WebElement close;
    public void AlertLink()
    {
        alertLink.click();
    }

    public void AcceptAlet() throws InterruptedException {
        simpleAcceptAlert.click();
        Thread.sleep(3000);
        org.openqa.selenium.Alert alert= ldriver.switchTo().alert();
        String text= alert.getText();
        System.out.println("accept alert msg: "+text);
        alert.accept();
    }

    public void ConfirmALert() throws InterruptedException {
        confirmAlert.click();
        Alert alert = ldriver.switchTo().alert();
        String txt= alert.getText();
        System.out.println("confirm alert msg: "+txt);
        Thread.sleep(3000);
        alert.accept();
    }
    public void dismissAlert() throws InterruptedException {
        confirmAlert.click();
        Alert alert = ldriver.switchTo().alert();
        Thread.sleep(3000);
        alert.dismiss();
    }

    public void prompAlert() throws InterruptedException {
        promptAlert.click();
        Alert alert = ldriver.switchTo().alert();
        String txt= alert.getText();
        System.out.println("confirm alert msg: "+txt);
        Thread.sleep(3000);
        alert.sendKeys("john");
        Thread.sleep(3000);
        alert.accept();

    }

    public  void modernAlert() throws InterruptedException {
        modernAlert.click();
        String msg= ldriver.findElement(By.xpath("//div//p[@class='title']")).getText();

        System.out.println(msg);
        Thread.sleep(3000);

        close.click();

    }



}
