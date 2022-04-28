package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility_demo {
	
	public static String getreaddata(String path, int rownum, int column)
	{
		String data="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			data=sheet.getRow(rownum).getCell(column).getStringCellValue();
			
		} catch (Exception e) {
			System.out.println(" Issue in read data from excel  "+e);
		}
		return data;
	}
	
	public static void main(String[] args) {
		String path="";
		for(int i=0; i<=20; i++) {
		String out = getreaddata(path, 0, i);
		String out1 = getreaddata(path, 1, i);
		System.out.println(out);
		System.out.println(out1);
		}
		
	}
}


