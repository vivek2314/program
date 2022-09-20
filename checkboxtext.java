package Automate_EndUser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxtext {

	public static void main(String[] args)
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
//		List<WebElement> ele = driver.findElements(By.xpath("//legend[normalize-space()='Checkbox Example']"));
//
//		for (WebElement e : ele)
//		{
//			System.out.println(e.getText());
//		}
		
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		
		WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='Option3']"));

		
		System.out.println("hello 1 ");
		
		if(ele.isEnabled())
		{
			System.out.println(ele.getText());
			
		}
		
		System.out.println("hello 2");
	}

}
