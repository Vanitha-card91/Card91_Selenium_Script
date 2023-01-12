package Card91TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAdmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/Users/card91/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.get("https://admin.sb.stag.card91.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("mpsuper@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"passwordBoxForLogin\"]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		// driver.navigate().refresh();

		// Add Admin
		driver.findElement(By.xpath("//*[@class=\"hover-pointer\"]")).click();
		driver.findElement(By.cssSelector("#__BVID__204___BV_tab_button__")).click();
		driver.findElement(
				By.xpath("//*[@id=\"user-table\"]/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/button/div"))
				.click();
		driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("Aut Admin");
		driver.findElement(By.xpath("//*[@name=\"mobileNumber\"]")).sendKeys("6009006002");
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("autoadmin1@mailinator.com");

		// For Super Admin
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@value=\"SUPER_ADMIN\"]")).click();

		driver.findElement(By.xpath("//*[@class=\"form-group mb-4\"]/div/div/div[1]/div/label/span")).click();

		// For Card Admin
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"form-group mb-4\"]/div/div/div[2]/div/label/span")).click();

		// For Read Only Admin
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"addNewAdminModal___BV_modal_body_\"]/div/div/form/div[2]/button"))
				.click();

		// Block Admin
		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"edit-icon-wrapper\"]")).click();
		 * driver.findElement(By.xpath("//*[@class=\"span-admin-status\"]")).click();
		 * driver.findElement(By.xpath("//*[@id=\"user-edit-form\"]/div[3]/button")).
		 * click();
		 */

		// Delete Admin
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-icon-wrapper\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-edit-form\"]/div[1]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"alertModalForAdmin___BV_modal_body_\"]/div/div[2]/button[2]")).click();
		System.out.println("Admin Deleted Successfully");

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken" + totalTime);

	}

}
