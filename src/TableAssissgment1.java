import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssissgment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
		
		
	//   WebElement  table= driver.findElement(By.xpath("//table[@name='courses']"));
	
	   int rows= driver.findElements(By.xpath("//*[@name='courses']/tbody/tr")).size();
	   
   
	   System.out.println(rows);
	   
	  //List<WebElement> row2 = driver.findElements(By.xpath("//*[@name='courses']/tbody/tr/td")).get(2);
	     
	  List<WebElement> secondrow=driver.findElements(By.xpath("//*[@name='courses']/tbody/tr")).get(2).findElements(By.xpath("//*[@name='courses']/tbody/tr/td"));
	   
	   
	   int column = driver.findElements(By.xpath("//*[@name='courses']/tbody/tr/th")).size();
	 
	   System.out.println(column);
	   
	   System.out.println(secondrow);

	}

}
