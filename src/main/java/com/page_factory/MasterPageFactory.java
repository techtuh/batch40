package com.page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//*[text()=' Signup / Login']")
	private WebElement login_btn_homepage;
	
	
	public WebElement getLogin_btn_homepage() {
		return login_btn_homepage;
	}

	

	@FindBy(xpath="(//*[ @name = 'email' and @placeholder ='Email Address' ])[1]")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	@FindBy(css="input[name = 'password']")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath="//*[@type='submit']")
	private WebElement login;


	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath=("//*[text()=' Logout']"))
	private WebElement logout;


	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(xpath="//*[@id='oldSelectMenu']")
	private WebElement dropdown;


	public WebElement getDropdown() {
		return dropdown;
	}
	
	@FindBy(xpath="//*[@id='alertButton']")
	private WebElement alert;


	public WebElement getAlert() {
		return alert;
	}
}
