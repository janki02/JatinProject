package seleniumCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelsheet {

	public static void main(String[] args) throws IOException {
		
	   FileInputStream ff = new FileInputStream("C:\\Users\\Janki_project\\DoNotTuchProject\\Book1.xlsx");
	   
	   XSSFWorkbook wb = new XSSFWorkbook(ff);
	   
	   XSSFSheet sheet = wb.getSheetAt(0);
	   

		  
	       
	}

}
