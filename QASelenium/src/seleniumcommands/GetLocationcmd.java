package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationcmd {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement button = driver.findElement(By.id("but2"));
		Point p = button.getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		
		
	}

}
