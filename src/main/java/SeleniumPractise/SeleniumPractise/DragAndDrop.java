package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement UnitedStates = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement Sweden = driver.findElement(By.id("box102"));
		
		//Using Click and Hold 
		Actions A = new Actions(driver);
		A.clickAndHold(Washington).release(UnitedStates).build().perform();
		
		//Using Drag and Drop 
		
		A.dragAndDrop(Stockholm, Sweden).build().perform();
		
		
	}

}
