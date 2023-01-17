package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributecmd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement searchField = driver.findElement(By.cssSelector("input[title='search'][name='q']"));
		
		String name = searchField.getAttribute("name");
		String size = searchField.getAttribute("size");
		String title = searchField.getAttribute("title");
		String type = searchField.getAttribute("type");
		
		System.out.println(name);
		System.out.println(size);
		System.out.println(title);
		System.out.println(type);
		
				

	}

}
