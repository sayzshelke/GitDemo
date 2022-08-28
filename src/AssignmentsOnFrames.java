import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentsOnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String Option = driver.findElement(By.xpath("//*[text()='Option2']")).getText();
		
		//System.out.println(Option);
		
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		dropdown.selectByVisibleText(Option);
		
		driver.findElement(By.id("name")).sendKeys(Option);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String text = driver.switchTo().alert().getText().split(" ")[1].split(",")[0];
		
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		
	}

}
