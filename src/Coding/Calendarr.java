package Coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendarr {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.navigate().to("https://www.expedia.com/");
		//by implicitwaittime up to 6 seconds , it will try multiple times to find the specific element
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		//in explicit wait it will wait until it finds the element. like below
		WebDriverWait obj=new WebDriverWait(driver, 10);   //EXPLICIT WAIT  -CALLING CONSTRUCTOR
		driver.findElement(By.xpath("(//*[@placeholder='mm/dd/yyyy'])[9]")).click();
		//below explicit wait
		obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-day='30'][1]")));
		driver.findElement(By.xpath("//button[@data-day='30'][1]")).click();
		
		
		
		
	}

}
