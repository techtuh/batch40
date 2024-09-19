package generic;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import com.page_factory.MasterPageFactory;

import utils.BaseConfig;
import utils.JSHighlighter;
import utils.ScreenShot;

public class BaseLogin {
	
WebDriver dr = new ChromeDriver();
	
	
	public void getLogin() throws IOException, InterruptedException {
		BaseConfig bc = new BaseConfig();
		MasterPageFactory mpf = new MasterPageFactory(dr);
		//JSHighlighter hl = new JSHighlighter();
		
		dr.manage().window().maximize();
		
		dr.navigate().to(bc.getConfig("PROD_URL"));
		
		JSHighlighter.addColor(dr, mpf.getLogin_btn_homepage());
		
		mpf.getLogin_btn_homepage().click();
		
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
		
		
		dr.quit();
	}

}
