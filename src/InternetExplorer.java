import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:\\InternetExplorer\\MicrosoftWebDriver.exe");
		WebDriver driver =new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
