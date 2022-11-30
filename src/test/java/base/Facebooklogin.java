package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebooklogin {
	
	WebDriver driver;

	By username = By.xpath("");
	By password = By.xpath("");
	By login = By.xpath("");
	
	public void facebook(String value ) {
	
		driver.findElement(username).sendKeys(value);
		driver.findElement(password).sendKeys(value);
		}
	public void loginbutton() {
		driver.findElement(login).click();
		
	}
	
	
	
}
