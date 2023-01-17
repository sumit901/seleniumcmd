package handlingmultiplewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTwoApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("Sumit Kumar");
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.name("search")).sendKeys("hp");
		
	}

}
