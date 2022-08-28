import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com");	
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	 driver.close();
	}
}