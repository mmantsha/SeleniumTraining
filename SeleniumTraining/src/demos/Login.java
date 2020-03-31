package demos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		
		//1.Define the erb browser
		System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		// 2. open web browser and navigate to the web application
		//http://sdettraining.com/trguitransactions/AccountManagement.aspx
		
		driver.navigate().to("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		//3. Enter email address
		
			driver.findElement(By.id("MainContent_txtUserName")).sendKeys("mmonageng9@gmail.com");
		
		//4. enter password
			
			driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Bioss!@Edac2017");
		
		//5.  Click Login 
			
			driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();
		
		//6. Get Confirmation 
			
			String message =driver.findElement(By.id("conf_message")).getText();
			
			System.out.println("Confermation" + message);
			
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			
			if(pageTitle == "SDET Training | Account Management") {
				System.out.println("Test Passed");
				
			}
			
		//7. Close browser
			
		driver.close();
			
	}

}
