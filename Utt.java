package Automate_InfraAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utt 

{
	
      WebDriver driver;
	
	@BeforeTest
	public void Launch_Browser() 
	
	  {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://testmate.vinsys.live");

		  
	  }
	@Test(priority=1)
	public void login() //login to application
	{
		
		driver.findElement(By.id("adminUserName")).sendKeys("testadmin@vinsys.com");
		driver.findElement(By.id("adminpassword")).sendKeys("admin21@123");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		driver.manage().window().maximize();
	}
	




@Test(priority=18)
	public void tc_que_17() throws InterruptedException // add question without entering answer options
	{
	
	Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='questionBankId']")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='add_question']")).click();
		
		
		Thread.sleep(1000);
		Select s=new Select (driver.findElement(By.xpath("//select[@id='subjectid']")));
		s.selectByVisibleText("JAVA");
		
		Thread.sleep(1000);
		
		Select s2=new Select(driver.findElement(By.xpath("//select[@id='qtype']")));
		s2.selectByVisibleText("Audio");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//span[@id='select2-chosen-1']")).click();
		
		
		
					
		
		
	
	}
}
