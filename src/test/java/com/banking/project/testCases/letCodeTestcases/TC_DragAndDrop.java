package com.banking.project.testCases.letCodeTestcases;

import com.banking.project.baseUtilities.BaseClass2;
import com.banking.project.pageObjects.letCodeObjects.DragAndDrop_PO;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_DragAndDrop extends BaseClass2 {

    @Test
    public void DragAndDropTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();
        DragAndDrop_PO dd= new DragAndDrop_PO(driver);
        dd.DragAndDropMethod();
        Thread.sleep(4000);
    }
}
