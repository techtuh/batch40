package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ebay {
	
	@Test
	public void getUrl() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.ebay.com/");
	}
}
