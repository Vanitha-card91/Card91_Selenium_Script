package Card91TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriverApachePOI {

	static List<String> userNameList = new ArrayList<String>();
	static List<String> passwordList = new ArrayList<String>();

	public void readExcel() throws IOException {
		FileInputStream excel = new FileInputStream("//Users//card91//Downloads//DataTest.xlsx");
		Workbook TestBook = new XSSFWorkbook(excel);
		Sheet Data = TestBook.getSheetAt(0);
		Iterator<Row> rowIterator = Data.iterator();
		while (rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();
			int i = 2;
			Iterator<Cell> columnIterator = rowValue.iterator();
			while (columnIterator.hasNext()) {
				if (i % 2 == 0) {
					userNameList.add(columnIterator.next().getStringCellValue());
				} else {
					passwordList.add(columnIterator.next().getStringCellValue());
				}
			i++;
			}
			

		}

	}

	
	public void executeTest() {
		for(int i=0; i<userNameList.size(); i++)
			login(userNameList.get(i), passwordList.get(i));
		
	}
	public void login( String email, String password) {
		System.setProperty("webdriver.chrome.driver", "/Users/card91/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
	   	 driver.get("www.google.com");
	   	driver.get("https://admin.sb.stag.card91.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"passwordBoxForLogin\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		
	}

	/*private void login(String string, String string2) 
	{
		// TODO Auto-generated method stub
		
	}*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataDriverApachePOI usingPOI = new DataDriverApachePOI();
		usingPOI.readExcel();
		System.out.println("Username List" + userNameList);
		System.out.println("Password List" + passwordList);
		usingPOI.executeTest();

	}

}
