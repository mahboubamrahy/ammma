package Coding;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Code2 {
public static WebDriver driver;                  
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();            //   first constructor
	driver.get("https://www.facebook.com/");
	//class name+name of object=new+name of constructor(element)
	Select dropdo=new Select(driver.findElement(By.id("month"))); //we are calling second constructor
	dropdo.selectByVisibleText("Aug");   //dropdo.selectByValue("");  or   dropdo.selectByIndex("");
 
	driver.findElement(By.name("sex")).click();
	//find out how to use linklist!
}
}
