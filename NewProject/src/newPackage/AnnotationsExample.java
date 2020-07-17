package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample {
	// Annotations are used in TestNG in classes or method to mark the different stages of the test. 
	// Examples are @BeforeTest, @Test and @AfterTest
	public String baseUrl = "https://amazon.com";
	String driverPath = "/Users/RegiBayoan/Downloads/chromedriver";
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	// Using @Test marks the method as part of the test 
	@Test
	public void verifyHomepageTitle() {
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Test Complete");
		driver.close();
	}
}
