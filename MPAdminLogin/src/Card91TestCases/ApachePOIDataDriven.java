package Card91TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File excel = new File("/Users/card91/Downloads/DataTest.xlsx");
		FileInputStream TestBook = new FileInputStream(excel);

		@SuppressWarnings("resource")
		XSSFWorkbook Workbook = new XSSFWorkbook(TestBook);

		XSSFSheet sheet1 = Workbook.getSheetAt(0);
		String data = sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);

	}

}
