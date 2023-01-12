package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrgCreation {
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "/Users/card91/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.get("https://admin.sb.stag.card91.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String Atitle = driver.getTitle();
		String Etitle = "CARD91.IO Administrator Panel - Staging - Sandbox";
		//driver.close();
		if(Atitle.equalsIgnoreCase(Etitle))
		{
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		//Login
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("mpsuper@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"passwordBoxForLogin\"]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		
		//String actualUrl="https://admin.sb.stag.card91.in/";
        //String expectedUrl= driver.getCurrentUrl();
       // Assert.assertEquals(expectedUrl,actualUrl);
		
		driver.findElement(By.xpath("//*[@id=\"app-container\"]/main/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"displayName\"]")).sendKeys("AutomationTest Org");
		driver.findElement(By.xpath("//*[@id=\"businessName\"]")).sendKeys("AutomationTest Org");
		
		//FOR BUSINESS TYPE
		driver.findElement(By.xpath("//*[@class=\"multiselect__select\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[3]/ul/li[1]/span/span")).click();
		//For LLP "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[2]/span/span"
        //For PUBLIC "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[3]/span/span"
        //For PROPRIETORSHIP "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[4]/span/span"
        //For OPC "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[5]/span/span"
        //For PARTNERSHIP "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[6]/span/span"
        
		driver.findElement(By.xpath("//*[@aria-label=\"gst number\"]")).sendKeys("07AGFCV5189K1ZX");
		//driver.findElement(By.xpath("//*[@title=\"Upload GST Certificate\"]")).click();
		
		
        driver.findElement(By.xpath("//*[@aria-label=\"tan number\"]")).sendKeys("GAVD19861H");
        //driver.findElement(By.xpath("//*[@title=\"Upload TAN\"]")).click();
        
        
        driver.findElement(By.xpath("//*[@aria-label=\"pan number\"]")).sendKeys("GAVDB1761H");
        //driver.findElement(By.xpath("//*[@title=\"Upload PAN\"]")).click();
       
        
        driver.findElement(By.xpath("//*[@aria-label=\"cin number\"]")).sendKeys("L15110KL1973PLC028286");
        //driver.findElement(By.xpath("//*[@title=\"Upload CIN\"]")).click();
        
        driver.findElement(By.xpath("//*[@title=\"Upload GST Certificate\"]")).sendKeys("/Users/card91/Desktop/Archive/GST Doc.png");
        driver.findElement(By.xpath("//*[@title=\"Upload TAN\"]")).sendKeys("/Users/card91/Desktop/Archive/Tan.jpeg");
        driver.findElement(By.xpath("//*[@title=\"Upload PAN\"]")).sendKeys("/Users/card91/Desktop/Archive/PAN-Card.jpeg");
        driver.findElement(By.xpath("//*[@title=\"Upload CIN\"]")).sendKeys("/Users/card91/Desktop/Archive/CIN.jpeg");
        
        driver.findElement(By.xpath("//*[@aria-label=\"logo path\"]")).sendKeys("/Users/card91/Desktop/Archive/abc_logo.jpeg");
       Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"accountNumber\"]")).sendKeys("1234567891");
        driver.findElement(By.xpath("//*[@id=\"ifscCode\"]")).sendKeys("SBIN0054532");
        driver.findElement(By.xpath("//*[@aria-label=\"address 1\"]")).sendKeys("No: 25-24/1");
        driver.findElement(By.xpath("//*[@aria-label=\"address 2\"]")).sendKeys("Ayyakanna Street, Newpet");
        driver.findElement(By.xpath("//*[@aria-label=\"Landmark Input\"]")).sendKeys("Near muthoot Finance");
        driver.findElement(By.xpath("//*[@aria-label=\"pin code\"]")).sendKeys("517408");
        driver.findElement(By.xpath("//*[@aria-label=\"city name\"]")).sendKeys("Palamaner");
        driver.findElement(By.xpath("//*[@aria-label=\"state name\"]")).sendKeys("AP");
        driver.findElement(By.xpath("//*[@aria-label=\"auth name\"]")).sendKeys("Automation Admin");
        driver.findElement(By.xpath("//*[@aria-label=\"Mobile number\"]")).sendKeys("7006007009");
        driver.findElement(By.xpath("//*[@aria-label=\"Email Id\"]")).sendKeys("automation10org@mailinator.com");
        System.out.println("All the required details are entered.");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        System.out.println("Org Created Successfully");
        driver.navigate().refresh();
        
        

		
        
        
	}

}
