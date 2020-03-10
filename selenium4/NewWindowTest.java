package selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewWindowTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp () {
		driver = new ChromeDriver ();
		driver.manage().window().maximize();		
		driver.get("https://blog.testproject.io/");	
		System.out.println(driver.getTitle());
	}

	@Test
	public void openTestProjectPlatformNewWindow () {
		WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
		newWindow.get("https://testproject.io/platform/");
		System.out.println(driver.getTitle());
	}
}
