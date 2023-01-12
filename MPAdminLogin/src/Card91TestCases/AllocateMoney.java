package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllocateMoney {

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
		driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]/div")).click();
		driver.findElement(By.xpath("//*[@name=\"amount\"]")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"allocate-money-modal___BV_modal_body_\"]/div/form/div[2]/button")).click();
		
	}

}
