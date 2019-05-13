import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// Selenium Code
		
		// Create a driver object - to invoke the browser choosen which is chrome
		//invoke the .exe file first which is gecko driver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("This is a test");
		//driver.findElement(By.name("pw")).sendKeys("This is the pwd");
		driver.findElement(By.cssSelector("#password")).sendKeys("This is the pwd");
		// the below throws exception as it is a compound name
		//driver.findElement(By.className("button r4 wide primary")).click(); 
		//driver.findElement(By.name("Login")).click(); 
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		//xpath for forgot password - //*[@id="forgot_password_link"] 
		//  css selector for error message - #error
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
	}

}
