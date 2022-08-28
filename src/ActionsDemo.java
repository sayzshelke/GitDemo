import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	//driver.findElement(By.id("nav-link-accountList")).click();
	
	Actions a=new Actions(driver);
	//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hello");
	
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
	 .click()
	 .keyDown(Keys.SHIFT)
	 .sendKeys("hello")
	 .doubleClick();
	
	a.moveToElement(driver.findElement(By.id("nav-link-accountList")))
	 .contextClick()
	 .build()
	 .perform();
	
	}
}
