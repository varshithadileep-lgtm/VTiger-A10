package practice;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchMulitpleDataFromExcel {
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
//			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\TestData.xlsx");
//			Workbook wb = WorkbookFactory.create(fis);
//			Sheet s = wb.getSheet("Insect");
//			int lastRowNum = s.getLastRowNum();
//			DataFormatter df = new DataFormatter();
//			for(int i = 0; i<=lastRowNum; i++)
//			{
//				Row r = s.getRow(i);
//				int lastCellNum = r.getLastCellNum();
//				for(int j=0; j<lastCellNum; j++)
//				{
//					Cell c = r.getCell(j);
//					String value = df.formatCellValue(c);
//					System.out.print(value+" ");
//				}
//				System.out.println();
//			}
			
			ExcelUtility eUtil = new ExcelUtility();
			ArrayList<String> val = eUtil.getMultipleCellDataFromExcel("Insect", 0, 0);
			System.out.println(val);

	}
}
