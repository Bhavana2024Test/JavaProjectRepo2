package com.banking.project.testCases.letCodeTestcases;

import com.banking.project.baseUtilities.BaseClass2;
import com.banking.project.pageObjects.letCodeObjects.DragAndDropBy_PO;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_DragAndDropBy extends BaseClass2 {

    @Test
    public void dragAndDropByTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();

        DragAndDropBy_PO db= new DragAndDropBy_PO(driver);

        db.DragAndDropByLink();
        Thread.sleep(3000);

    }
}
