package Ubrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//this is simply for further usage in other classes to avoid typing system.setProperty and all that stuff
public class openbrowser {


	//this did not work!! for testng first_pract class
	  
		public void openingbrowser(String url) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver(); 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 driver.navigate().to(url);
	     
	
	
		}
}
