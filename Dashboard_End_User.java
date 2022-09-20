package Automate_EndUser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard_End_User {

	WebDriver driver;

	@BeforeTest
	
	public void Launch_Browser()

	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://vilt.vinsys.live/#/login");
		driver.manage().window().maximize();
		
;
		

	}
	
	@Test(priority=1)

	public void Login_valid_credentials_() throws InterruptedException

	{
		
           System.out.println("*******************Login Page**************\n");
           
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Saurabh M");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456789");

		driver.findElement(By.xpath("//button")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("/html"));

		for (WebElement e : ele)
		{
			System.out.println(e.getText());
		}

		}
		
		@Test(priority=2)
		public void Dashboard_verification() throws InterruptedException
		{
			
			System.out.println("******************In Dashboard*****************\n");
			Thread.sleep(1000);
   
			
		
			
	  }
		
		@Test(priority=3)
		public void Vm_status_on_off_Dashboard() throws InterruptedException
		{
             driver.findElement(By.xpath("//span[@class='switch-slider']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[@class='switch-slider']")).click();
		}
		
		
		
		@Test(priority=4)
		public void Clickon_AllocatedVm() throws InterruptedException
		
		{
			driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
            
			System.out.println("*********************allocated Vm title after click on login ************************");
			System.out.println(driver.getTitle());
			//driver.quit();
             
             
		}
		
		
}
