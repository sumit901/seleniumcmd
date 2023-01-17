package seleniumcommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("http://omayo.blogspot.com/");
		driver.quit();
	}

}
