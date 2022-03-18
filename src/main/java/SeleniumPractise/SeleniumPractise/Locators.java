package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("Arpit"); //Absolute Xpath
		
	//	driver.findElement(By.cssSelector("input#email")).sendKeys("chinkukreti8@gmail.com");  //selecting by Tag and Id in CSS 
		
	//	driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		
		
	}

}
