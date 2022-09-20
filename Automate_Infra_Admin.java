package Automate_InfraAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Automate_Infra_Admin 

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
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("nilesh");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
		
		
		driver.findElement(By.xpath("//button")).click();
		
	    Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
		
		
		
  }
  @Test(priority=2)
  
  public void Valid_Username_Invalid_Password() throws InterruptedException
  
  {
    
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("nilesh");
		
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
  
 @Test(priority=3)
  
  public void Invalid_Username_InValid_Password() throws InterruptedException
  
  {
    
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("niles");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456789");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		
		Thread.sleep(2000);
		
		String Act=driver.findElement(By.className("alert")).getText();
		System.out.println(Act);
		
		String Exp="Login failed: Error: Username is dose not exits!";
		
		   Assert.assertEquals(Exp,Act);
		   
		   System.out.println(Exp);
	  
  }
 
 
 @Test(priority=4)
 
 public void Invalid_Username_Valid_Password() throws InterruptedException
 
 {
   
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("niles");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		
		Thread.sleep(2000);
		
		String Act=driver.findElement(By.className("alert")).getText();
		System.out.println(Act);
		
		String Exp="Login failed: Error: Username is dose not exits!";
		
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
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("nilesh");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
		
		
		  WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
	      ele.sendKeys(Keys.ENTER);
}
 
  
}
