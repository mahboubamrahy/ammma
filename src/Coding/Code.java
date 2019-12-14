package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();   //here we are calling the constructor, meaning ChromeDriver
		
		driver.get("https://www.facebook.com/");
		/*driver.navigate().forward();
		Thread.sleep(300);
		driver.navigate().refresh();
		Thread.sleep(300);
		driver.navigate().back();
		Thread.sleep(300);
		driver.manage().window().maximize();
		driver.quit();*/
		driver.findElement(By.id("email")).sendKeys("majho");
		driver.findElement(By.id("pass")).sendKeys("6545595");
	    //driver.findElement(By.linkText("Data Policy")).click();
		//driver.findElement(By.partialLinkText("Data")).click();
		//driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input")).click(); //absolute xpath
		//driver.quit
		//"//input[@type='email']" or "//input[@class='inputtext login_form_input_box']" or...
		//contains xpath    //input[contains(@aria-label,'Mobile number or email')]   (//input[contains(@aria-label,'Mob')])[1]
		//starts with        //*[starts-with(@aria-label,'New')]
		//for the next line which starts with tag name div   //*[@class='mbm _br- _a4y']/div
		//for text   //*[text()='Login']  from the website online.actitime.com
	}

}
