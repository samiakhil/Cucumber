package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testmethod {
	
  WebDriver driver;
  Googlesearch obj;
	
	@BeforeTest
	
	public void beforetest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
	}
	
	@Test
	public void searchoption() {
		
		Googlesearch page = new Googlesearch(driver);
		page.searchgoogle("facebook");
		
		}
	
	@Test
	public void verifyaccessfacebook() {
		
		Googlesearch page1 = new Googlesearch(driver);
		
		page1.clickfacebook();
	}
	@Test
	public void facebooklogin() {
		
		Facebooklogin page = new  Facebooklogin();
		page.facebook("tester");
		page.facebook("selenium");
		
		page.loginbutton(); 
		}
	
	
	@AfterTest
	
	public void aftertest() throws Throwable {
		
		Thread.sleep(7000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
