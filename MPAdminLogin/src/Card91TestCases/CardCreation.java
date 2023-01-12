package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CardCreation {

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
        
        //Card Creation
        driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"nav-link\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"card-table-tab-view\"]/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]")).click();
        driver.findElement(By.xpath("//*[@aria-label=\"full name\"]")).sendKeys("CardA");
        driver.findElement(By.xpath("//*[@aria-label=\"name on card\"]")).sendKeys("CardAa");
        driver.findElement(By.xpath("//*[@aria-label=\"mobile number\"]")).sendKeys("7006007003");
        driver.findElement(By.xpath("//*[@aria-label=\"email id\"]")).sendKeys("carda@mailinator.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"form-group mt-3\"]/div/div/div[2]/div/div/label")).click();       //For Personalized card
        //driver.findElement(By.xpath("//*[@class="form-group mt-3"]/div/div/div[3]/div/div/label")).click();  //For Insta card
        driver.findElement(By.xpath("//*[@aria-label=\"smart wallets\"]")).sendKeys("100");
        //driver.findElement(By.xpath("//*[@id=\"__BVID__250\"]")).sendKeys("200");
        driver.findElement(By.xpath("//*[@aria-label=\"address line 1\"]")).sendKeys("No: 90");
        driver.findElement(By.xpath("//*[@aria-label=\"address line 2\"]")).sendKeys("Rajaji Nagar");
        driver.findElement(By.xpath("//*[@aria-label=\"Landmark Input\"]")).sendKeys("Near Post Office");
        driver.findElement(By.xpath("//*[@aria-label=\"pincode\"]")).sendKeys("517408");
        driver.findElement(By.xpath("//*[@aria-label=\"city\"]")).sendKeys("Palamaner");
        driver.findElement(By.xpath("//*[@aria-label=\"state\"]")).sendKeys("AP");
        driver.findElement(By.xpath("//*[@id=\"addNewCardModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
        
        
        
        
        


}
}