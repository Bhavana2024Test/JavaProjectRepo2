package com.banking.project.pageObjects.letCodeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class WindowHandles_PO {

    WebDriver ldriver;
    public WindowHandles_PO(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


   @FindBy(linkText = "Tabs")
    public WebElement windowHandlesLink;

    @FindBy(id = "home")
    public  WebElement openHomePageBtn;

    @FindBy(id="multi")
    public WebElement openMultipleWindowsBtn;

    public void WindowHandleLink()
    {
        windowHandlesLink.click();
    }

    public void ClickonHomPageBtn()
    {
        openHomePageBtn.click();
    }

    public void ClickonMultipleWindowBtn()
    {
        openMultipleWindowsBtn.click();
    }

    public void SwitchTOChildWindow()
    {
        String parentWindow= ldriver.getWindowHandle();
        System.out.println("Parent wndow:"+parentWindow);

        Set<String> allWindows= ldriver.getWindowHandles();
        System.out.println("child wndow:"+allWindows);

        for( String windowhandle: allWindows)
        {
            if(!windowhandle.equals(parentWindow))
            {
                ldriver.switchTo().window(windowhandle);

            }
        }
    }
    public void SwitchToParentWindow()
    {
        String parentWindow= ldriver.getWindowHandle();
        System.out.println("Parent wndow:"+parentWindow);

        Set<String> allWindows= ldriver.getWindowHandles();
        System.out.println("child wndow:"+allWindows);

        for( String windowhandle: allWindows)
        {
            if(!windowhandle.equals(parentWindow))
            {
                ldriver.switchTo().window(windowhandle);

            }
        }
        ldriver.switchTo().window(parentWindow);
    }
    public void getTitle() {
        SwitchTOChildWindow();
        String ChildWindowtitle = ldriver.getTitle();
        System.out.println("Child Window title: " + ChildWindowtitle);
    }

    public void getAllTitles()
    {
        Set<String> allWindows= ldriver.getWindowHandles();
        System.out.println("child wndow:"+allWindows);

        for( String windowhandle: allWindows)
        {
            ldriver.switchTo().window(windowhandle);
            String AllWindowtitle = ldriver.getTitle();
            System.out.println("Child Window title: " + AllWindowtitle);
        }
    }
}
