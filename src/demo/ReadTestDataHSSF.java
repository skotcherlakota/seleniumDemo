package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestDataHSSF {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir")+"\\TestData2.xls"));
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		HSSFSheet sheet = workbook.getSheet("sheet1");
		int noOfRows=sheet.getLastRowNum();
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=noOfRows;i++) {
			for(int j=0;j<noOfColumns;j++) {
				HSSFCell ColumnHeader = sheet.getRow(0).getCell(j);
				HSSFCell ColumnCell = sheet.getRow(i).getCell(j);
				String sCellValue = ColumnCell.getStringCellValue();
				String sCellHeader = ColumnHeader.getStringCellValue();
				System.out.println(sCellHeader);
				System.out.println(sCellValue);
				
			}
		}
	
	}
}
