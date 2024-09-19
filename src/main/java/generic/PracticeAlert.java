package generic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.page_factory.MasterPageFactory;

public class PracticeAlert {
	
	public void getAlert() {
		

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		//mpf.getAlert().click();
		
		Web_Driver_Wait obj = new Web_Driver_Wait();
		obj.getWait(driver, Duration.ofSeconds(10));
		 
		Alert alert = driver.switchTo().alert();
		//alert.getText();
		//System.out.println(alert.getText());
		//alert.accept();
		//alert.dismiss();
		alert.sendKeys("hello I'm here!");
		alert.accept();
		
	}

	public static void main(String[] args) {
		
		PracticeAlert al = new PracticeAlert();
		al.getAlert();
	}

}
