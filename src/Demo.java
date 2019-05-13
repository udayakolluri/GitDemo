import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// Selenium Code
		
		// Create a driver object - to invoke the browser choosen which is chrome
		//invoke the .exe file first 
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		//Checkpoint to validate whether you have landed on the correct url
		System.out.println(driver.getCurrentUrl());
		
		// To print the page source
		//System.out.println(driver.getPageSource());
		
		// Navigate to different url
		driver.get("http://yahoo.com");
		
		// Navigate back to the google url
		driver.navigate().back();
		
		//Navigate forward to yahoo
		driver.navigate().forward();
		
		driver.close();
		//driver.quit();
		
	}

}
