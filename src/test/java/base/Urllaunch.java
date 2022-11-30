package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urllaunch {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\as21305\\Downloads\\chromedriver.exe");
		
			driver = new ChromeDriver();
			driver.get("https://www.worldometers.info/world-population/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			String elm=driver.findElement(By.xpath("//*[@class='maincounter-number']")).getText();
			System.out.println(elm);
		
			
		}

	
	
	
	
	
	
	
}
