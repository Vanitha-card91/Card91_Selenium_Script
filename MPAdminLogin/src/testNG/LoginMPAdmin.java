package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginMPAdmin {
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	String winHandleBefore;

	@Test
	@Parameters({ "env", "M_url", "email", "password"  })
	public void LaunchBrowser(@Optional String env, String M_url, String email, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/card91/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		if (env.equals("Staging Sandbox")) {

			Thread.sleep(3000);
			driver.get(M_url);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"passwordBoxForLogin\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		} else if (env.equals("Staging Live")) {

			driver.get(M_url);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"passwordBoxForLogin\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		}

	}
}