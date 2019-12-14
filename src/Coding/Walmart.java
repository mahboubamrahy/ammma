package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Walmart {
	
	  static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();  
			 driver.navigate().to("https://www.walmart.com/");
	 
			 Actions o=new Actions(driver);
			 
			 driver.findElement(By.xpath("//button[@class='f_a al_c f_c']//span[@class='g_a g_h']")).click();
			 WebElement a=driver.findElement(By.xpath("//div[@class='e_a o_a o_o o_g ac_a e_f']//button[2]"));
			WebElement b=driver.findElement(By.xpath("//div[@id='dept-AHzCAZRQ-children']//div[@class='o_a o_m o_b'][contains(text(),'Kitchen')]"));
			 
			 Thread.sleep(5000);
		
			 o.moveToElement(a).build().perform();
			 
			 Thread.sleep(5000);
	
			 o.moveToElement(b).click().build().perform();
}
}