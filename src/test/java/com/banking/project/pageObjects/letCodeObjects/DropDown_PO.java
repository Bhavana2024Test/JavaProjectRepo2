package com.banking.project.pageObjects.letCodeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown_PO {
    WebDriver ldriver;

    public DropDown_PO(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(linkText = "Drop-Down")
    public WebElement dropDownLink;

    @FindBy(id="fruits")
    public  WebElement fruitsDropDown;

    @FindBy(id="superheros")
    public WebElement multiSelectDropDown;

    @FindBy(id="lang")
    public WebElement progDropDown;

    @FindBy(id="country")
    public WebElement countryDropDwon;



    public void DropDownLink()
    {
        dropDownLink.click();
    }

    public void SelectDropDownByVisibleText()
    {
        Select sel= new Select(fruitsDropDown);
        sel.selectByVisibleText("Apple");
    }


    public void SelectMultipleOptions()
    {
        Select sel= new Select(multiSelectDropDown);
        sel.selectByValue("ta");
        sel.selectByValue("bt");
        sel.selectByValue("ca");
        List<WebElement> element= sel.getAllSelectedOptions();
        for( WebElement option : element)
        {
            System.out.println("selected options: "+option.getText());
        }
    }

    public void deSelectOptionFromMultiSelect()
    {
        Select sel= new Select(multiSelectDropDown);
        sel.selectByValue("ta");
        sel.selectByValue("bt");
        sel.selectByValue("ca");
        sel.deselectByValue("ta");
        sel.deselectAll();
    }

    public void selectLastOptionFromTheDropDown()
    {
        Select sel= new Select(progDropDown);
        int size= sel.getOptions().size();
        System.out.println("size:"+size);
        sel.selectByIndex(size-1);
        System.out.println(sel.getFirstSelectedOption().getText());
    }

    public void selectSecondLastOptionFromTheDropDown()
    {
        Select sel= new Select(progDropDown);
        int size= sel.getOptions().size();
        sel.selectByIndex(size-2);
        System.out.println(sel.getFirstSelectedOption().getText());
    }


    public void selectByValueAndPrintSelectOption()
    {
        Select sel= new Select(countryDropDwon);
        sel.selectByValue("India");
        System.out.println("selected country option is: "+sel.getFirstSelectedOption().getText());
    }
}
