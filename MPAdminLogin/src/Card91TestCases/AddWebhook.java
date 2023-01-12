package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddWebhook {

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
        
        //Add Webhook
        driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
        driver.findElement(By.cssSelector("#__BVID__206___BV_tab_button__")).click();
        Thread.sleep(3000);
      //For Customer Auth
        driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/button/div")).click();
        driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("https://webhook.site/6d394e77-5ec9-477d-b37c-80eaaa0cd32a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[3]/ul/li[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"addWebhookFormModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
        System.out.println("Customer Auth webhook Added successfully");
        Thread.sleep(3000);
        
        //For Card Events
        driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/button/div")).click();
        driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("https://webhook.site/6d394e77-5ec9-477d-b37c-80eaaa0cd32a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[3]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"addWebhookFormModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
        System.out.println("Card Events webhook Added successfully");
        Thread.sleep(3000);
        
        //For Create Txn
        driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/button/div")).click();
        driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("https://webhook.site/6d394e77-5ec9-477d-b37c-80eaaa0cd32a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[3]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"addWebhookFormModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
        System.out.println("Create Txn webhook Added successfully");
        Thread.sleep(3000);
        
        //For KYC Events
        driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/button/div")).click();
        driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("https://webhook.site/6d394e77-5ec9-477d-b37c-80eaaa0cd32a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[3]/ul/li[4]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"addWebhookFormModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
        System.out.println("KYC Events webhook Added successfully");
        Thread.sleep(3000);
        
        //Validate Txn
        driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/button/div")).click();
        driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("https://webhook.site/6d394e77-5ec9-477d-b37c-80eaaa0cd32a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[3]/ul/li[5]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"addWebhookFormModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
        System.out.println("Validate Txn webhook Added successfully");
        Thread.sleep(3000);
        
        //For Notify Txn
        driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/button/div")).click();
        driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("https://webhook.site/6d394e77-5ec9-477d-b37c-80eaaa0cd32a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[3]/ul/li[6]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"addWebhookFormModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
        System.out.println("Notify Txn webhook Added successfully");
        Thread.sleep(3000);
        
        //Edit Webhook
        driver.findElement(By.xpath("//*[@id=\"editWebHook\"]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"editWebHook\"]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"editWebHook\"]/div/input")).sendKeys("https://webhook.site/a45f42b5-0d3b-497f-9ac1-b89f7028cf9d");
        driver.findElement(By.xpath("//*[@id=\"saveWebhook\"]")).click();
        System.out.println("Webhook updated successfully");
        Thread.sleep(3000);
       
        
        
        
        //Test Webhook
        driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"TestWebhookModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
        System.out.println("Webhook Tested successfully");
        Thread.sleep(3000);
        
      //Delete Webhook
        driver.findElement(By.xpath("//*[@id=\"delete-icon\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"alertModal___BV_modal_body_\"]/div/div[2]/button[2]")).click();
        System.out.println("Webhook Deleted successfully");
        
        

	}

}
