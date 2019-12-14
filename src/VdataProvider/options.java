package VdataProvider;
//data provider is a testng class
import org.testng.annotations.Test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class options {
	WebDriver driver;
  @Test(dataProvider = "dp")  //this dp is the nemae of method which is below
  public void f(String n, String s) throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys(n);
	  driver.findElement(By.id("pass")).sendKeys(s);
	  driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	  Thread.sleep(6000);
	  driver.navigate().back();
	  driver.findElement(By.id("email")).clear();
	  Thread.sleep(6000);
	  driver.findElement(By.id("pass")).clear();
	  Thread.sleep(6000);
  }

  @DataProvider
  public Object[][] dp() {   //this is method which uses multi-dimensional arrays
    return new Object[][] {
      new Object[] { "sbaaazz@ff", "a10000" },
      new Object[] { "jwveirijn@rv", "b59955" },
      new Object[] { "frhxirh@f", "crr598" },
      new Object[] { "ftrh@vvgf", "55555d" },
    };
  }
  @BeforeClass
 @Parameters("browser")
  public void beforeClass(String browsers) {
	if(browsers.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 	
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.facebook.com/");
	}else if(browsers.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\src\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.navigate().to("https://www.facebook.com/");
	}else {
		System.out.println("correct to digits");
	}

  }
	
  
  @AfterClass
  public void afterClass() throws InterruptedException {
	 
	  driver.close();
  }

}
