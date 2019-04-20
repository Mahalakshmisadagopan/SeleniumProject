package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class Createexcel {

	public String[][] Readexcel(String Filename) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./excel/"+Filename+".xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//Last used row count
		int rowcount = sheet.getLastRowNum();
		//To get column count first go to row and last cell num
		int columncount = sheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowcount][columncount];
		System.out.println("Table values" +"\t");
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			for (int j=0;j<columncount;j++) {
				//Go to cell
				XSSFCell cell = row.getCell(j);
				//read data from cell in string
				data[i-1][j] = cell.getStringCellValue();
				//System.out.println(name);
			}
			
		}
		return data;
		
		

	}


}