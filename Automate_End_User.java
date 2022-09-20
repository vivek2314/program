package Automate_EndUser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Automate_End_User

{
    WebDriver driver;
	
	@BeforeTest
	public void Launch_Browser() 
	
	  {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://vilt.vinsys.live/#/login");
		driver.manage().window().maximize();

		  
	  }
	
	
	  @Test(priority=1)
	  
	  public void Login_valid_credentials() throws InterruptedException 
	  
	  {	
		
	        driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Saurabh M");
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456789");
			
			Thread.sleep(1000);
			
			System.out.println("**************************Login Page Element ****************************************");
			
			List<WebElement> ele = driver.findElements(By.xpath("/html"));

			for (WebElement e : ele)
{
				System.out.println(e.getText());
}
			
			driver.findElement(By.xpath("//button")).click();
			
		    Thread.sleep(1000);
		    
		    
		    System.out.println("************************  Dasboard Page Element ****************************");
		    
		    Thread.sleep(1000);
		    
			List<WebElement> ele1 = driver.findElements(By.xpath("/html"));

			for (WebElement e1: ele1)
{
				System.out.println(e1.getText());
}
			
			System.out.println("***************************************************************************\n");
			
			driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
			
		
			
			
	  }
	  @Test(priority=2)
	  
	  public void Valid_Username_Invalid_Password() throws InterruptedException
	  
	  {
	    
		    driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
			
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Saurabh M");
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
			
			
			driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
			
			Thread.sleep(2000);
			
			String Act=driver.findElement(By.className("alert")).getText();
			System.out.println(Act);
			
			String Exp="Login failed: Error: Password is incorrect";
			
			   Assert.assertEquals(Exp,Act);
			   
			   System.out.println(Exp);
			
			
		  
	  }
	  
	 @Test(priority=3)
	  
	  public void Invalid_Username_InValid_Password() throws InterruptedException
	  
	  {
	    
		    driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
			
           driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("SaurabhM");
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
			
			
			driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
			
			Thread.sleep(2000);
			
			String Act=driver.findElement(By.className("alert")).getText();
			System.out.println(Act);
			
			String Exp="Login failed: Error: Password is incorrect";
			
			   Assert.assertEquals(Exp,Act);
			   
			   System.out.println(Exp);
		  
	  }
	 
	 
	 @Test(priority=4)
	 
	 public void Invalid_Username_Valid_Password() throws InterruptedException
	 
	 {
	   
		    driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		    
           driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("SaurabhM");
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456789");
			
			
			
			driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
			
			Thread.sleep(2000);
			
			String Act=driver.findElement(By.className("alert")).getText();
			System.out.println(Act);
			
			String Exp="Login failed: Error: Password is incorrect";
			
			   Assert.assertEquals(Exp,Act);
			   
			   System.out.println(Exp);
			
			
		  
	 }
	@Test(priority=5)
	 
	 public void blank_username_blank_password() throws InterruptedException 

	 
	 {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
	
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		
		Thread.sleep(2000);
		
		String Act=driver.findElement(By.xpath("//div[contains(text(),'Password is required')]")).getText();
		System.out.println(Act);
		
		String Exp="Password is required";
		
		   Assert.assertEquals(Exp,Act);
		   
		   System.out.println(Exp);
	 }


	@Test(priority=6)

	public void forgot_password()
	{
		driver.findElement(By.xpath("//a[@title='Forgot Password ?']")).click();
	}

	@Test(priority=7)


	public void hit_enter_from_keyborad() throws InterruptedException

	{
		    driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
			
			
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Saurabh M");
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456789");
			
			  WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		      ele.sendKeys(Keys.ENTER);
		      
		      Thread.sleep(1000);
				
				driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
		      
		      
	}
	
	@AfterTest
	public void Close_Browser()
	{
		driver.close();
	}
	
 

}
