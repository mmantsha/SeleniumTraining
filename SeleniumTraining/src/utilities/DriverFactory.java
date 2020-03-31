package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	// This method will rendering a webdriver object 
public static WebDriver open(String browserType) {
	
	if (browserType.equalsIgnoreCase("chrome")) {
		//code for chrome
		
		System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
		 return new ChromeDriver();
		
	}
	
	else if(browserType.equalsIgnoreCase("fireFox")) {
		
		//code for fF
		 System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");
		 return new FirefoxDriver();
		
	}
	
	else if (browserType.equalsIgnoreCase("edge")) {
		
		 System.setProperty("webdriver.edge.driver", "C:\\Software\\msedgedriver.exe");
		 return new EdgeDriver();
		
	}
	
	else {
		System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
		 return new ChromeDriver();
		
	}
}
}
