package com.banking.project.pageObjects.letCodeObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropBy_PO {

    WebDriver ldriver;

    public DragAndDropBy_PO(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(id="draggable")
    public WebElement from;

    public void DragAndDropByLink() throws InterruptedException {

       ldriver.switchTo().frame(0);
        Actions actions= new Actions(ldriver);
        int x=from.getLocation().getX();
        int y= from.getLocation().getY();
        System.out.println("x:"+x+"y:"+y);
        actions.dragAndDropBy(from,x+70,y+90 ).perform();
       Thread.sleep(3000);
    }


}
