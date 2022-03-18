package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightClick {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement Click =driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		WebElement Edit = driver.findElement(By.xpath("/html/body/ul/li[1]/span"));
		Actions A = new Actions(driver);
        A.contextClick(Click).moveToElement(Edit).click().build().perform();          
        driver.switchTo().alert().accept();
	}

}
