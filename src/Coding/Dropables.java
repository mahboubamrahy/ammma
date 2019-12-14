package Coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropables  {
	static WebDriver driver;
	//droppable is possible by usage of Action class
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
		Actions poin=new Actions(driver);
		String cwind=driver.getWindowHandle();
		System.out.println(cwind);
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
driver.switchTo().frame(0);
	poin.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();  
		
	
		
		
		
		
		
		
		
		
	}

}
