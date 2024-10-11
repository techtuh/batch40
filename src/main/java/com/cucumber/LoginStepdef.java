package com.cucumber;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page_factory.MasterPageFactory;

import generic.BaseLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseConfig;
import utils.JSHighlighter;
import utils.ScreenShot;

public class LoginStepdef {
	
	BaseLogin obj = new BaseLogin();
	WebDriver driver;
	BaseConfig bc = new BaseConfig();
	MasterPageFactory mpf = new MasterPageFactory(driver);
	
	@Given("Open browser")
	public void open_browser() {
	    
	   driver = new ChromeDriver(); 
	   driver.manage().window().maximize();
	}

	@Given("pass the url")
	public void pass_the_url(io.cucumber.datatable.DataTable dataTable) {
		try {
			driver.navigate().to(bc.getConfig("PROD_URL"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	    
	}

	@When("click on login\\/signup button in the homepage")
	public void click_on_login_signup_button_in_the_homepage() {
		JSHighlighter.addColor(driver, mpf.getLogin_btn_homepage());
		
		mpf.getLogin_btn_homepage().click();
	    
	}

	@When("enter the email address in email field")
	public void enter_the_email_address_in_email_field(io.cucumber.datatable.DataTable dataTable) {
	    
		JSHighlighter.addColor(driver, mpf.getUsername());
		try {
			mpf.getUsername().sendKeys(bc.getConfig("USER"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("enter the password in password field")
	public void enter_the_password_in_password_field(io.cucumber.datatable.DataTable dataTable) {
		JSHighlighter.addColor(driver, mpf.getPassword());
		try {
			mpf.getPassword().sendKeys(bc.getConfig("PASS"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@When("click on login button on the login page")
	public void click_on_login_button_on_the_login_page() {
		mpf.getLogin().submit();
	    
	}

	@Then("I validate the outcomes\\(Validate Login is successful)")
	public void i_validate_the_outcomes_validate_login_is_successful() {
		if(mpf.getLogout().isDisplayed()){
			System.out.println("Login Success!");
			System.out.println("@Smoke Test pass!"); //Smoke Test pass
		}else {
			System.out.println("Login Faild"); //Smoke Test Fail
		}
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		ScreenShot.getScreenShot(driver, "loginverify");
		
		
		driver.quit();
	    
	}



}
