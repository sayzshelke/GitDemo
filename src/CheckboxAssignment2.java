import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Sayali");
		driver.findElement(By.name("email")).sendKeys("demo@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'InputPassword')]")).sendKeys("qazwsx369");
		driver.findElement(By.xpath("//*[contains(@id,'exampleCheck1')]")).click();
		
		WebElement Genderoptions = driver.findElement(By.xpath("//*[@id='exampleFormControlSelect1']"));
		Select Gender= new Select(Genderoptions);
		Thread.sleep(2000);
		Gender.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.className("form-control")).sendKeys("22/04/1793");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());
	
	}

}
