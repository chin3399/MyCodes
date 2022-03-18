package SeleniumPractise.SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException 
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Simpli5d");
		Thread.sleep(2000);
		List <WebElement> list = driver.findElements(By.cssSelector("li.sbct"));
		System.out.println(list.size());
		
        driver.quit();
	}

}
