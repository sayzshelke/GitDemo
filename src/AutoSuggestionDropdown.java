import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		//Thread.sleep(3000);
		
		//WebDriverWait w =new WebDriverWait(driver,5);
		//WebDriverWait w =new WebDriverWait(driver,5);
		
		
		//List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
			
		
		
	}

}
