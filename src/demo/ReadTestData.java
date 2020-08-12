package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {
	public static void main(String[] args) throws IOException {
		
		File fiel1=new File("TestData.xlsx");
		FileInputStream file = new FileInputStream(fiel1);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("test");
		
		
		int noOfRows=sheet.getLastRowNum();
		
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		
		System.out.println(sheet.getRow(5).getCell(1));
		
		
		for(int i=1;i<=noOfRows;i++) {
			
			for(int j=0;j<noOfColumns;j++) {
				
				XSSFCell ColumnHeader = sheet.getRow(0).getCell(j);
				XSSFCell ColumnCell = sheet.getRow(i).getCell(j);
				
				String sCellValue = ColumnCell.getStringCellValue();
				String sCellHeader = ColumnHeader.getStringCellValue();
				
				
				System.out.println(sCellHeader);
				System.out.println(sCellValue);
				
				//adding into map
				
				
			}
		}
		
		workbook.close();
	}
}
