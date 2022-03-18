package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) 
	
	{
		// TODO Handling CheckBoxes 
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		
		 
		

	}

}
