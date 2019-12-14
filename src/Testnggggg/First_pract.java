package Testnggggg;

import org.testng.annotations.Test;

import POM.Home;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class First_pract {
	public WebDriver driver;
 

@Test
  public void f() {
	Reporter.log("this line is to be seen on test suite report");
	Home home=new Home(driver);
	home.clickforgot();    //did not work with openbrowser class because we needed get new browser session id and jump on it

  }
  @BeforeClass  
  @Parameters("browser")          //this browser if-else's are for xml report
  public void beforeClass(String browsers) {
	  if (browsers.equalsIgnoreCase("chrome")) {   //equalIgnoreCase means ignore lower or upper case and see them equal
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.facebook.com/");
  }else if(browsers.equalsIgnoreCase("firefox")){
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\src\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.facebook.com/");
  }
  else {
	  System.out.println("mamamam");
  }
  }
  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }

}
