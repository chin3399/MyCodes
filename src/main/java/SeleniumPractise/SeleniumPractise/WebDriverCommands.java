package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText());
        //driver.close();
        driver.quit();
	}

}
