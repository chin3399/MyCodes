package OrangeCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[9]/ul/li[3]/a")).click();
		driver.close();

	}

}
