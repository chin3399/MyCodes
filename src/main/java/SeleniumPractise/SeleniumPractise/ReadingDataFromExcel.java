package SeleniumPractise.SeleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Program Files\\Data.xlsx");  //opens the file in the input mode 
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);     //Creating Object of WorkBook to access the current workbook
		
		XSSFSheet sheet = workbook.getSheetAt(0);          //Accessing the required sheet using XSSFSheetclass 
		
		int row =sheet.getLastRowNum();                    //getting total number of rows 
		int column= sheet.getRow(0).getLastCellNum();      //getting total number of column using row 
		
		for(int i=0;i<row;i++) {                           // loop for selecting row 
			
			XSSFRow current=sheet.getRow(i);
			for (int j =0;j<column;j++)                    //loop for printing all values of the selected row 
				
			{
				String value =current.getCell(j).toString();         //Different Methods to read different types of Data 
				                                                     //getStringcallvalue() , getNumericellvalue()   ,  getBooleancellvalue()
				System.out.print("    "   +value);
				
			}System.out.println();
		}    

		
		
		
		
		
		
	}
	}