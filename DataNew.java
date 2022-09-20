package Automate_EndUser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataNew

{

	WebDriver driver;

	@BeforeTest
	public void Launch_Browser()

	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://vilt.vinsys.live/#/login");
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "Data")

	public void Login_valid_credentials(String UserName, String Password) throws InterruptedException

	{

		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("UserName");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Password");

		driver.findElement(By.xpath("//button")).click();
	}

	
	@DataProvider(name="Data")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("C:/Users/Shree/Documents/Data2.xls","Sheet1");
		return arrayObject;
	}
	
	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}
}