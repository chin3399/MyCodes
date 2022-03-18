package SeleniumPractise.SeleniumPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownOptionSorted {

	public static void main(String[] args) 
	
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		WebElement Drop=driver.findElement(By.xpath("//*[@id=\"animals\"]"));
        Select se = new Select(Drop);
		
		List OrignalList = new ArrayList();
		List TempList = new ArrayList();
		
		List <WebElement> options =se.getOptions();
		for(WebElement e:options) {
			
			OrignalList.add(e.getText());
			TempList.add(e.getText());
		}
		
	    System.out.println("Orignal List"+OrignalList); 
	    System.out.println("Temp List"+TempList); 
		
	    
	    Collections.sort(TempList);
	    System.out.println("Temp List After Sorting"+TempList); 
	    
	    if(OrignalList==TempList) {
	    	
	    	System.out.println("Sorted");
	    }else {
	    	
	    	System.out.println("Unsorted");
	    }
	    
	    
	    driver.close();
		

		
		

	}

}
