package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
	/*	driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();  //first type of popup
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();       //this is to push the ok button
		
		driver.findElement(By.linkText("Alert with OK & Cancel ")).click();   //second type of popup
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();   */
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		Thread.sleep(3000);   
		driver.findElement(By.xpath("//*[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("amalgam");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
