package learningscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllAnchorTagValueByTagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement e: allLinks) {
			
			if(e.getAttribute("href") != null) {
			System.out.println(e.getAttribute("href"));

	}

}
}
}