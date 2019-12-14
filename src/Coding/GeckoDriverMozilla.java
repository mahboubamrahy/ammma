package Coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverMozilla {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\src\\geckodriver.exe");
		driver=new FirefoxDriver();         
		driver.get("https://www.facebook.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String windows=driver.getWindowHandle();
		System.out.println(windows);
	}

}
