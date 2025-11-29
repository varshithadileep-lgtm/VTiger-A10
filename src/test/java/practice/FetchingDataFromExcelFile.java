package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtility eUtil = new ExcelUtility();
		String val1 = eUtil.getSingleCellDataFromExcel("Animal", 0, 0);
		String val2 = eUtil.getSingleCellDataFromExcel("Fish", 2, 2);
		System.out.println(val1);
		System.out.println(val2);
	}
}
