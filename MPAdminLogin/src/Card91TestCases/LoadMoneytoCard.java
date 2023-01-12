package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoadMoneytoCard {

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
        
        //Load Money to Card
        driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#__BVID__200___BV_tab_button__")).click();
        Thread.sleep(3000);
       /* driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
        driver.findElement(By.xpath("//*[@id=\"card-detail-view-component\"]/div/div[2]/section/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"amount-input-undefined\"]")).sendKeys("1000");
        driver.findElement(By.xpath("//*[@id=\"allocate-org-money-modal\"]/form/button")).click();
        Thread.sleep(3000);
        
        //Unload Money from Card
        driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"card-detail-view-component\"]/div/div[2]/section/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"amount-input-undefined\"]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"withdraw-org-money-modal\"]/form/button")).click();
        Thread.sleep(3000);*/
        
        //Demo Txns
       /* driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"card-detail-view-component\"]/div/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@placeholder=\"Type Amount\"]")).sendKeys("10");
        
        WebElement dropDown= driver.findElement(By.xpath("//*[@class=\"txn-type-select custom-select\"]"));
        Select select = new Select(dropDown);
        Thread.sleep(3000);
        //select.selectByValue("ATM");
        //select.selectByValue("POS");
       select.selectByValue("TAP");
        
         driver.findElement(By.xpath("//*[@placeholder=\"Merchant Name\"]")).sendKeys("Abcd");
        driver.findElement(By.xpath("//*[@placeholder=\"Enter Merchant ID\"]")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"demo-txn-modal___BV_modal_body_\"]/div/form/div[4]/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"__BVID__304___BV_tab_button__\"]")).click();
        Thread.sleep(3000);
        
        //Freeze the Card
        driver.findElement(By.xpath("//*[@class=\"btn ml-2 btn-secondary rounded-0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"lockUnlockOrBlockCard___BV_modal_body_\"]/div/div[2]/button[2]")).click();
        Thread.sleep(3000);
        
        //Unfreeze the Card
        driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
        driver.findElement(By.xpath("//*[@class=\"btn ml-2 btn-secondary rounded-0\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"btn modal-btn btn-danger\"]")).click();*/
        
        
        //Block the Card
        driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
        driver.findElement(By.xpath("//*[@class=\"btn submitBtn ml-2 btn-danger rounded-0\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"btn modal-btn btn-danger\"]")).click();
        
        
        
        

        
        
        
        }

}
