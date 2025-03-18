package com.banking.project.pageObjects.letCodeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class DragAndDrop_PO {
    WebDriver ldriver;

    public DragAndDrop_PO(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(linkText = "AUI - 2")
    public WebElement dragAndDropLink;

    @FindBy(id="draggable")
    public WebElement source;

    @FindBy(id="droppable")
    public WebElement target;

    public void DragAndDropLink()
    {
        dragAndDropLink.click();
    }

    public void DragAndDropMethod() throws InterruptedException {
        try {
            Actions action = new Actions(ldriver);
            action.dragAndDrop(source, target).build().perform();
            Thread.sleep(3000);
        }
        catch (Exception e) {
            System.out.println(
                    "Exception occurred while performing Drag and Drop : " + e);
        }
    }
}
