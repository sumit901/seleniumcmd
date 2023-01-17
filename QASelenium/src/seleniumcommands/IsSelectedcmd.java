package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedcmd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		boolean b = driver.findElement(By.id("checkbox1")).isSelected();
		
		if(b) {
			
			System.out.println("Checkbox is selected");
		}
		
		else {
			System.out.println("Checkbox is not selected");
		}
	}

}
