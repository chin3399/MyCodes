package SeleniumPractise.SeleniumPractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWindow {

	public static void main(String[] args) 
	
	{
		// TODO Handling Browser Window
       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		
		System.out.println("Parent Window Title:"+driver.getTitle());
		
		Set <String> S=driver.getWindowHandles();
		for(String i:S)
		{
			
			
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if(t.contains("Selenium"));
			
			driver.close();

			
		}
		
	


	}

}
