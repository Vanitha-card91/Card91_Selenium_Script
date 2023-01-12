package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CardProgram {

	public static void main(String[] args) throws InterruptedException {
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
        
        //Card Program Creation
        driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
        driver.findElement(By.cssSelector("#__BVID__202___BV_tab_button__")).click(); 		
		//driver.findElement(By.xpath("//*[@id=\"__BVID__202\"]/div/div[1]/button")).click();
		//driver.findElement(By.xpath("//*[@aria-label=\"group name\"]")).sendKeys("Adding Card Program");
		//driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
        
		driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[2]/div/button[1]/div")).click();
		driver.findElement(By.xpath("//*[@title=\"Add Smart Wallet\"]")).click();
		driver.findElement(By.id("userapplicationName")).sendKeys("Prepaid Wallet2");
		driver.findElement(By.id("appDesc")).sendKeys("Prepaid Wallet Testing");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//*[@value=\"PREPAID\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", button);
		driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div[1]/label/div/span[1]")).click();
		driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div[3]/label/div/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"addAppsToGroupInGroupModal___BV_modal_body_\"]/div/div/div/div/div[5]/button[2]")).click();
		/*Adding Rules
		driver.findElement(By.xpath("//*[@class=\"btn mb-4 semi-transparent-btn btn-secondary\"]")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"Enter a descriptive rule name\"]")).sendKeys("Rules for Txn");
		driver.findElement(By.xpath("//*[@class=\"btn mt-3 semi-transparent-btn btn-secondary\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"mr-2 form-control is-valid\"]")).click();
		driver.findElement(By.xpath("//*[@value=\"txnType\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"form-control is-valid\"]")).click();
		driver.findElement(By.xpath("//*[@value=\"in\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"multiselect__select\"]")).click();*/
		
		driver.findElement(By.xpath("//*[@id=\"addAppsToGroupInGroupModal___BV_modal_body_\"]/div/div/div/div/div[5]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"addAppsToGroupInGroupModal___BV_modal_body_\"]/div/div/div/div/div[5]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"addAppsToGroupInGroupModal___BV_modal_body_\"]/div/div/div/div/div[5]/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"close-wrapper\"]")).click();
		
		


	}

}
