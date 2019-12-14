package Coding;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.navigate().to("https://www.facebook.com/");
		//to get the session id
		String currentwindow=driver.getWindowHandle();  // this only stores session id for parent browser
		//		System.out.println(currenwindow);
		Actions point=new Actions(driver); //calling actions class from selenium
	//here we store the value of variable in WebElement class
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement forgot= driver.findElement(By.linkText("Forgot account?"));
		
		//forgot.click();
		//we use actions class in case of doing anything with mouse and keyboard
		//with actions class we need to use .build().perform()
		point.keyDown(Keys.SHIFT).click(forgot).build().perform();;
		 //below gets session id for both browsers and stores it in a variable which we print them out
		//set allows you to store multiple values
		Set <String> ids=driver.getWindowHandles();
		System.out.println(ids);
		System.out.println(ids.size());
		
		//this is for clicking on new browser's element
		/*here, we store the two value of ids into windowbrowser, 
		then if the variable windowbrowser is the session id of parent window, the loop will switcch into child browser*/
		for(String windowbrowser:ids) {
			if(windowbrowser !=currentwindow) {
				driver.switchTo().window(windowbrowser);
			}
		}
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("ejvkjrv@#$%^&");
		Thread.sleep(4000);
		driver.findElement(By.name("did_submit")).click();
		
		
		
		
		
		
		
		
	}

}
