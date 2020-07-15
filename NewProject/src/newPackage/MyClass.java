package newPackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	public static void main(String[] args) throws InterruptedException, AWTException{
		/*// Setting the WebDriver - in this case Chrome Driver
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
		// Use JavascriptExecutor to scroll through the screen
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		// Closes the browser
		driver.quit(); */
		
		/* // Handling alerts 
		
		System.setProperty("webdriver.chrome.driver", "/Users/RegiBayoan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Maximises the curret webpage
		driver.manage().window().maximize();
		driver.get("<APPLICATION LINK HERE>");
		Thread.sleep(1000);
		driver.findElement(By.id("alert")).click();
		Thread.sleep(1000);
		// Instantiate the Alert object and use the method switchTo() to switch focus to alert
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
		// This is for pop up windows type of popups instead of a modal type of popup
		driver.findElement(By.id("<popup id>")).click();
		// Robot class is used for simulating an input device such as a mouse click
		Robot robot = new Robot();
		// This is like moving the mouse to wherever the coordinates of the 'close' button is
		robot.mouseMove(400, 5);
		// This is like clicking the mouse
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		driver.quit(); */
		
	}
}
