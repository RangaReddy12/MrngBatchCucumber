package stepDefinitations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitation {
	WebDriver driver;
	String url="http://orangehrm.qedgetech.com";
	@When("^I open OrangeHRMS URL on \"([^\"]*)\"$")
	public void i_open_OrangeHRMS_URL_on(String browser) throws Throwable {
	  if(browser.equalsIgnoreCase("ChromeBrowser"))  
	  {
		  System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		 	  }
	  else if(browser.equalsIgnoreCase("FirefoxBrowser"))
	  {
		  System.setProperty("webdriver.gecko.driver", "E://geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get(url);
	  }
	  else
	  {
		  System.out.println("No Browser is matching");
	  }
	}

	@When("^I enter \"([^\"]*)\" in usernameField$")
	public void i_enter_in_usernameField(String username) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(username);  
	}

	@When("^I enter \"([^\"]*)\" in passwordField$")
	public void i_enter_in_passwordField(String password) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password);  
	}
	@When("^I click Login Button$")
	public void i_click_Login_Button() throws Throwable {
	 driver.findElement(By.name("Submit")).click(); 
	 Thread.sleep(5000);
	}
	@Then("^I Should check dash in url$")
	public void i_Should_check_dash_in_url() throws Throwable {
	    if(driver.getCurrentUrl().contains("dash"))
	    {
	    	System.out.println("Login Success");
	    }
	    else{
	    	System.out.println("Login Fail");
	    }
	}
	

	@When("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		 Thread.sleep(4000);
		 driver.quit();
	}

}
