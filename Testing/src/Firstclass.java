import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firstclass {

	
		
		static WebDriver driver;
	
		@Test
		public void Launchbrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\seleniumsession\\drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			
			System.out.println("opened");
			System.out.println(driver.getTitle());
		}

}
