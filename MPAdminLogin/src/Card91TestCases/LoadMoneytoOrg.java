package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadMoneytoOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/card91/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.get("https://admin.sb.stag.card91.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("mpsuper@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"passwordBoxForLogin\"]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
        //driver.navigate().refresh();
        
        //Load Money to Org
        driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"app-container\"]/main/div/div/div/div[1]/div/div/div/div/div[4]/div[2]/span/div[1]/button/div")).click();
        driver.findElement(By.xpath("//*[@placeholder=\"Enter UTR No.\"]")).sendKeys("Load Money");
        driver.findElement(By.xpath("//*[@placeholder=\"Pick a date\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[2]/div/span[17]")).click();
        driver.findElement(By.xpath("//*[@placeholder=\"Enter Amount\"]")).sendKeys("10000");
        driver.findElement(By.xpath("//*[@id=\"add-money-modal___BV_modal_body_\"]/form/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"sideLi4\"]/a")).click();
        
        WebElement scrollRight = driver.findElement(By.xpath("//*[@class=\"btn approve-btn btn-outline\"]"));
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        
        jse.executeScript("arguments[0].scrollIntoView()", scrollRight);
        driver.findElement(By.xpath("//*[@class=\"btn approve-btn btn-outline\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"approve-request-modal___BV_modal_body_\"]/div[2]/button")).click();
        
        //For Reject
        /*driver.findElement(By.xpath("//*[@id=\"app-container\"]/main/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[11]/div/button[2]")).click();
        driver.findElement(By.id("reasonBox")).sendKeys("Invalid amount");
        driver.findElement(By.xpath("//*[@id=\"reject-request-modal___BV_modal_body_\"]/div/button")).click();*/
        
        
	
	
	}

}
