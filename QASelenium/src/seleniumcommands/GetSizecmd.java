package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizecmd {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		Dimension d = driver.findElement(By.id("but2")).getSize();
		System.out.println(d.height);
		System.out.println(d.width);
		
	}

}
