package selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTabTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp () {
		driver = new ChromeDriver ();
		driver.manage().window().maximize();		
		driver.get("https://blog.testproject.io/");	
		System.out.println(driver.getTitle());
	}

	@Test
	public void openTestProjectPlatformNewTab () {
		WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://testproject.io/platform/");
		System.out.println(driver.getTitle());
	}
}
