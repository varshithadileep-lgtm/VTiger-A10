package genericUtility;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getSingleCellDataFromExcel(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IpathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;
	}
	
	public ArrayList<String> getMultipleCellDataFromExcel(String sheetName,int startRowIndex, int startCellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =  new FileInputStream(IpathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetName);
		int lastRowNum = s.getLastRowNum();
		DataFormatter df = new DataFormatter();
		ArrayList<String> a = new ArrayList<String>();
		for(int i = startRowIndex; i<=lastRowNum; i++)
		{
			Row r =  s.getRow(i);
			int lastCellNum = r.getLastCellNum();
			for(int j = startCellIndex; j<=lastCellNum; j++)
			{
				Cell c = r.getCell(j);
				String value = df.formatCellValue(c);
				a.add(value);
			}
		}
		return a;
	}
	
	public void writeDataToExcelFile(String sheetName, int rowIndex, int cellIndex, String cellValue) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IpathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		c.setCellValue(cellValue);
		FileOutputStream fos = new FileOutputStream(IpathUtility.excelPath);
		wb.write(fos);
		
	}
}
