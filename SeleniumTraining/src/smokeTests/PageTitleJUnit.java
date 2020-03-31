package smokeTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageTitleJUnit {
	
	//1. Declare variables and objects at Class level in order to access in multiple methods through program 
	
	WebDriver driver;
	String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
	
	@Test
	public void pageTitleTest() {

		System.out.println("Running the test");
		driver.navigate().to(webURL);
		String actualTitle = driver.getTitle();
		String expectedTitle= "SDET Training | Account Management";
		Assert.assertEquals(expectedTitle, actualTitle);
		
		//Assert.fail("Initializing failed this test");
		
	}
	
	
	@Before
	public void setUp() {
		System.out.println("Initializing the driver");
		driver = utilities.DriverFactory.open("chrome");
	}
	
	
	@After
	public void tearDoen() {
		System.out.println("Closing the driver");
		driver.close();
	}
	

}
