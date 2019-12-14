package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

		  static WebDriver driver;
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver(); 
				 driver.navigate().to("https://www.amazon.com/");
		 
				 Actions p=new Actions(driver);
				 
				driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();;
				 
				driver.findElement(By.xpath("//ul[contains(@class,'hmenu-visible')]//li[6]//a[1]")).click();
				 
				 driver.findElement(By.xpath("//div[contains(text(),'Fire TV Stick 4K')]")).click();
			
			
				 
				 
				 
	}

}
