package SeleniumPractise.SeleniumPractise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) 
	{
		// handling DropDown
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
		 Select drop = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		 List <WebElement> option=drop.getOptions();
         int i=1;
		 for(WebElement op:option) {

			 System.out.println(i +"."+op.getText());
			 i++;
		 }
         System.out.println("Total number of options is "+(i-1));
		
		 
       
         driver.close();
	}

}
