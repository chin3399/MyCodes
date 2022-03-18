package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPrograms {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement Tab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b"));
		Actions A = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b"));

		WebElement UserM = driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement User = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));

		/*
		 * We can Either Write like this individualy or we can write in a single line as
		 * well
		 * 
		 * A.moveToElement(admin).build().perform();
		 * A.moveToElement(UserM).build().perform();
		 * A.moveToElement(User).click().build().perform();
		 */

		A.moveToElement(admin).moveToElement(UserM).moveToElement(User).click().build().perform();
		
	}

}
