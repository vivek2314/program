package Automate_EndUser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Profile_End_User 
{
	

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

	public void Login_valid_credentials() throws InterruptedException

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
		
		
		Thread.sleep(1000);
		
		System.out.println("**********************Dasboard Page ***********************");
		
		List<WebElement> ele1 = driver.findElements(By.xpath("/html"));

		for (WebElement e1: ele1)
		{
			System.out.println(e1.getText());
		}
		
		
		

		}
	@Test(priority=2)
	public void click_on_profile()
	{
		driver.findElement(By.xpath("//a[@class='nav-link nav-dropdown-toggle']")).click();
	}
	@Test(priority=2)
	public void clickonproilfe_viewprofile() throws InterruptedException
	{
		
		System.out.println("********************************view profile***************************");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-sidebar-nav-link-content[normalize-space()='View Profile']")).click();
		System.out.println(driver.getTitle());
		
		
		List<WebElement> ele = driver.findElements(By.xpath("/html"));

		for (WebElement e : ele)
		{
			System.out.println(e.getText());
		}
		
	}
	@Test(priority=3)
	public void click_on_editprofile_on_viewprofile() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-pill']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Saurabh1");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mhaskar1");
		
		driver.findElement(By.xpath("//input[@placeholder='8408095657']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='8408095657']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@name='emailId']")).clear();
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("saurab@october1.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Role']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Role']")).sendKeys("AdminNew");
		
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-pill']")).click();
		
		
		
		
	}
	
	@Test(priority=4)
	public void EditProfile_Profile() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-sidebar-nav-link-content[normalize-space()='Edit Profile']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Saurabh1");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mhaskar1");
		
		
	driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("1234567890");

		
		
		driver.findElement(By.xpath("//input[@name='emailId']")).clear();
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("saurab@october1.com");
		
		
		
	driver.findElement(By.xpath("//input[@placeholder='Role']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Role']")).sendKeys("AdminNew");
	
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-pill']")).click();
	}
	
	
	
	
	@Test(priority=5)
	public void ChangePassword_Profile() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-sidebar-nav-link-content[normalize-space()='Change Password']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Current Password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@placeholder='Re-Enter New Password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-pill']")).click();
	}
	
	

}
