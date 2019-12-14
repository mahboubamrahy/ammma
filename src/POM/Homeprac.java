package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeprac {

	public WebDriver driver;

	@FindBy(xpath="//input[@id='email']")
	WebElement em;
	@FindBy(xpath="//input[@id='pass']")
	WebElement pa;
	@FindBy(xpath="//input[@id='u_0_4']")
	WebElement lo;

	public Homeprac (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enem()  {
		em.sendKeys("amamma");
	
	}
	public void enpa()  {
		
		pa.sendKeys("55666");
	}
	public void cllo()  {
		
		lo.click();
	
	
}
}