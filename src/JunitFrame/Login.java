package JunitFrame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	 static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.navigate().to("https://www.facebook.com/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		Thread.sleep(5000);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("majhh");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ffg");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]")).click();
		
	}

}
