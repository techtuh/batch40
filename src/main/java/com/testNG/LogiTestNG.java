package com.testNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page_factory.MasterPageFactory;

import utils.BaseConfig;
import utils.JSHighlighter;
import utils.ScreenShot;

public class LogiTestNG {
	static WebDriver dr = new ChromeDriver();
	static BaseConfig bc = new BaseConfig();

	@BeforeTest
	public static void getSetup() throws IOException {
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		BaseConfig bc = new BaseConfig();
		dr.navigate().to(bc.getConfig("PROD_URL"));
		
	}
	
	@Test
	public static void getLogin() throws IOException, InterruptedException {
		
		MasterPageFactory mpf = new MasterPageFactory(dr);
		
	
		Thread.sleep(5000);
		mpf.getLogin_btn_homepage().click();
		JSHighlighter.addColor(dr, mpf.getLogin_btn_homepage());
		
		JSHighlighter.addColor(dr, mpf.getUsername());
		mpf.getUsername().sendKeys(bc.getConfig("USER"));
		
		JSHighlighter.addColor(dr, mpf.getPassword());
		mpf.getPassword().sendKeys(bc.getConfig("PASS"));
	
		
		mpf.getLogin().submit();
		
		if(mpf.getLogout().isDisplayed()){
			System.out.println("Login Success!");
			System.out.println("@Smoke Test pass!"); //Smoke Test pass
		}else {
			System.out.println("Login Faild"); //Smoke Test Fail
		}
		//dr.findElement(By.xpath("//*[text()=' Logout']")).click();
		//dr.findElement(By.xpath("(//*[@class='fa fa-plus-square'])[1]")).click();
		
		ScreenShot.getScreenShot(dr, "loginverify");
		
		
		
	}
	
	@AfterTest
	public static void getClose() {
		
		dr.quit();
	}
	
}
