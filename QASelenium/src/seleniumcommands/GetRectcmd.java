package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectcmd {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement element = driver.findElement(By.id("but2"));
		
		Rectangle rect = element.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		
	}
}
