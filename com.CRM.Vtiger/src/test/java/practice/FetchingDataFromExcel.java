package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println(wb.getSheet("Animal").getRow(4).getCell(1).getStringCellValue());
//		Sheet s = wb.getSheet("Animal");
//		Row r = s.getRow(4);
//		Cell c = r.getCell(1);
//		String value = c.getStringCellValue();
//		System.out.println(value);
	}
}
