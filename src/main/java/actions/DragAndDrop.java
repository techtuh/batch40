package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.SeleniumActions;

public class DragAndDrop {
	
	public void getAction() {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		
		
		WebElement A= driver.findElement(By.xpath("//*[@id='column-a']"));
		WebElement B= driver.findElement(By.xpath("//*[@id='column-b']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(A, B).perform();
		
	}
	public static void main(String[] args) {
		SeleniumActions ac = new SeleniumActions();
		ac.getAction();
		
	}

}
