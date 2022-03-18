package SeleniumPractise.SeleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomaticRegistrationProcess {

	public static void main(String[] args) throws IOException 
	
	
	{   System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
	
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		    
	
		FileInputStream file = new FileInputStream("C:\\Program Files\\RegistrationData.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheetAt(0);
		
		int row = sheet.getLastRowNum();
		int column = sheet.getRow(0).getLastCellNum();
		
		for(int i =1;i<=row;i++) 
		
		{
			XSSFRow current=sheet.getRow(i);
			String first_name = current.getCell(0).getStringCellValue();
			String last_name = current.getCell(1).getStringCellValue();
			String phone = current.getCell(2).getStringCellValue();
			String email = current.getCell(3).getStringCellValue();
			String address = current.getCell(4).getStringCellValue();
			String city= current.getCell(5).getStringCellValue();
			String state = current.getCell(6).getStringCellValue();
			String postal = current.getCell(7).getStringCellValue();
			String user = current.getCell(9).getStringCellValue();
			String password = current.getCell(10).getStringCellValue();
			String confirmpass = current.getCell(11).getStringCellValue();
			
				
			driver.findElement(By.name("firstName")).sendKeys(first_name);
			driver.findElement(By.name("lastName")).sendKeys(last_name);
			driver.findElement(By.name("phone")).sendKeys(phone);
			driver.findElement(By.id("userName")).sendKeys(email);
			driver.findElement(By.name("address1")).sendKeys(address);
			driver.findElement(By.name("city")).sendKeys(city);
			driver.findElement(By.name("state")).sendKeys(state);
			driver.findElement(By.name("postalCode")).sendKeys(postal);
			
						
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(user);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("confirmPassword")).sendKeys(confirmpass);
			
			driver.findElement(By.name("submit")).click();
		    if(driver.getPageSource().contains("Thank you for registering")) {
		    	
		    	System.out.println("Registration Successfull for"+i);
		    	driver.navigate().back();
		    }else {
		    	
	    	System.out.println("Registration failed for row "+i);
		    }
		    
		}
			
			
		}

	}


