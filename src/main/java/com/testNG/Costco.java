package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Costco {
	
	@Test
	@Parameters("browser")
	public void getUrl(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.costco.com/");
		System.out.println("Chrome");
		
		}else if(browser.equalsIgnoreCase("FireFox")){
			
			WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to("https://www.costco.com/");
			System.out.println("Firefox");
		}
		
else if(browser.equalsIgnoreCase("Microsoft edge")){
			
			WebDriver driver = new EdgeDriver();
			
			driver.navigate().to("https://www.costco.com/");
			System.out.println("edge");
		}
		
	}
	

}
