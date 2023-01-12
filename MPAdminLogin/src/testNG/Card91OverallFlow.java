package testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Card91OverallFlow {
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	String winHandleBefore;
	
	
	@BeforeSuite
	public void LaunchBrowser() {
		 startTime= System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/Users/card91/Downloads/chromedriver");
		 driver = new ChromeDriver();
	   	 driver.get("www.google.com");
	   	 
		 
		}
	
	@Test(priority=0)
	public void Login() {
		driver.get("https://admin.sb.stag.card91.in/");
				driver.manage().window().maximize();
        boolean a= driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div[1]")).isDisplayed();
        Assert.assertTrue(a);
        //Assert.assertEquals(a, true);
        System.out.println(a);
		//Login
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("mpsuper@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"passwordBoxForLogin\"]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		String title =driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, "CARD91.IO Administrator Panel - Staging - Sandbox", "title is not matcehd");
	    
	
	}
	
	//Org Creation
	@Test(priority=1, enabled= false)
	public void OrgCreation() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app-container\"]/main/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"displayName\"]")).sendKeys("TestNGs Automations Org");
		driver.findElement(By.xpath("//*[@id=\"businessName\"]")).sendKeys("TestNGs Automations");
		
		//FOR BUSINESS TYPE
		driver.findElement(By.xpath("//*[@class=\"multiselect__select\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[3]/ul/li[1]/span/span")).click();
		//For LLP "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[2]/span/span"
        //For PUBLIC "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[3]/span/span"
        //For PROPRIETORSHIP "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[4]/span/span"
        //For OPC "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[5]/span/span"
        //For PARTNERSHIP "//*[@class=\"form-group\"]/div/div/div[3]/ul/li[6]/span/span"
        
		driver.findElement(By.xpath("//*[@aria-label=\"gst number\"]")).sendKeys("07VDFCT3685K1ZX");
		//driver.findElement(By.xpath("//*[@title=\"Upload GST Certificate\"]")).click();
		
		
        driver.findElement(By.xpath("//*[@aria-label=\"tan number\"]")).sendKeys("BTVD51262M");
        //driver.findElement(By.xpath("//*[@title=\"Upload TAN\"]")).click();
        
        
        driver.findElement(By.xpath("//*[@aria-label=\"pan number\"]")).sendKeys("GABRF2262M");
        //driver.findElement(By.xpath("//*[@title=\"Upload PAN\"]")).click();
       
        
        driver.findElement(By.xpath("//*[@aria-label=\"cin number\"]")).sendKeys("L15170AP2410PLC015897");
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
        driver.findElement(By.xpath("//*[@aria-label=\"Mobile number\"]")).sendKeys("7006007010");
        driver.findElement(By.xpath("//*[@aria-label=\"Email Id\"]")).sendKeys("automation15org@mailinator.com");
        System.out.println("All the required details are entered.");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        System.out.println("Org Created Successfully");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
       
	}
	
	@Test(priority=2)
    //@Test(dependsOnMethods = "OrgCreation")	
     public void Load_Money_to_Org() throws InterruptedException {
	//Load Money to Org
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
		 Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"app-container\"]/main/div/div/div/div[1]/div/div/div/div/div[4]/div[2]/span/div[1]/button/div")).click();
    driver.findElement(By.xpath("//*[@placeholder=\"Enter UTR No.\"]")).sendKeys("Load Money");
    driver.findElement(By.xpath("//*[@placeholder=\"Pick a date\"]")).click();
    driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div/div[2]/div/span[10]")).click();
    driver.findElement(By.xpath("//*[@placeholder=\"Enter Amount\"]")).sendKeys("1000");
    driver.findElement(By.xpath("//*[@id=\"add-money-modal___BV_modal_body_\"]/form/div[2]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"sideLi4\"]/a")).click();
    Thread.sleep(3000);
    
    WebElement scrollRight = driver.findElement(By.xpath("//*[@class=\"btn approve-btn btn-outline\"]"));
    JavascriptExecutor jse =(JavascriptExecutor) driver;
    
    jse.executeScript("arguments[0].scrollIntoView()", scrollRight);
    driver.findElement(By.xpath("//*[@class=\"btn approve-btn btn-outline\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"approve-request-modal___BV_modal_body_\"]/div[2]/button")).click();
    Thread.sleep(3000);
    
    //For Reject
    /*driver.findElement(By.xpath("//*[@id=\"app-container\"]/main/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[11]/div/button[2]")).click();
    driver.findElement(By.id("reasonBox")).sendKeys("Invalid amount");
    driver.findElement(By.xpath("//*[@id=\"reject-request-modal___BV_modal_body_\"]/div/button")).click();*/
   
}
    
    
    
	//@Test(priority=3)
      @Test(dependsOnMethods = "Load_Money_to_Org")
     public void CardProgram_Creation() throws InterruptedException {
	//Card Program Creation
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"sideLi0\"]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
    	Thread.sleep(6000);
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,-250)");
    	/*WebElement element = driver.findElement(By.xpath("//*[@class=\"nav nav-tabs card-header-tabs\"]/li[3]"));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(element).click().build().perform();*/
    driver.findElement(By.xpath("//*[@class=\"nav nav-tabs card-header-tabs\"]/li[3]")).click();
    Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/button/div")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@aria-label=\"group name\"]")).sendKeys("Cards Programms");
	driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
	Thread.sleep(3000);
    
	driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[2]/div/button[1]/div")).click();
	driver.findElement(By.xpath("//*[@title=\"Add Smart Wallet\"]")).click();
	driver.findElement(By.id("userapplicationName")).sendKeys("Prepaid Wallet");
	driver.findElement(By.id("appDesc")).sendKeys("Prepaid Wallet Testing");
	Thread.sleep(3000);
	/*WebElement button = driver.findElement(By.xpath("//*[@value=\"PREPAID\"]"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", button);*/
	driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div[1]/label/div/span[1]")).click();
	//driver.findElement(By.xpath("//*[@class=\"form-group\"]/div/div[3]/label/div/span[1]")).click();
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
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"addAppsToGroupInGroupModal___BV_modal_body_\"]/div/div/div/div/div[5]/button[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"addAppsToGroupInGroupModal___BV_modal_body_\"]/div/div/div/div/div[5]/button[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"addAppsToGroupInGroupModal___BV_modal_body_\"]/div/div/div/div/div[5]/button[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"close-wrapper\"]")).click();
	
	}
  
	//@Test(priority=4)
      @Test(dependsOnMethods ="CardProgram_Creation")
    public void Card_Creation() throws InterruptedException {
    	//Card Creation
    	Thread.sleep(5000);
    	//driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
    	Thread.sleep(3000);
    	WebElement element = driver.findElement(By.xpath("//*[@class=\"nav nav-tabs card-header-tabs\"]/li[2]"));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(element).click().build().perform();
        driver.findElement(By.xpath("//*[@id=\"card-table-tab-view\"]/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@aria-label=\"full name\"]")).sendKeys("CardA");
        driver.findElement(By.xpath("//*[@aria-label=\"name on card\"]")).sendKeys("CardAa");
        driver.findElement(By.xpath("//*[@aria-label=\"mobile number\"]")).sendKeys("7006007021");
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
      // @Test(priority=5)
   @Test(dependsOnMethods = "Card_Creation")
    public void KYCPortal() throws InterruptedException {
    	Thread.sleep(3000);
    	
    	driver.get("https://kyc.sb.stag.card91.in/");
		driver.findElement(By.id("phoneTxtField")).sendKeys("7006007021");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@inputmode=\"numeric\"]")).sendKeys("111111");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[2]/form/div/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"panNumber\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"panNumber\"]")).sendKeys("EGTDR4322L");
		driver.findElement(By.xpath("//*[@placeholder=\"Name on PAN card\"]")).sendKeys("CardA");
		driver.findElement(By.xpath("//*[@id=\"gender\"]/label[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"dd/mm/yyyy\"]")).sendKeys("05041995");
		driver.findElement(By.id("address")).sendKeys("No: 90, Rajaji Nagar");
		driver.findElement(By.id("pinCode")).sendKeys("602001");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/form/div[2]/button")).click();
		Thread.sleep(3000);
		 driver.get("https://admin.sb.stag.card91.in/app/organization/overview");
    	}
	 //@Test(priority=6)	
    @Test(dependsOnMethods ="KYCPortal" )
         public void Load_Moneyto_Card() throws InterruptedException {
        	//Load Money to Card
             Thread.sleep(3000);
             driver.navigate().refresh();
             driver.findElement(By.xpath("//*[@class=\"nav nav-tabs card-header-tabs\"]/li[2]")).click();
             Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
            Thread.sleep(5000);
             driver.findElement(By.xpath("//*[@id=\"card-detail-view-component\"]/div/div[2]/section/button[1]")).click();
             Thread.sleep(3000);
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
             Thread.sleep(3000);
        }
        
        //@Test(priority=7)
        @Test(dependsOnMethods = "Load_Moneyto_Card")
        public void Demo_Txn() throws InterruptedException {	
             
             //Demo Txns
             driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
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
             driver.findElement(By.xpath("//*[@class=\"card-header margin-left-40\"]/ul/li[2]")).click();
             Thread.sleep(3000);
        }
        
     // @Test(priority=7)
        @Test(dependsOnMethods ="Demo_Txn" )
        public void Freeze_Unfreeze_the_Card() throws InterruptedException {
             //Freeze the Card
             driver.findElement(By.xpath("//*[@class=\"btn ml-2 btn-secondary rounded-0\"]")).click();
             driver.findElement(By.xpath("//*[@id=\"lockUnlockOrBlockCard___BV_modal_body_\"]/div/div[2]/button[2]")).click();
             Thread.sleep(3000);
             
             //Unfreeze the Card
             driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//*[@class=\"btn ml-2 btn-secondary rounded-0\"]")).click();
             driver.findElement(By.xpath("//*[@class=\"btn modal-btn btn-danger\"]")).click();
        }
        
    // @Test(priority=8)
        @Test(dependsOnMethods = "Freeze_Unfreeze_the_Card")
        public void Block_the_Card() throws InterruptedException {     
             //Block the Card
        	Thread.sleep(3000);
             driver.findElement(By.xpath("//*[@id=\"cardVueTable\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//*[@class=\"btn submitBtn ml-2 btn-danger rounded-0\"]")).click();
             driver.findElement(By.xpath("//*[@class=\"btn modal-btn btn-danger\"]")).click();
             
         }
       // @Test(priority=9)
        @Test(dependsOnMethods = "Block_the_Card")
        public void Sub_Org_Creation() throws InterruptedException {
        	Thread.sleep(3000);
        	WebElement element = driver.findElement(By.xpath("//*[@class=\"nav nav-tabs card-header-tabs\"]/li[1]"));
        	Actions actions = new Actions(driver);
        	actions.moveToElement(element).click().build().perform();
        	driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]/div")).click();
    		driver.findElement(By.id("displayName-input")).sendKeys("Automation Sub Org");
    		driver.findElement(By.id("business-input")).sendKeys("Auto Sub Org");
    		//driver.findElement(By.xpath("//*[@id=\"__BVID__523\"]")).sendKeys("20AABCT1189K2Z2");
    		driver.findElement(By.id("calling-name-input")).sendKeys("Automation sub Admin");
    		driver.findElement(By.id("authSignMob-input")).sendKeys("8006008000");
    		driver.findElement(By.id("authSignEmail-input")).sendKeys("autosuborg@mailinator.com");
    		driver.findElement(By.id("addressLine1-input")).sendKeys("No: 90");
    		driver.findElement(By.id("addressLine2-input")).sendKeys("Rajaji Nagar");
    		driver.findElement(By.name("landmark")).sendKeys("Near Post Office");
    		driver.findElement(By.id("pinCode-input")).sendKeys("517408");
    		driver.findElement(By.id("city-input")).sendKeys("Palamaner");
    		driver.findElement(By.id("state-input")).sendKeys("Andhra Pradesh");
    		driver.findElement(By.xpath("//*[@id=\"addNewSubBusinessModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
    		
        }
        //@Test(priority=10)
        @Test(dependsOnMethods = "Sub_Org_Creation")
        public void Allocate_Money_to_SubOrg() throws InterruptedException {
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]/div")).click();
    		driver.findElement(By.xpath("//*[@name=\"amount\"]")).sendKeys("100");
    		driver.findElement(By.xpath("//*[@id=\"allocate-money-modal___BV_modal_body_\"]/div/form/div[2]/button")).click();
    		
        }
        
       // @Test(priority=11, invocationCount = 2) 
        @Test(dependsOnMethods = "Allocate_Money_to_SubOrg", invocationCount = 2)
        public void Add_Admin() throws InterruptedException {
        	driver.findElement(By.cssSelector("#__BVID__204___BV_tab_button__")).click();
            driver.findElement(By.xpath("//*[@id=\"user-table\"]/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/button/div")).click();
            driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("Aut Admin");
            driver.findElement(By.xpath("//*[@name=\"mobileNumber\"]")).sendKeys("6009006006");
            driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("autoadmin6@mailinator.com");
            
            //For Super Admin
            Thread.sleep(3000);
            //driver.findElement(By.xpath("//*[@value=\"SUPER_ADMIN\"]")).click();
            driver.findElement(By.xpath("//*[@class=\"form-group mb-4\"]/div/div/div[1]/div/label/span")).click();
            //For Card Admin
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@class=\"form-group mb-4\"]/div/div/div[2]/div/label/span")).click();
            
            //For Read Only Admin
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"addNewAdminModal___BV_modal_body_\"]/div/div/form/div[2]/button")).click();
        }
        
        //@Test(priority=12)
        @Test(dependsOnMethods = "Add_Admin")
        public void Block_Admin() throws InterruptedException {
            //Block Admin 
           Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"edit-icon-wrapper\"]")).click();
            driver.findElement(By.xpath("//*[@class=\"span-admin-status\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"user-edit-form\"]/div[3]/button")).click();
            System.out.println("Admin is Blocked Successfully");
        }
        
       // @Test(priority=13)
       @Test(dependsOnMethods = "Block_Admin")
        public void Delete_Admin() throws InterruptedException {
            
            //Delete Admin
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"user-table\"]/div[2]/div/div[1]/div/div[2]/div[2]/table/tbody/tr[2]/td[6]/div/div/div")).click();
            driver.findElement(By.xpath("//*[@id=\"user-edit-form\"]/div[1]/div[2]/button")).click();
            driver.findElement(By.xpath("//*[@id=\"alertModalForAdmin___BV_modal_body_\"]/div/div[2]/button[2]")).click();
            System.out.println("Admin Deleted Successfully");
        }
        
       // @Test(priority=14)
        @Test(dependsOnMethods = "Delete_Admin")
        public void Add_Webhook() throws InterruptedException {
        	 //driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
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
        }
        
        
        //Edit Webhook
       // @Test(priority=15)
        @Test(dependsOnMethods ="Add_Webhook" )
        public void Edit_Webhook() throws InterruptedException {
        	driver.findElement(By.xpath("//*[@id=\"editWebHook\"]/div/button")).click();
            driver.findElement(By.xpath("//*[@id=\"editWebHook\"]/div/input")).clear();
            driver.findElement(By.xpath("//*[@id=\"editWebHook\"]/div/input")).sendKeys("https://webhook.site/a45f42b5-0d3b-497f-9ac1-b89f7028cf9d");
            driver.findElement(By.xpath("//*[@id=\"saveWebhook\"]")).click();
            System.out.println("Webhook updated successfully");
            Thread.sleep(3000);
        }
        
        //Test Webhook
       // @Test(priority=16)
        @Test(dependsOnMethods ="Edit_Webhook" )
        public void Test_Webhook() throws InterruptedException {
        	driver.findElement(By.xpath("//*[@class=\"tab-pane active card-body\"]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]/div/button")).click();
            driver.findElement(By.xpath("//*[@id=\"TestWebhookModal___BV_modal_body_\"]/div/form/div[2]/button")).click();
            System.out.println("Webhook Tested successfully");
            Thread.sleep(3000);
        
        }
        
        //Delete Webhook
        //@Test(priority=17)
        @Test(dependsOnMethods ="Test_Webhook" )
        public void Delete_Webhook() throws InterruptedException {
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//*[@id=\"delete-icon\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"alertModal___BV_modal_body_\"]/div/div[2]/button[2]")).click();
            System.out.println("Webhook Deleted successfully");
        	
        }
	
	
	@AfterSuite
	public void closeBrowser() {
		//driver.close();
		 endTime= System.currentTimeMillis();
         totalTime = endTime-startTime;
        System.out.println("Total time taken:" +totalTime);
		
	}

}
