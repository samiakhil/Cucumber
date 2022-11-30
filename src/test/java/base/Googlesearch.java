package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Googlesearch {

	
	
	WebDriver driver;
	
	public Googlesearch(WebDriver driver) {
		
		this.driver=driver;
		  
	}
	
	By searchbox =By.xpath("//input[@name='q']");
	By searchbtn =By.xpath("(//input[@name='btnK'])[1]");
	By facebooklink =By.xpath("//h3[text()='Facebook - log in or sign up']");
	
	public void searchgoogle(String searchinput) {
		
		driver.findElement(searchbox).sendKeys(searchinput);
		driver.findElement(searchbtn).click();
		
		}
	
	public void clickfacebook() {
		
		
		driver.findElement(facebooklink).click();
		
		
	}
	}

