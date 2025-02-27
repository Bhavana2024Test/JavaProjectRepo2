package com.banking.project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver ldriver;

	public loginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement userId;
	
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="btnLogin")
	WebElement lgnBtn;
	
	
	//below is the action methods
	
	public void setUsername(String uname)
	{
		userId.sendKeys(uname);
	}
	
	public void setPwd(String upwd)
	{
		pwd.sendKeys(upwd);
	}
	
	public void login()
	{
		lgnBtn.click();
	}
}
