package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubOrgCreation {

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
		driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
		
		//Adding Sub Org
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]/div")).click();
		driver.findElement(By.id("displayName-input")).sendKeys("Automations Sub Org");
		driver.findElement(By.id("business-input")).sendKeys("Autos Sub Org");
		//driver.findElement(By.xpath("//*[@id=\"__BVID__523\"]")).sendKeys("20AABCT1189K2Z2");
		driver.findElement(By.id("calling-name-input")).sendKeys("Automation sub Admin");
		driver.findElement(By.id("authSignMob-input")).sendKeys("8006008001");
		driver.findElement(By.id("authSignEmail-input")).sendKeys("autosuborg1@mailinator.com");
		driver.findElement(By.id("addressLine1-input")).sendKeys("No: 90");
		driver.findElement(By.id("addressLine2-input")).sendKeys("Rajaji Nagar");
		driver.findElement(By.name("landmark")).sendKeys("Near Post Office");
		driver.findElement(By.id("pinCode-input")).sendKeys("517408");
		driver.findElement(By.id("city-input")).sendKeys("Palamaner");
		driver.findElement(By.id("state-input")).sendKeys("Andhra Pradesh");
		driver.findElement(By.xpath("//*[@id=\"addNewSubBusinessModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
		
		

	}

}
