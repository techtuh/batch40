package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.SeleniumActions;

public class MouseHover {

	public void getMouseOver() {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.costco.com/");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement A= driver.findElement(By.xpath("//*[@id='Home_Ancillary_4']"));
WebElement scroll =		driver.findElement(By.xpath("(//*[@class='eco-whybuy-tab-name'])[8]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(A).perform();
		action.moveToElement(scroll).perform();
		scroll.click();
		
	}
	public static void main(String[] args) {
		MouseHover mo = new MouseHover();
		mo.getMouseOver();
		
	}
	
	

}
