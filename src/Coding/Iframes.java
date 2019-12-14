package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		//when there is iframe, you need to first switch from current url to iframe
		driver.switchTo().frame(driver.findElement(By.name("SingleFrame")));   //instead of webelement we could go by index no
		driver.findElement(By.xpath("//*[@class='col-xs-6 col-xs-offset-5']/input")).sendKeys("mak");
	}

}
