package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

	public static void main(String[] args) {
		String name = "Mmantsha";
		String email = "biosstestseven@gmail.com";
		String password = "monageng@1";
		String phoneNumber = "0119757476" ;
		String country = "Albania" ;
		String browserType = "chrome";
		String gender = "Male";
        boolean weeklyEmail = false;  // When you select false and the current state is false 
        boolean monthlyEmail = false;
        boolean occassionalEmail = true;
		
		
		//Define WebDriver
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);
	
		
		driver.navigate().to("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.cssSelector("a.btn")).click();
	
		//define WebElement 
		WebElement nameElement = driver.findElement(By.id("MainContent_txtFirstName"));
		WebElement emailElement = driver.findElement(By.id("MainContent_txtEmail"));
		WebElement phoneElelent =  driver.findElement(By.id("MainContent_txtHomePhone"));
		WebElement passwordElelent= driver.findElement(By.id("MainContent_txtPassword"));
		WebElement passwordverifyElelent = driver.findElement(By.id("MainContent_txtVerifyPassword"));
        WebElement countryElement = driver.findElement(By.id("MainContent_menuCountry"));
		WebElement maleRadio = driver.findElement(By.id("MainContent_Male"));
        WebElement femaleRadio = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Female']"));
		WebElement weeklyCheck = 	driver.findElement(By.name("ctl00$MainContent$checkWeeklyEmail"));
		WebElement OccUpdatesCheck = driver.findElement(By.id("MainContent_checkUpdates"));
		WebElement wonthlyCheck = driver.findElement(By.id("MainContent_checkMonthlyEmail"));
		WebElement submitButtton = driver.findElement(By.id("MainContent_btnSubmit"));
		//3. Fill out the form
		nameElement.sendKeys(name);
		emailElement.sendKeys(email);
		phoneElelent.sendKeys(phoneNumber);
		passwordElelent.sendKeys(password);
		passwordverifyElelent.sendKeys(password);
		 
	   
	 
		//Gender Radio button Algorithm
		if(gender.equalsIgnoreCase("Male")){
			maleRadio.click();
		}
		else {
			femaleRadio.click();
			
		}
		
		//check Box Alogrithm
		
		if(occassionalEmail) {
			
			if(!OccUpdatesCheck.isSelected()){
				
				OccUpdatesCheck.click();
			}
		}
		
		else if(OccUpdatesCheck.isSelected()) {
			
			OccUpdatesCheck.click();
		}
		
		//if (occassionalEmail) {
			
			//if(occassionalEmail.isSelected()) {
				
				
			//}
		//}
		
		
		new Select(countryElement).selectByValue(country);

		submitButtton.click();
		

		// Get confirmation & close the browser
		String conf = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		String expected ="Customer information added successfully";
		
		if(conf.contains(expected)) {
			
			System.out.println("Confirmation" + conf);
		}
		else {
			
			System.out.println("Test Failed");
		}

		driver.close();
	}

}
