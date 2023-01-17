package seleniumcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourcecmd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/basic_web_page.html");
		String htmlCode = driver.getPageSource();
		System.out.println(htmlCode);
		

	}

}
