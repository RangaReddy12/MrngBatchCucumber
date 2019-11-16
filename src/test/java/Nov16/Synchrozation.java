package Nov16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Synchrozation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.name("identifier")).sendKeys("pranga2010");
	driver.findElement(By.className("CwaK9")).click();

	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test54321");
		

	}

}
