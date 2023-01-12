package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginCard91Admin {
	WebDriver driver;
	String[][]data= null;
	
	@DataProvider(name="LoginData")
	public String[][] loginDataProvider() throws BiffException, IOException{
		data =getExcelData();
		return data;
		
	}
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel=new FileInputStream("/Users/card91/Downloads/DataTest.xlsx");
		Workbook DataBook = Workbook.getWorkbook(excel);
		Sheet Data = DataBook.getSheet(0);
		int rowCount = Data.getRows();
		int columnCount = Data.getRows();
		String TestData[][]=new String[rowCount-1][columnCount];
		for (int i=1; i<rowCount; i++) {
			for(int j=0;j<columnCount; j++) {
				TestData[i-1][j]=Data.getCell(j, i).getContents();
			}
		}
		return TestData;
		
		
	}
	@Test(dataProvider ="LoginData" )
	public void LoginTestCases( String env, String M_url, String email, String password) {
		System.setProperty("webdriver.chrome.driver", "/Users/card91/Downloads/chromedriver");
		 driver = new ChromeDriver();
	   	 driver.get("www.google.com");
	   	driver.get(M_url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"passwordBoxForLogin\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		
	}
	

}
