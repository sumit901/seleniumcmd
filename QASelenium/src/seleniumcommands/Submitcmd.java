package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitcmd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.name("email")).sendKeys("amotooricap9@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("password")).submit();

	}

}
