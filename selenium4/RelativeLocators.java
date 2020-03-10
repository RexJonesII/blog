package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RelativeLocators {
	WebDriver driver;
	
	@BeforeClass
	public void setUp () {
		driver = new ChromeDriver ();
		driver.manage().window().maximize();		
		driver.get("https://www.carmax.com/");		
	}
	
	@Test
	public void clickHeartFavoriteIcon () {
		WebElement locationDropDown = driver.findElement(By.id("header-my-store-button"));
		WebElement heartFavoriteIcon = driver.findElement(RelativeLocator.withTagName("svg").toRightOf(locationDropDown));
		heartFavoriteIcon.click();
	}
}
