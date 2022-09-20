package Automate_EndUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inter 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ottinter.vinsys.live/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userName")).sendKeys("9922638224");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='SEND OTP']")).click();
		
		Thread.sleep(30000);
		
//		driver.findElement(By.id("loginOtp")).sendKeys("");
//		
//		driver.findElement(By.id("captcha")).sendKeys("");
		
		//Thread.sleep(20000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

}
