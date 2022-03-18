package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();

		driver.switchTo().alert().accept(); // Alert with Okay Button

		// Alert with OK and CANCEL button

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();

		driver.switchTo().alert().dismiss();

		// Alert with Text Box

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		
		driver.switchTo().alert().sendKeys("Arpit Kukreti");
	

	}

}
