package Qexecute;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Homeprac;

public class Homepracs {
static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 	
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.facebook.com/");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Test
	public void test()    {
		Homeprac ho=new Homeprac(driver);
		ho.enem();
		ho.enpa();
		ho.cllo();
		
	}

}
