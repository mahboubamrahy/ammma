package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
	static WebDriver driver;
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver(); 
Actions poi=new Actions(driver);

                   driver.navigate().to("https://jqueryui.com/slider/");
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
poi.dragAndDropBy((WebElement) driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")), 200, 0).build().perform();





	}

}
