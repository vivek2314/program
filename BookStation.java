package Book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookStation 

{
	
     WebDriver driver;
     
     
	@BeforeTest
	public void Launch_Browser() 
	
	  {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://uat.bookstation.in/portal/public/");
		driver.manage().window().maximize();

		  
	  }
	
	@Test
	
	public void Login_valid_credentials() throws InterruptedException
	
	{
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='nav-link header_signin hover_effect_header']")).click();
		
		driver.findElement(By.xpath("//input[@id='emailid_validation']")).sendKeys("7798922483");
		
		driver.findElement(By.xpath("//input[@id='password_validation']")).sendKeys("Admin@123");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
	}
	
	
}
