package cucumber.run;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true,plugin = { "pretty", "html:target/site/cucumber-pretty",
		"json:target/cucumber.json",
		},

		features = { "Login_page.feature" }, 
		glue = { "com.cucumber" }, // package name
		monochrome = true, //remove all ?? & console will be easily readable
		dryRun = true, //check feature file
		strict = true //check stepdef
		// ,tags= {"@Function"}

)



	public class CucumberLoginRun extends AbstractTestNGCucumberTests  {
	
	@BeforeTest
	public void getSetup() {
		
	}
	
	@Test
	public void getTest() {
		
	}
	
	@AfterTest
public void tearDown() {
		
	}
	
	

}
