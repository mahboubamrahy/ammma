package Qexecute;
//this is a junit 
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Home;
//this is for execution of POM-Home
public class Credentials {
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
	public void test() {
		Home homepage=new Home(driver);
		homepage.enteremail("cekoslovakyalilastiramadiklarimizdanmisiniz?");  //this is not hard-coded
		homepage.enterpass();
		//homepage.login();
		homepage.clickforgot();
	}

}
