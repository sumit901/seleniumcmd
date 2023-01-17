package seleniumcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Locate multiple URL on a web page

public class FindElementscmd1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		int noOfLinks = links.size();
		
		String path = "(//div[@id='LinkList1']//a)";
	
		for(int i=1; i<=noOfLinks; i++) {
			
			String elementPath = path+"["+i+"]";
			driver.findElement(By.xpath(elementPath)).click();
			driver.navigate().back();
		}
		driver.quit();
		
	}

}
