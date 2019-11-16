package Nov16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class UsingExplicit {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	//create object for webdriver wait class
	WebDriverWait wait=new WebDriverWait(driver, 400);
	driver.manage().window().maximize();
	//wait for element to located
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
	driver.findElement(By.name("identifier")).sendKeys("pranga2010");
	//wait for element to click
	wait.until(ExpectedConditions.elementToBeClickable(By.className("CwaK9")));
	driver.findElement(By.className("CwaK9")).click();
	//wait for element to located
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	driver.findElement(By.name("password")).sendKeys("test54321");

	}

}
