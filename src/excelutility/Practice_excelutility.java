package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice_excelutility {
	
	public static String readdata(String path, int rownum, int colum)
	{
		
		String data="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			sheet.getRow(rownum).getCell(colum).getStringCellValue();
			
		} catch (Exception e) {
			System.out.println(" Issue in get read data via excel  "+e);
		}
		return data;
	}
	
	public static void main(String[] args) {
		String path="";
		
	}

}
