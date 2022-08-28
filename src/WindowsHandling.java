import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.partialLinkText("Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
				
		Iterator<String> it = windows.iterator();
		
		String parent=it.next();
		 
		String child=it.next();
		
		driver.switchTo().window(child);
		
		System.out.println(driver.findElement(By.xpath("//div/h3[text()='New Window']")).getText());
		 /*
		String text = driver.findElement(By.xpath("//div/h3[text()='New Window']")).getText().split(" ")[1];
		
		System.out.println(text);
		*/
		driver.switchTo().window(parent);
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Opening a new window']")).getText());
				
	}

}
