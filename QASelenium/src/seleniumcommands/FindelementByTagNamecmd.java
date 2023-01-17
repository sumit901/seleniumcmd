package seleniumcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementByTagNamecmd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> allInputs = driver.findElements(By.tagName("input"));
		
		for(WebElement e: allInputs) {
			
			System.out.println(e.getAttribute("type"));
		}
		
		driver.quit();

	}

}
