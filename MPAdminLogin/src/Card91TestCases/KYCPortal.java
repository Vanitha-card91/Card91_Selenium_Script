package Card91TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KYCPortal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/card91/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.get("https://kyc.sb.stag.card91.in/");
		driver.findElement(By.id("phoneTxtField")).sendKeys("8138849786");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@inputmode=\"numeric\"]")).sendKeys("111111");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[2]/form/div/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"panNumber\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"panNumber\"]")).sendKeys("BVSAX5126J");
		driver.findElement(By.xpath("//*[@placeholder=\"Name on PAN card\"]")).sendKeys("CardA");
		driver.findElement(By.xpath("//*[@id=\"gender\"]/label[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"dd/mm/yyyy\"]")).sendKeys("05041995");
		driver.findElement(By.id("address")).sendKeys("No: 90, Rajaji Nagar");
		driver.findElement(By.id("pinCode")).sendKeys("602001");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/form/div[2]/button")).click();
		driver.close();
		//Thread.sleep(3000);
		//driver.get("https://admin.sb.stag.card91.in/app/organization/overview");
		

	}

}
