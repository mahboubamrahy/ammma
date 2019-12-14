package POM;
//INTERFACEEEE
//THIS CODE IS TO BE EXECUTED IN Qexecute-Credentials
//*********THIS HOME CLASS IN OUR SCENARIO IS TEST CASE "TO VERIFY USER OF FACEBOOK IS ABLE TO LOGIN"
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM=PAGE OBJECT MODEL  , CONSEPT OF USING PAGEFACTORY
/*THIS CONCEPT'S USAGE; WHEN WE WANT TO DO MULTIPLE ACTIONS ON A WEBSITE, LIKE SEARCHING ON AMAZON,PRESSING BUTTON,
 * DOING THIS AND THAT, FOR EACH CASE, WE CREATE SEPERATE CLASSES, THEN WE CREATE AN EXECUTION CLASS FOR ALL OF THE CASES,
 * AND WE USE PAGEFACTORY TO EXECUTE ALL OF THE TESTS
 * 1.FIRST WE NEED TO INITIALIZE ALL THE LOCATORS
 * 2.WE USE @FINDBY TO LOCATE AND STORE THE ELEMENTS AND INITIALIZE
 * 3.WE CREATE CONSTRUCTOR AND USE PAGEFACTORY TO INITIALIZE ALL OF THEM.
 * 4.THE CLASS WHICH "INCLUDES PAGEFACTORY" IS NOT FOR EXECUTION IT IS TO INCLUDE LOCATORS AND METHODS
 * 5.THE CLASS FOR EXECUTION , IS TESTNG (OR JUNIT) CLASS
 * REMEMBER THAT WHEN YOU WANT TO USE METHODS OF ANOTHER CLASS, YOU NEED TO CALL THE CONSTRUCTOR OF THAT CLASS AND CREATE OBJECT FOR IT
 * SYNTAX FOR CALLING CONSTRUCTER; NAME OF CLASS+OBJECT=NEW +NAME OF CLASS(ARGUMENT);
 */
public class Home {
//Annotations!!!!!!!!!!
	public WebDriver driver;    //calling interface
	                            
	@FindBy(id="email")   //locating the element
	WebElement emailfield;  //storing in this variable
	
	@FindBy(id="pass")
	WebElement psswd;
	
	@FindBy(xpath="//*[@aria-label='Log In']")
	WebElement loginbutton;
	  
	@FindBy(xpath="//a[contains(text(),'Forgot account?')]")
	WebElement forgotlink;
	
	public Home(WebDriver driver) {      //this is constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);  //syntax for using pagefactory in constructor
	//driver is local , this is global variable of driver
	}
	
	
	public void enteremail(String email) {  //this is how we created local email variable instead of hard-coding
		//...so we could enter the email in Qexecute class
		emailfield.sendKeys(email);
	}
	public void enterpass() {
		psswd.sendKeys("tgiiw");
	}
	public void login() {
		loginbutton.click();
	} 
	
	public void clickforgot() {
		forgotlink.click();
	}
	
}
