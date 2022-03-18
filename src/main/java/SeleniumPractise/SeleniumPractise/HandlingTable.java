package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		
		
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		 driver.manage().window().maximize();
		int row = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/main/article/div[2]/table/tbody/tr")).size();
		
		System.out.println("The rows are :"+row);
		    
               int col = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/main/article/div[2]/table/tbody/tr/th")).size();
               System.out.println("The Columns are :"+col);
               
               for(int i=2;i<=row;i++) {
            	   for(int j=1;j<=col;j++) {
            		   System.out.print("     "+driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/main/article/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
            	   }
            		  System.out.println(); 
            	   }driver.close();
               }
	             
            		   
            		   
            	   
               }
   		     
	


