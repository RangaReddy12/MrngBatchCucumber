package nov16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathusing {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("Ritameta");
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("Ritameta");
		driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("Ritameta@gmail.com");
		driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("Ritameta@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Ritameta");
new Select(driver.findElement(By.xpath("(//select[@class='_5dba _8esg'])[1]"))).selectByIndex(10);
Thread.sleep(3000);
new Select(driver.findElement(By.xpath("(//select[@class='_5dba _8esg'])[2]"))).selectByIndex(12);
Thread.sleep(3000);
new Select(driver.findElement(By.xpath("(//select[@class='_5dba _8esg'])[3]"))).selectByIndex(50);
Thread.sleep(3000);	
WebElement maleradio=driver.findElement(By.xpath("//*[@type='radio'and@value='2']"));
if(!maleradio.isSelected())
	maleradio.click();
Thread.sleep(3000);	
driver.findElement(By.xpath("(//*[contains(text(),'Sign')])[2]")).click();
	}

}












