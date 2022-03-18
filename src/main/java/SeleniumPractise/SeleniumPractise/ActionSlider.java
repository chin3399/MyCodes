package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSlider {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		WebElement Scroll=driver.findElement(By.xpath("Iframe: /html/body/div[1]/div[2]/div/div[1]/iframe\r\n"
				+ "XPath: /html/body/div[1]/span"));
		Actions A = new Actions(driver);
		A.moveToElement(Scroll).dragAndDropBy(Scroll, 60, 0).build().perform();

		
		

	}

}
