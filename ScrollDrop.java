package Automate_EndUser;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDrop {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement el =driver.findElement(By.id("fromCity"));
		el.click();
		
		
		
		// jse.executeScript("window.scrollBy(0,400)", "");
		
		
		
		Thread.sleep(3000);
		
	    jse.executeScript("document.querySelector(\"#react-autowhatever-1\").scrollTop=500");
	
	   

		
	  
		
		
		}

}
