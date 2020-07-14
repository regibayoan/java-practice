package newPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	public static void main(String[] args) throws InterruptedException{
		// Setting the WebDriver - in this case Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/RegiBayoan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Maximises the curret webpage
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// URL the we are testing
		driver.get("https://amazon.com/");
		// sleep so program can load fully before continuing
		Thread.sleep(1000);
		// Find WebElement using id
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop 2020");
		Thread.sleep(1000);
		// Click on a button
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(1000);
		// Click on checkbox items
		driver.findElement(By.linkText("Razer")).click();
		driver.findElement(By.linkText("32 GB")).click();
		driver.findElement(By.linkText("Dell")).click();
		// Navigates to a different webpage
		driver.navigate().to("https://ebay.com");
		// Navigates back to the previous page
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		// Create variables for comparison testing
		String at = driver.getTitle();
		// String variable for expected variable
		String et = "Amazon.com : laptop 2020";
		// Comparison 
		if(at.equalsIgnoreCase(et)){
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failed");
		}
		// Closes the browser
		driver.quit();

		
	}
}
