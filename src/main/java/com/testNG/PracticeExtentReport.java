package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class PracticeExtentReport {
	
	
	ExtentTest test;
	

	
	
	public void getSetup() {
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		htmlReporter.config().setDocumentTitle("Testng Automation");
		htmlReporter.config().setReportName("Smoke test");
		htmlReporter.config().setTheme(Theme.DARK);
				
		//create extent report and attach reporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Ebay" , "this is some description/ goto url");
		
		WebDriver driver = new ChromeDriver();
		test1.pass("browser opend");
		
		driver.navigate().to("https://www.ebay.com");
		test1.pass("url navigated");
		
		extent.flush();
		
		/*
		 * extent.setSystemInfo("Company ", "SMART TECH");
		 * extent.setSystemInfo("Testing environment ", "QA");
		 * extent.setSystemInfo("Team ", "QA"); extent.setSystemInfo("Tester Name: ",
		 * System.getProperty("user.name"));
		 */
	
		
	}
	
	
	 public void getUrl() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com");
		//test = extent.createTest("Login test");

	}
	
	
	
	
	public void getClose() {
		
		//driver.quit();
	}
	
	public static void main(String[] args) {
		PracticeExtentReport obj = new PracticeExtentReport();
		obj.getSetup();
		
	}

}
