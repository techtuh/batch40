package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.page_factory.MasterPageFactory;

public class DropDown {

	public void getDropDown() {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver); 
		Select sc = new Select(mpf.getDropdown());
		
		sc.selectByVisibleText("Black");
		
		sc.selectByIndex(0);
		
		sc.selectByValue("2");
	}
	public static void main(String[] args) {
		
		DropDown dd = new DropDown();
		dd.getDropDown();

	}

}
