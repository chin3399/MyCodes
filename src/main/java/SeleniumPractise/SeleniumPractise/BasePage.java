package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("submit")).click();
        String ExpectedTitle = "Login: Mercury Tours";
        String ActualTitle = driver.getTitle();
        if(ExpectedTitle.equals(ActualTitle)==true)
        {
        	System.out.println("Pass");
        }
        else 
	    {

		System.out.println("Fail");
		}
        
        driver.close();
}
}
