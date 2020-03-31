package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		//1. create webdriver
		 System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		

		//2. Navigate to account management page >> click on create account 
		
		 driver.navigate().to("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		driver.findElement(By.cssSelector("a.btn")).click();
		
		//3. Fill out the form
		driver.findElement(By.id("MainContent_txtFirstName")).sendKeys("Mmantsha");
		 
	   driver.findElement(By.id("MainContent_txtEmail")).sendKeys("biosstestseven@gmail.com");
	   
	   driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys("0119757476");
		 
	   driver.findElement(By.id("MainContent_txtPassword")).sendKeys("monageng@1");
	   
	   driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys("monageng@1");
		 
	   
	   //how to inteact with other elements 
		//driver.findElement(By.id("MainContent_Female")).click();
		
		driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Female']")).click();
		
		new Select(driver.findElement(By.id("MainContent_menuCountry"))).selectByValue("Albania");
		
		driver.findElement(By.name("ctl00$MainContent$checkWeeklyEmail"));
		
		driver.findElement(By.id("MainContent_btnSubmit")).click();
	   
		//4. Get confirmation
		
		String message =driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		
		System.out.println("Confirmation" + message);
		
		//5. close the browser 
		
		driver.close();

	}

}
